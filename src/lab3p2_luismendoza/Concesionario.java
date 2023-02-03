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
public class Concesionario {
    
    private String nombreC;
    private int idEmpresa;
    private String direccion;
    private int saldo;
    private ArrayList<Vehiculo> vehiculosEmpresa = new ArrayList();
    private ArrayList<Clientes> clientesEmpresa = new ArrayList();

    public Concesionario() {
    }

    public Concesionario(String nombreC, int idEmpresa, String direccion, int saldo) {
        this.nombreC = nombreC;
        this.idEmpresa = idEmpresa;
        this.direccion = direccion;
        this.saldo = saldo;
    }
    
    

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Vehiculo> getVehiculosEmpresa() {
        return vehiculosEmpresa;
    }

    public void setVehiculosEmpresa(ArrayList<Vehiculo> vehiculosEmpresa) {
        this.vehiculosEmpresa = vehiculosEmpresa;
    }

    public ArrayList<Clientes> getClientesEmpresa() {
        return clientesEmpresa;
    }

    public void setClientesEmpresa(ArrayList<Clientes> clientesEmpresa) {
        this.clientesEmpresa = clientesEmpresa;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "nombreC=" + nombreC + ", idEmpresa=" + idEmpresa + ", direccion=" + direccion + ", saldo=" + saldo + ", vehiculosEmpresa=" + vehiculosEmpresa + ", clientesEmpresa=" + clientesEmpresa + '}';
    }
    
    
    
    
    
}
