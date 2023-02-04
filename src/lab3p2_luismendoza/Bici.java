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
public class Bici extends Vehiculo {
    
    private String decripBici;
    private int radioRueda;
    private String tipoBici;

   

    
    public Bici(String decripBici, int radioRueda, String tipoBici, String color, String marca, String modelo, Date fechaC, int precio, int llantas) {
        super(color, marca, modelo, fechaC, precio, llantas);
        this.decripBici = decripBici;
        this.radioRueda = radioRueda;
        this.tipoBici = tipoBici;
    }

    public String getDecripBici() {
        return decripBici;
    }

    public void setDecripBici(String decripBici) {
        this.decripBici = decripBici;
    }

    public int getRadioRueda() {
        return radioRueda;
    }

    public void setRadioRueda(int radioRueda) {
        this.radioRueda = radioRueda;
    }

    public String getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(String tipoBici) {
        this.tipoBici = tipoBici;
    }

    @Override
    public String toString() {
        return super.toString() + "Bici{" + "decripBici=" + decripBici + ", radioRueda=" + radioRueda + ", tipoBici=" + tipoBici + '}';
    }
    
    
    
    
    
    
    
    
}
