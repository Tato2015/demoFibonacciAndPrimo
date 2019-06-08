package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Numero {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int numeroIngreso;
	
	private int sumaFibonacci;
	
	private int sumaPrimos;
		

	public int getNumeroIngreso() {
		return numeroIngreso;
	}

	public void setNumeroIngreso(int numeroIngreso) {
		this.numeroIngreso = numeroIngreso;
	}

	public int getSumaFibonacci() {
		return sumaFibonacci;
	}

	public void setSumaFibonacci(int sumaFibonacci) {
		this.sumaFibonacci = sumaFibonacci;
	}

	public int getSumaPrimos() {
		return sumaPrimos;
	}

	public void setSumaPrimos(int sumaPrimos) {
		this.sumaPrimos = sumaPrimos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	
	
}
