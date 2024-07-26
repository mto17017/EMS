package Main;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Login.Login;

import javax.swing.JComboBox;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setBackground(new Color(240, 240, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 905, 583);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 64, 64));
        panel_1.setBounds(6, 0, 893, 549);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel titleLabel = new JLabel("Main Menu");
        titleLabel.setForeground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
        titleLabel.setBounds(273, 50, 517, 101);
        panel_1.add(titleLabel);
        
        JButton btnNewButton = new JButton("EDIT PROFILE");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
    			ViewProfile b = new ViewProfile();
    			b.setVisible(true);
        	}
        });
        btnNewButton.setBackground(new Color(255, 250, 240));
        btnNewButton.setForeground(new Color(0, 128, 128));
        btnNewButton.setBounds(104, 337, 157, 49);
        panel_1.add(btnNewButton);
        
        JButton btnYourEvents = new JButton("YOUR EVENTS");
        btnYourEvents.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		YourEvents y= new YourEvents();
        		y.setVisible(true);
        	}
        });
        btnYourEvents.setBackground(new Color(255, 250, 240));
        btnYourEvents.setForeground(new Color(0, 128, 128));
        btnYourEvents.setBounds(383, 337, 157, 49);
        panel_1.add(btnYourEvents);
        
        JButton btnLogOut = new JButton("LOG OUT");
        btnLogOut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Login l= new Login();
        		l.setVisible(true);
        	}
        });
        btnLogOut.setBackground(new Color(255, 250, 240));
        btnLogOut.setForeground(new Color(0, 128, 128));
        btnLogOut.setBounds(654, 337, 157, 49);
        panel_1.add(btnLogOut);
        
        JLabel lblNewLabel = new JLabel();
        ImageIcon editImage = new ImageIcon("edit.png");
        Image img1 = editImage.getImage().getScaledInstance(153, 120, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(img1));
        lblNewLabel.setBounds(120, 201, 157, 124);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel();
        ImageIcon eventImage = new ImageIcon("list.png");
        Image img2 = eventImage.getImage().getScaledInstance(158, 127, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(img2));
        lblNewLabel_1.setBounds(395, 201, 157, 124);
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel();
        ImageIcon logImage = new ImageIcon("logout.png");
        Image img3 = logImage.getImage().getScaledInstance(158, 127, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(img3));
        lblNewLabel_2.setBounds(625, 201, 157, 124);
        panel_1.add(lblNewLabel_2);
        
       
        
        
	}
}
