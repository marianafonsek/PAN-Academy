package com.unicas.funcoes;

public class Incremento {
	
	static int myMethod(int x) {
		return ++x;
	}

	static int myMethod2(int y) {
		return ++y;				
	}
	
	public static void main(String[] args) {
		System.out.println(myMethod(2));
		System.out.println(myMethod(2));
	}
}
