package com.github.sanchezih.java_inicial.clase03._01_ejemplos.arrays.ejemplos_iniciales;

/**
 * Ejemplo que muestra como inicializar un array con valores definidos y
 * recorrerlo para mostrar su contenido.
 * 
 * @author ihsanch
 */
public class Ejemplo02 {

	public static void main(String[] args) {

		// Se declara e inicializa un array de enteros con valores especificos
		int[] numeros = new int[] { 23, 46, 520, 8, 17 };

		// Se recorre el array usando un bucle for clasico
		for (int i = 0; i < numeros.length; i++) {
			// Se imprime el valor almacenado en la posicion i del array
			System.out.println(numeros[i]);
		}
	}
}
