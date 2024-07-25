package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int precioHeladoSimple = 2000;
        int precioHeladoDoble = 4000;
        int precioHeladoEspecial= 6000;

        System.out.print("Digite la cantidad de helados Simples: ");
        int cantidadSimple = leerTeclado.nextInt();

        System.out.print("Digite la cantidad de helados Dobles: ");
        int cantidadDobles = leerTeclado.nextInt();

        System.out.print("Digite la cantidad de helados Especiales: ");
        int cantidadEspeciales = leerTeclado.nextInt();
|

        int totalVentaSimples = cantidadSimple * precioHeladoSimple;
        int totalVentasDobles = cantidadDobles * precioHeladoDoble;
        int totalVentasEspeciales = cantidadEspeciales * precioHeladoEspecial;


        int totalGeneralVentas = totalVentaSimples + totalVentasDobles + totalVentasEspeciales;

        System.out.println("Total de ventas Helado Simple: " + totalVentaSimples);
        System.out.println("Total de ventas Helados Dobles: " + totalVentasDobles);
        System.out.println("Total de ventas Helados Especiales: " + totalVentasEspeciales);
        System.out.println("Total general de ventas del día: " + totalGeneralVentas);


    }
}