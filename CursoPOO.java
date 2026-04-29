package com.mycompany.cursopoo;
import java.util.Scanner;

public class CursoPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        byte opcion;
        int edad, sueldo;
        long telefono;
        String tren,YN,nombre,apelliuno,apellidos,fechauno, fecha2,CURP, RFC;
        boolean repetir= false, asegurado;
        
        
        
        
        
        //Menu
        do{
            System.out.println("\n==BIENVENIDOS AL GYM==");
            System.out.print("(Ingrese el numero de acuerdo a la opcion)");
            
            System.out.println("\n1. Personas\n2. Maquinas\n3. Salir");
            System.out.print("R=");
            opcion = scanner.nextByte();
            
            //Ingresa a las opciones que ofrece maquina y personas
            switch (opcion){
                //Opciones de personas
                case 1:
                    //Validador
                    do{
                        repetir=false;
                    System.out.println("\n==PERSONAS==");
                    System.out.print("(Ingrese el numero de acuerdo a la opcion)");
                    
                    System.out.println("\n1. Clientes\n2. Personal");
                    System.out.print("R=");
                    opcion=scanner.nextByte();
                    
                    
                    
                    
                    //Aqui ingresara a las opciones que ofrece Cliente y Personal
                    switch (opcion){
                        
                        //Resgistro para cliente
                        case 1:
                            //Un do while en caso de no querer salirse de registrar
                            System.out.println("\n==CLIENTES==");
                            System.out.print("(Ingrese el numero de acuedo a la opcion)");
                            
                            System.out.println("Ingresa nombre del cliente (Solo nombre): ");
                            nombre=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Ingresa el primer apellido: ");
                            apelliuno=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Ingresa el segundo apellido: ");
                            apellidos=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Ingresa fecha de inicio de membrecia: ");
                            fechauno=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Ingresa fecha de caducidad de la membresia: ");
                            fecha2=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Telefono: ");
                            telefono=scanner.nextLong();
                            System.out.println("Edad: ");
                            edad=scanner.nextInt();
                            break;
                            
                            //Registro para entrenador
                        case 2:
                            System.out.println("\n==PERSONAL==");
                            System.out.println("(Ingrese el numero de acuerdo a la opcion)");
                            
                            System.out.println("RFC: ");
                            RFC=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Curp: ");
                            CURP=scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Sueldo: ");
                            sueldo=scanner.nextInt();
                            //Ejecuta una opcion de boolean para saber si esta asegurado
                            System.out.println("Esta asegurado:");
                            System.out.println("1. SI\n2.NO");
                            opcion=scanner.nextByte();
                            System.out.println("R=");
                            if(opcion==1){
                                asegurado=true;
                            }
                            else{
                                asegurado=false;
                            }
                            break;
                        default:
                            System.out.println("No esta en las opciones...");
                            repetir=true;
                            break;
                    }
                    }while(repetir);
                    break;
                    //Opcion de maquinas
                case 2:
                    do{
                    repetir=false;
                    System.out.println("\n==MAQUINAS==");
                    System.out.println("(\nFuerza: )");
                    //Fuerza
                    System.out.println("Marca: ");
                    //Marca
                    System.out.println("Precio: ");
                    //Precio
                    System.out.println("Mantenimiento:");
                    //Y/N
                    
                    //Aqui es una opcion aparte ver los ejercicios
                    System.out.println("Zona a trabajar:");
                    System.out.println("(Escribe superior o inferior, dependiendo de cual opcion se busca)");
                    System.out.print("R= ");
                    tren=scanner.nextLine();
                    scanner.nextLine();
                    switch (tren){
                        case "Superior":
                                System.out.println("\n==TREN SUPERIOR==");
                                /*
                                EJERSCICIOS
                                */
                                break;
                        case "Inferior":
                            System.out.println("\n==TREN INFERIOR==");
                            /*
                            EJERCICIOS
                            */
                            break;
                        default:
                            System.out.println("No hay ninguna de esas opciones...");
                            break;
                    }
                    }while(repetir);
                    break;
                    
                default:
                    System.out.println("No esta ninguna de estas opciones...");
                    break;
            }
            System.out.println("\nDesea continuar en el menu:");
            System.out.println("1. SI\n2. NO");
            System.out.print("R=");
            opcion=scanner.nextByte();
            
            //Pondra el break para cerrar el dowhile
            if(opcion==2){
                break;
            }
        }while(opcion!=3);
    }
}