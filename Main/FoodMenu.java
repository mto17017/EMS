package Main;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class FoodMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FoodMenu frame = new FoodMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FoodMenu() {
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

        JLabel title = new JLabel("Select A Menu");
        title.setBounds(393, 11, 272, 77);
        title.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
        title.setForeground(new Color(255, 255, 255));
        contentPane.add(title);

        JLabel eventName_lbl = new JLabel("  Rice Items");
        eventName_lbl.setForeground(new Color(255, 255, 255));
        eventName_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
        eventName_lbl.setBounds(435, 99, 155, 42);
        contentPane.add(eventName_lbl);

        JLabel eventTyp_lbl = new JLabel("  Bread");
        eventTyp_lbl.setForeground(new Color(255, 255, 255));
        eventTyp_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
        eventTyp_lbl.setBounds(467, 207, 86, 42);
        contentPane.add(eventTyp_lbl);

        JLabel eventDate_lbl = new JLabel("  Protien");
        eventDate_lbl.setForeground(new Color(255, 255, 255));
        eventDate_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
        eventDate_lbl.setBounds(467, 337, 132, 42);
        contentPane.add(eventDate_lbl);

        JLabel guest_lbl = new JLabel("  Bevarages");
        guest_lbl.setForeground(new Color(255, 255, 255));
        guest_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
        guest_lbl.setBounds(467, 470, 180, 42);
        contentPane.add(guest_lbl);

        JButton btn_back = new JButton("BACK");
        btn_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Venue l = new Venue();
                l.setVisible(true);
            }
        });
        btn_back.setBackground(new Color(192, 192, 192));
        btn_back.setForeground(new Color(47, 79, 79));
        btn_back.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_back.setBounds(189, 574, 171, 42);
        contentPane.add(btn_back);

        JButton btn_nxt = new JButton("NEXT\r\n");
        btn_nxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Theme t = new Theme();
                t.setVisible(true);
            }
        });
        btn_nxt.setBackground(new Color(192, 192, 192));
        btn_nxt.setForeground(new Color(47, 79, 79));
        btn_nxt.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_nxt.setBounds(775, 574, 155, 42);
        contentPane.add(btn_nxt);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Egg Fried-/700");
        chckbxNewCheckBox.setBounds(130, 146, 132, 33);
        chckbxNewCheckBox.addActionListener(e -> {
            if (chckbxNewCheckBox.isSelected()) {
                BookEvents.foodCost += 700;
            } else {
                BookEvents.foodCost -= 700;
            }
        });
        contentPane.add(chckbxNewCheckBox);

        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Plain Boiled-/3000");
        chckbxNewCheckBox_1.setBounds(333, 146, 132, 33);
        chckbxNewCheckBox_1.addActionListener(e -> {
            if (chckbxNewCheckBox_1.isSelected()) {
                BookEvents.foodCost += 3000;
            } else {
                BookEvents.foodCost -= 3000;
            }
        });
        contentPane.add(chckbxNewCheckBox_1);

        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Kabuli-/1300");
        chckbxNewCheckBox_2.setBounds(779, 146, 132, 33);
        chckbxNewCheckBox_2.addActionListener(e -> {
            if (chckbxNewCheckBox_2.isSelected()) {
                BookEvents.foodCost += 1300;
            } else {
                BookEvents.foodCost -= 1300;
            }
        });
        contentPane.add(chckbxNewCheckBox_2);

        JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Biriyani-/1100");
        chckbxNewCheckBox_1_1.setBounds(559, 146, 132, 33);
        chckbxNewCheckBox_1_1.addActionListener(e -> {
            if (chckbxNewCheckBox_1_1.isSelected()) {
                BookEvents.foodCost += 1100;
            } else {
                BookEvents.foodCost -= 1100;
            }
        });
        contentPane.add(chckbxNewCheckBox_1_1);

        JCheckBox chckbxNaan = new JCheckBox("Naan-/1000");
        chckbxNaan.setBounds(130, 263, 132, 33);
        chckbxNaan.addActionListener(e -> {
            if (chckbxNaan.isSelected()) {
                BookEvents.foodCost += 1000;
            } else {
                BookEvents.foodCost -= 1000;
            }
        });
        contentPane.add(chckbxNaan);

        JCheckBox chckbxTandoori = new JCheckBox("Tandoori-/2000");
        chckbxTandoori.setBounds(333, 263, 132, 33);
        chckbxTandoori.addActionListener(e -> {
            if (chckbxTandoori.isSelected()) {
                BookEvents.foodCost += 2000;
            } else {
                BookEvents.foodCost -= 2000;
            }
        });
        contentPane.add(chckbxTandoori);

        JCheckBox chckbxGarlicBread = new JCheckBox("Garlic Bread-/3500");
        chckbxGarlicBread.setBounds(559, 263, 132, 33);
        chckbxGarlicBread.addActionListener(e -> {
            if (chckbxGarlicBread.isSelected()) {
                BookEvents.foodCost += 3500;
            } else {
                BookEvents.foodCost -= 3500;
            }
        });
        contentPane.add(chckbxGarlicBread);

        JCheckBox chckbxOnzersSpecial = new JCheckBox("Onzer's Special-/3000");
        chckbxOnzersSpecial.setBounds(779, 263, 151, 33);
        chckbxOnzersSpecial.addActionListener(e -> {
            if (chckbxOnzersSpecial.isSelected()) {
                BookEvents.foodCost += 3000;
            } else {
                BookEvents.foodCost -= 3000;
            }
        });
        contentPane.add(chckbxOnzersSpecial);

        JCheckBox chckbxChicken = new JCheckBox("Chicken-/1200");
        chckbxChicken.setBounds(130, 407, 132, 33);
        chckbxChicken.addActionListener(e -> {
            if (chckbxChicken.isSelected()) {
                BookEvents.foodCost += 1200;
            } else {
                BookEvents.foodCost -= 1200;
            }
        });
        contentPane.add(chckbxChicken);

        JCheckBox chckbxBeef = new JCheckBox("Beef-/1500");
        chckbxBeef.setBounds(333, 407, 132, 33);
        chckbxBeef.addActionListener(e -> {
            if (chckbxBeef.isSelected()) {
                BookEvents.foodCost += 1500;
            } else {
                BookEvents.foodCost -= 1500;
            }
        });
        contentPane.add(chckbxBeef);

        JCheckBox chckbxMutton = new JCheckBox("Mutton-/1900");
        chckbxMutton.setBounds(559, 407, 132, 33);
        chckbxMutton.addActionListener(e -> {
            if (chckbxMutton.isSelected()) {
                BookEvents.foodCost += 1900;
            } else {
                BookEvents.foodCost -= 1900;
            }
        });
        contentPane.add(chckbxMutton);

        JCheckBox chckbxSeefood = new JCheckBox("Seefood-/2200");
        chckbxSeefood.setBounds(779, 407, 132, 33);
        chckbxSeefood.addActionListener(e -> {
            if (chckbxSeefood.isSelected()) {
                BookEvents.foodCost += 2200;
            } else {
                BookEvents.foodCost -= 2200;
            }
        });
        contentPane.add(chckbxSeefood);

        JCheckBox chckbxCoke = new JCheckBox("Coke-/100");
        chckbxCoke.setBounds(130, 518, 132, 33);
        chckbxCoke.addActionListener(e -> {
            if (chckbxCoke.isSelected()) {
                BookEvents.foodCost += 100;
            } else {
                BookEvents.foodCost -= 100;
            }
        });
        contentPane.add(chckbxCoke);

        JCheckBox chckbxSprite = new JCheckBox("Sprite-/100");
        chckbxSprite.setBounds(333, 518, 132, 33);
        chckbxSprite.addActionListener(e -> {
            if (chckbxSprite.isSelected()) {
                BookEvents.foodCost += 100;
            } else {
                BookEvents.foodCost -= 100;
            }
        });
        contentPane.add(chckbxSprite);

        JCheckBox chckbxMirinda = new JCheckBox("Mirinda-/100");
        chckbxMirinda.setBounds(559, 519, 132, 33);
        chckbxMirinda.addActionListener(e -> {
            if (chckbxMirinda.isSelected()) {
                BookEvents.foodCost += 100;
            } else {
                BookEvents.foodCost -= 100;
            }
        });
        contentPane.add(chckbxMirinda);

        JCheckBox chckbxIcecream = new JCheckBox("Icecream-/120");
        chckbxIcecream.setBounds(779, 518, 132, 33);
        chckbxIcecream.addActionListener(e -> {
            if (chckbxIcecream.isSelected()) {
                BookEvents.foodCost += 120;
            } else {
                BookEvents.foodCost -= 120;
            }
        });
        contentPane.add(chckbxIcecream);
    }
}