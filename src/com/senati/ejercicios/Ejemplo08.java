package com.senati.ejercicios;

import java.util.Scanner;

public class Ejemplo08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double lado, area, perimetro;
		System.out.println("Digite el lado del cuadrado");
		lado = sc.nextDouble();
		area = lado*lado;
		perimetro = lado * 4;
		
		System.out.println("El area del cuadrado es " + area);
		System.out.println("El perimetro del cuadrado es " + perimetro);
		
	}
}
