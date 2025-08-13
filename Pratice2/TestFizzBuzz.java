package Pratice2;

import Pratice2.src.Fizzbuzz;

import java.util.Scanner;

public class TestFizzBuzz {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 1 ; i <= number; i++){
            result =result.concat(Fizzbuzz.FizzBuzz(i)+ " " );
        }
        System.out.println(result);
    }
}
