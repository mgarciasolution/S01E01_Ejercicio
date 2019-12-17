package com.senati.ejercicios;

import java.util.Scanner;

public class Ejemplo17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int _inicio, _final, _primero, _ultimo;		
		
		
		System.out.println("Digite el primer numero");
		_inicio = sc.nextInt();
		System.out.println("Digite el segundo numero");
		_final = sc.nextInt();
		
		if (_inicio % 2 == 0) {
			_primero = _inicio;
		}else {
			_primero = _inicio + 1;
		}
		
		if (_final % 2 == 0) {
			_ultimo = _final;
		}else {
			_ultimo = _final - 1;
		}
		
		for (int i = _primero; i <= _final; i = i + 2) {
			System.out.println("Valor: " + i);
		}				
	}
}
