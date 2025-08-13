package Pratice1;

import Pratice1.src.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int firstOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second operand: ");
        int secondOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter operator: ");
        char operator = scanner.nextLine().charAt(0);

        int result = Calculator.Calculate(firstOperand, secondOperand, operator);
        System.out.println("result: "+ result);
    }
}
