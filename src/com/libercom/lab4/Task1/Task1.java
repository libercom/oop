package com.libercom.lab4.Task1;

import com.libercom.lab4.BalancedParentheses;
import java.net.URL;

public class Task1 {
    public static void main(String[] args) {
        URL url = Task1.class.getResource("one_expression.txt");
        BalancedParentheses.checkFromFile(url);
    }
}
