package Login;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

public class LoginUser extends JFrame implements Runnable {
    private static final long serialVersionUID = 1L;
	Thread t;

    LoginUser() {
        
        ImageIcon image = new ImageIcon("Z1.png");
        Image i1 = image.getImage().getScaledInstance(520, 520, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        
        Border border = BorderFactory.createLineBorder(Color.WHITE, 7);

        
        setTitle("Onzer's Event");
        setLocation(350, 50);
        setSize(520, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(0xB2B26));
        
                // Create a label with the image
                JLabel label = new JLabel(i2);
                label.setBackground(new Color(0xB2B26));
                label.setBorder(border);
                label.setVerticalAlignment(JLabel.CENTER);
                label.setHorizontalAlignment(JLabel.CENTER);
                getContentPane().add(label);

        
        t = new Thread(this);
        t.start();

        
        setVisible(true);

        
        int x = 1;
        for (int i = 2; i <= 600; i += 4, x += 1) {
            setLocation(600 - ((i + x) / 2), 350 - (i / 2));
            setSize(i + 3 * x, i + x / 2);

            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        try {
            Thread.sleep(4000); 
            dispose();
            Login l = new Login();
            l.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) {
        new LoginUser();
    }
}


