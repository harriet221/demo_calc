package com.ll;

public class Calc {
    public static int run(String exp) {
        String[] operation = exp.split(" ");
        if(exp.equals("")) return 0;

        int a = Integer.parseInt(operation[0]);
        String op = operation[1];
        int b = Integer.parseInt(operation[2]);

        if(op.equals("+")) {
            return a+b;
        } else if(op.equals("-")) {
            return a-b;
        } else if(op.equals("*")) {
            return a*b;
        } else if(op.equals("/")) {
            if(b == 0) {
                System.out.println("0으로 나누지 말라고");
                return -999;
            }
            return (int)a/b;
        }

        return 0;
    }
}
