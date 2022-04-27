package com.prueba;



public class ejerciciostema4 {

    public static void main(String[] args){
        int numeroif = -3;

        if (numeroif > 0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }


        System.out.println("***BUCLE WHILE***");

        int numerowhile = 0;

        while (numerowhile < 3){
            System.out.println(numerowhile);
            numerowhile = numerowhile + 1;
        }

        System.out.println("***BUCLE DO WHILE***");

        int numeroDowhile = 3;

        do {
            System.out.println(numeroDowhile);
            numeroDowhile = numeroDowhile + 1;
        }while (numeroDowhile < 3);


        System.out.println("***BUCLE FOR***");

        for (int numerofor = 0; numerofor <= 3; numerofor = numerofor + 1){
            System.out.println(numerofor);
        }

        System.out.println("***Switch***");

        var estacion = "diciembre";

        switch(estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otono":
                System.out.println("Es otono");
                break;
            default:
                System.out.println("Ese valor no es una estacion");
                break;
        }






    }
}
