package Login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import Main.BookEvents;
import Main.Menu;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;

import java.awt.Window;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usrn_textField;
    private JPasswordField passwordField;
    String password, usrName;
    JLabel Invalid_mssg = new JLabel("");
    JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	boolean validations() {
		
    	
    	
    	
    	
    	usrName = usrn_textField.getText();
    	password = passwordField.getText();
    	
    	
    	
    	if(usrName.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter username!");
    		return false;
    	}
    	if(password.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter password!");
    		return false;
    	}
    	
    	return true;
	}
	
	

	/**
	 * Create the frame.
	 */
	public Login() {
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

        JLabel titleLabel = new JLabel("Welcome to ONZER  EVENT");
        titleLabel.setForeground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
        titleLabel.setBounds(112, 50, 678, 101);
        panel_1.add(titleLabel);

        usrn_textField = new JTextField();
        usrn_textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        usrn_textField.setBounds(379, 181, 327, 43);
        panel_1.add(usrn_textField);
        usrn_textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField.setBounds(379, 267, 327, 43);
        panel_1.add(passwordField);

        JButton signin_btn = new JButton("SIGN IN");
        signin_btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		validations();
        		
        		boolean matched = false;
        		usrName = usrn_textField.getText().toString();
            	password = passwordField.getText().toString();
            	
            	if(comboBox.getSelectedItem().equals("MANAGER")) {
            		try {
    					FileReader readLogin = new FileReader("adminlogin.txt");
    					BufferedReader br = new BufferedReader(readLogin);
    					String str;
    					while((str=br.readLine())!=null) {
    						if(str.equals(usrName+ "\t"+password)) {
    							matched = true;
    							break;
    						}
    					}
    					
    						readLogin.close();
    						
    						if(matched) {
    							dispose();
    		        			Menu b = new Menu();
    		        			b.setVisible(true);
    		        		}
    		        		else {
    		        			Invalid_mssg.setText("Invalid username or password");
    		        		}
    					
    				} catch (IOException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				}
                	
            		
            	}
            	else if(comboBox.getSelectedItem().equals("CUSTOMER")) {
            		try {
    					FileReader adminLogin = new FileReader("login.txt");
    					BufferedReader br = new BufferedReader(adminLogin);
    					String str;
    					while((str=br.readLine())!=null) {
    						if(str.equals(usrName+ "\t"+password)) {
    							matched = true;
    							break;
    						}
    					}
    					
    						adminLogin.close();  						
    						if(matched) {
    							dispose();
    		        			BookEvents b = new BookEvents();
    		        			b.setVisible(true);
    		        		}
    		        		else {
    		        			Invalid_mssg.setText("Invalid username or password");
    		        		}
    					
    				} catch (IOException e1) {
    					
    					e1.printStackTrace();
    				}
                	
            	}
				
       		
        	}
        	
        });
        signin_btn.setForeground(new Color(47, 79, 79));
        signin_btn.setBackground(new Color(240, 255, 255));
        signin_btn.setFont(new Font("Tahoma", Font.BOLD, 18));
        signin_btn.setBounds(200, 439, 153, 36);
        panel_1.add(signin_btn);

        JLabel usr_nameLabel = new JLabel("USERNAME  :");
        usr_nameLabel.setForeground(new Color(255, 255, 255));
        usr_nameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        usr_nameLabel.setBounds(200, 181, 147, 43);
        panel_1.add(usr_nameLabel);

        JLabel pswd_label = new JLabel("PASSWORD  :");
        pswd_label.setForeground(new Color(255, 255, 255));
        pswd_label.setFont(new Font("Tahoma", Font.BOLD, 20));
        pswd_label.setBounds(200, 267, 147, 43);
        panel_1.add(pswd_label);

        JButton reg_btn = new JButton("REGISTER");
        reg_btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
    			Register r = new Register();
    			r.setVisible(true);
        	}
        });
        reg_btn.setForeground(new Color(47, 79, 79));
        reg_btn.setBackground(new Color(240, 248, 255));
        reg_btn.setFont(new Font("Tahoma", Font.BOLD, 18));
        reg_btn.setBounds(379, 439, 153, 36);
        
        panel_1.add(reg_btn);
        
        
        Invalid_mssg.setForeground(new Color(240, 248, 255));
        Invalid_mssg.setBackground(new Color(211, 211, 211));
        Invalid_mssg.setBounds(379, 327, 269, 16);
        panel_1.add(Invalid_mssg);
        comboBox.setBackground(new Color(240, 255, 240));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setSize(206, 42);
        comboBox.setLocation(389, 364);
        
        
        comboBox.addItem("SELECT USER");
		comboBox.addItem( "CUSTOMER");
		comboBox.addItem("MANAGER");
        panel_1.add(comboBox);
        
        JLabel pswd_label_1 = new JLabel("USER  :");
        pswd_label_1.setForeground(Color.WHITE);
        pswd_label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        pswd_label_1.setBounds(202, 362, 147, 43);
        panel_1.add(pswd_label_1);
        
        
	}
	
}
