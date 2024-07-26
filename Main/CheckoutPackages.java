package Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Login.Login;

public class CheckoutPackages extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JRadioButton btnYes = new JRadioButton("YES");
    private JRadioButton btnNo = new JRadioButton("NO");
    private JLabel lblNewLabel_2_1;

    private String weddingPackage;
    private String birthdayPackage;
    private String corporatePackage;

    private double totalCost;

    public CheckoutPackages(String weddingPackage, String birthdayPackage, String corporatePackage) {
        this.weddingPackage = weddingPackage;
        this.birthdayPackage = birthdayPackage;
        this.corporatePackage = corporatePackage;

        ImageIcon image = new ImageIcon("Z1.png");
        Image i1 = image.getImage().getScaledInstance(520, 520, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel label = new JLabel(i2);
        label.setBackground(new Color(0xB2B26));

        setTitle("Onzer's Event");
        setLocation(350, 50);
        setSize(936, 627);
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(0xB2B26));
        getContentPane().add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 936, 584);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 64, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Checkout Packages");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 80));
        lblNewLabel.setBounds(250, 11, 500, 86);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Checkout");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookEvents b= new BookEvents();
                b.setVisible(true);
                Component container = null;
				JOptionPane.showMessageDialog(container, "Booking Completed!");
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.setBounds(573, 505, 165, 31);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("BACK");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Packages p = new Packages();
                p.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1.setBounds(192, 505, 146, 31);
        contentPane.add(btnNewButton_1);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(417, 119, 430, 291);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Payment Method  :");
        lblNewLabel_2.setFont(new Font("Rage Italic", Font.BOLD, 30));
        lblNewLabel_2.setForeground(new Color(0, 64, 64));
        lblNewLabel_2.setBounds(3, 129, 259, 46);
        panel.add(lblNewLabel_2);

        totalCost = calculatePackageCost();
        lblNewLabel_2_1 = new JLabel("Net Total  : " + totalCost + "/-");
        lblNewLabel_2_1.setForeground(new Color(0, 64, 64));
        lblNewLabel_2_1.setFont(new Font("Rage Italic", Font.BOLD, 30));
        lblNewLabel_2_1.setBounds(10, 40, 410, 78);
        panel.add(lblNewLabel_2_1);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Cash Payment");
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        rdbtnNewRadioButton.setBounds(246, 134, 174, 38);
        panel.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Online Payment");
        rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        rdbtnNewRadioButton_1.setBounds(246, 180, 174, 38);
        panel.add(rdbtnNewRadioButton_1);

        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Card Payment");
        rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        rdbtnNewRadioButton_2.setBounds(246, 225, 174, 39);
        panel.add(rdbtnNewRadioButton_2);

        JLabel lblNewLabel_1 = new JLabel("Thank You For Booking With ONZER'S EVENT");
        lblNewLabel_1.setFont(new Font("Rage Italic", Font.BOLD, 40));
        lblNewLabel_1.setBounds(73, 421, 804, 65);
        contentPane.add(lblNewLabel_1);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBackground(new Color(0, 64, 64));

        JLabel lblDoYouHave = new JLabel("Do You Have A Discount Voucher :");
        lblDoYouHave.setForeground(Color.WHITE);
        lblDoYouHave.setFont(new Font("French Script MT", Font.PLAIN, 30));
        lblDoYouHave.setBounds(20, 119, 357, 65);
        contentPane.add(lblDoYouHave);

        btnYes.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnYes.setBounds(47, 191, 90, 38);
        contentPane.add(btnYes);

        btnNo.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNo.setBounds(222, 191, 90, 38);
        contentPane.add(btnNo);

        btnYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnYes.isSelected()) {
                    totalCost = applyDiscount(totalCost, 10);
                    lblNewLabel_2_1.setText("Net Total  : " + totalCost + "/-");
                    
                }
            }
        });

        btnNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnNo.isSelected()) {
                    totalCost = calculatePackageCost();
                    lblNewLabel_2_1.setText("Net Total  : " + totalCost + "/-");
                    System.out.println("Total Cost (without discount): " + totalCost);
                }
            }
        });

        // Ensure only one button can be selected at a time
        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(btnYes);
        discountGroup.add(btnNo);
    }

    private double calculatePackageCost() {
        double packageCost = 0;

        if (weddingPackage != null) {
            switch (weddingPackage) {
                case "1. Enchanted 12,000/-":
                    packageCost += 12000;
                    break;
                case "2. Elegant 15,000/-":
                    packageCost += 15000;
                    break;
                case "3. Chic Celebrations 25,000/-":
                    packageCost += 25000;
                    break;
            }
        }

        if (birthdayPackage != null) {
            switch (birthdayPackage) {
                case "1. Enchanted 12,000/-":
                    packageCost += 12000;
                    break;
                case "2. Elegant 15,000/-":
                    packageCost += 15000;
                    break;
                case "3. Chic Celebrations 25,000/-":
                    packageCost += 25000;
                    break;
            }
        }

        if (corporatePackage != null) {
            switch (corporatePackage) {
                case "1. Enchanted 12,000/-":
                    packageCost += 12000;
                    break;
                case "2. Elegant 15,000/-":
                    packageCost += 15000;
                    break;
                case "3. Chic Celebrations 25,000/-":
                    packageCost += 25000;
                    break;
            }
        }

        return packageCost;
    }

    private double applyDiscount(double cost, int discountPercentage) {
        return cost - (cost * discountPercentage / 100.0);
    }
}
