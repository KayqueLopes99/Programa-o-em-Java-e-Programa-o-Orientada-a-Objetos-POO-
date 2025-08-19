package Udemy.Code.Generics.PrintServices;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = scanner.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		scanner.close();
	}
}
