package com.co.udea.reto3.Concesionario;

/**
 *
 * @author HOME
 */
public class EdadNegativaException extends Exception{

    public EdadNegativaException() {
        super("La edad no puede ser inferior a 18");
    }
    
}
