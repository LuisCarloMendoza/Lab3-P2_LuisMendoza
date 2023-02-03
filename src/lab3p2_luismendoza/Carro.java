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
public class Carro extends Vehiculo{
    
    private int puertas;
    private String descriptionMotor;
    private double velocity;

    public Carro() {
        super();
    }

    

    public Carro(int puertas, String descriptionMotor, double velocity, String color, String marca, String modelo, Date fechaC, double precio, int llantas) {
        super(color, marca, modelo, fechaC, precio, llantas);
        this.puertas = puertas;
        this.descriptionMotor = descriptionMotor;
        this.velocity = velocity;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getDescriptionMotor() {
        return descriptionMotor;
    }

    public void setDescriptionMotor(String descriptionMotor) {
        this.descriptionMotor = descriptionMotor;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "puertas=" + puertas + ", descriptionMotor=" + descriptionMotor + ", velocity=" + velocity + '}';
    }
    
    
    
    
    
    
}
