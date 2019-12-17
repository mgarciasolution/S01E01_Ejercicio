package com.senati.ejercicios;

import java.util.Scanner;
import java.text.*;

public class Ejemplo15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formato1 = new DecimalFormat("#.00");
		double sueldo, descuento;
		int faltas;
		
		System.out.println("Digite el sueldo del trabajador");
		sueldo = sc.nextDouble();
		System.out.println("Digite la cantidad de faltas");
		faltas = sc.nextInt();
		
		if (faltas>=2) {
			descuento = sueldo * 0.05;
			System.out.println("Aplica descuento de 5% por " + faltas + " faltas: $" + formato1.format(descuento));
		}else {
			descuento = 0;
		}
		
		System.out.println("El valor que se va a pagar es: $" + formato1.format(sueldo - descuento));		
	}
}
