package com.senati.ejercicios;

import java.util.Scanner;
import java.text.*;

public class Ejemplo11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formato1 = new DecimalFormat("#.00");
		double salario, incremento, seguro;
		System.out.println("Digite el salario:");
		salario = sc.nextDouble();		
		
		incremento = salario * 0.25;
		seguro = (salario + incremento) * 0.05;
		
		System.out.println("Su salario se ha incrementado en $: " + formato1.format(incremento));
		System.out.println("Pero se le aplicará un descuento de $ " + formato1.format(seguro));
		System.out.println("El nuevo salario es: $" + formato1.format(salario + incremento - seguro));
		
	}
}
