package Pratice1.src;

import java.util.Scanner;

public class Calculator {
    public static final char Addition = '+';
    public static final char Subtraction = '-';
    public static final char Multiplication = '*';
    public static final char Division = '/';
    public static int Calculate(int firstOperand, int secondOperand, int operator) {
        switch (operator) {
            case Addition:
                return firstOperand + secondOperand;
            case Subtraction:
                return firstOperand - secondOperand;
            case Multiplication:
                return firstOperand * secondOperand;
            case Division:
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("Can not divide by zero");
                }
                default:
                    throw new RuntimeException("Unsupported operator");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int firstOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second operand: ");
        int secondOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter operator: ");
        char operator = scanner.nextLine().charAt(0);

        int result = Calculate(firstOperand, secondOperand, operator);
        System.out.println("result: "+ result);
    }
}

