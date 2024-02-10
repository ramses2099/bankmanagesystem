package com.jprograming.form;

import com.jprograming.db.DbConnectionPostgress;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrmSignUpOne extends JFrame implements ActionListener {

    public final static String TITLE_FROM = "Sign UP";
    private JPanel pnlPrincipal;
    private JLabel lblTitle;
    private JLabel lblTitle2;
    private JPanel pnlTitle;
    private JPanel pnlButton;
    private JRadioButton rbtnMale;
    private JRadioButton rbtnFemale;
    private JRadioButton rbtnMarrie;
    private JRadioButton rbtnSingle;
    private JButton btnNext;
    private JPanel pnlCard;
    private JPanel pnlCard1;
    private JPanel pnlCard2;
    private JPanel pnlCard3;
    private ButtonGroup btngrpStatusMarital;
    private ButtonGroup btngrpGender;
    private Random random;
    private static int PAGE = 1;

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
        pnlButton.setBackground(Color.WHITE);
        pnlTitle.setBackground(Color.WHITE);

        random = new Random();
        Long formNumber = (Math.abs((random.nextLong() % 900L) + 1000L));
        lblTitle.setText(String.format("APPLICATION NO.:%s", formNumber));
        PAGE = 1;
        lblTitle2.setText(String.format("Page %s: Personal Details", PAGE));
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
        btnNext.addActionListener(this);


        try {
            ImageIcon imageIcon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/icons/logo.jpg")));
            setIconImage(imageIcon.getImage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (PAGE == 1) {
            pnlCard.removeAll();
            pnlCard.add(pnlCard1);
            pnlCard.repaint();
            pnlCard.revalidate();
            lblTitle2.setText(String.format("Page %s: Personal Details", PAGE));
            PAGE += 1;
        } else if (PAGE == 2) {
            pnlCard.removeAll();
            pnlCard.add(pnlCard2);
            pnlCard.repaint();
            pnlCard.revalidate();
            lblTitle2.setText(String.format("Page %s: Personal Details", PAGE));
            PAGE += 1;
        } else if (PAGE == 3) {
            pnlCard.removeAll();
            pnlCard.add(pnlCard3);
            pnlCard.repaint();
            pnlCard.revalidate();
            lblTitle2.setText(String.format("Page %s: Personal Details", PAGE));
            PAGE += 1;
        } else if (PAGE == 4) {
            PAGE = 1;
            lblTitle2.setText(String.format("Page %s: Personal Details", PAGE));
            pnlCard.removeAll();
            pnlCard.add(pnlCard1);
            pnlCard.repaint();
            pnlCard.revalidate();
        }
    }
}
