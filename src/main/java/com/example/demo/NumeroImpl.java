package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NumeroImpl {
	Numero num = new Numero();
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public void mostarSerieFibonacci(int cantidad) {
		int suma=0;
		String cadena="";
		System.out.println("FIBONACCI");
		for(int i=0;i<cantidad;i++) {
//			System.out.print(procesaFibonacci(i)+" + ");
			log.info(procesaFibonacci(i)+" + ");						
			suma += procesaFibonacci(i);
			cadena += " + "+procesaFibonacci(i);
		}
		this.num.setCadenaFibonacci(cadena);
		this.num.setSumaFibonacci(suma);
	
	}

	public int procesaFibonacci(int numero) {
		
		if(numero>1) {
			return procesaFibonacci(numero-1) + procesaFibonacci(numero-2);
		}else if(numero == 1){
			return 1;
		}else if(numero == 0) {
			return 0;
		}else {
			System.out.println("El número es negativo");
			return -1;
		}
				
	}

	
	public void procesarNumeroPrimos(int cantidad) {
		int n = cantidad;
		int c = 1;
		int p = 2;
		int d = 2;
		int suma = 0;
		String cadena = "";
		System.out.println("NUMERO PRIMOS");
		while (c <= n) {
		   if (p % d == 0) {
		      if (p == d) {
//		         System.out.print(p + ", ");
		         log.info(p + ", ");
		         cadena +=" + "+p;
		         c++;
		         suma+=p;		         
		      }
		      d = 2;
		      p++;
		   }
		   else
		      d++;
		}
		this.num.setCadenaPrimo(cadena);
		this.num.setSumaPrimos(suma);
	}
	
	
	
	
	public Numero getNum() {
		return num;
	}

	public void setNum(Numero num) {
		this.num = num;
	}
	
	
	
}
