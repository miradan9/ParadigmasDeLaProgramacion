package Figuras;
//Valeria Danae Aguayo Miranda
import java.util.Scanner;

//Valeria Danae Aguayo Miranda
public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figura[] figura = new Figura[3];
        int opcion;
        do{
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    int opcionC;
                    double lado;
                    System.out.println("Ingrese el lado de la figura: ");
                    lado = entrada.nextDouble();
                    figura[0]= new Cuadrado(lado);
                    System.out.println("¿Qué acción quieres realizar?: ");
                    System.out.println("1.- Área");
                    System.out.println("2.- Perímetro");
                    opcionC = entrada.nextInt();
                    if (opcionC==1){
                        System.out.println("Resultado: "+figura[0].calcularArea());
                    }
                    if (opcionC==2){
                        System.out.println("Resultado: "+figura[0].calcularPerimetro());

                    }
                    break;
                case 2:
                    System.out.println("Ingrese los lados de la figura: ");
                    double lado1, lado2, lado3;
                    System.out.println("Lado1: ");
                    lado1 = entrada.nextDouble();
                    System.out.println("Lado2: ");
                    lado2 = entrada.nextDouble();
                    System.out.println("Lado3: ");
                    lado3 = entrada.nextDouble();
                    figura[1]=new Triangulo(lado1,lado2,lado3);
                    System.out.println("¿Qué acción quieres realizar?: ");
                    System.out.println("1.- Área");
                    System.out.println("2.- Perímetro");
                    opcionC = entrada.nextInt();
                    if (opcionC==1){
                        System.out.println("Resultado: "+figura[1].calcularArea());
                    }
                    if (opcionC==2){
                        System.out.println("Resultado: "+figura[1].calcularPerimetro());
                    }
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("No valido, ingrese de nuevo");
                    break;
            }
        } while (opcion !=3);
    }
    private static void menu(){
        System.out.println();
        System.out.println("Elige la figura con la que deseas trabajar: ");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Triangulo");
        System.out.println("3.- SALIR");
        System.out.println("Digite el número: ");

    }
}