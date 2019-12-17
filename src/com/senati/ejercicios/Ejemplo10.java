package com.senati.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejemplo10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double compra, descuento;
		
		System.out.println("Digite valor de compra");
		compra = sc.nextDouble();
		
		DecimalFormat formato1 = new DecimalFormat("#.00");
		
		if (compra>1000) {
			descuento = compra * 0.2;
			System.out.println("Aplica descuento de $" + formato1.format(+ descuento));
		}else {
			descuento = 0;
		}
		
		System.out.println("El valor que se va a pagar es: $" + formato1.format((compra - descuento)));		
	}

}
