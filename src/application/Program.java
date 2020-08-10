package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello World!!!");
		System.out.println("Digite numeros para soma:");
		int nmb1 = sc.nextInt();
		int nmb2 = sc.nextInt();
		int result = nmb1 + nmb2;
		
		System.out.println("numeros somados: " + result);
		
		sc.close();
	}

}
