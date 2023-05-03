import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> problemasSoluciones = new HashMap<>(); // Mapa para almacenar los problemas y soluciones
        
        problemasSoluciones.put("0000", "Ejemplo"); // Podemos agregar aqui los datos de la BD

        Scanner scanner = new Scanner(System.in);
        String codigoProblema;
        
        // Bucle que se ejecuta hasta que el usuario ingresa "0" para salir
        do {
            System.out.println("Ingrese el código del problema (0 para salir): ");
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
        
        System.out.println("¡Gracias por utilizar nuestro sistema de solución de problemas de maquinaria!");
        
    }
}