
package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {

    private int base;
    private int altura;

    public Triangulo(String nombre, String color,int base,int altura) {
        super(nombre, color);
        this.altura = altura;
        this.base = base;
                
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
          @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }
             @Override
    public double obtenerPerimetro() {
        return 3 * base;
    }
}