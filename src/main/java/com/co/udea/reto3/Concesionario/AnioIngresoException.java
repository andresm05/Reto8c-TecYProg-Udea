/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto3.Concesionario;

/**
 *
 * @author HOME
 */
public class AnioIngresoException extends Exception{

    public AnioIngresoException() {
        super("El año de ingreso no puede ser inferior al año presente");
    }
    
}
