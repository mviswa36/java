package javaBasicExercises;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int i = scan.nextInt();
		for( int j=1; j<=10; j++){
			System.out.println(i+"*"+j+" = "+(i*j));
		}

	}

}
