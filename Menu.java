import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n===== Menú de Ejercicios =====");
            System.out.println("1. Suma de 1 a n (ciclo)");
            System.out.println("2. Factorial (recursivo)");
            System.out.println("3. Potencia (ciclo)");
            System.out.println("4. Número Primo (ciclo)");
            System.out.println("5. Año Bisiesto (recursivo)");
            System.out.println("6. Número Primo (recursivo)");
            System.out.println("7. Año Bisiesto (ciclos)");
            System.out.println("8. Suma de Dígitos Pares (ciclos)");
            System.out.println("9. Producto de Dígitos (recursivo)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios.suma_1n();
                    break;
                case 2:
                    Ejercicios.factorial();
                    break;
                case 3:
                    Ejercicios.potencia();
                    break;
                case 4:
                    Ejercicios.es_primo_c();
                    break;
                case 5:
                    Ejercicios.año_bisiesto_r();
                    break;
                case 6:
                    Ejercicios.es_primo_r();
                    break;
                case 7:
                    Ejercicios.año_bisiesto_c();
                    break;
                case 8:
                    Ejercicios.suma_digitos_pares();
                    break;
                case 9:
                    Ejercicios.producto_digitos();
                    break;
                case 0:
                    System.out.println("\nFin del programa!\n");
                    break;
                default:
                    System.out.println("\nOpción no válida!");
                    break;
            }
        } while (opcion != 0);
        entrada.close();
    }
}
