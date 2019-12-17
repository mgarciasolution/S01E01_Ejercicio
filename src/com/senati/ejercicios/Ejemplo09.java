package com.senati.ejercicios;

import java.util.Scanner;

public class Ejemplo09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,estado;
		System.out.println("Digite numero A:");
		a = sc.nextInt();
		System.out.println("Digite numero B:");
		b = sc.nextInt();
		System.out.println("Digite numero C:");
		c = sc.nextInt();
		
		if ((a+b-c==0)||(b+c-a==0)||(c+a-b==0)){
			System.out.println("Iguales");
		}else {
			System.out.println("Distintos");
		}
		
	}
}
