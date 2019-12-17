package com.senati.ejercicios;

import java.util.Scanner;
import java.text.*;

public class Ejemplo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formato1 = new DecimalFormat("#.00");
		double costo, descuento;
		int edad;
		
		
		System.out.println("Digite el valor de la ropa");
		costo = sc.nextDouble();
		System.out.println("Digite la edad del cliente");
		edad = sc.nextInt();
		
		if (edad < 18){
			descuento = costo * 0.15;
			System.out.println("Aplica descuento de: $" + formato1.format(descuento));
		}else if (edad <= 60) {
			descuento = 0;
			System.out.println("No aplica descuento");
		}else {
			descuento = costo * 0.3;
			System.out.println("Aplica descuento de: $" + formato1.format(descuento));
		}
		System.out.println("El valor a pagar es: $" + formato1.format((costo - descuento)));
		
			
		
	}
	
}
