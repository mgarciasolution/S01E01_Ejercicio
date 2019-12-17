package com.senati.ejercicios;

import java.util.Scanner;
import java.text.*;

public class Ejemplo14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double compra, descuento;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		System.out.println("Digite valor de compra");
		compra = sc.nextDouble();
		
		if (compra>3000) {
			descuento = compra * 0.3;
			System.out.println("Aplica descuento de 30%: $" + formato1.format(descuento));
		}else {
			descuento = compra * 0.2;
			System.out.println("Aplica descuento de 20%: $" + formato1.format(descuento));
		}
		
		System.out.println("El valor que se va a pagar es: $" + formato1.format(compra - descuento));		
	}
}
