package project01;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the number: ");
		int j = SC.nextInt();
		System.out.println("multiplication table for: "+j);
		for (int i = 1; i <= 10; i++) {
			int k = j * i;
			System.out.println(i + " * " + j + " = " + k);

		}

	}

}
