package com.co.udea.reto3.Concesionario;

import java.time.LocalDate;

public class Automovil {

    private String placa;
    private String marca;
    private final int modelo;
    private int kilometraje;
    private double precio;
    private String descripcion;
    private String color;
    private Llanta[] llantas;
    private Vendedor vendedor;
    private Motor motor;
    private int anioFabricacion;
    public static final int KMNUEVO = 1000;
    public static final int KMCASINUEVO = 20000;
    public static final int KMUSADO = 100000;
    public static final int ULTIMOMODELO = LocalDate.now().getYear();
    public static final int NUEVOMODELO = ULTIMOMODELO - 3;
    public static final int INTERMEDIOMODELO = NUEVOMODELO - 4;

    public Automovil(String placa, String marca, int modelo, int kilometraje, double precio, String descripcion, String color, Llanta[] llantas, Motor motor, int anioFabricacion) throws KilometrajeException, PrecioNegativoException, AnioFabricacionException {
        if (kilometraje < 0) {
            throw new KilometrajeException();
        } else {
            this.kilometraje = kilometraje;
        }
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        if (precio < 0) {
            throw new PrecioNegativoException();
        } else {
            this.precio = precio;
        }
        this.descripcion = descripcion;
        this.color = color;
        if (llantas.length == 4) {
            this.llantas = llantas;
        }
        this.motor = motor;
        if (anioFabricacion < 0) {
            throw new AnioFabricacionException();
        } else {
            this.anioFabricacion = anioFabricacion;
        }
    }

    public String calcularUso() {
        if (kilometraje == 0) {
            return "0 km";
        }
        if (kilometraje > 0 && kilometraje < KMNUEVO) {
            return "Nuevo";
        }
        if (kilometraje >= KMNUEVO && kilometraje < KMCASINUEVO) {
            return "Casi nuevo";
        }
        if (kilometraje >= KMCASINUEVO && kilometraje < KMUSADO) {
            return "Usado";
        }
        if (kilometraje >= KMUSADO) {
            return "Muy usado";
        }
        return "Valor del kilometraje incorrecto";
    }

    public String calcularEstado() {
        if (anioFabricacion >= ULTIMOMODELO) {
            return "Último modelo";
        }
        if (anioFabricacion >= NUEVOMODELO && anioFabricacion < ULTIMOMODELO) {
            return "Nuevo";
        }
        if (anioFabricacion >= INTERMEDIOMODELO && anioFabricacion < NUEVOMODELO) {
            return "Intermedio";
        }
        if (anioFabricacion < INTERMEDIOMODELO) {
            return "Antiguo";
        }
        return "Fecha incorrecta";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) throws KilometrajeException {
        this.kilometraje = kilometraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws PrecioNegativoException {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) throws AnioFabricacionException {
        this.anioFabricacion = anioFabricacion;
    }

}
