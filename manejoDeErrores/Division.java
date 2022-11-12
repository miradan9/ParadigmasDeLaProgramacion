package manejoDeErrores;
//Valeria Danae Aguayo Miranda
public class Division {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("La division entre 0 no es posible, intentalo con otro número");
        }
    }
}

