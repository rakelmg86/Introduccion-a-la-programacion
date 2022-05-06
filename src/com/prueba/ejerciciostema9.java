package com.prueba;

public class ejerciciostema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Raquel";
        cliente.edad = 36;
        cliente.telefono = "617469662";
        cliente.credito = 275;
        System.out.println("Nombre: " + cliente.nombre + "  " + "Edad: " +  cliente.edad);
        System.out.println("Telefono: " + cliente.telefono + " " + "Credito: " + cliente.credito + " euros");


        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Jordi";
        trabajador.edad = 34;
        trabajador.telefono = "615478547";
        trabajador.salario = 1238;
        System.out.println("Nombre: " + trabajador.nombre + " " + "Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono + "  " + "Salario: " + trabajador.salario + " Euros/mes");




    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {
    int credito;

}

class Trabajador extends Persona{
    int salario;

}