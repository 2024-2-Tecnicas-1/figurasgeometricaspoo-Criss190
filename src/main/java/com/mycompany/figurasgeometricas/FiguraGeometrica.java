package com.mycompany.figurasgeometricas;

public class FiguraGeometrica {
 // Complejidad: O(1)
    private String nombre;
    private String color;
 // Complejidad: O(1)
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
 // Complejidad: O(1)
    public String getNombre() {
        return nombre;
    }
 // Complejidad: O(1)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 // Complejidad: O(1)
    public String getColor() {
        return color;
    }
 // Complejidad: O(1)s
    public void setColor(String color) {
        this.color = color;
    }
}
