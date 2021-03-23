package com.senati.eti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado........: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nivel [1-4].....: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo..........: ");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		
		switch (nivel) {
			case 1:
				inc = 0.045f;
			case 2:
				inc = 0.06f;
		}
		
		
	}

}
