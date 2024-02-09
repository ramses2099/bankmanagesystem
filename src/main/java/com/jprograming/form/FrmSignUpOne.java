package com.jprograming.form;

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
    private ButtonGroup btngrpGender;
    private Random random;

    public FrmSignUpOne() {

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
        lblTitle = new JLabel();
        lblTitle.setText(String.format("APPLICATION NO.:%S",formNumber));
        lblDetails = new JLabel();
        lblFirstName = new JLabel();
        txtFirstName = new JTextField();
        rbtnMale = new JRadioButton();
        rbtnFemale = new JRadioButton();
        btngrpGender = new ButtonGroup();
        btngrpGender.add(rbtnMale);
        btngrpGender.add(rbtnFemale);






    }
}
