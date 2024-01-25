/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

// Excepción personalizada para manejar productos no disponibles
public class ProductoNoDisponibleException extends Exception {
    public ProductoNoDisponibleException(String mensaje) {
        super(mensaje);
    }    
}
