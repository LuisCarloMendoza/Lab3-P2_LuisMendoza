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
public class Bus extends Vehiculo {
    
    private int pasajeros;
    private String tipoBus;

    public Bus() {
        super();
    }


    public Bus(int pasajeros, String tipoBus, String color, String marca, String modelo, Date fechaC, double precio, int llantas) {
        super(color, marca, modelo, fechaC, precio, llantas);
        this.pasajeros = pasajeros;
        this.setPasajeros(pasajeros);
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int p) {
        if(p > 50){
            pasajeros = 0;
        } else if(p < 0){
            pasajeros = 0;
        } else {
            pasajeros = p;
        }
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" + "pasajeros=" + pasajeros + ", tipoBus=" + tipoBus + '}';
    }
    
    
    
    
    
    
    
    
}
