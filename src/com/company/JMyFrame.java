package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMyFrame extends JFrame {

    private final static UserBase userBase = new UserBase();
    private final static  Color RED = new Color(255,0,0);
    private final static Color GREEN = new Color(0,255,0);


    public JMyFrame(String title)
    {
        super(title);
        try {
            //Tworzymy elementy ktore bedziemy dodawac do naszego okna
            JLabel loginJLabel = new JLabel("Login: ");
            JLabel passwordJLabel = new JLabel("Haslo: ");

            JTextField loginJTextField = new JTextField(15);
            JPasswordField passwordJTextField = new JPasswordField(15);

            JButton logBtn = new JButton("Zaloguj");
            JButton resetBtn = new JButton("Reset");

            setLayout( new GridBagLayout());
            GridBagConstraints gridBagConstraints= new GridBagConstraints();
            //ustawiamy i dodajmy elementy
            gridBagConstraints.weightx=0.1;
            gridBagConstraints.weighty=0.1;

            gridBagConstraints.anchor = GridBagConstraints.LINE_END;
            gridBagConstraints.gridx=0;
            gridBagConstraints.gridy=0;
            add(loginJLabel,gridBagConstraints);

            gridBagConstraints.gridx=0;
            gridBagConstraints.gridy=1;
            add(passwordJLabel,gridBagConstraints);

            gridBagConstraints.anchor = GridBagConstraints.LINE_START;
            gridBagConstraints.gridx=1;
            gridBagConstraints.gridy=0;
            add(loginJTextField,gridBagConstraints);

            gridBagConstraints.gridx=1;
            gridBagConstraints.gridy=1;
            add(passwordJTextField,gridBagConstraints);

            gridBagConstraints.weightx=0.5;
            gridBagConstraints.weighty=0.5;

            gridBagConstraints.gridx=1;
            gridBagConstraints.gridy=2;
            add(logBtn,gridBagConstraints);

            gridBagConstraints.anchor=GridBagConstraints.LAST_LINE_END;
            gridBagConstraints.weightx=1;
            gridBagConstraints.weighty=1;
            add(resetBtn,gridBagConstraints);
            //prgramujemy dzialanie guzikow
            logBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String login=loginJTextField.getText();
                    char[] password=passwordJTextField.getPassword();

                    if(userBase.confirm(login,String.valueOf(password))){
                        getContentPane().setBackground(GREEN);
                        loginJTextField.setText("");
                        passwordJTextField.setText("");
                    }
                    else {
                        getContentPane().setBackground(RED);
                        passwordJTextField.setText("");
                    }

                }
            });

            resetBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

        }catch (Exception e){
            System.out.println("Cos poszlo nie tak");
            System.out.println(e.getMessage());
        }



    }
}
