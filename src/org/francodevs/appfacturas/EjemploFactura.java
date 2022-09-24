package org.francodevs.appfacturas;

import org.francodevs.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("2037766278");
        cliente.setNombre("Romeo, F");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar descripción de la factura: ");
        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 2; i++){
            producto = new Producto();

            System.out.print("Ingrese producto n°" + producto.getCodigo() + " -> ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese precio -> ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad -> ");

            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
            sc.nextLine();
        }

        System.out.println(factura);

    }

}
