/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea__ed;

/**
 *
 * @author Andrea
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*DESCUENTO_MENOR;
            mostrarTotal(Total);
        }else {
            Total = precioProducto*0.95;
            mostrarTotal(Total);
        }   

    }
    public static final double DESCUENTO_MENOR = 0.8;

    public void mostrarTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}
