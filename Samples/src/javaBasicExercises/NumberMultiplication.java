package javaBasicExercises;

import java.util.Scanner;

public class NumberMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int i = scan.nextInt();
		System.out.println("Enter secound number : ");
		int j = scan.nextInt();
		int mul = i*j;
        
        System.out.println("Output:"+mul);

	}

}
