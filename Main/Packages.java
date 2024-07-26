package Main;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Packages extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JCheckBox weddingCheckBox = new JCheckBox("1. Wedding Package");
    JCheckBox bdCheckBox = new JCheckBox("2. Birthday Package");
    JCheckBox corpCheckBox = new JCheckBox("3. Corporate Events");
    JComboBox<String> comboBox_wedding = new JComboBox<>();
    JComboBox<String> comboBox_birthday = new JComboBox<>();
    JComboBox<String> comboBox_corp = new JComboBox<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Packages frame = new Packages();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Packages() {
        setTitle("Onzer's Event");
        setLocation(350, 50);
        setSize(936, 584);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("Z1.png");
        setIconImage(image.getImage());

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 64, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("  Select A Package");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
        lblNewLabel.setBounds(283, 11, 629, 54);
        contentPane.add(lblNewLabel);

        weddingCheckBox.setForeground(new Color(240, 248, 255));
        weddingCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        weddingCheckBox.setBounds(47, 147, 203, 43);
        contentPane.add(weddingCheckBox);

        bdCheckBox.setForeground(new Color(240, 248, 255));
        bdCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        bdCheckBox.setBounds(370, 147, 203, 43);
        contentPane.add(bdCheckBox);

        corpCheckBox.setForeground(new Color(240, 248, 255));
        corpCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        corpCheckBox.setBounds(677, 147, 235, 43);
        contentPane.add(corpCheckBox);

        comboBox_wedding.setForeground(new Color(47, 79, 79));
        comboBox_wedding.setModel(new DefaultComboBoxModel<>(new String[]{"Select A Package :", "1. Enchanted 12,000/-", "2. Elegant 15,000/-", "3. Chic Celebrations 25,000/-"}));
        comboBox_wedding.setFont(new Font("Tahoma", Font.PLAIN, 18));
        comboBox_wedding.setBounds(25, 192, 240, 43);
        contentPane.add(comboBox_wedding);

        comboBox_birthday.setForeground(new Color(47, 79, 79));
        comboBox_birthday.setModel(new DefaultComboBoxModel<>(new String[]{"Select A Package :", "1. Enchanted 12,000/-", "2. Elegant 15,000/-", "3. Chic Celebrations 25,000/-"}));
        comboBox_birthday.setFont(new Font("Tahoma", Font.PLAIN, 18));
        comboBox_birthday.setBounds(345, 192, 240, 43);
        contentPane.add(comboBox_birthday);

        comboBox_corp.setForeground(new Color(47, 79, 79));
        comboBox_corp.setFont(new Font("Tahoma", Font.PLAIN, 18));
        comboBox_corp.setModel(new DefaultComboBoxModel<>(new String[]{"Select A Package :", "1. Enchanted 12,000/-", "2. Elegant 15,000/-", "3. Chic Celebrations 25,000/-"}));
        comboBox_corp.setBounds(644, 192, 240, 43);
        contentPane.add(comboBox_corp);

        JLabel weddingImage = new JLabel();
        ImageIcon wdImage = new ImageIcon("couple.png");
        Image img1 = wdImage.getImage().getScaledInstance(225, 175, Image.SCALE_SMOOTH);
        weddingImage.setIcon(new ImageIcon(img1));
        weddingImage.setBounds(25, 306, 225, 175);
        contentPane.add(weddingImage);

        JLabel bdImage = new JLabel("");
        ImageIcon bdpic = new ImageIcon("birthday.png");
        Image img2 = bdpic.getImage().getScaledInstance(225, 175, Image.SCALE_SMOOTH);
        bdImage.setIcon(new ImageIcon(img2));
        bdImage.setBounds(345, 283, 225, 175);
        contentPane.add(bdImage);

        JLabel corpImage = new JLabel("");
        ImageIcon corpEvtImage = new ImageIcon("corpevent.png");
        Image img3 = corpEvtImage.getImage().getScaledInstance(225, 175, Image.SCALE_SMOOTH);
        corpImage.setIcon(new ImageIcon(img3));
        corpImage.setBounds(644, 306, 225, 152);
        contentPane.add(corpImage);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setForeground(new Color(47, 79, 79));
        checkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String weddingPackage = weddingCheckBox.isSelected() ? (String) comboBox_wedding.getSelectedItem() : null;
                String birthdayPackage = bdCheckBox.isSelected() ? (String) comboBox_birthday.getSelectedItem() : null;
                String corporatePackage = corpCheckBox.isSelected() ? (String) comboBox_corp.getSelectedItem() : null;

                dispose();
                CheckoutPackages checkout = new CheckoutPackages(weddingPackage, birthdayPackage, corporatePackage);
                checkout.setVisible(true);
            }
        });
        checkoutButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        checkoutButton.setBounds(706, 505, 146, 31);
        contentPane.add(checkoutButton);

        JButton backButton = new JButton("BACK");
        backButton.setForeground(new Color(47, 79, 79));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookEvents b = new BookEvents();
                b.setVisible(true);
            }
        });
        backButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        backButton.setBounds(548, 505, 146, 31);
        contentPane.add(backButton);
    }
}
