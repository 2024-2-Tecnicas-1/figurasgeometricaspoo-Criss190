package com.mycompany.figurasgeometricas;

import java.util.Scanner;
 // Complejidad: O(1)
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
 // Complejidad: O(1)
        while (continuar) {
            System.out.println("Menu de Figuras Geometricas");
            System.out.println("1. Crear Circulo");
            System.out.println("2. Crear Rectangulo");
            System.out.println("3. Crear Triangulo Rectangulo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 
 // Complejidad: O(1)
            switch (opcion) {
                case 1: // Complejidad: O(1)
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreCirculo = sc.nextLine(); // Complejidad: O(1)
                    System.out.println("Ingrese el color de la figura:");
                    String colorCirculo = sc.nextLine(); // Complejidad: O(1)
                    System.out.println("Ingrese el radio del circulo:");
                    double radio = sc.nextDouble(); // Complejidad: O(1)
                    Circulo circulo = new Circulo(nombreCirculo, colorCirculo, radio);
                    System.out.println("Area: " + circulo.obtenerArea()); // Complejidad: O(1)
                    System.out.println("PerImetro: " + circulo.obtenerPerimetro());
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreRectangulo = sc.nextLine(); // Complejidad: O(1)
                    System.out.println("Ingrese el color de la figura:");
                    String colorRectangulo = sc.nextLine(); // Complejidad: O(1)
                    System.out.println("Ingrese el valor del lado 1 del rectangulo:");
                    double lado1 = sc.nextDouble(); // Complejidad: O(1)
                    System.out.println("Ingrese el valor del lado 2 del rectangulo:");
                    double lado2 = sc.nextDouble(); // Complejidad: O(1)
                    Rectangulo rectangulo = new Rectangulo(nombreRectangulo, colorRectangulo, lado1, lado2);
                    System.out.println("Area: " + rectangulo.obtenerArea()); // Complejidad: O(1)
                    System.out.println("Perimetro: " + rectangulo.obtenerPerimetro()); // Complejidad: O(1)
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreTriangulo = sc.nextLine(); // Complejidad: O(1)
                    System.out.println("Ingrese el color de la figura:");
                    String colorTriangulo = sc.nextLine(); // Complejidad: O(1)
                    System.out.println("Ingrese el valor de la base del triangulo:");
                    double base = sc.nextDouble(); // Complejidad: O(1)
                    System.out.println("Ingrese el valor de la altura del triangulo:");
                    double altura = sc.nextDouble(); // Complejidad: O(1)
                    Triangulo triangulo = new Triangulo(nombreTriangulo, colorTriangulo, base, altura); // Complejidad: O(1)
                    System.out.println("Area: " + triangulo.obtenerArea()); // Complejidad: O(1)
                    System.out.println("Perimetro: " + triangulo.obtenerPerimetro());
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    continuar = false; // Complejidad: O(1)
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}                  