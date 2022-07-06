package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        var scanner = new Scanner(System.in);
        System.out.println("Enter numeric value");
        var input = scanner.nextDouble();
        System.out.println("Enter second one");
        var input1 = scanner.nextDouble();
        var sum = input/ input1;
        System.out.println("The answer is :" +sum);
    }
}
