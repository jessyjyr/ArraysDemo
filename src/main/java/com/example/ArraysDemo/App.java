package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// VARIANTE 2
    //	¿Cómo se declara un array?
    int[] numeros = {
    		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
    };
    
    //Un array de nombres sería
    String[] nombres = {
    		"Tamara", "Jessica", "Carlos", "Adrian", "Carlos", "Maria Lopez",
    		"Maria Jose", "Rosa", "Pablo", "Ivan", "Marly"
    };
    
    //Para mostrar por consola, los elementos del array de nombres
    //Variante 1. 
    //Utilizando una función println, mostrar cada elemento del array
    System.out.println(nombres[0]);
    System.out.println(nombres[1]);
    
    // Y como podran apreciar, la variante 1, no sirve para Nadaa.
    
    // Variante 2. Implica utilizar la sentencia de control de flujo, para recorrer el array y 
    // lo veremos en la rama "sentenciasDeControlDeFlujo"
    }
    			
    }

