package javaBasicExercises;

import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Circle Radius : ");
		int i = scan.nextInt();
		System.out.println("Circle Perimeter : "+(3.142*2*i));
		System.out.println("Circle Area : "+(3.142*i*i));

	}

}
