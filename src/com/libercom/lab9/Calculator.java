package com.libercom.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField firstInput;
    private JTextField secondInput;
    private JLabel result;
    private JButton divideButton;

    public Calculator() {
        super("Calculator");

        this.firstInput = new JTextField(15);
        this.secondInput = new JTextField(15);
        this.result = new JLabel("Result: ");
        this.divideButton = new JButton("Divide");

        this.add(this.firstInput);
        this.add(this.secondInput);
        this.add(this.result);
        this.add(this.divideButton);

        this.divideButton.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            double firstNumber = Double.parseDouble(this.firstInput.getText());
            double secondNumber = Double.parseDouble(this.secondInput.getText());
            double quotient = firstNumber / secondNumber;

            if (secondNumber == 13.0) {
                throw new UnluckyException();
            }

            this.result.setText("Result: " + quotient);
        } catch(Exception exception) {
            this.result.setText("Error: " + exception.getMessage());
        }
    }
}