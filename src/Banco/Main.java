package Banco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
private static Scanner leer;
    public static void main(String[] args) throws FileNotFoundException {
        File datos  = new  File("datos.txt");
        leer = new Scanner(datos);
        Banco paypal = new Banco(leer);

        System.out.println(paypal);
    }
}
