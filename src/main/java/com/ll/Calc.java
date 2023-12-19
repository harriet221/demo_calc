package com.ll;

import java.util.Stack;

public class Calc {
    public static int run(String exp) {
        if(exp.contains("(") && exp.contains(")")) {
            exp = outOfBracket(exp);
        }

        String[] operation = exp.split(" ");
        Stack<Integer> stack = new Stack<>();

        if(exp.isBlank()) return -999;
        int i = 0;

        while(i<operation.length) {
            String op = operation[i++].trim();

            if(op.equals("+")) {
                int b = Integer.parseInt(operation[i++].trim());
                int a = stack.pop();
                stack.push(a+b);
            } else if(op.equals("-")) {
                int b = Integer.parseInt(operation[i++].trim());
                int a = stack.pop();
                stack.push(a-b);
            } else if(op.equals("*")) {
                int b = Integer.parseInt(operation[i++].trim());
                int a = stack.pop();
                stack.push(a*b);
            } else if(op.equals("/")) {
                int b = Integer.parseInt(operation[i++].trim());
                int a = stack.pop();
                if(b == 0) {
                    System.out.println("0으로 나누지 말라고");
                    return -999;
                }
                stack.push((int)(a/b));
            } else {
                int k = Integer.parseInt(op);
                stack.push(k);
            }
        }
        return stack.pop();
    }

    public static String outOfBracket(String exp) {
        while (exp.startsWith("(") && exp.endsWith(")")) {
            exp = exp.substring(1, exp.length()-1);
        }
        return exp;
    }
}
