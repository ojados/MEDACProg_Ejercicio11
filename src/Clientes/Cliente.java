/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Productos.Producto;
import Exceptions.*;
// Clase que representa a un cliente de la tienda
public class Cliente {
    private String nombre;
    private List<Producto> carrito;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.carrito = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void agregarAlCarrito(Producto producto, int cantidad) throws ProductoNoDisponibleException {
        producto.comprar(cantidad);
        for (int i = 0; i < cantidad; i++) {
            carrito.add(producto);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", carrito=" + carrito +
                '}';
    }
}


