package com.senati.ejercicios;

import java.util.Scanner;

public class Ejemplo07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, notamenor, promedio = 0;
		System.out.println("Digite nota 1");
		nota1 = sc.nextDouble();
		System.out.println("Digite nota 2");
		nota2 = sc.nextDouble();
		System.out.println("Digite nota 3");
		nota3 = sc.nextDouble();
		System.out.println("Digite nota 4");
		nota4 = sc.nextDouble();
		
		if (nota1 < nota2) {
			notamenor = nota1;
		}else {
			notamenor = nota2;
		}
		
		if (notamenor > nota3) {
			notamenor = nota3;
		}	
		
		if (notamenor > nota4) {
			notamenor = nota4;
		}
		
		System.out.println("La nota mas baja es: " + notamenor + " y no sera considerada para el promedio");
		
		System.out.println("El promedio final es: " + (nota1+nota2+nota3+nota4-notamenor)/3);
		
				
	}

}
