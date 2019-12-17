package com.senati.ejercicios;

import java.util.Scanner;
import java.text.*;

public class Ejemplo16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formato1 = new DecimalFormat("#.00");
		double entrada = 12;
		double descuento = 0;
		String dia;
		
		
		System.out.println("Digite el dia de la semana");
		dia = sc.next().toLowerCase();			
		if (dia.equals("martes") == true) {
			System.out.println("Digite la edad de la persona:");
			int temp = sc.nextInt();
			if (temp < 25) {
				descuento = entrada * 0.25;
				System.out.println("Aplica descuento del dia del estudiante: $" + formato1.format(descuento));
			}else {
				descuento = 0;
			}
		}else if (dia.equals("miercoles") == true) {
			System.out.println("Digite la edad de la persona:");
			int temp = sc.nextInt();
			if (temp > 60) {
				descuento = entrada * 0.4;
				System.out.println("Aplica descuento del dia del jubilado: " + formato1.format(descuento));
			}else {
				descuento = 0;
			}
		}else if (dia.equals("jueves") == true) {
			descuento = entrada = 0.2;
			System.out.println("Aplica descuento del dia del espectador: " + formato1.format(descuento));
		}
			
		
		System.out.println("El valor que se va a pagar es: $" + formato1.format((entrada - descuento)));		
	}

}
