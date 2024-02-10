package com.jprograming.form;

import javax.swing.*;

public class FrmTest extends  JFrame{
    private JPanel pnlPrincipal;

    public FrmTest(){
        setContentPane(pnlPrincipal);
        setVisible(true);
        setSize(800, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Test layout");
    }
}
