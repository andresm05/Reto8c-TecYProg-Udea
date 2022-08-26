/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.udea.reto3.Concesionario;

/**
 *
 * @author HOME
 */
public class PrecioNegativoException extends Exception {

    public PrecioNegativoException() {
        super("No puede tener precio negativo");
    }
    
}
