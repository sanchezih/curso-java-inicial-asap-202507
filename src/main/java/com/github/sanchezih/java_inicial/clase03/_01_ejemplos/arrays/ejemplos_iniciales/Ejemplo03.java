package com.github.sanchezih.java_inicial.clase03._01_ejemplos.arrays.ejemplos_iniciales;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que busca un numero entero dentro de un array de 5 enteros.
 * 
 * Todos los numeros se leen por teclado. Si se encuentra el numero buscado, se
 * informa la posicion.Si no, se informa que no fue encontrado.
 * 
 * @author ihsanch
 */
public class Ejemplo03 {

	public static void main(String[] args) {

		// Cantidad fija de elementos del array
		final int CANT_ELEMENTOS = 5;
		int[] array = new int[CANT_ELEMENTOS]; // Se crea el array de enteros

		// Variables auxiliares
		int numeroABuscar; // Numero que se desea buscar
		int j = 0; // Indice para recorrer el array en el while
		boolean encontrado = false; // Bandera para indicar si se encontro el numero

		// Carga del array desde teclado
		for (int i = 0; i <= CANT_ELEMENTOS - 1; i++) {
			array[i] = Consola.leerEntero("Ingrese un numero entero: ");
		}

		// Lectura del numero que se desea buscar
		numeroABuscar = Consola.leerEntero("Ingrese numero a buscar: ");

		// Busqueda del numero en el array (busqueda secuencial)
		while (j < array.length && !encontrado) {
			if (array[j] == numeroABuscar) {
				encontrado = true; // Se encontro el numero
			}
			j++; // Se avanza al siguiente elemento
		}

		// Mostrar resultado
		if (encontrado) {
			System.out.println("Encontrado en la posicion " + (j - 1)); // Se resta 1 porque j se incremento luego de
																		// encontrarlo
		} else {
			System.out.println("Numero no encontrado");
		}
	}
}
