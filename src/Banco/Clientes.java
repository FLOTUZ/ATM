package Banco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clientes extends Banco {
    private String nombre;
    private double saldo;
    private int nCliente;

    Clientes() throws FileNotFoundException {
        File carteraClientes = new File("carteraClientes.txt");
        Scanner leer = new Scanner(carteraClientes);
        this.nombre = leer.next();
        this.nCliente = leer.nextInt();
        this.saldo = leer.nextDouble();
    }
}
