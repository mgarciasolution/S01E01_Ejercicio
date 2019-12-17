package com.senati.ejercicios;

import java.util.Scanner;

public class Ejemplo19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		int mes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String nomMes[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
		int numMes;		
		
		
		System.out.println("Digite el mes a consultar");
		numMes = sc.nextInt();
		
		System.out.println("El mes numero " + numMes + " (" + nomMes[numMes-1] + ") tiene " + mes[numMes-1] + " dias");		
	}
}
