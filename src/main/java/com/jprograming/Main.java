package com.jprograming;

import com.jprograming.form.FrmSignUpOne;
import com.jprograming.form.FrmTest;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmSignUpOne();
            }
        });

    }
}