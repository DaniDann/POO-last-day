package com.mycompany.cursopoo;
import java.util.Scanner;

public class CursoPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte num;
        

        do {
            System.out.println("\nMenu de gym");
            System.out.println("1.- Datos del cliente");
            System.out.println("2.- Datos del recepcionista");
            System.out.println("3.- Datos del entrenador");
            System.out.println("0.- Salir");

            num = scanner.nextByte();
            scanner.nextLine(); 

            switch (num) {

                case 1:
                    System.out.println("\n--- Cliente ---");
                    System.out.println("1. Nombre");
                    System.out.println("2. Correo");
                    System.out.println("3. Telefono");
                    System.out.println("4. Numero de cliente");
                    System.out.println("5. Edad");

                    int op1 = scanner.nextInt();
                    scanner.nextLine();

                    switch (op1) {
                        case 1:
                            System.out.println("Nombre:");
                            nombre = scanner.nextLine();
                            break;
                        case 2:
                            System.out.println("Correo:");
                            correo = scanner.nextLine();
                            break;
                        case 3:
                            System.out.println("Telefono:");
                            telefono = scanner.nextLine();
                            break;
                        case 4:
                            System.out.println("Numero de cliente:");
                            cliente = scanner.nextInt();
                            break;
                        case 5:
                            System.out.println("Edad:");
                            edad = scanner.nextInt();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Recepcionista ---");
                    System.out.println("1. Nombre");
                    System.out.println("2. Sueldo");
                    System.out.println("3. CURP");

                    int op2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (op2) {
                        case 1:
                            System.out.println("Nombre:");
                            nombre = scanner.nextLine();
                            break;
                        case 2:
                            System.out.println("Sueldo:");
                            sueldo = scanner.nextInt();
                            break;
                        case 3:
                            System.out.println("CURP:");
                            curp = scanner.nextLine();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Entrenador ---");
                    System.out.println("1. Nombre");
                    System.out.println("2. Sueldo");
                    System.out.println("3. CURP");
                    System.out.println("4. Telefono");

                    int op3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (op3) {
                        case 1:
                            System.out.println("Nombre:");
                            nombre = scanner.nextLine();
                            break;
                        case 2:
                            System.out.println("Sueldo:");
                            sueldo = scanner.nextInt();
                            break;
                        case 3:
                            System.out.println("CURP:");
                            curp = scanner.nextLine();
                            break;
                        case 4:
                            System.out.println("Telefono:");
                            telefono = scanner.nextLine();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (num != 0);

        scanner.close();
        
        
    }
}