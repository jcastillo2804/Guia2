package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número [1-7]...: ");
		int n = sc.nextInt();
		
		String nombre_dia = "";
		
		switch (n) {
			case 1:
				nombre_dia = "Lunes";
				break;
			case 2:
				nombre_dia = "Martes";
				break;
			default:
				nombre_dia = "Desconocido";
		}
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Día de la semana.......: " + nombre_dia);
	}

}
