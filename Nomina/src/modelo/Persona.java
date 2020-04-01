package modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre; // cada caracter ocupa 2 bytes
    private int edad; // ocupa 4 bytes
    private boolean activo;

    public Persona() {
        nombre = "NN";
        edad = 0;
        activo = true;
    }

    public Persona(String nombre, int edad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
                "\nEdad: " + edad;
    }   
    
    public int getTamaño() {
        return getNombre().length()*2 + 2 + 4 + 1;
    }
}