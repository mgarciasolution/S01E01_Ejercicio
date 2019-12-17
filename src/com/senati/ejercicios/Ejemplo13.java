package com.senati.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejemplo13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double soles, euros, cambio;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		
		System.out.println("Digite la cantidad en soles");
		soles = sc.nextDouble();
		System.out.println("Digite el tipo de cambio");
		cambio = sc.nextDouble();
				
		euros = soles * cambio;
		System.out.println("Se van a pagar " + formato1.format(euros + " euros"));		
	}
}
