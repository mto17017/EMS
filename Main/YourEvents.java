package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class YourEvents extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public YourEvents() {
        setTitle("Your Events");
        setLocation(350, 50);
        setSize(800, 520);
        getContentPane().setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Read data from the file
        Vector<Vector<String>> data = readEvents();
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Event Name");
        columnNames.add("Event Type");
        columnNames.add("Event Date");
        columnNames.add("Guests");
        columnNames.add("Start Time");
        columnNames.add("End Time");

        // Create a table model and set it to the JTable
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private Vector<Vector<String>> readEvents() {
        Vector<Vector<String>> data = new Vector<>();
        try (BufferedReader br = new BufferedReader(new FileReader("event.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length >= 6) { // Assuming 6 columns based on your fields
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

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new YourEvents());
    }
}
