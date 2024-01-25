/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

// Clase que representa un pedido en la tienda

import Clientes.Cliente;
import Productos.Producto;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = cliente.getCarrito();
    }

    public void procesarPedido() {
        // Lógica para procesar el pedido, como generar una factura, enviar confirmación, etc.
        System.out.println("Pedido procesado para el cliente: " + cliente.getNombre());
        System.out.println("Productos comprados: " + productos);
    }
}
