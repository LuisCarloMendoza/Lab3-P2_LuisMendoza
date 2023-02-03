/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismendoza;

import java.util.ArrayList;

/**
 *
 * @author luiscarlomendoza
 */
public class Clientes {
    
    private String nombreCliente;
    private int idCliente;
    private ArrayList<Vehiculo> vehiculosCliente = new ArrayList();
    private int saldoCliente;

    public Clientes() {
    }

    public Clientes(String nombreCliente, int idCliente, int saldoCliente) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.saldoCliente = saldoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Vehiculo> getVehiculosCliente() {
        return vehiculosCliente;
    }

    public void setVehiculosCliente(ArrayList<Vehiculo> vehiculosCliente) {
        this.vehiculosCliente = vehiculosCliente;
    }

    public int getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(int saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombreCliente=" + nombreCliente + ", idCliente=" + idCliente + ", vehiculosCliente=" + vehiculosCliente + ", saldoCliente=" + saldoCliente + '}';
    }
    
    
    
}
