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
public class Camion extends Vehiculo {
    
    private double volumenMax;
    private double altura;
    private boolean retro;

    


    public Camion(double volumenMax, double altura, boolean retro, String color, String marca, String modelo, Date fechaC, int precio, int llantas) {
        super(color, marca, modelo, fechaC, precio, llantas);
        this.volumenMax = volumenMax;
        this.altura = altura;
        this.retro = retro;
    }

    public double getVolumenMax() {
        return volumenMax;
    }

    public void setVolumenMax(double volumenMax) {
        this.volumenMax = volumenMax;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" + "volumenMax=" + volumenMax + ", altura=" + altura + ", retro=" + retro + '}';
    }
    
    
    
    
    
    
    
    
}
