package com.libercom.lab4.Task2;

import com.libercom.lab4.BalancedParentheses;
import java.net.URL;

public class Task2 {
    public static void main(String[] args) {
        URL url = Task2.class.getResource("three_expressions.txt");
        BalancedParentheses.checkFromFile(url);
    }
}
