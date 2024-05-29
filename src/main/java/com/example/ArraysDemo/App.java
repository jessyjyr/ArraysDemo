package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		// VARIANTE 2
		// ¿Cómo se declara un array?
		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		// Un array de nombres sería
		String[] nombres = { "Tamara", "Jessica", "Carlos", "Adrian", "Carlos", "Maria Lopez", "Maria Jose", "Rosa",
				"Pablo", "Ivan", "Marly" };

		// Para mostrar por consola, los elementos del array de nombres
		// Variante 1.
		// Utilizando una función println, mostrar cada elemento del array
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);

		// Y como podran apreciar, la variante 1, no sirve para Nadaa.

		// Variante 2. Implica utilizar la sentencia de control de flujo, para recorrer
		// el array y
		// lo veremos en la rama "sentenciasDeControlDeFlujo"

		// Primero: Con una sentencia for de toda la vida, o clasica
		// Es lo mismo: i = i +1 / i++
		/*
		 * for(int i = 0; i < nombres.length; i++) { System.out.println(nombres[i]); }
		 */

		// Ejercicio1: Solamente mostrar los nombres del array de nombres que tienen más
		// de 4 caracteres:

		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].length() > 4) {
				System.out.println(nombres[i]);
			}
		}

		// ¿Qué diferencia hay en utilizar el operador de autoincremento o
		// autodecremento, antes o despues?
		// Para solucionar este problema, clásico de cuando uno empieza con un lenguaje
		// de programación, usaremos
		// JSHELL, que es como un shell, que es como Shell de Python, que antes Java no
		// tenía.

		// RTA. El operador de autoincremento si está solo en una sentencia, no importa
		// el orden i++; ++i; son
		// exactamente lo mismo, sin embargo, i + ++j, no es lo mismo que i + j++

		// NOTA IMPORTANTE:
		// ¿Cuando se usa el for clasico?
		// Cuando nos interesa el indice.
		// Ejercicio 2. Por ejemplo, si queremos recorrer el array de numeros y
		// solamente mostrar
		// los elementos que son de índice par

		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0)
				System.out.println("El elemento de indice" + i + ", es par");
		}

		// Segundo: Con un for mejorado, en ocasiones MAL llamado for each (por cada)
		// y DIGO MAL LLAMADO porque la sentencia for each, existe, como veran
		// posteriormente.

	}
}
