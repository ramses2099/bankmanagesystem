package com.jprograming.form;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin extends JFrame implements ActionListener {

    public final static String TITLE_FORM = "Automated teller machine (ATM)";
    public final static String TITLE = "Welcome to (ATM)";
    public final static String CARDNO = "Card No.:";
    public final static String PIN = "PIN:";
    public final static String SIGN_IN = "SIGN IN";
    public final static String CLEAR = "CLEAR";
    public final static String SIGN_UP = "SIGN UP";

    private JLabel lblIcon;
    private JLabel lblTitle;
    private JLabel lblCardNo;
    private JLabel lblPin;
    private JTextField txtCardNo;
    private JPasswordField txtPin;
    private JButton btnLogin;
    private JButton btnClear;
    private JButton btnSignUp;

    public FrmLogin() {

        setVisible(true);
        setSize(800, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle(TITLE_FORM);
        //Layout
        setLayout(null);
        //icon form

        try {
            ImageIcon imageIcon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/icons/logo.jpg")));
            setIconImage(imageIcon.getImage());

            Image img2 = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon imageIcon1 = new ImageIcon(img2);
            lblIcon = new JLabel(imageIcon1);
            lblIcon.setBounds(70, 10, 100, 100);
            add(lblIcon);
            //
            lblTitle = new JLabel(TITLE);
            lblTitle.setFont(new Font("Osward", Font.BOLD, 38));
            lblTitle.setBounds(200, 40, 500, 40);
            add(lblTitle);

            lblCardNo = new JLabel(CARDNO);
            lblCardNo.setFont(new Font("Raleway", Font.BOLD, 28));
            lblCardNo.setBounds(120, 150, 150, 30);
            add(lblCardNo);

            txtCardNo = new JTextField();
            txtCardNo.setBounds(300, 150, 230, 30);
            txtCardNo.setFont(new Font("Arial",Font.BOLD,14));
            add(txtCardNo);

            lblPin = new JLabel(PIN);
            lblPin.setFont(new Font("Raleway", Font.BOLD, 28));
            lblPin.setBounds(120, 220, 250, 30);
            add(lblPin);

            txtPin = new JPasswordField();
            txtPin.setBounds(300, 220, 230, 30);
            txtPin.setFont(new Font("Arial",Font.BOLD,14));
            add(txtPin);

            btnLogin = new JButton(SIGN_IN);
            btnLogin.setBounds(300, 300, 100, 30);
            btnLogin.setBackground(Color.BLACK);
            btnLogin.setForeground(Color.WHITE);
            btnLogin.addActionListener(this);
            add(btnLogin);

            btnClear = new JButton(CLEAR);
            btnClear.setBounds(430, 300, 100, 30);
            btnClear.setBackground(Color.BLACK);
            btnClear.setForeground(Color.WHITE);
            btnClear.addActionListener(this);
            add(btnClear);

            btnSignUp = new JButton(SIGN_UP);
            btnSignUp.setBounds(300, 350, 230, 30);
            btnSignUp.setBackground(Color.BLACK);
            btnSignUp.setForeground(Color.WHITE);
            btnSignUp.addActionListener(this);
            add(btnSignUp);


            //Color background Form
            getContentPane().setBackground(Color.WHITE);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Event click buttons
        if (e.getSource() == btnLogin) {
            //TODO code here
        } else if (e.getSource() == btnClear) {
            this.txtPin.setText("");
            this.txtCardNo.setText("");
        } else if (e.getSource() == btnSignUp) {
            //TODO code here
        }


    }
}
