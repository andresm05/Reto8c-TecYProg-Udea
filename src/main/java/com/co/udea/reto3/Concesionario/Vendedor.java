
package com.co.udea.reto3.Concesionario;

import java.time.LocalDate;

/**
 *
 * @author HOME
 */
public class Vendedor {

    private String documento;
    private String nombres;
    private String apellidos;
    private int edad;
    private double valorVendido;
    private int anioIngreso;
    private String descripcion;
    public static final int VENDEDORPRINCIPIANTE = 500000000;
    public static final int VENDEDORINTERMEDIO = 2000000000;
    public static final int ACTUALYEAR = LocalDate.now().getYear();

    public Vendedor(String documento, String nombres, String apellidos, int edad, double valorVendido, int anioIngreso, String descripcion) throws AnioIngresoException, EdadNegativaException, ValorVendidoException {
        if(anioIngreso>ACTUALYEAR){
            throw new AnioIngresoException();
        }else{
            this.anioIngreso = anioIngreso;
        }
        if(edad<18){
            throw new EdadNegativaException();
        }else{
             this.edad = edad;
        }
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        if(valorVendido<0){
            throw new ValorVendidoException();
        }else{
        this.valorVendido = valorVendido; }
        this.descripcion = descripcion;
    }

    public String calcularVenta() {
        if (valorVendido == 0) {
            return "Novato";
        }
        if (valorVendido > 0 && valorVendido < VENDEDORPRINCIPIANTE) {
            return "principiante";
        }
        if (valorVendido >= VENDEDORPRINCIPIANTE && valorVendido < VENDEDORINTERMEDIO) {
            return "intermedio";
        }
        if(valorVendido >= VENDEDORINTERMEDIO){
            return "Avanzado";
        }
        return "El valor vendido no es correcto";
    }
    
    public String calcularCalidad(){
        /*La calidad del vendedor dependerá de la cantidad vendida según el año de ingreso
        Un vendedor que haya ingresado recientemente, tendrá que vender al menos 
        500000000 para ser considerado bueno, y en el peor de los casos, si aun no ha vendido nada,
        se considera malo. Por otro lado, si el vendedor ya tiene algo de experiencia
        se espera mejores resultados.
        */
        if(anioIngreso>= 2021){
            if(valorVendido>=500000000){
                return "Bueno";
            }
            if(valorVendido>0 && valorVendido<500000000){
                return "Regular";
            }
            if(valorVendido == 0){
                return "malo";
            }
        }
        if(anioIngreso>=2018 && anioIngreso<2021){
            if(valorVendido >=1500000000){
                return "Bueno";
            }
            if(valorVendido>=250000000 && valorVendido<1500000000){
                return "Regular";
            }
            if(valorVendido < 250000000){
                return "malo";
            }
        }
        if(anioIngreso<2017){
            if(valorVendido>= 2000000000){
                return "Bueno";
            }
            if(valorVendido>=500000000 && valorVendido<2000000000){
                return "Regular";
            }
            if(valorVendido< 500000000){
                return "Malo";
            }
        }
        return "año de ingreso o ventas totales incorrectas";
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws EdadNegativaException {
        this.edad = edad;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido)throws ValorVendidoException {
        this.valorVendido = valorVendido;
    }

    public int getAnioIngreso() {
        
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso)throws AnioIngresoException {
        this.anioIngreso = anioIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
