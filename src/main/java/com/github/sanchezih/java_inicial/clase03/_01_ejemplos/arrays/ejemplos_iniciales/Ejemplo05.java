package com.github.sanchezih.java_inicial.clase03._01_ejemplos.arrays.ejemplos_iniciales;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que guarda en un array 10 numeros enteros leidos por teclado. Luego
 * recorre el array para contar:
 * 
 * - cuantos son positivos
 * 
 * - cuantos negativos
 * 
 * - y cuantos ceros
 * 
 * @author ihsanch
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		// Cantidad fija de elementos del array
		final int TOTAL_NUMEROS = 10;

		// Se declara el array de enteros
		int[] numeros = new int[TOTAL_NUMEROS];

		// Contadores
		int positivos = 0, negativos = 0, ceros = 0;

		// Carga de datos desde teclado
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Consola.leerEntero("numeros[" + i + "] = ");
		}

		// Recorremos el array para contar cada tipo de valor
		for (int numero : numeros) {
			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			} else {
				ceros++;
			}
		}

		// Mostramos los resultados
		System.out.println("Cantidad de positivos: " + positivos);
		System.out.println("Cantidad de negativos: " + negativos);
		System.out.println("Cantidad de ceros: " + ceros);
	}
}
