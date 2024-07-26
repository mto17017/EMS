package Main;
import Login.Login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.Login;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import Login.Login;
public class BookEvents extends JFrame {

	private static final long serialVersionUID = 1L;
	public static int themeCost;
	public static int foodCost;
	public static int venueCost;
	private JPanel contentPane;
	private JTextField evName_txt;
	private JTextField evDate_txt;
	private JTextField guest_txt;
	private JTextField strtTime_txt;
	private JTextField endTime_txt;
	String name,date,guest,srt_time,endTime;
	JComboBox comboBox_evType = new JComboBox();

	boolean validations() {
		
    	
    	
    	name = evName_txt.getText();
    	date = evDate_txt.getText();
    	guest = guest_txt.getText();
    	srt_time = strtTime_txt.getText();
    	endTime = endTime_txt.getText();
    	
    	
    	if(name.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter event name!");
    		return false;
    	}
    	if(date.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter event date!");
    		return false;
    	}
    	if(guest.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter number of guests!");
    		return false;
    	}
    	if(srt_time.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter starting time!");
    		return false;
    	}
    	if(endTime.equals("")) {
    		
    		JOptionPane.showMessageDialog(this, "Please enter end time!");
    		return false;
    	}
    	
    	
    	
    	
    	return true;
   
    	
    	
    }
    
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookEvents frame = new BookEvents();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	@SuppressWarnings("rawtypes")
	public BookEvents() {
		
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
		setBounds(100, 100, 1056, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon wdImage = new ImageIcon("Customer_Desktop.jpg");
        Image img1 = wdImage.getImage().getScaledInstance(1077, 636, Image.SCALE_SMOOTH);
		
		JLabel title = new JLabel("Book An Event With Us");
		title.setBounds(281, 10, 498, 77);
		title.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
		title.setForeground(new Color(255, 255, 255));
		contentPane.add(title);
		
		JLabel eventName_lbl = new JLabel("Event Name   :\r\n");
		eventName_lbl.setForeground(new Color(255, 255, 255));
		eventName_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		eventName_lbl.setBounds(82, 162, 180, 42);
		contentPane.add(eventName_lbl);
		
		JLabel eventTyp_lbl = new JLabel("Event Type    :\r\n");
		eventTyp_lbl.setForeground(new Color(255, 255, 255));
		eventTyp_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		eventTyp_lbl.setBounds(82, 237, 143, 42);
		contentPane.add(eventTyp_lbl);
		
		JLabel eventDate_lbl = new JLabel("Event Date    :");
		eventDate_lbl.setForeground(new Color(255, 255, 255));
		eventDate_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		eventDate_lbl.setBounds(82, 320, 132, 42);
		contentPane.add(eventDate_lbl);
		
		evName_txt = new JTextField();
		evName_txt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		evName_txt.setBounds(299, 162, 631, 42);
		contentPane.add(evName_txt);
		evName_txt.setColumns(10);
		
		evDate_txt = new JTextField();
		evDate_txt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		evDate_txt.setBounds(299, 313, 631, 42);
		contentPane.add(evDate_txt);
		evDate_txt.setColumns(10);
		
		JLabel guest_lbl = new JLabel("Guests Expected :");
		guest_lbl.setForeground(new Color(255, 255, 255));
		guest_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		guest_lbl.setBounds(82, 403, 180, 42);
		contentPane.add(guest_lbl);
		
		JLabel srtTime_lbl = new JLabel("Starting Time:");
		srtTime_lbl.setForeground(new Color(255, 255, 255));
		srtTime_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		srtTime_lbl.setBounds(82, 482, 143, 53);
		contentPane.add(srtTime_lbl);
		
		guest_txt = new JTextField();
		guest_txt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		guest_txt.setBounds(299, 396, 631, 42);
		contentPane.add(guest_txt);
		guest_txt.setColumns(10);
		
		strtTime_txt = new JTextField();
		strtTime_txt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		strtTime_txt.setBounds(302, 492, 168, 40);
		contentPane.add(strtTime_txt);
		strtTime_txt.setColumns(10);
		
		JLabel endTime_lbl = new JLabel("Ending Time:");
		endTime_lbl.setForeground(new Color(255, 255, 255));
		endTime_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		endTime_lbl.setBounds(529, 492, 121, 42);
		contentPane.add(endTime_lbl);
		
		endTime_txt = new JTextField();
		endTime_txt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		endTime_txt.setBounds(729, 492, 201, 42);
		contentPane.add(endTime_txt);
		endTime_txt.setColumns(10);
		
		JButton btn_back = new JButton("Log Out");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
        		Login  l= new Login ();
        		l.setVisible(true);
			}
		});
		btn_back.setBackground(new Color(47, 79, 79));
		btn_back.setForeground(new Color(47, 79, 79));
		btn_back.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_back.setBounds(594, 560, 171, 42);
		contentPane.add(btn_back);
		
		JButton btn_nxt = new JButton("NEXT\r\n");
		btn_nxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validations();
				
				try {
				    FileWriter fw = new FileWriter("event.txt", true);

				    String eventType;
				    if (comboBox_evType.getSelectedItem().equals("1.  Packages")) {
				        eventType = "Package";
				    } else if (comboBox_evType.getSelectedItem().equals("2.  Customized")) {
				        eventType = "Custom";
				    } else {
				        eventType = "Custom";
				    }

				    fw.write(evName_txt.getText() + "\t" + eventType + "\t" + evDate_txt.getText() + "\t" + guest_txt.getText() + "\t" + strtTime_txt.getText() + "\t" + endTime_txt.getText() + "\n");
				    fw.close();
				} catch (IOException e1) {
				    e1.printStackTrace();
				}
				
				dispose();
        		
				
				if(comboBox_evType.getSelectedItem().equals("1.  Packages")) {
					dispose();
	        		Packages p= new Packages();
	        		p.setVisible(true);
				}
				else if(comboBox_evType.getSelectedItem().equals("2.  Customized")) {
					dispose();
	    			Venue r = new Venue();
	    			r.setVisible(true);
				}
				else {
					
				}
			}
		});
		btn_nxt.setBackground(new Color(47, 79, 79));
		btn_nxt.setForeground(new Color(47, 79, 79));
		btn_nxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_nxt.setBounds(775, 560, 155, 42);
		contentPane.add(btn_nxt);
		
		
		comboBox_evType.setBackground(new Color(224, 255, 255));
		comboBox_evType.setForeground(new Color(47, 79, 79));
		comboBox_evType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_evType.addItem("Select Type:");
		comboBox_evType.addItem("1.  Packages");
		comboBox_evType.addItem("2.  Customized");
		//comboBox_evType.setModel(new DefaultComboBoxModel(new String[] {, , }));
		comboBox_evType.setBounds(299, 237, 631, 42);
		contentPane.add(comboBox_evType);
	}


	public static double applyDiscount(double totalCost, double discountPercentage) {
		return totalCost - (totalCost * (discountPercentage / 100));
		
	}
}

