package com.github.sanchezih.java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee la altura de N personas y calcula:
 * 
 * - La altura media.
 * 
 * - Cuantas personas tienen una altura superior a la media.
 * 
 * - Cuantas tienen una altura inferior a la media.
 * 
 * El valor de N se pide por teclado y debe ser entero positivo.
 * 
 * @author ihsanch
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		// Variables
		int N;
		int cantMasAltos = 0;
		int cantMasBajos = 0;
		double suma = 0;
		double media;

		// Lectura del valor N (con validacion)
		do {
			N = Consola.leerEntero("Cantidad de personas: ");
		} while (N <= 0);

		// Declaracion del array
		double[] estaturas = new double[N];

		// Lectura de alturas y acumulacion para la media
		System.out.println("Lectura de la altura de las personas:");
		for (int i = 0; i < N; i++) {
			estaturas[i] = Consola.leerDouble("Persona " + (i + 1) + " = ");
			suma += estaturas[i];
		}

		// Calculo de la media
		media = suma / N;

		// Conteo de personas por comparacion con la media
		for (double estatura : estaturas) {
			if (estatura > media) {
				cantMasAltos++;
			} else if (estatura < media) {
				cantMasBajos++;
			}
		}

		// Mostrar resultados
		System.out.println("Estatura media: " + media);
		System.out.println("Personas con estatura superior a la media: " + cantMasAltos);
		System.out.println("Personas con estatura inferior a la media: " + cantMasBajos);
	}
}
