package com.github.sanchezih.java_inicial.clase03._01_ejemplos.arrays.ejemplos_iniciales;

/**
 * Ejemplo simple de uso de arrays en Java Muestra como declarar, inicializar y
 * recorrer un array
 * 
 * @author ihsanch
 */
public class Ejemplo01 {

	public static void main(String[] args) {

		// Declaracion e inicializacion de un array de enteros con 5 posiciones
		int[] numeros = new int[5];

		// Mostramos por consola la cantidad de elementos que puede contener el array
		System.out.println("El array puede contener " + numeros.length + " elementos");

		// Recorremos el array e imprimimos cada uno de sus elementos
		// Como no se han asignado valores, todos serán 0 (valor por defecto de int)
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
