package com.ll;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("결과 : " + (Calc.run("3 * 1")==3));
    }
}


class Calc {
    static int run(String form) {
        String[] forms = form.split(" ");
        Stack<Double> stack = new Stack<Double>();
        double answer = 0;
        String[] operation = {"+", "-", "*", "/"};

        for (int i = 0; i < forms.length; i++) {
            if (forms[i].equals("+")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[++i]);
                stack.push(a + b);
            } else if (forms[i].equals("-")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[++i]);
                stack.push(a - b);
            } else if (forms[i].equals("*")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[++i]);
                stack.push(a * b);
            } else if (forms[i].equals("/")) {
                double a = stack.pop();
                double b = Double.parseDouble(forms[++i]);
                if(b == 0) {
                    System.out.println("0으로 나누면 안됨");
                    return -1;
                }
                stack.push(a / b);
            } else {
                stack.push(Double.parseDouble(forms[i]));
            }
        }
        answer = stack.pop();
        return (int)answer;
    }
}
