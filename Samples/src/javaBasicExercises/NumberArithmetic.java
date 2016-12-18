package javaBasicExercises;

import java.util.Scanner;

public class NumberArithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int i = scan.nextInt();
		System.out.println("Enter secound number : ");
		int j = scan.nextInt();

		System.out.println("Addition of given number's :"+(i+j));
		System.out.println("Subtraction of given number's :"+(i-j));
		System.out.println("multilication of given number's :"+(i*j));
		System.out.println("division of given number's :"+(i/j));
		System.out.println("modulous of given number's :"+(i%j));
	}

}
