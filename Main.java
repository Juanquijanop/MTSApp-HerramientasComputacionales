package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> problemasSoluciones = new HashMap<>(); // Mapa para almacenar los problemas y soluciones

        problemasSoluciones.put("E1", "Error: Sobrecalentamiento del motor\n" +
                "Solución: Paso 1 - Apague la máquina inmediatamente\n" +
                "Solución: Paso 2 - Verifique el nivel de refrigerante y agregue si es necesario\n" +
                "Solución: Paso 3 - Limpie los radiadores y asegúrese de que no estén obstruidos");

        problemasSoluciones.put("E2", "Error: Fugas de aire en el sistema hidráulico\n" +
                "Solución: Paso 1 - Inspeccione las conexiones y juntas hidráulicas en busca de fugas\n" +
                "Solución: Paso 2 - Reemplace los sellos y empaques dañados\n" +
                "Solución: Paso 3 - Verifique la presión del sistema hidráulico y ajústela si es necesario");

        problemasSoluciones.put("E3", "Error: Vibraciones excesivas en la máquina\n" +
                "Solución: Paso 1 - Verifique que todas las partes móviles estén correctamente ajustadas\n" +
                "Solución: Paso 2 - Equilibre o reemplace los componentes desgastados\n" +
                "Solución: Paso 3 - Ajuste los soportes y bases de la máquina para reducir las vibraciones");

        Scanner scanner = new Scanner(System.in);
        String codigoProblema;

        System.out.println("Lista de códigos de problema:");
        for (String codigo : problemasSoluciones.keySet()) {
            System.out.println("- " + codigo);
        }

        // Bucle que se ejecuta hasta que el usuario ingresa "0" para salir
        do {
            System.out.println("\nIngrese el código del problema (0 para salir): ");
            codigoProblema = scanner.nextLine();

            if (problemasSoluciones.containsKey(codigoProblema)) {
                System.out.println("Solución: " + problemasSoluciones.get(codigoProblema));
                System.out.println("¿Se resolvió el problema? (s/n): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.println("Problema resuelto. ¡Buen trabajo!");
                } else {
                    System.out.println("Intente resolver el problema nuevamente o busque ayuda.");
                }
            } else if (!codigoProblema.equals("0")) {
                System.out.println("Código de problema no válido. Por favor, intente nuevamente.");
            }
        } while (!codigoProblema.equals("0"));

        System.out.println("\n¡Gracias por utilizar nuestro sistema de solución de problemas de maquinaria!");
    }
}