/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_programacion_11;
import Productos.*;
import Clientes.Cliente;
import Pedidos.*;
import Exceptions.*;

public class MEDAC_Programacion_11 {

    public static void main(String[] args) {
try {
            // Crear productos
            Producto laptop = new Producto("Laptop", 1000.0, 5);
            Producto smartphone = new Producto("Smartphone", 500.0, 10);

            // Crear cliente
            Cliente cliente1 = new Cliente("Cliente A");

            // Agregar productos al carrito del cliente
            cliente1.agregarAlCarrito(laptop, 2);
            cliente1.agregarAlCarrito(smartphone, 1);

            // Crear pedido
            Pedido pedidoCliente1 = new Pedido(cliente1);

            // Procesar pedido
            pedidoCliente1.procesarPedido();

        } catch (ProductoNoDisponibleException e) {
            System.out.println("Error al procesar el pedido: " + e.getMessage());
        }
    }
}
