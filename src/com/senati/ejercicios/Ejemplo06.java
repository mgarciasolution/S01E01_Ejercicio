package com.senati.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejemplo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dias, kilometrosRecorridos = 0;		
		double costoAlquiler = 0;
		double sobrecosto = 0;
		// TODO Auto-generated method stub
	    System.out.println("Digite los dias alquilados");
	    dias = sc.nextInt();
	    System.out.println("Digite los kilometros recorridos");
	    kilometrosRecorridos = sc.nextInt();
	    
	    DecimalFormat formato1 = new DecimalFormat("#.00");
	    
	    costoAlquiler = (30 * dias);
	    if (kilometrosRecorridos > 2000) {
	    	
	    	sobrecosto = (kilometrosRecorridos -2000) * 0.04;
	    	System.out.println("HAY SOBRECOSTO DE $" + formato1.format(sobrecosto) + " por " + (kilometrosRecorridos-2000) + " kilometros de exceso");	    	
	    }else {
	    	sobrecosto = 0;
	    }
	     
	    
	    System.out.println("El total a pagar es: $" + formato1.format((costoAlquiler + sobrecosto)));   	    
	}
}
