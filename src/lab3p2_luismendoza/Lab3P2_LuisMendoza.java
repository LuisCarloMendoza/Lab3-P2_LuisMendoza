/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_luismendoza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luiscarlomendoza
 */
public class Lab3P2_LuisMendoza {

    /**
     * @param args the command line arguments
     */
    
    public static Concesionario addCon(){
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Agregar Nombre");
        String cadena = entrada.next();
        cadena += entrada.nextLine();
        System.out.println("Agregar ID");
        int id = entrada.nextInt() + 1;
        System.out.println("Agregar dirección");
        String cadena2 = entrada.next();
        cadena2 += entrada.nextLine();
        System.out.println("Agregar Saldo");
        int saldo = entrada.nextInt();
        
        Concesionario c = new Concesionario(cadena,id,cadena2,saldo);
        
        return c;
        
    }
    
    public static Carro addCarro(){
        
    } 
    
    public static Camion addCamion(){
        
    } 
    
    public static Bus addBus(){
        
    }
    
    public static Moto addMoto(){
        
    }
    

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Concesionario> cons = new ArrayList();
        System.out.println("Bienvenido a los Consecionarios");
        
        int opcion = 0;
        
        while(opcion != 5)
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. CRUD Consecionario\n"
                + "2. CRUD Clientes\n"
                + "3. CRUD Vehículos\n"
                + "4. Compra y Venta para los Clientes\n"
                + "5. Salir\n");
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1:
                int opcion2 = 0;
                while(opcion2 != 4){
                
                    System.out.println("1. Agregar Consecionario\n"
                            + "2. Eliminar Consecionario\n"
                            + "3. Modificar Consecionario \n "
                            + "4. Salir \n");
                    switch(opcion2){
                        
                        case 1:
                            
                            cons.add(addCon());
                            
                            break;
                            
                        case 2:
                            
                            if(cons.isEmpty()){
                                System.out.println("Aún no hay Concesionarios");
                            } else{
                                System.out.println("Elija el concesionario que desea eliminar");
                                System.out.println(cons);
                                int opcionEliminarCon = entrada.nextInt();
                                cons.remove(opcionEliminarCon);
                            }
                            
                            break;
                            
                        case 3:
                            
                            System.out.println("Elija el Concesionario");
                            System.out.println(cons);
                            int conMod1 = entrada.nextInt();
                            if(conMod1 > cons.size() - 1){
                                System.out.println("No existe ese concesionario");
                            } else if(cons.isEmpty()){
                                System.out.println("No hay concesionarios");
                            } else{
                                
                                System.out.println("1. Modificar direccion\n"
                                        + "2. Modificar Saldo");
                                int conMod2 = entrada.nextInt();
                                switch(conMod2){
                                    
                                    case 1:
                                        System.out.println("Ingrese la nueva dirección");
                                        String newDirection = entrada.next();
                                        newDirection += entrada.nextLine();
                                        cons.get(conMod1).setDireccion(newDirection);
                                        
                                        break;
                                        
                                    case 2:
                                        
                                        System.out.println("Ingrese el nuevo sueldo");
                                        int newSaldo = entrada.nextInt();
                                        cons.get(conMod1).setSaldo(newSaldo);
                                        
                                        break;
                                        
                                    default:
                                        System.out.println("Opción no valida");
                                        break;
                                }
                               
                                
                            }
                            
                            
                            break;
                            
                       default:
                            System.out.println("Opción no valida");
                            break;
                          
                    }
                }    
                    
                
                break;
                
                
            case 2: 
                
                
                
                break;
                
            case 3:
                
                int opcionV = 0;
                
                System.out.println("1. Agregar Vehiculo\n"
                        + "2. Quitar Vehiculo\n"
                        + "3. Modificar Vehiculo \n"
                        + "4. Salir");
                
                while(opcionV!=4){
                    switch(opcionV){
                        
                        case 1: 
                            
                            
                            
                            
                            break;
                            
                        case 2:
                            
                            break;
                            
                        case 3:
                            
                            break;
                            
                        default:
                            
                            break;
                        
                        
                        
                    }
                    
                    
                }
                
                
                
                
                
                break;
                
            case 4:
                
                break;
                
            case 5:
                System.out.println("Hasta la vista");
                break;
                
            default:
                System.out.println("Opción no valida");
                break;
            
        }
        
        
        
        
        
    }
    
}
