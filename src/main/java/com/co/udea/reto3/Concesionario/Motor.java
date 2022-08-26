package com.co.udea.reto3.Concesionario;

/**
 *
 * @author HOME
 */
public class Motor {

    private double cilindraje;
    private String marca;
    private String referencia;
    private double peso;
    private String descripcion;

    public Motor(double cilindraje, String marca, String referencia, double peso, String descripcion) throws PesoNegativoException {
        if (peso <= 0) {
            throw new PesoNegativoException();
        } else {
            this.peso = peso;
        }
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.descripcion = descripcion;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso)throws PesoNegativoException {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
