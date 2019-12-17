package com.senati.ejercicios;

import java.util.*;

public class Ejemplo02 {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		x = sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		y = sc.nextInt();
		z = x;
		x = y;
		y = z;
		System.out.println("El nuevo valor de X es " + x + " y el de Y es " + y);		
	}
}
