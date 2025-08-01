package com.github.sanchezih.java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide 6 numeros por teclado, los almacena en un array y luego
 * muestra el valor maximo, el valor minimo y las posiciones que ocupan en el
 * array.
 * 
 * @author ihsanch
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// Cantidad de elementos que se van a ingresar
		final int CANT_ELEMENTOS = 6;

		// Se crea el array de enteros
		int[] array = new int[CANT_ELEMENTOS];

		// Se inicializan las variables para buscar maximo y minimo
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		// Variables para guardar las posiciones del maximo y minimo
		int posicionMaximo = 0;
		int posicionMinimo = 0;

		// Solicita los numeros al usuario
		System.out.println("Ingrese " + CANT_ELEMENTOS + " numeros");
		for (int i = 0; i < array.length; i++) {
			// Se lee cada numero desde teclado
			array[i] = Consola.leerEntero("numeros[" + i + "]= ");

			// Si el valor ingresado es menor o igual al minimo actual, se actualiza
			if (array[i] <= minimo) {
				minimo = array[i];
				posicionMinimo = i + 1; // Guardamos la posicion (empezando en 1)
			}

			// Si el valor ingresado es mayor o igual al maximo actual, se actualiza
			if (array[i] >= maximo) {
				maximo = array[i];
				posicionMaximo = i + 1; // Guardamos la posicion (empezando en 1)
			}
		}

		// Se muestran los resultados
		System.out.println("El maximo es " + maximo + " y la posicion es " + posicionMaximo);
		System.out.println("El minimo es " + minimo + " y la posicion es " + posicionMinimo);
	}
}
