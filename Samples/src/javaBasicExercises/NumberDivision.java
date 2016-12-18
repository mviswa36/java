package javaBasicExercises;

import java.util.Scanner;

public class NumberDivision {

	public static void main(String[] args) {

 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int i = scan.nextInt();
		System.out.println("Enter a number to divide above given number: ");
		int j = scan.nextInt();
		int div = i/j;
        
        System.out.println("Output:"+div);

	}

}
