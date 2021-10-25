package com.libercom.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Stack;

public class BalancedParentheses {
    public static boolean check(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void checkFromFile(URL url) {
        File file = new File(url.getPath());

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                boolean res = check(line);
                System.out.println(res ? "The expression is correct" : "The expression isn't correct");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
