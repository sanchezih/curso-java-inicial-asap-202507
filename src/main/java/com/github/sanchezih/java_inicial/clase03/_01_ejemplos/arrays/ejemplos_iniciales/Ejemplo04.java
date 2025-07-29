package com.github.sanchezih.java_inicial.clase03._01_ejemplos.arrays.ejemplos_iniciales;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee por teclado 6 numeros enteros y los guarda en un array.
 * Luego calcula y muestra por separado la media de los positivos y la de los
 * negativos.
 * 
 * @author ihsanch
 */
public class Ejemplo04 {

	public static void main(String[] args) {

		// Constante que indica la cantidad de numeros a ingresar
		final int TOTAL_NUMEROS = 6;

		// Array para almacenar los numeros
		int[] numeros = new int[TOTAL_NUMEROS];

		// Acumuladores y contadores
		int sumaPositivos = 0, sumaNegativos = 0;
		int cantidadPositivos = 0, cantidadNegativos = 0;

		// Lectura de los numeros desde teclado
		for (int i = 0; i < TOTAL_NUMEROS; i++) {
			numeros[i] = Consola.leerEntero("array[" + i + "] = ");
		}

		// Procesamiento: separar positivos y negativos
		for (int numero : numeros) {
			if (numero > 0) {
				sumaPositivos += numero;
				cantidadPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				cantidadNegativos++;
			}
		}

		// Mostrar resultados
		if (cantidadPositivos > 0) {
			double mediaPositivos = (double) sumaPositivos / cantidadPositivos;
			System.out.println("Media de los valores positivos: " + mediaPositivos);
		} else {
			System.out.println("No se ingresaron numeros positivos");
		}

		if (cantidadNegativos > 0) {
			double mediaNegativos = (double) sumaNegativos / cantidadNegativos;
			System.out.println("Media de los valores negativos: " + mediaNegativos);
		} else {
			System.out.println("No se ingresaron numeros negativos");
		}
	}
}
