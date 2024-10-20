package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu de Figuras Geometricas");
            System.out.println("1. Crear Circulo");
            System.out.println("2. Crear Rectangulo");
            System.out.println("3. Crear Triangulo Rectangulo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreCirculo = sc.nextLine();
                    System.out.println("Ingrese el color de la figura:");
                    String colorCirculo = sc.nextLine();
                    System.out.println("Ingrese el radio del circulo:");
                    double radio = sc.nextDouble();
                    Circulo circulo = new Circulo(nombreCirculo, colorCirculo, radio);
                    System.out.println("Area: " + circulo.obtenerArea());
                    System.out.println("PerImetro: " + circulo.obtenerPerimetro());
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreRectangulo = sc.nextLine();
                    System.out.println("Ingrese el color de la figura:");
                    String colorRectangulo = sc.nextLine();
                    System.out.println("Ingrese el valor del lado 1 del rectangulo:");
                    double lado1 = sc.nextDouble();
                    System.out.println("Ingrese el valor del lado 2 del rectangulo:");
                    double lado2 = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(nombreRectangulo, colorRectangulo, lado1, lado2);
                    System.out.println("Area: " + rectangulo.obtenerArea());
                    System.out.println("Perimetro: " + rectangulo.obtenerPerimetro());
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreTriangulo = sc.nextLine();
                    System.out.println("Ingrese el color de la figura:");
                    String colorTriangulo = sc.nextLine();
                    System.out.println("Ingrese el valor de la base del triangulo:");
                    double base = sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triangulo:");
                    double altura = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(nombreTriangulo, colorTriangulo, base, altura);
                    System.out.println("Area: " + triangulo.obtenerArea());
                    System.out.println("Perimetro: " + triangulo.obtenerPerimetro());
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}                  