package com.ll;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Calc.run("3 * 1");
    }
}


class Calc {
    static void run(String form) {
        String[] forms = form.split(" ");
        Stack<Double> stack = new Stack<Double>();
        double answer = 0;
        String[] operation = {"+", "-", "*", "/"};

        for (int i = 0; i < forms.length; i++) {
            if (forms[i].equals("+")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[i + 1]);
                answer = a + b;
            } else if (forms[i].equals("-")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[i + 1]);
                answer = a - b;
            } else if (forms[i].equals("*")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[i + 1]);
                answer = a * b;
            } else if (forms[i].equals("/")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[i + 1]);
                answer = a / b;
            } else {
                stack.push(Double.parseDouble(forms[i]));
            }
        }

        System.out.println((int)answer);
    }
}
