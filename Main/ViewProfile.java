package Main;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class ViewProfile extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public ViewProfile() {
        Border border = BorderFactory.createLineBorder(Color.WHITE, 7);

        setTitle("Onzer's Event User's Profile");
        setLocation(350, 50);
        setSize(800, 520);  // Adjust size to accommodate the table and buttons

        getContentPane().setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Read data from the file
        Vector<Vector<String>> data = readUserProfiles();
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Name");
        columnNames.add("Email");
        columnNames.add("Username");
        columnNames.add("Password");
        columnNames.add("Address");

        // Create a table model and set it to the JTable
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Add edit button
        JButton editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String name = (String) model.getValueAt(selectedRow, 0);
                    String email = (String) model.getValueAt(selectedRow, 1);
                    String username = (String) model.getValueAt(selectedRow, 2);
                    String password = (String) model.getValueAt(selectedRow, 3);
                    String address = (String) model.getValueAt(selectedRow, 4);

                    JTextField nameField = new JTextField(name);
                    JTextField emailField = new JTextField(email);
                    JTextField usernameField = new JTextField(username);
                    JTextField passwordField = new JTextField(password);
                    JTextField addressField = new JTextField(address);

                    JPanel panel = new JPanel(new GridLayout(0, 2));
                    panel.add(new JLabel("Name:"));
                    panel.add(nameField);
                    panel.add(new JLabel("Email:"));
                    panel.add(emailField);
                    panel.add(new JLabel("Username:"));
                    panel.add(usernameField);
                    panel.add(new JLabel("Password:"));
                    panel.add(passwordField);
                    panel.add(new JLabel("Address:"));
                    panel.add(addressField);

                    int result = JOptionPane.showConfirmDialog(null, panel, "Edit User", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (result == JOptionPane.OK_OPTION) {
                        model.setValueAt(nameField.getText(), selectedRow, 0);
                        model.setValueAt(emailField.getText(), selectedRow, 1);
                        model.setValueAt(usernameField.getText(), selectedRow, 2);
                        model.setValueAt(passwordField.getText(), selectedRow, 3);
                        model.setValueAt(addressField.getText(), selectedRow, 4);
                        saveUserProfiles();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row to edit", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(editButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private Vector<Vector<String>> readUserProfiles() {
        Vector<Vector<String>> data = new Vector<>();
        try (BufferedReader br = new BufferedReader(new FileReader("User.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length >= 5) {
                    Vector<String> row = new Vector<>();
                    for (String part : parts) {
                        row.add(part);
                    }
                    data.add(row);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private void saveUserProfiles() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("User.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                Vector<String> row = (Vector<String>) model.getDataVector().elementAt(i);
                for (int j = 0; j < row.size(); j++) {
                    bw.write(row.get(j));
                    if (j < row.size() - 1) {
                        bw.write("\t");
                    }
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new ViewProfile());
    }
}
