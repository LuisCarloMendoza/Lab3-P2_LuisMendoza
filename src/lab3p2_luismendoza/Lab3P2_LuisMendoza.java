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
    
    
    public static Clientes addCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Usuario");
        String cadena = entrada.next();
        cadena += entrada.nextLine();
        System.out.println("Ingrese el ID del Usuario");
        int id = entrada.nextInt();
        System.out.println("Ingrese el saldo del usuario");
        int saldo = entrada.nextInt();
        
        Clientes c = new Clientes(cadena,id,saldo);
        return c;
    }
    
    
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
        System.out.println("Ingrese el modelo");
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
        System.out.println("Ingrese el modelo");
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
        System.out.println("Ingrese el modelo");
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
        System.out.println("Ingrese el modelo");
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
        System.out.println("Ingrese el modelo");
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
        
        String color;
        String marca;
        String modelo;
        int year;
        int month; 
        int date;
        Date fecha;
        int precio;
        int llantas;
        
        ArrayList<Concesionario> cons = new ArrayList();
        System.out.println("Bienvenido a los Consecionarios");
        
        int opcion = 0;
        
        while(opcion != 5){
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
                    opcion2 = entrada.nextInt();
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
                
                System.out.println("Ingrese el concesionario con el que desea trabajar");
                System.out.println(cons);
                int modU = entrada.nextInt();
                
                System.out.println("1. Agregar Usuario\n"
                        + "2. Quitar Usuario\n"
                        + "3. Modificar Usuario\n");
                int opcionUsuario = entrada.nextInt();
                
                switch(opcionUsuario){
                    
                    case 1:
                        
                        cons.get(modU).getClientesEmpresa().add(addCliente());
                        
                        
                        break;
                        
                    case 2:
                        
                        System.out.println(cons.get(modU).getClientesEmpresa());
                        System.out.println("Ingrese el cliente que desea eliminar");
                        int eliminarUsuario = entrada.nextInt();
                        cons.get(modU).getVehiculosEmpresa().remove(eliminarUsuario);
                        
                        
                        break;
                        
                    case 3:
                        
                        System.out.println(cons.get(modU).getClientesEmpresa());
                        System.out.println("Ingrese el cliente que desea Modificar");
                        int modUsuario = entrada.nextInt();
                        
                        System.out.println("Ingrese el nuevo Saldo");
                        int saldoCliente = entrada.nextInt();
                        cons.get(modU).getClientesEmpresa().get(modUsuario).setSaldoCliente(saldoCliente);
                        
                        
                        break;
                        
                    default:
                        
                        break;
                    
                }
                
                
                
                
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

                        switch (opcionV) {

                            case 1:

                                System.out.println("1. Carro\n"
                                        + "2. Camion \n"
                                        + "3. Bus \n"
                                        + "4. Moto\n"
                                        + "5. Bici \n");
                                int opcionVehiculo = entrada.nextInt();

                                switch (opcionVehiculo) {

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

                                if (cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Carro) {
                                    
                                    System.out.println("1. Modificar color\n"
                                            + "2. Modificar marca\n"
                                            + "3. Modificar modelo\n"
                                            + "4. Modificar Fecha\n"
                                            + "5. Modificar precio\n"
                                            + "6. Modificar llantas\n"
                                            + "7. Modificar puertas \n"
                                            + "8. Modificar Descripción del Motor\n"
                                            + "9. Modificar Velocidad \n");
                                    int modCarro = entrada.nextInt();
                                    
                                    switch(modCarro){
                                        
                                        case 1:
                                            
                                            System.out.println("Ingrese el color");
                                            color = entrada.next();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setColor(color);
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Ingrese la marca");
                                            marca = entrada.next();
                                            marca += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setMarca(marca);
                                            
                                            break;
                                            
                                        case 3:
                                            
                                            System.out.println("Ingrese el modelo");
                                            modelo = entrada.next();
                                            modelo += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setModelo(modelo);
                                            
                                            break;
                                            
                                        case 4:
                                            System.out.println("Ingrese la fecha de creación");
                                            System.out.println("Ingrese el año");
                                            year = entrada.nextInt();
                                            System.out.println("Ingrese el mes");
                                            month = entrada.nextInt();
                                            System.out.println("Ingrese el día");
                                            date = entrada.nextInt();

                                            fecha = new Date(year, month, date);
                                            
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setFechaC(fecha);
                                            
                                            break;
                                            
                                            
                                        case 5:
                                            
                                            System.out.println("Ingrese el precio");
                                            precio = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setPrecio(precio);

                                            break;
                                            
                                        case 6:
                                            System.out.println("Ingrese la cantidad de llantas");
                                            llantas = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setLlantas(llantas);
                                            
                                            break;
                                        
                                        case 7:
                                            
                                            System.out.println("Ingrese el numero de puertas");
                                            int puertas = entrada.nextInt();
                                            ((Carro)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setPuertas(puertas);
                                            
                                            break;
                                            
                                        case 8:
                                            
                                            System.out.println("Ingrese la nueva descripción del motor");
                                            String motorDescrip = entrada.next();
                                            motorDescrip += entrada.nextLine();
                                            ((Carro)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setDescriptionMotor(motorDescrip);
                                            
                                            break;
                                            
                                        case 9:
                                            
                                            System.out.println("Ingrese la nueva velocidad");
                                            double velocityCar = entrada.nextDouble();
                                            ((Carro)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setVelocity(velocityCar);
                                            
                                            break;
                                            
                                        default:
                                            System.out.println("Opción no valida");
                                            break;
                                                
                                          
                                    }
                                    
                                    
                                    
                                } else if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Camion){
                                    
                                    System.out.println("1. Modificar color\n"
                                            + "2. Modificar marca\n"
                                            + "3. Modificar modelo\n"
                                            + "4. Modificar Fecha\n"
                                            + "5. Modificar precio\n"
                                            + "6. Modificar llantas\n"
                                            + "7. Modificar Retroexcavadora\n"
                                            + "8. Modificar Volumen\n"
                                            + "9. Modificar Altura \n");
                                    int modCamion = entrada.nextInt();
                                    
                                    
                                    switch(modCamion){
                                        
                                        case 1:
                                            
                                            System.out.println("Ingrese el color");
                                            color = entrada.next();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setColor(color);
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Ingrese la marca");
                                            marca = entrada.next();
                                            marca += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setMarca(marca);
                                            
                                            break;
                                            
                                        case 3:
                                            
                                            System.out.println("Ingrese el modelo");
                                            modelo = entrada.next();
                                            modelo += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setModelo(modelo);
                                            
                                            break;
                                            
                                        case 4:
                                            System.out.println("Ingrese la fecha de creación");
                                            System.out.println("Ingrese el año");
                                            year = entrada.nextInt();
                                            System.out.println("Ingrese el mes");
                                            month = entrada.nextInt();
                                            System.out.println("Ingrese el día");
                                            date = entrada.nextInt();

                                            fecha = new Date(year, month, date);
                                            
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setFechaC(fecha);
                                            
                                            break;
                                            
                                            
                                        case 5:
                                            
                                            System.out.println("Ingrese el precio");
                                            precio = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setPrecio(precio);

                                            break;
                                            
                                        case 6:
                                            System.out.println("Ingrese la cantidad de llantas");
                                            llantas = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setLlantas(llantas);
                                            
                                            break;
                                        
                                        case 7:
                                            
                                            System.out.println("Ingrese si tiene o no tiene retro excavadora True or False");
                                            boolean retro = entrada.nextBoolean();
                                            ((Camion)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setRetro(retro);
                                            
                                            break;
                                            
                                        case 8:
                                            
                                            System.out.println("Ingrese el nuevo Volumen");
                                            double VolumenC = entrada.nextDouble();
                                            ((Camion)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setVolumenMax(VolumenC);
                                            
                                            break;
                                            
                                        case 9:
                                            
                                            System.out.println("Ingrese la nueva altura");
                                            double alturaCamion = entrada.nextDouble();
                                            ((Camion)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setAltura(alturaCamion);
                                            
                                            break;
                                            
                                        default:
                                            System.out.println("Opción no valida");
                                            break;
                                                
                                          
                                    }
                                    
                                    
                                    
                                } else if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Bus){
                                    System.out.println("1. Modificar color\n"
                                            + "2. Modificar marca\n"
                                            + "3. Modificar modelo\n"
                                            + "4. Modificar Fecha\n"
                                            + "5. Modificar precio\n"
                                            + "6. Modificar llantas\n"
                                            + "7. Modificar Pasajeros \n"
                                            + "8. Modificar Tipo\n"
                                            );
                                    int modBus = entrada.nextInt();
                                    
                                    switch(modBus){
                                        
                                        case 1:
                                            
                                            System.out.println("Ingrese el color");
                                            color = entrada.next();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setColor(color);
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Ingrese la marca");
                                            marca = entrada.next();
                                            marca += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setMarca(marca);
                                            
                                            break;
                                            
                                        case 3:
                                            
                                            System.out.println("Ingrese el modelo");
                                            modelo = entrada.next();
                                            modelo += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setModelo(modelo);
                                            
                                            break;
                                            
                                        case 4:
                                            System.out.println("Ingrese la fecha de creación");
                                            System.out.println("Ingrese el año");
                                            year = entrada.nextInt();
                                            System.out.println("Ingrese el mes");
                                            month = entrada.nextInt();
                                            System.out.println("Ingrese el día");
                                            date = entrada.nextInt();

                                            fecha = new Date(year, month, date);
                                            
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setFechaC(fecha);
                                            
                                            break;
                                            
                                            
                                        case 5:
                                            
                                            System.out.println("Ingrese el precio");
                                            precio = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setPrecio(precio);

                                            break;
                                            
                                        case 6:
                                            System.out.println("Ingrese la cantidad de llantas");
                                            llantas = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setLlantas(llantas);
                                            
                                            break;
                                        
                                        case 7:
                                            
                                            System.out.println("Ingrese el numero de pasajeros");
                                            int pasajeros = entrada.nextInt();
                                            ((Bus)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setPasajeros(pasajeros);
                                            
                                            break;
                                            
                                        case 8:
                                            
                                            System.out.println("Ingrese el tipo de bus");
                                            String tipoBus = entrada.next();
                                            tipoBus += entrada.nextLine();
                                            ((Bus)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setTipoBus(tipoBus);
                                            
                                            break;
                                            
                                         
                                        default:
                                            System.out.println("Opción no valida");
                                            break;
                                                
                                          
                                    }
                                    
                                    
                                } else if(cons.get(modVCon).getVehiculosEmpresa().get(opcionMod) instanceof Moto){
                                    
                                     System.out.println("1. Modificar color\n"
                                            + "2. Modificar marca\n"
                                            + "3. Modificar modelo\n"
                                            + "4. Modificar Fecha\n"
                                            + "5. Modificar precio\n"
                                            + "6. Modificar llantas\n"
                                            + "7. Modificar Desplazamiento \n"
                                            + "8. Modificar Motor\n ");
                                    int modMoto = entrada.nextInt();
                                    
                                    switch(modMoto){
                                        
                                        case 1:
                                            
                                            System.out.println("Ingrese el color");
                                            color = entrada.next();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setColor(color);
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Ingrese la marca");
                                            marca = entrada.next();
                                            marca += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setMarca(marca);
                                            
                                            break;
                                            
                                        case 3:
                                            
                                            System.out.println("Ingrese el modelo");
                                            modelo = entrada.next();
                                            modelo += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setModelo(modelo);
                                            
                                            break;
                                            
                                        case 4:
                                            System.out.println("Ingrese la fecha de creación");
                                            System.out.println("Ingrese el año");
                                            year = entrada.nextInt();
                                            System.out.println("Ingrese el mes");
                                            month = entrada.nextInt();
                                            System.out.println("Ingrese el día");
                                            date = entrada.nextInt();

                                            fecha = new Date(year, month, date);
                                            
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setFechaC(fecha);
                                            
                                            break;
                                            
                                            
                                        case 5:
                                            
                                            System.out.println("Ingrese el precio");
                                            precio = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setPrecio(precio);

                                            break;
                                            
                                        case 6:
                                            System.out.println("Ingrese la cantidad de llantas");
                                            llantas = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setLlantas(llantas);
                                            
                                            break;
                                        
                                        case 7:
                                            
                                            System.out.println("Ingrese el nuevo Desplazamiento");
                                            int displaceMoto = entrada.nextInt();
                                            ((Moto)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setDesplaceMotor(displaceMoto);
                                            
                                            break;
                                            
                                        case 8:
                                            
                                            System.out.println("Ingrese si el motor es electrico True or False");
                                            boolean motorMoto = entrada.nextBoolean();
                                            ((Moto)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setMotorM(motorMoto);
                                            
                                            break;
                                            
                                         
                                        default:
                                            System.out.println("Opción no valida");
                                            break;
                                                
                                          
                                    }
                                    
                                    
                                } else{
                                    
                                     System.out.println("1. Modificar color\n"
                                            + "2. Modificar marca\n"
                                            + "3. Modificar modelo\n"
                                            + "4. Modificar Fecha\n"
                                            + "5. Modificar precio\n"
                                            + "6. Modificar llantas\n"
                                            + "7. Modifircar la Descripción \n"
                                            + "8. Modificar Radio\n"
                                             + "9. Modificar el tipo de Bicicleta "
                                            );
                                    int modBici = entrada.nextInt();
                                    
                                    switch(modBici){
                                        
                                        case 1:
                                            
                                            System.out.println("Ingrese el color");
                                            color = entrada.next();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setColor(color);
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Ingrese la marca");
                                            marca = entrada.next();
                                            marca += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setMarca(marca);
                                            
                                            break;
                                            
                                        case 3:
                                            
                                            System.out.println("Ingrese el modelo");
                                            modelo = entrada.next();
                                            modelo += entrada.nextLine();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setModelo(modelo);
                                            
                                            break;
                                            
                                        case 4:
                                            System.out.println("Ingrese la fecha de creación");
                                            System.out.println("Ingrese el año");
                                            year = entrada.nextInt();
                                            System.out.println("Ingrese el mes");
                                            month = entrada.nextInt();
                                            System.out.println("Ingrese el día");
                                            date = entrada.nextInt();

                                            fecha = new Date(year, month, date);
                                            
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setFechaC(fecha);
                                            
                                            break;
                                            
                                            
                                        case 5:
                                            
                                            System.out.println("Ingrese el precio");
                                            precio = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setPrecio(precio);

                                            break;
                                            
                                        case 6:
                                            System.out.println("Ingrese la cantidad de llantas");
                                            llantas = entrada.nextInt();
                                            cons.get(modVCon).getVehiculosEmpresa().get(opcionMod).setLlantas(llantas);
                                            
                                            break;
                                        
                                        case 7:
                                            
                                            System.out.println("Ingrese la descripción de la bicicleta");
                                            String descripBici = entrada.next();
                                            descripBici += entrada.nextLine();
                                            ((Bici)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setDecripBici(descripBici);
                                            
                                            break;
                                            
                                        case 8:
                                            
                                            System.out.println("Ingrese el radio de la bicicleta");
                                            int radioBici = entrada.nextInt();
                                            
                                            ((Bici)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setRadioRueda(radioBici);
                                            
                                            break;
                                            
                                        case 9:
                                            System.out.println("Ingrese el tipo de bicicleta");
                                            String tipoBici = entrada.next();
                                            tipoBici += entrada.nextLine();
                                            ((Bici)cons.get(modVCon).getVehiculosEmpresa().get(opcionMod)).setTipoBici(tipoBici);
                                            
                                            break;
                                            
                                         
                                        default:
                                            System.out.println("Opción no valida");
                                            break;
                                                
                                          
                                    }
                                    
                                }
                                
                                
                                
                                
                                break;
                                
                            
                            
                        }
                        
                        
                        
                    }
                   
                
                break;
                
            case 4:
                
                
                
                if(cons.isEmpty()){
                    System.out.println("No hay Concesionados");
                }
                else {
                 
                System.out.println("1. Comprar\n"
                        + "2. Vender \n");
                
                int opcionCV = entrada.nextInt();
                
                if(opcionCV == 1 ){
                    for (int i = 0; i < cons.size(); i++) {
                    
                    System.out.println("Vehiculos del Consecionado #" + i);
                    System.out.println(cons.get(i).getVehiculosEmpresa());
                    
                    }
                    System.out.println("Elija el Concesionario del cual desea comprar");
                    int opcionCompra = entrada.nextInt();
                    
                    if(cons.get(opcionCompra).getClientesEmpresa().isEmpty() || cons.get(opcionCompra).getVehiculosEmpresa().isEmpty()){
                        System.out.println("No hay Vehiculos o Clientes");
                    } else{
                        
                        for (int i = 0; i < cons.get(opcionCompra).getClientesEmpresa().size(); i++) {
                            System.out.println(cons.get(opcionCompra).getClientesEmpresa());
                        }
                        
                        System.out.println("Elija el cliente");
                        int opcionClienteCompra = entrada.nextInt();
                        
                        
                        for (int i = 0; i < cons.size(); i++) {
                    
                        System.out.println("Vehiculos del Consecionado #" + i);
                        System.out.println(cons.get(i).getVehiculosEmpresa());
                    
                        }
                        
                        System.out.println("Elija el vehiculo que desea comprar");
                        int opcionCompra2 = entrada.nextInt();
                        
                        if(cons.get(opcionCompra).getVehiculosEmpresa().get(opcionCompra2).getPrecio() > cons.get(opcionCompra).getClientesEmpresa().get(opcionClienteCompra).getSaldoCliente()){
                            System.out.println("No tiene el dinero suficiente");
                        } else{
                            
                            int p = cons.get(opcionCompra).getVehiculosEmpresa().get(opcionCompra2).getPrecio() + cons.get(opcionCompra).getSaldo();
                            cons.get(opcionCompra).setSaldo(p);
                            
                            int p1 = cons.get(opcionCompra).getClientesEmpresa().get(opcionClienteCompra).getSaldoCliente() - cons.get(opcionCompra).getVehiculosEmpresa().get(opcionCompra2).getPrecio();
                            cons.get(opcionCompra).getClientesEmpresa().get(opcionClienteCompra).setSaldoCliente(p1);
                        }
                        
                        
                        
                    }
                    
                } else if(opcionCV == 2){
                    if(cons.isEmpty()){
                    System.out.println("No hay Concesionados");
                    } else {
                        
                        for (int i = 0; i < cons.size(); i++) {
                            System.out.println(cons.get(i));
                        }
                        
                        System.out.println("Elija el concesionario");
                        int opcionVenta = entrada.nextInt();
                        
                        if(cons.get(opcionVenta).getClientesEmpresa().isEmpty() || cons.get(opcionVenta).getVehiculosEmpresa().isEmpty()){
                            System.out.println("No hay clientes");
                        } else{
                            
                            for (int i = 0; i < cons.get(opcionVenta).getClientesEmpresa().size(); i++) {
                                
                                System.out.println("");
                                System.out.println(cons.get(opcionVenta).getClientesEmpresa());
                                System.out.println("");
                            }
                            
                            System.out.println("Elija el cliente");
                           int  opcionVenta2 = entrada.nextInt();
                           
                            System.out.println("Elija el vehiculo del cliente");
                            System.out.println(cons.get(opcionVenta).getClientesEmpresa().get(opcionVenta2).getVehiculosCliente());
                           
                            int opcionVenta3 = entrada.nextInt();
                            
                            if(cons.get(opcionVenta).getSaldo() < cons.get(opcionVenta).getClientesEmpresa().get(opcionVenta2).getVehiculosCliente().get(opcionVenta3).getPrecio()){
                            System.out.println("No tiene el dinero suficiente");
                        } else{
                            
                            int p3 = cons.get(opcionVenta).getSaldo() - cons.get(opcionVenta).getClientesEmpresa().get(opcionVenta2).getSaldoCliente();
                            cons.get(opcionVenta).setSaldo(p3);
                            cons.get(opcionVenta).getVehiculosEmpresa().remove(opcionVenta3);
                            
                            int p4 = cons.get(opcionVenta).getSaldo() +cons.get(opcionVenta).getClientesEmpresa().get(opcionVenta2).getSaldoCliente();
                            cons.get(opcionVenta).getClientesEmpresa().get(opcionVenta3).getVehiculosCliente().add(cons.get(opcionVenta).getVehiculosEmpresa().get(opcionVenta2));
                            cons.get(opcionVenta).getClientesEmpresa().get(opcionVenta2).setSaldoCliente(p4);
                            
                        }
                            
                            
                        }
                    } 
                    
                    
                    
                } else{
                    System.out.println("Opción no valida");
                }
                
                }
                
                
                
                
                
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
    
}
