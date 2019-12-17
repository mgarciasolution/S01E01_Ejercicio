package com.senati.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejemplo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sueldo, descuentoGobierno, descuentoSeguroVida, descuentoPobres = 0;
		// TODO Auto-generated method stub
	    System.out.println("Digite el sueldo bruto");
	    sueldo = sc.nextDouble();
	    descuentoGobierno = sueldo * 0.10;
	    descuentoSeguroVida = sueldo * 0.05;
	    descuentoPobres = (sueldo-descuentoGobierno-descuentoSeguroVida)*0.03;
	    
	    DecimalFormat formato1 = new DecimalFormat("#.00");
	    
	    
	    System.out.println("Descuento para el gobierno: $" + formato1.format(descuentoGobierno));
	    System.out.println("Descuento para el seguro de vida: $" + formato1.format(descuentoSeguroVida));
	    System.out.println("Descuento para los niños pobres: $" + formato1.format(descuentoPobres));
	    System.out.println("Neto restante: $" + formato1.format((sueldo - descuentoGobierno - descuentoSeguroVida - descuentoPobres)));
	    
	    
	}
}
