/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_luismendoza;

import java.util.ArrayList;
import java.util.Date;
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
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
        String color = entrada.next();
        System.out.println("Ingrese la marca");
        String marca = entrada.next();
        marca+= entrada.nextLine();
        String modelo = entrada.next();
        modelo += entrada.nextLine();
        System.out.println("Ingrese la fecha de creación");
        System.out.println("Ingrese el año");
        int year = entrada.nextInt();
        System.out.println("Ingrese el mes");
        int month = entrada.nextInt();
        System.out.println("Ingrese el día");
        int date = entrada.nextInt();
        
        Date fecha = new Date(year, month, date);
        
        System.out.println("Ingrese el precio");
        int precio = entrada.nextInt();
        System.out.println("Ingrese la cantidad de llantas");
        int llantas = entrada.nextInt();
        
        System.out.println("Ingrese el numero de puertas");
        int puertas = entrada.nextInt();
        System.out.println("Ingrese la descripción del carro");
        String descrip = entrada.next();
        descrip += entrada.nextLine();
        System.out.println("Ingrese la velocidad");
        double v = entrada.nextDouble();
        
        Carro c = new Carro(puertas,descrip,v,color,marca,modelo,fecha,precio,llantas);
        
        return c;
        
    } 
    
    public static Camion addCamion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
        String color = entrada.next();
        System.out.println("Ingrese la marca");
        String marca = entrada.next();
        marca+= entrada.nextLine();
        String modelo = entrada.next();
        modelo += entrada.nextLine();
        System.out.println("Ingrese la fecha de creación");
        System.out.println("Ingrese el año");
        int year = entrada.nextInt();
        System.out.println("Ingrese el mes");
        int month = entrada.nextInt();
        System.out.println("Ingrese el día");
        int date = entrada.nextInt();
        
        Date fecha = new Date(year, month, date);
        
        System.out.println("Ingrese el precio");
        int precio = entrada.nextInt();
        System.out.println("Ingrese la cantidad de llantas");
        int llantas = entrada.nextInt();
        
        System.out.println("Ingrese el volumen de carga");
        double volumen = entrada.nextDouble();
        
        System.out.println("Ingrese la altura");
        double altura = entrada.nextDouble();
        
        System.out.println("Ingrese si es verdadero o falso que tiene retro excavadora");
        boolean retro = entrada.nextBoolean();
        
        Camion c = new Camion(volumen,altura,retro,color,marca,modelo,fecha,precio,llantas);
        
        return c;
        
    } 
    
    public static Bus addBus(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
        String color = entrada.next();
        System.out.println("Ingrese la marca");
        String marca = entrada.next();
        marca+= entrada.nextLine();
        String modelo = entrada.next();
        modelo += entrada.nextLine();
        System.out.println("Ingrese la fecha de creación");
        System.out.println("Ingrese el año");
        int year = entrada.nextInt();
        System.out.println("Ingrese el mes");
        int month = entrada.nextInt();
        System.out.println("Ingrese el día");
        int date = entrada.nextInt();
        
        Date fecha = new Date(year, month, date);
        
        System.out.println("Ingrese el precio");
        int precio = entrada.nextInt();
        System.out.println("Ingrese la cantidad de llantas");
        int llantas = entrada.nextInt();
        
        System.out.println("Ingrese el numero de pasajeros");
        int pasajeros = entrada.nextInt();
        
        System.out.println("Ingrese el tipo de bus");
        String tipo = entrada.next();
        tipo += entrada.nextLine();
        
        Bus b = new Bus(pasajeros,tipo,color,marca,modelo,fecha,precio,llantas);
        
        return b;
        
    }
    
    public static Moto addMoto(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
        String color = entrada.next();
        System.out.println("Ingrese la marca");
        String marca = entrada.next();
        marca+= entrada.nextLine();
        String modelo = entrada.next();
        modelo += entrada.nextLine();
        System.out.println("Ingrese la fecha de creación");
        System.out.println("Ingrese el año");
        int year = entrada.nextInt();
        System.out.println("Ingrese el mes");
        int month = entrada.nextInt();
        System.out.println("Ingrese el día");
        int date = entrada.nextInt();
        
        Date fecha = new Date(year, month, date);
        
        System.out.println("Ingrese el precio");
        int precio = entrada.nextInt();
        System.out.println("Ingrese la cantidad de llantas");
        int llantas = entrada.nextInt();
        
        System.out.println("Ingrese el displacement de la moto");
        int dis = entrada.nextInt();
        
        System.out.println("Ingrese si es verdadero o falso que tiene un motor electrico");
        boolean elec = entrada.nextBoolean();
        
        Moto v = new Moto(dis,elec,color,marca,modelo,fecha,precio,llantas);
        return v;
    }
    
    public static Bici addBici(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
        String color = entrada.next();
        System.out.println("Ingrese la marca");
        String marca = entrada.next();
        marca+= entrada.nextLine();
        String modelo = entrada.next();
        modelo += entrada.nextLine();
        System.out.println("Ingrese la fecha de creación");
        System.out.println("Ingrese el año");
        int year = entrada.nextInt();
        System.out.println("Ingrese el mes");
        int month = entrada.nextInt();
        System.out.println("Ingrese el día");
        int date = entrada.nextInt();
        
        Date fecha = new Date(year, month, date);
        
        System.out.println("Ingrese el precio");
        int precio = entrada.nextInt();
        System.out.println("Ingrese la cantidad de llantas");
        int llantas = entrada.nextInt();
        
        System.out.println("Ingrese la descripción de la bici");
        String descrip = entrada.next();
        descrip += entrada.nextLine();
        
        System.out.println("Ingrese el radio de la rueda");
        int radio = entrada.nextInt();
        
        System.out.println("Ingrese el tipo de bici");
        String tipo = entrada.next();
        tipo += entrada.nextLine();
        
        Bici b = new Bici(descrip,radio,tipo,color,marca,modelo,fecha,precio,llantas);
        
        return b;
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
                
                    System.out.println("Ingrese el concesionario que desea modificar");
                    System.out.println(cons);
                    int modVCon = entrada.nextInt();
                   
                    while(opcionV != 4){
                        
                        System.out.println("1. Agregar Vehiculo\n"
                        + "2. Quitar Vehiculo\n"
                        + "3. Modificar Vehiculo \n"
                        + "4. Salir\n");
                        
                        opcionV = entrada.nextInt();
                        
                        switch(opcionV){
                            
                            case 1:
                                
                                System.out.println("1. Carro\n"
                                        + "2. Camion \n"
                                        + "3. Bus \n"
                                        + "4. Moto\n"
                                        + "5. Bici \n");
                                int opcionVehiculo = entrada.nextInt();
                                
                                switch(opcionVehiculo){
                                    
                                    case 1:
                                        cons.get(modVCon).getVehiculosEmpresa().add(addCarro());
                                        break;
                                        
                                    case 2:
                                        cons.get(modVCon).getVehiculosEmpresa().add(addCamion());
                                        break;
                                        
                                    case 3:
                                        cons.get(modVCon).getVehiculosEmpresa().add(addBus());
                                        break;
                                        
                                    case 4:
                                        cons.get(modVCon).getVehiculosEmpresa().add(addMoto());
                                        break;
                                        
                                    case 5:
                                        cons.get(modVCon).getVehiculosEmpresa().add(addBici());
                                        break;
                                        
                                    default:
                                        System.out.println("Opción no valida");
                                        break;
                                     
                                }
                                
                                
                                break;
                                
                            case 2:
                                
                                System.out.println("Ingrese el vehiculo que desea eliminar");
                                
                                System.out.println(cons.get(modVCon).getVehiculosEmpresa());
                                int elimV = entrada.nextInt();
                                
                                cons.get(modVCon).getVehiculosEmpresa().remove(elimV);
                                
                                break;
                                
                            case 3:
                                
                                System.out.println("Ingrese el vehiculo que desea modificar");
                                System.out.println(cons.get(modVCon).getVehiculosEmpresa());
                                
                                int opcionMod = entrada.nextInt();
                                
                                if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Carro){
                                    
                                } else if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Camion){
                                    
                                } else if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Bus){
                                    
                                } else if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Moto){
                                    
                                } else{
                                    
                                }
                                
                                
                                
                                
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
