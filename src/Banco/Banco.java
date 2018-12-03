package Banco;

import java.util.Scanner;

public class Banco {
    private String nombre;
    private int nClientes;

    Banco(){

    }
    Banco (Scanner leer){
        this.nombre = leer.next();
        Clientes carteraClientes = new Clientes();
    }

    @Override
    public String toString() {
        return nombre + " #Clientes " + nClientes;
    }
}
