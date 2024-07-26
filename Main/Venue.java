package Main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class EmptyFieldException extends Exception {
    public EmptyFieldException(String message) {
        super(message);
    }
}

public class Venue extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField evName_txt;
    private JTextField evDate_txt;
    private JTextField guest_txt;
    private JTextField strtTime_txt;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Venue frame = new Venue();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Venue() {
        ImageIcon image = new ImageIcon("Z1.png");
        Image i1 = image.getImage().getScaledInstance(520, 520, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel label = new JLabel(i2);
        label.setBackground(new Color(0xB2B26));

        setTitle("Onzer's Event");
        setLocation(350, 50);
        setSize(520, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(0xB2B26));
        getContentPane().add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 60, 1056, 664);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 64, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel title = new JLabel("Venue Information ");
        title.setBounds(387, 32, 290, 77);
        title.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
        title.setForeground(new Color(255, 255, 255));
        contentPane.add(title);

        JLabel eventName_lbl = new JLabel("Venue Name   :");
        eventName_lbl.setForeground(new Color(255, 255, 255));
        eventName_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eventName_lbl.setBounds(82, 162, 180, 42);
        contentPane.add(eventName_lbl);

        JLabel eventTyp_lbl = new JLabel("Venue Location:");
        eventTyp_lbl.setForeground(new Color(255, 255, 255));
        eventTyp_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eventTyp_lbl.setBounds(82, 237, 143, 42);
        contentPane.add(eventTyp_lbl);

        JLabel eventDate_lbl = new JLabel("Venue Category :");
        eventDate_lbl.setForeground(new Color(255, 255, 255));
        eventDate_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eventDate_lbl.setBounds(82, 320, 160, 42);
        contentPane.add(eventDate_lbl);

        evName_txt = new JTextField();
        evName_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        evName_txt.setBounds(299, 162, 631, 42);
        contentPane.add(evName_txt);
        evName_txt.setColumns(10);

        evDate_txt = new JTextField();
        evDate_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        evDate_txt.setBounds(299, 313, 631, 42);
        contentPane.add(evDate_txt);
        evDate_txt.setColumns(10);

        JLabel guest_lbl = new JLabel("Venue Contact :");
        guest_lbl.setForeground(new Color(255, 255, 255));
        guest_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        guest_lbl.setBounds(82, 403, 180, 42);
        contentPane.add(guest_lbl);

        JLabel srtTime_lbl = new JLabel("Venue Capacity:");
        srtTime_lbl.setForeground(new Color(255, 255, 255));
        srtTime_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        srtTime_lbl.setBounds(82, 482, 160, 53);
        contentPane.add(srtTime_lbl);

        guest_txt = new JTextField();
        guest_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        guest_txt.setBounds(299, 396, 631, 42);
        contentPane.add(guest_txt);
        guest_txt.setColumns(10);

        strtTime_txt = new JTextField();
        strtTime_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        strtTime_txt.setBounds(302, 492, 628, 40);
        contentPane.add(strtTime_txt);
        strtTime_txt.setColumns(10);

        JButton btn_back = new JButton("BACK");
        btn_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu l = new Menu();
                l.setVisible(true);
            }
        });
        btn_back.setBackground(new Color(192, 192, 192));
        btn_back.setForeground(new Color(47, 79, 79));
        btn_back.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_back.setBounds(299, 560, 171, 42);
        contentPane.add(btn_back);

        JButton btn_nxt = new JButton("NEXT");
        btn_nxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    checkFields();
                    dispose();
                    FoodMenu f = new FoodMenu();
                    f.setVisible(true);
                } catch (EmptyFieldException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btn_nxt.setBackground(new Color(192, 192, 192));
        btn_nxt.setForeground(new Color(47, 79, 79));
        btn_nxt.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_nxt.setBounds(638, 560, 155, 42);
        contentPane.add(btn_nxt);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setColumns(10);
        textField.setBounds(299, 237, 631, 42);
        contentPane.add(textField);
    }

    private void checkFields() throws EmptyFieldException {
        if (evName_txt.getText().trim().isEmpty() || 
            textField.getText().trim().isEmpty() || 
            evDate_txt.getText().trim().isEmpty() || 
            guest_txt.getText().trim().isEmpty() || 
            strtTime_txt.getText().trim().isEmpty()) {
            throw new EmptyFieldException("All fields must be filled out.");
        }
    }
}
