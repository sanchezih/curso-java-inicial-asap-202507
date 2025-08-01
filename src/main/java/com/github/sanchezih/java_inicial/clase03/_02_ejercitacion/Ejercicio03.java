package com.github.sanchezih.java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide 5 numeros enteros, los almacena en un array, y verifica si
 * el array es capicua (palindromo).
 * 
 * @author ihsanch
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Cantidad de elementos a ingresar
		final int CANT_ELEMENTOS = 5;

		// Se crea el array de enteros
		int[] array = new int[CANT_ELEMENTOS];

		// Variables para controlar el inicio y fin del array
		int ini = 0;
		int fin = array.length - 1;

		// Bandera para saber si el array es capicua
		boolean esCapicua = true;

		System.out.println("Ingrese " + CANT_ELEMENTOS + " numeros");

		// Lectura de los numeros por teclado
		for (int i = 0; i < array.length; i++) {
			array[i] = Consola.leerEntero("numeros[" + i + "]= ");
		}

		// Se compara el array desde ambos extremos hacia el centro
		// Mientras ini <= fin y no se haya encontrado diferencia
		while (ini <= fin && esCapicua) {
			// Compara los elementos en las posiciones ini y fin
			esCapicua = (array[ini++] == array[fin--]);
		}

		// Se muestra el resultado
		if (esCapicua) {
			System.out.println("El array es capicua");
		} else {
			System.out.println("El array NO es capicua");
		}
	}
}
