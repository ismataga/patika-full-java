package com.udemy.lambda_expression;

public class Main {
    public static void main(String[] args) {

        Maths maths = new Maths() {
            public int transactional(int a, int b) {
                return a + b;
            }
        };


        Maths toplama = (a, b) -> (a + b);
        Maths cixma = (a, b) -> (a - b);
        Maths vurma = (a, b) -> (a * b);
        Maths bolme = (a, b) -> {
            if (a == 0) {
                a = 1;
            }
            return a / b;
        };

        System.out.println(toplama.transactional(10, 2));
        System.out.println(cixma.transactional(10, 2));
        System.out.println(vurma.transactional(10, 2));
        System.out.println(bolme.transactional(10, 2));
    }


}