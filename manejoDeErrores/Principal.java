package manejoDeErrores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        System.out.println("Valor ");
         //2. CON ESTE YA SE IMPRIME Y SE CONTROLA EL ERRORu
        try {
        //1. No se imprime ""FINAL"
            System.out.println(numeros[3]);
        }
        //por si el usuario la kga jijija
        catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("Final");

    }
}


