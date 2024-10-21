package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
 // Complejidad: O(1)
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
 // Complejidad: O(1)
    public double getBase() {
        return base;
    }
 // Complejidad: O(1)
    public void setBase(double base) {
        this.base = base;
    }
 // Complejidad: O(1)
    public double getAltura() {
        return altura;
    }
 // Complejidad: O(1)
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
 // Complejidad: O(1)
    public double obtenerArea() {
        return (base * altura) / 2;
    }
 // Complejidad: O(1)
    public double obtenerPerimetro() {
        return 3 * base;
    }
}

