package com.company;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JMyFrame("Logowanie");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setSize(400, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//gdy zamkniemy okono to rowniez zastopujemy dzialanie programu
                frame.setLocationRelativeTo(null); //okno pokazuje sie na srodku monitora
                frame.setVisible(true);
                frame.setResizable(false);//nie moza zmieniac wielkosci
            }
        });

    }

}
