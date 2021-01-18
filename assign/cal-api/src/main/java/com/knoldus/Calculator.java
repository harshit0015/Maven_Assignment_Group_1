package com.knoldus;

public class Calculator {

    public void add(int a , int b) {
        int res = a + b;
        System.out.println(" Addition of numbers  are: " +res);
    }

    public void sub(int a , int b) {
        int res = a - b;
        System.out.println(" Substraction of numbers are: " +res);
    }

    public void mul(int a , int b) {
        int res = a * b;
        System.out.println(" Multiplication of numbers are " +res);
    }

    public void div(int a , int b) {
        int res = a % b;
        System.out.println(" Division of numbers are: " +res);
    }
}

