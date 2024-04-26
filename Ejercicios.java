import java.util.Scanner;

public class Ejercicios {

//1.suma de los números naturales desde 1 hasta n con ciclos
    public static void suma_1n() {
        Scanner entrada = new Scanner(System.in);
        int numero = validar_entero_positivo(entrada, "\nIngrese un número entero positivo: ");
        
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("\nLa suma de los números naturales del 1 hasta " + numero + " es: " + suma);
    }

//2.factorial usando recursividad para un número entero positivo ingresado por el usuario
    public static void factorial() {
        Scanner entrada = new Scanner(System.in);
        int numero = validar_entero_positivo(entrada, "\nIngrese un número entero positivo: ");
        
        System.out.println("\nEl factorial de " + numero + " es: " + factorial_recursivo(numero));
    }

    public static int factorial_recursivo(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial_recursivo(n - 1);
    }

//3.potencia usando ciclos de un número ingresado por el usuario elevado a un exponente
    public static void potencia() {
        Scanner entrada = new Scanner(System.in);
        int base = validar_entero_positivo(entrada, "\nIngrese la base (un número entero positivo): ");
        int exponente = validar_entero_positivo(entrada, "\nIngrese el exponente (un número entero positivo): ");

        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println("\nEl resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    }

//4.si un número entero es primo o no usando ciclos
    public static void es_primo_c() {
        Scanner entrada = new Scanner(System.in);
        int numero = validar_entero_positivo(entrada, "\nIngrese un número entero positivo: ");
        boolean esPrimo = true;
    
        if (numero == 0 || numero == 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println("\nEl número " + numero + " es primo.");
        } else {
            System.out.println("\nEl número " + numero + " no es primo.");
        }
    }
    
//5.si un año es bisiesto o no utilizando recursividad    
    public static void año_bisiesto_r() {
        Scanner entrada = new Scanner(System.in);
        int ano = validar_entero_positivo(entrada, "\nIngresa un año: ");

        if (bisiesto_recursivo(ano)) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }
    }

    public static boolean bisiesto_recursivo(int ano) {
        if (ano < 4) {
            return false;
        } else if (ano == 4) {
            return true;
        } else {
            return bisiesto_recursivo(ano - 4);
        }
    }

//6.si un número entero es primo o no utilizando recursividad
    public static void es_primo_r() {
        Scanner entrada = new Scanner(System.in);
        int numero = validar_entero_positivo(entrada, "\nIngrese un número entero positivo: ");
    
        if (primo_recursivo(numero, 2)) {
            System.out.println("\nEl número " + numero + " es primo.");
        } else {
            System.out.println("\nEl número " + numero + " no es primo.");
        }
    }
    
    public static boolean primo_recursivo(int n, int divisor) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return primo_recursivo(n, divisor + 1);
    }
    
//7.si un año es bisiesto o no utilizando ciclos.
    public static void año_bisiesto_c() {
        Scanner entrada = new Scanner(System.in);
        int año = validar_entero_positivo(entrada, "\nIngrese un año: ");
    
        boolean esBisiesto = false;
    
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    esBisiesto = true;
                }
            } else {
                esBisiesto = true;
            }
        }
    
        if (esBisiesto) {
            System.out.println("\nEl año " + año + " es bisiesto.");
        } else {
            System.out.println("\nEl año " + año + " no es bisiesto.");
        }
    }
    
//8.suma de los dígitos pares de un número entero utilizando ciclos
    public static void suma_digitos_pares() {
        Scanner entrada = new Scanner(System.in);
        int numero = validar_entero_positivo(entrada, "\nIngrese un número entero positivo: ");
    
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        System.out.println("\nLa suma de los dígitos pares del número ingresado es: " + suma);
    }
    
//9.producto de los dígitos de un número entero utilizando recursividad.
    public static void producto_digitos() {
        Scanner entrada = new Scanner(System.in);
        int numero = validar_entero_positivo(entrada, "\nIngrese un número entero positivo: ");
    
        int producto = producto_recursivo(numero);
        System.out.println("\nEl producto de los dígitos del número ingresado es: " + producto);
    }
    
    public static int producto_recursivo(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) * producto_recursivo(n / 10);
        }
    }
    
//validacion de numero entero positivo
    public static int validar_entero_positivo(Scanner entrada, String mensaje) {
        int numero = -1;
        while (numero < 0) {
            System.out.print(mensaje);
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                if (numero < 0) {
                    System.out.println("Debe ingresar un número positivo!");
                }
            } else {
                System.out.println("Eso no es un número entero!");
                entrada.next();
            }
        }
        return numero;
    }
}
