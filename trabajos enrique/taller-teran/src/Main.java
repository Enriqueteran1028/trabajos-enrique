import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // ─── Constante IVA ───────────────────────────────────────
    private static final double IVA             = 0.19;
    private static final double DESCUENTO_ALTO  = 0.25;
    private static final double DESCUENTO_BAJO  = 0.10;
    private static final double LIMITE_DESCUENTO = 150_000.0;

    private static final Scanner scanner = new Scanner(System.in);

    // ════════════════════════════════════════════════════════
    //  MÉTODO PRINCIPAL
    // ════════════════════════════════════════════════════════
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        separador("TALLER INICIAL - ALGORITMOS Y PROGRAMACIÓN JAVA");

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();

        separador("FIN DEL TALLER");
        scanner.close();
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 1 — Leer un número entero y mostrarlo
    // ════════════════════════════════════════════════════════
    private static void ejercicio1() {
        separador("Ejercicio 1 — Leer y mostrar un número entero");
        System.out.print("  Ingrese un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("  El número ingresado es: " + numero);
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 2 — Número decimal: positivo o negativo
    // ════════════════════════════════════════════════════════
    private static void ejercicio2() {
        separador("Ejercicio 2 — Número decimal: positivo o negativo");
        System.out.print("  Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("  El número " + numero + " es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("  El número " + numero + " es NEGATIVO.");
        } else {
            System.out.println("  El número es CERO (ni positivo ni negativo).");
        }
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 3 — Número entero: par o impar
    // ════════════════════════════════════════════════════════
    private static void ejercicio3() {
        separador("Ejercicio 3 — Número entero: par o impar");
        System.out.print("  Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("  El número " + numero + " es PAR.");
        } else {
            System.out.println("  El número " + numero + " es IMPAR.");
        }
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 4 — Par-positivo, par-negativo, impar-positivo, impar-negativo
    // ════════════════════════════════════════════════════════
    private static void ejercicio4() {
        separador("Ejercicio 4 — Par/Impar + Positivo/Negativo");
        System.out.print("  Ingrese un número entero: ");
        int numero = scanner.nextInt();

        String paridad  = (numero % 2 == 0) ? "PAR"    : "IMPAR";
        String signo    = (numero >= 0)      ? "POSITIVO" : "NEGATIVO";

        System.out.println("  El número " + numero + " es " + paridad + " y " + signo + ".");
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 5 — Fecha de nacimiento → edad en años
    // ════════════════════════════════════════════════════════
    private static void ejercicio5() {
        separador("Ejercicio 5 — Calcular edad a partir de fecha de nacimiento");
        System.out.print("  Ingrese el año  de nacimiento (ej: 1998): ");
        int anio = scanner.nextInt();
        System.out.print("  Ingrese el mes  de nacimiento (1-12):      ");
        int mes  = scanner.nextInt();
        System.out.print("  Ingrese el día  de nacimiento (1-31):      ");
        int dia  = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy             = LocalDate.now();
        int edad                  = Period.between(fechaNacimiento, hoy).getYears();

        System.out.println("  La persona tiene " + edad + " años.");
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 6 — Número de teléfono → operador móvil (Colombia)
    // ════════════════════════════════════════════════════════
    private static void ejercicio6() {
        separador("Ejercicio 6 — Número de teléfono → operador móvil");
        System.out.print("  Ingrese el número de teléfono (10 dígitos, ej: 3001234567): ");
        String telefono = scanner.next();

        if (telefono.length() < 3) {
            System.out.println("  Número inválido.");
            return;
        }

        String prefijo = telefono.substring(0, 3);
        String operador;

        switch (prefijo) {
            case "300": case "301": case "302": case "303": case "304":
                operador = "Claro";
                break;
            case "310": case "311": case "312": case "313":
                operador = "Tigo";
                break;
            case "315": case "316":
                operador = "Movistar";
                break;
            case "320": case "321": case "322":
                operador = "Avantel";
                break;
            case "350": case "351":
                operador = "Virgin Mobile";
                break;
            default:
                operador = "Operador desconocido";
        }

        System.out.println("  El número " + telefono + " pertenece a: " + operador);
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 7 — Intercambiar el valor de 2 números enteros
    // ════════════════════════════════════════════════════════
    private static void ejercicio7() {
        separador("Ejercicio 7 — Intercambiar dos números enteros");
        System.out.print("  Ingrese el primer  número: ");
        int a = scanner.nextInt();
        System.out.print("  Ingrese el segundo número: ");
        int b = scanner.nextInt();

        System.out.println("  Antes del intercambio → a = " + a + ", b = " + b);

        // Intercambio sin variable auxiliar
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("  Después del intercambio → a = " + a + ", b = " + b);
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 8 — Generar número aleatorio entre 50 y 70
    // ════════════════════════════════════════════════════════
    private static void ejercicio8() {
        separador("Ejercicio 8 — Número aleatorio entre 50 y 70");
        Random random     = new Random();
        int numeroAleatorio = 50 + random.nextInt(21); // 0..20 + 50 → 50..70
        System.out.println("  Número aleatorio generado: " + numeroAleatorio);
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 9 — Edad → generación
    // ════════════════════════════════════════════════════════
    private static void ejercicio9() {
        separador("Ejercicio 9 — Edad → generación");
        System.out.print("  Ingrese la edad en años: ");
        int edad = scanner.nextInt();

        String generacion;

        if (edad >= 0 && edad <= 3) {
            generacion = "Bebé (0 - 3 años)";
        } else if (edad <= 8) {
            generacion = "Niño (4 - 8 años)";
        } else if (edad <= 12) {
            generacion = "Preadolescente (9 - 12 años)";
        } else if (edad <= 17) {
            generacion = "Adolescente (13 - 17 años)";
        } else {
            generacion = "Adulto (mayor de 17 años)";
        }

        System.out.println("  Con " + edad + " años, la persona es: " + generacion);
    }

    // ════════════════════════════════════════════════════════
    //  EJERCICIO 10 — IVA + descuento de una venta
    // ════════════════════════════════════════════════════════
    private static void ejercicio10() {
        separador("Ejercicio 10 — IVA y descuento de una venta");
        System.out.print("  Ingrese el valor de la venta (sin puntos, ej: 200000): ");
        double venta = scanner.nextDouble();

        double descuento      = (venta > LIMITE_DESCUENTO) ? DESCUENTO_ALTO : DESCUENTO_BAJO;
        double valorDescuento = venta * descuento;
        double baseGravable   = venta - valorDescuento;
        double iva            = baseGravable * IVA;
        double totalFinal     = baseGravable + iva;

        System.out.printf("  Valor de venta:        $%,.2f%n", venta);
        System.out.printf("  Descuento (%.0f%%):      -$%,.2f%n", descuento * 100, valorDescuento);
        System.out.printf("  Base gravable:          $%,.2f%n", baseGravable);
        System.out.printf("  IVA (19%%):              +$%,.2f%n", iva);
        System.out.printf("  ─────────────────────────────────%n");
        System.out.printf("  TOTAL A PAGAR:          $%,.2f%n", totalFinal);
    }

    // ════════════════════════════════════════════════════════
    //  UTILIDAD — Separador visual
    // ════════════════════════════════════════════════════════
    private static void separador(String titulo) {
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.printf( "║  %-48s║%n", titulo);
        System.out.println("╚══════════════════════════════════════════════════╝");
    }
}