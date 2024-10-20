
package com.mycompany.figurasgeometricas;
public class Circulo extends FiguraGeometrica {
    private int radio;
    
    public Circulo(String nombre, String color, int radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
      @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
       @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio; // Fórmula del perímetro del círculo
    }
}