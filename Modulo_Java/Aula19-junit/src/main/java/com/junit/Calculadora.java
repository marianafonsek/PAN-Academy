package com.junit;


public class Calculadora {
	
	private int resultado = 0;
	
	double aumentar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}
	
	double diminuir(int n1, int n2) {
		resultado = n1 - n2;
		return resultado;
	}
	double multiplicar(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}
	double dividir(int n1, int n2) {
		resultado = n1 / n2;
		return resultado;
	}
	public double duplica(int n1) {
		resultado = n1 * 2;
		return resultado;
	}
	
}
