package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Condition {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        double d1,d2;
        try{
            System.out.println("Enter first value");
            d1=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter second value");
            d2=sc.nextDouble();
            sc.nextLine();
        }catch (InputMismatchException e){
            System.out.println("couldnt format");
            return;
        }

        System.out.println("Enter an operation(+,-,*,/):");
        var operation= sc.nextLine();
        double result;
        switch(operation){
            case "+":
                result= CalcHelper.addValues(d1,d2);
                break;
            case "-":
                result= CalcHelper.subValues(d1,d2);
                break;
            case "*":
                result= CalcHelper.mulValues(d1,d2);
                break;
            case "/":
                result= CalcHelper.divValues(d1,d2);
                break;
            default:
                System.out.println("Invalid operation");
return;

        }
        System.out.println("The answer is:"+result);

    }
}
