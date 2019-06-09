package com.example.demo;

import java.util.Scanner;

public class Ejecutar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumeroImpl numeroImpl = new NumeroImpl();
		
		System.out.print("Ingrese número :");
		String numeroStr = sc.next();
		numeroImpl.mostarSerieFibonacci(Integer.valueOf(numeroStr));
		System.out.println("Suma Fibonacci : "+numeroImpl.getNum().getSumaFibonacci()+"\n");
		numeroImpl.procesarNumeroPrimos(Integer.valueOf(numeroStr));
		System.out.println("Suma Primos : "+numeroImpl.getNum().getSumaPrimos());
		
		
	}

}
