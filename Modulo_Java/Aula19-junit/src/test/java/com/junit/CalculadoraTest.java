package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

		@Test
		public void testSomar() {
			System.out.println("somar");
			int n1 = 5;
			int n2 = 5;
			Calculadora calcTeste = new Calculadora();
			double resultadoEsperado = 10;
			double result = calcTeste.aumentar(n1, n2);
			assertEquals(resultadoEsperado, result, 0);
		}


		@Test
		public void testDiminuir() {
			System.out.println("diminuir");
			int n1 = 5;
			int n2 = 3;
			Calculadora calcTeste = new Calculadora();
			double resultadoEsperado = 2;
			double result = calcTeste.diminuir(n1, n2);
			assertEquals(resultadoEsperado, result, 0);
		}
//
//
		@Test
		public void testMultiplicar() {
			System.out.println("multiplicar");
			int n1 = 5;
			int n2 = 3;
			Calculadora calcTeste = new Calculadora();
			double resultadoEsperado = 15;
			double result = calcTeste.multiplicar(n1, n2);
			assertEquals(resultadoEsperado, result, 0);
		}
		
		
		@Test
		public void testDividir() {
			System.out.println("dividir");
			int n1 = 6;
			int n2 = 3;
			Calculadora calcTeste = new Calculadora();
			double resultadoEsperado = 2;
			double result = calcTeste.dividir(n1, n2);
			assertEquals(resultadoEsperado, result, 0);
		}
		
		@Test
		public void testDuplica() {
			System.out.println("duplica");
			int n1 = 6;
			Calculadora calcTeste = new Calculadora();
			double resultadoEsperado = 12;
			double result = calcTeste.duplica(n1);
			assertEquals(resultadoEsperado, result, "Erro");
		}
}

