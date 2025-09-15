package com.mycompany.temperaturaspromediossemana13;

public class TemperaturasPromediosSemana13 {

    // Función que calcula el promedio de cada ciudad
    // Recibe una matriz con temperaturas [ciudades][semanas]
    public static double[] calcularPromedios(double[][] temperaturas) {
        double[] promedios = new double[temperaturas.length]; // arreglo de promedios por ciudad

        // Recorremos cada ciudad
        for (int i = 0; i < temperaturas.length; i++) {
            double suma = 0;
            // Recorremos las semanas de esa ciudad
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }
            // Calculamos promedio de la ciudad i
            promedios[i] = suma / temperaturas[i].length;
        }

        return promedios;
    }

    // Función que muestra los promedios de cada ciudad
    public static void mostrarPromedios(double[] promedios) {
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Ciudad " + (i + 1) + " - Promedio: " + promedios[i] + " grados");
        }
    }

    public static void main(String[] args) {
        // Datos de ejemplo: 3 ciudades, 4 semanas
        double[][] temperaturas = {
            {20.5, 22.0, 19.8, 21.3}, // Ciudad 1
            {25.0, 24.5, 26.1, 23.9}, // Ciudad 2
            {18.2, 19.0, 17.5, 18.7}  // Ciudad 3
        };

        // Calculamos los promedios
        double[] promedios = calcularPromedios(temperaturas);

        // Mostramos los resultados con la palabra "grados"
        mostrarPromedios(promedios);
    }
}
