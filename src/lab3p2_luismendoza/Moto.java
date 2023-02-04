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
public class Moto extends Vehiculo {
    
    private int desplaceMotor;
    private boolean motorM;

    


    public Moto(int desplaceMotor, boolean motorM, String color, String marca, String modelo, Date fechaC, int precio, int llantas) {
        super(color, marca, modelo, fechaC, precio, llantas);
        this.desplaceMotor = desplaceMotor;
        this.motorM = motorM;
    }
    
    

    public int getDesplaceMotor() {
        return desplaceMotor;
    }

    public void setDesplaceMotor(int desplaceMotor) {
        this.desplaceMotor = desplaceMotor;
    }

    public boolean isMotorM() {
        return motorM;
    }

    public void setMotorM(boolean motorM) {
        this.motorM = motorM;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "desplaceMotor=" + desplaceMotor + ", motorM=" + motorM + '}';
    }
    
    
    
    
    
}
