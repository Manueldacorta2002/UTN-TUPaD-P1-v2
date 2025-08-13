package tp1introjava;

import java.util.Scanner;

public class TP1IntroJava {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // consumir salto de linea

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== Menu TP1: Introduccion a Java ===");
        System.out.println("1. Verificar Java");
        System.out.println("2. Hola Mundo");
        System.out.println("3. Variables");
        System.out.println("4. Leer nombre y edad");
        System.out.println("5. Aritmetica");
        System.out.println("6. Escape chars");
        System.out.println("7. Expresiones vs Instrucciones");
        System.out.println("8. Division int/double");
        System.out.println("9. Corregir Scanner");
        System.out.println("10. Prueba escritorio");
        System.out.println("0. Salir");
        System.out.print("Elige una opcion: ");
    }

    private static void ejercicio1() {
        System.out.println("Ejercicio 1: Ejecuta `java -version` en tu terminal.");
    }

    private static void ejercicio2() {
        System.out.println("Ejercicio 2: Hola, Mundo!");
    }

    private static void ejercicio3() {
        String nombre = "Maria";
        int edad = 25;
        double altura = 1.68;
        boolean estudiante = true;
        System.out.println(
            "Nombre: " + nombre +
            ", Edad: " + edad +
            ", Altura: " + altura +
            ", Estudiante: " + estudiante
        );
    }

    private static void ejercicio4() {
        System.out.print("Ingresa tu nombre: ");
        String nom = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int ed = sc.nextInt();
        sc.nextLine();
        System.out.println("-> " + nom + " tiene " + ed + " anos.");
    }

    private static void ejercicio5() {
        System.out.print("Numero A: ");
        int a = sc.nextInt();
        System.out.print("Numero B: ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        if (b != 0) {
            System.out.println("Division (double): " + ((double) a / b));
        } else {
            System.out.println("Division: ERROR (division por cero)");
        }
    }

    private static void ejercicio6() {
        System.out.println("Ejercicio 6: Mensaje con saltos y comillas:");
        System.out.println("Juan\n\"Calle Falsa 123\"");
    }

    private static void ejercicio7() {
        System.out.println("Ejercicio 7: Expresiones vs Instrucciones");
        System.out.println("- Expresion: calcula y devuelve un valor.");
        System.out.println("- Instruccion: realiza una accion (declarar, asignar, llamar a un metodo).");
    }

    private static void ejercicio8() {
        System.out.print("Ingresa X: ");
        int x = sc.nextInt();
        System.out.print("Ingresa Y: ");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Division int: " + (x / y));
        System.out.println("Division double: " + ((double) x / y));
    }

    private static void ejercicio9() {
        System.out.println("Ejercicio 9: Corregir lectura de String con Scanner.");
        System.out.println("Usa sc.nextLine() para leer cadenas correctamente.");
    }

    private static void ejercicio10() {
        System.out.println("Ejercicio 10: Prueba de escritorio:");
        int resultado = 5 / 2;
        System.out.println("5 / 2 = " + resultado + " (division entera trunca).");
    }
}
