package com.jprograming.form;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FrmSignUpOne extends JFrame {

    public final static String TITLE_FROM = "Sign UP";
    private JPanel pnlPrincipal;
    private JLabel lblTitle;
    private JLabel lblDetails;
    private JTextField txtFirstName;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblDateOfBirth;
    private JLabel Gender;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblAddress;
    private JTextField txtAddress;
    private JLabel lblCity;
    private JTextField txtCity;
    private JLabel lblState;
    private JTextField txtState;
    private JLabel lblPinCode;
    private JTextField txtPinCode;
    private JRadioButton rbtnMale;
    private JRadioButton rbtnFemale;
    private JRadioButton rbtnMarrie;
    private JRadioButton rbtnSingle;
    private JButton btnNext;
    private ButtonGroup btngrpStatusMarital;
    private ButtonGroup btngrpGender;
    private Random random;

    public FrmSignUpOne() {
        setContentPane(pnlPrincipal);
        getContentPane().setBackground(Color.WHITE);

        setTitle(TITLE_FROM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(850, 800);
        setLocationRelativeTo(null);
        setVisible(true);

        // Control set
        setContentPane(pnlPrincipal);
        getContentPane().setBackground(Color.WHITE);

        random = new Random();
        Long formNumber = (Math.abs((random.nextLong() % 900L) + 1000L));
        lblTitle.setText(String.format("APPLICATION NO.:%s", formNumber));
        //
        btngrpGender = new ButtonGroup();
        btngrpGender.add(rbtnMale);
        btngrpGender.add(rbtnFemale);
        //
        btngrpStatusMarital = new ButtonGroup();
        btngrpStatusMarital.add(rbtnMarrie);
        btngrpStatusMarital.add(rbtnSingle);
        //
        btnNext.setBackground(Color.BLACK);
        btnNext.setForeground(Color.WHITE);

        try {
            ImageIcon imageIcon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/icons/logo.jpg")));
            setIconImage(imageIcon.getImage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }






    }
}
