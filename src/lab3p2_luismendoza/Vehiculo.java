/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismendoza;

import java.util.Date;

/**
 *
 * @author luiscarlomendoza
 */
public class Vehiculo {
    
    protected String color;
    protected String marca,modelo;
    protected Date fechaC;
    protected int precio;
    protected int llantas;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, String modelo, Date fechaC, int precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaC = fechaC;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", fechaC=" + fechaC + ", precio=" + precio + ", llantas=" + llantas + '}';
    }
    
    
    
}
