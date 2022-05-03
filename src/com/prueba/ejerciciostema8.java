package com.prueba;

public class ejerciciostema8 {
    public static void main(String[] args) {
        Persona mujer = new Persona();

        mujer.setEdad(35);
        System.out.println("Edad: " + mujer.getEdad());

        mujer.setNombre("Raquel");
        System.out.println("Nombre: " + mujer.getNombre());

        mujer.setTelefono("617469662");
        System.out.println("Telefono: " + mujer.getTelefono());



    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

}
