package com.zipcode;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Instance variables.
        double a = 0;
        double b = 0;
        double c = 0;
        String operator = "";
        String y = "";
        String n = "";

        //Welcome formatting and user input.
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("-------%---!---*---^---Let's CALCULATE!---+--- - ----*---/-------");
        System.out.println("     J    a   v     v   a        CCCCC      a     L        CCCCC ");
        System.out.println("     J   a a   v   v   a a      C          a a    L       C ");
        System.out.println(" J   J  aaaaa   V V   aaaaa     C         aaaaa   L       C ");
        System.out.println(" JJJJ  a     a   V   a     a     CCCCC   a     a  LLLLLL   CCCCC ");
        System.out.println();
        System.out.println("  Welcome! I am Calculus, your basic personal Java Calculator! ");
        System.out.println();
        System.out.println("Operators: +   -   *   /   %  ^2  ^x  sqrt  cbrt  !  r (reciprocal)");
        System.out.println("--------> sin   cos   tan   sinh   cosh   tanh   asin   acos   atan");
        System.out.println();
        System.out.println("Enter your first number: ");
        a = input.nextDouble();
        System.out.println("Enter a second number if it applies, otherwise enter 0: ");
        b = input.nextDouble();
        System.out.println();
        System.out.println("Enter an operator: ");
        //System.out.println("If you wish to see a number squared, please .");
        operator = input.next();
        operator.toLowerCase();

        //Math operations being performed.
        switch(operator) {
            case "+": c = a + b;
                break;

            case "-":
                c = Math.abs(a - b);
                break;

            case "*":
                c = a * b;
                break;

            case "/":
                c = a / b;
                break;

            case "%":
                c = a % b;
                break;

            case "^2":
                c = a * a;
                break;

            case "^x":
                c = Math.pow(a, b);
                break;

            case "sqrt":
                c = Math.sqrt(a);
                break;

            case "cbrt":
                c = Math.cbrt(a);
                break;

            case "!":
                for (double i = a; i > 0; i--) {
                    a = a * i;
                    c = a; };
                break;

            case "sin":
                c = Math.sin(a);
                break;

            case "cos":
                c = Math.cos(a);
                break;

            case "tan":
                c = Math.tan(a);
                break;

            case "sinh":
                c = Math.sinh(a);
                break;

            case "cosh":
                c = Math.cosh(a);
                break;

            case "tanh":
                c = Math.tanh(a);
                break;

            case "asin":
                c = Math.asin(a);
                break;

            case "acos":
                c = Math.acos(a);
                break;

            case "atan":
                c = Math.atan(a);
                break;

            case "r":
                c = 1 / a;
                break;

            default:
                System.out.println("You have entered an invalid operator. Please try again.");
        }

        //Answer output.
        System.out.println("Your answer is: " + a + " " + b + " " + "= " + c);
//        System.out.println("Would you like to perform another operation? (y/n)");
//        y = input.next();
//        n = input.next();
//        if ()

    }
}
