package com.mycompany.figurasgeometricas;
 // Complejidad: O(1)
public class Circulo extends FiguraGeometrica {
    private double radio;
 // Complejidad: O(1)
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
 // Complejidad: O(1)
    public double getRadio() {
        return radio;
    }
 // Complejidad: O(1)
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
 // Complejidad: O(1)
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
 // Complejidad: O(1)
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}