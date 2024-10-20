
package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica{
    private int lado1;
    private int lado2;

    public Rectangulo(String nombre, String color, int lado1, int lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;       
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
@Override
    public double obtenerArea() {
        return (lado1 * lado2);
    }
@Override
    public double obtenerPerimetro() {
        return (lado1 + lado2) * 2;
    }
    
}
