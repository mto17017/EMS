package Main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.Login;
import Login.LoginUser;
import Login.Register;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Checkout extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JRadioButton btnYes = new JRadioButton("YES");
    JRadioButton btnNo = new JRadioButton("NO");
    JLabel lblNewLabel_2_1;
    double totalCost = BookEvents.venueCost + BookEvents.foodCost + BookEvents.themeCost;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Checkout frame = new Checkout();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Checkout() {
        ImageIcon image = new ImageIcon("Z1.png");
        setIconImage(image.getImage());

        setTitle("Onzer's Event");
        setLocation(350, 50);
        setSize(936, 627);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 64, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Checkout");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 80));
        lblNewLabel.setBounds(351, 11, 491, 86); // Adjusted the width to fit the text
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
                Theme t = new Theme();
                t.setVisible(true);
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

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(rdbtnNewRadioButton);
        paymentGroup.add(rdbtnNewRadioButton_1);
        paymentGroup.add(rdbtnNewRadioButton_2);

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

        btnYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnYes.isSelected()) {
                    totalCost = BookEvents.applyDiscount(totalCost, 10);
                    lblNewLabel_2_1.setText("Net Total  : " + totalCost + "/-");
                }
            }
        });
        btnYes.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnYes.setBounds(47, 191, 90, 38);
        contentPane.add(btnYes);

        btnNo.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNo.setBounds(222, 191, 90, 38);
        contentPane.add(btnNo);

        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(btnYes);
        discountGroup.add(btnNo);
    }
}
