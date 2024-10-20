package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class FiguraGeometrica {

    private String nombre;
    private String color;

 
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double obtenerArea() {
        return 0;
    }

    public double obtenerPerimetro() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
       
            System.out.println("=== Menú de Figuras Geométricas ===");
            System.out.println("1. Crear Círculo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Crear Triángulo Rectángulo");
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
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = sc.nextDouble();
                    Circulo circulo = new Circulo(nombreCirculo, colorCirculo, radio);
                    System.out.println("Área: " + circulo.obtenerArea());
                    System.out.println("Perímetro: " + circulo.obtenerPerimetro());
                    break;

                case 2: 
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreRectangulo = sc.nextLine();
                    System.out.println("Ingrese el color de la figura:");
                    String colorRectangulo = sc.nextLine();
                    System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                    double lado1 = sc.nextDouble();
                    System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                    double lado2 = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(nombreRectangulo, colorRectangulo, lado1, lado2);
                    System.out.println("Área: " + rectangulo.obtenerArea());
                    System.out.println("Perímetro: " + rectangulo.obtenerPerimetro());
                    break;

                case 3: 
                    System.out.println("Ingrese el nombre de la figura:");
                    String nombreTriangulo = sc.nextLine();
                    System.out.println("Ingrese el color de la figura:");
                    String colorTriangulo = sc.nextLine();
                    System.out.println("Ingrese el valor de la base del triángulo:");
                    double base = sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triángulo:");
                    double altura = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(nombreTriangulo, colorTriangulo, base, altura);
                    System.out.println("Área: " + triangulo.obtenerArea());
                    System.out.println("Perímetro: " + triangulo.obtenerPerimetro());
                    break;

                case 4: 
                    System.out.println("Saliendo del programa.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

    }
}