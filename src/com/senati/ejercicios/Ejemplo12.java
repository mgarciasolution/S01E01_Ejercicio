package com.senati.ejercicios;

import java.util.Scanner;

public class Ejemplo12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite el numero");
		numero= sc.nextDouble();
		
		System.out.println("El doble de " + numero + " es: " + (numero * 2));
		System.out.println("El triple de " + numero + " es: " + (numero * 3));
		System.out.println("El cuadrado de " + numero + " es: " + (numero * numero));
		System.out.println("El cubo de " + numero + " es: " + (numero * numero * numero));
	}

}
