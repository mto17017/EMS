package Main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Theme extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Theme frame = new Theme();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Theme() {
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

        JLabel title = new JLabel("  Select A Theme");
        title.setBounds(382, 10, 397, 77);
        title.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 60));
        title.setForeground(new Color(255, 255, 255));
        contentPane.add(title);

        JLabel eventName_lbl = new JLabel("Decor Color  :");
        eventName_lbl.setForeground(new Color(255, 255, 255));
        eventName_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eventName_lbl.setBounds(110, 162, 155, 68);
        contentPane.add(eventName_lbl);

        JLabel eventTyp_lbl = new JLabel("Photo and Films:\r\n");
        eventTyp_lbl.setForeground(new Color(255, 255, 255));
        eventTyp_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eventTyp_lbl.setBounds(110, 410, 155, 42);
        contentPane.add(eventTyp_lbl);

        JButton btn_back = new JButton("BACK");
        btn_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                FoodMenu f = new FoodMenu();
                f.setVisible(true);
            }
        });
        btn_back.setBackground(new Color(192, 192, 192));
        btn_back.setForeground(new Color(47, 79, 79));
        btn_back.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_back.setBounds(277, 560, 171, 42);
        contentPane.add(btn_back);

        JButton btn_nxt = new JButton("NEXT\r\n");
        btn_nxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Checkout c = new Checkout();
                c.setVisible(true);
            }
        });
        btn_nxt.setBackground(new Color(192, 192, 192));
        btn_nxt.setForeground(new Color(47, 79, 79));
        btn_nxt.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn_nxt.setBounds(721, 560, 155, 42);
        contentPane.add(btn_nxt);

        JComboBox comboBox_evType_1 = new JComboBox();
        comboBox_evType_1.setModel(new DefaultComboBoxModel(new String[] { "Select Types  :", "1. Photograpy", "2. Cinematography",
                "3. Photography & Cinematography", "4. Drone Filming" }));
        comboBox_evType_1.setForeground(new Color(47, 79, 79));
        comboBox_evType_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        comboBox_evType_1.setBackground(new Color(224, 255, 255));
        comboBox_evType_1.setBounds(363, 410, 513, 42);
        comboBox_evType_1.addActionListener(e -> {
            if ( comboBox_evType_1.isShowing()) {
                BookEvents.themeCost += 3000;
            } else {
                BookEvents.themeCost -= 3000;
            }
        });
        contentPane.add(comboBox_evType_1);

        JComboBox comboBox_evType = new JComboBox();
        comboBox_evType.setModel(new DefaultComboBoxModel(new String[] { "Select A Color:", "1. Golden", "2. Silver", "3. White",
                "4. Red", "5. Others" }));
        comboBox_evType.setForeground(new Color(47, 79, 79));
        comboBox_evType.setFont(new Font("Tahoma", Font.PLAIN, 20));
        comboBox_evType.setBackground(new Color(224, 255, 255));
        comboBox_evType.setBounds(363, 175, 513, 42);
        contentPane.add(comboBox_evType);

        JLabel srtTime_lbl = new JLabel("1. Studio Name :");
        srtTime_lbl.setForeground(Color.WHITE);
        srtTime_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        srtTime_lbl.setBounds(154, 463, 171, 53);
        contentPane.add(srtTime_lbl);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setColumns(10);
        textField.setBounds(363, 470, 132, 40);
        contentPane.add(textField);

        JLabel srtTime_lbl_1 = new JLabel("2. Studio Contact :");
        srtTime_lbl_1.setForeground(Color.WHITE);
        srtTime_lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        srtTime_lbl_1.setBounds(523, 463, 171, 53);
        contentPane.add(srtTime_lbl_1);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField_1.setColumns(10);
        textField_1.setBounds(727, 470, 149, 40);
        contentPane.add(textField_1);

        JLabel eventName_lbl_1 = new JLabel("Event's Items:");
        eventName_lbl_1.setForeground(Color.WHITE);
        eventName_lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eventName_lbl_1.setBounds(110, 244, 155, 68);
        contentPane.add(eventName_lbl_1);

        JCheckBox chckbxStage = new JCheckBox("Stage 2000/-");
        chckbxStage.setForeground(new Color(47, 79, 79));
        chckbxStage.setFont(new Font("Tahoma", Font.BOLD, 15));
        chckbxStage.setBounds(359, 244, 195, 33);
        chckbxStage.addActionListener(e -> {
            if (chckbxStage.isSelected()) {
                BookEvents.themeCost += 2000;
            } else {
                BookEvents.themeCost -= 2000;
            }
        });
        contentPane.add(chckbxStage);

        JCheckBox chckbxHeadTable = new JCheckBox("Head Table 1500/-");
        chckbxHeadTable.setForeground(new Color(47, 79, 79));
        chckbxHeadTable.setFont(new Font("Tahoma", Font.BOLD, 15));
        chckbxHeadTable.setBounds(359, 297, 195, 33);
        chckbxHeadTable.addActionListener(e -> {
            if (chckbxHeadTable.isSelected()) {
                BookEvents.themeCost += 1500;
            } else {
                BookEvents.themeCost -= 1500;
            }
        });
        contentPane.add(chckbxHeadTable);

        JCheckBox chckbxEntryGate = new JCheckBox("Entry Gate 2500/-");
        chckbxEntryGate.setForeground(new Color(47, 79, 79));
        chckbxEntryGate.setFont(new Font("Tahoma", Font.BOLD, 15));
        chckbxEntryGate.setBounds(688, 244, 188, 33);
        chckbxEntryGate.addActionListener(e -> {
            if (chckbxEntryGate.isSelected()) {
                BookEvents.themeCost += 2500;
            } else {
                BookEvents.themeCost -= 2500;
            }
        });
        contentPane.add(chckbxEntryGate);

        JCheckBox chckbxPhotoBooth = new JCheckBox("Photo Booth 3000/-");
        chckbxPhotoBooth.setForeground(new Color(47, 79, 79));
        chckbxPhotoBooth.setFont(new Font("Tahoma", Font.BOLD, 15));
        chckbxPhotoBooth.setBounds(688, 302, 188, 33);
        chckbxPhotoBooth.addActionListener(e -> {
            if (chckbxPhotoBooth.isSelected()) {
                BookEvents.themeCost += 3000;
            } else {
                BookEvents.themeCost -= 3000;
            }
        });
        contentPane.add(chckbxPhotoBooth);

        JCheckBox chckbxAddOns = new JCheckBox("Add Ons 1000/-");
        chckbxAddOns.setForeground(new Color(47, 79, 79));
        chckbxAddOns.setFont(new Font("Tahoma", Font.BOLD, 15));
        chckbxAddOns.setBounds(530, 355, 195, 33);
        chckbxAddOns.addActionListener(e -> {
            if (chckbxAddOns.isSelected()) {
                BookEvents.themeCost += 1000;
            } else {
                BookEvents.themeCost -= 1000;
            }
        });
        contentPane.add(chckbxAddOns);
    }
}