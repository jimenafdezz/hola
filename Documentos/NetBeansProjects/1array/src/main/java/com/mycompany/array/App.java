/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author DAW107
 */
public class App {
    public static void main(String[] args) {
        // Definir un array de 10 posiciones de tipo entero
        int[] array = new int[10];

        // Inicializar todas las posiciones del array a -2 en el momento de la definición
        for (int i = 0; i < array.length; i++) {
            array[i] = -2;
        }

        // Visualizar el array después de la primera inicialización
        System.out.println("Después de la primera inicialización:");
        mostrarArray(array);

        // Utilizando un FOR, inicializar todas las posiciones a valor -1
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        // Visualizar el array después de la segunda inicialización
        System.out.println("\nDespués de la segunda inicialización:");
        mostrarArray(array);

        // Inicializar cada posición con un valor distinto utilizando función Math.random
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Se utiliza Math.random() para obtener un valor entre 0 y 1, luego se escala a un rango deseado.
        }

        // Visualizar el array después de la tercera inicialización
        System.out.println("\nDespués de la tercera inicialización con valores aleatorios:");
        mostrarArray(array);
    }

    // Método para mostrar los elementos de un array
    private static void mostrarArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

