import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Cliente {
        // --- CLIENTE 1: Datos dispersos ---
        String nombreCliente = "TechSolutions SL";
        String identificadorCliente = "B12345678";
        String direccionCliente = "Calle Industria 55, Madrid";
        String nombreCliente2 = "Libreria Moderna";
        String identificadorCliente2 = "A98765432";
        String direccionCliente2 = "Av. Diagonal 200, Barcelona";

        private static double TASA_IVA = 0.21; // Esto es el IVA

        public Cliente (String nombreCliente,String identificadorCliente,String direccionCliente){
        System.out.println("INICIANDO SISTEMA DE PEDIDOS v1.0...");
        // --- CLIENTE 1: CÁLCULOS (Mezclados con impresión) ---
        double total = 0; // total
        System.out.println("Procesando pedido para: " + nombreCliente);
        System.out.println("ID Cliente: " + identificadorCliente);
        
        for (int i = 0; i < productoNombre.size(); i++) {
        total = total + productoPrecio.get(i);
        System.out.println("Item " + (i+1) + ": " + productoNombre.get(i) + " - " +
        productoPrecio.get(i) + " EUR");
        }
        // Lógica de descuento "hardcodeada"
        if (total > 3000) {
        System.out.println("Aplica descuento por gran volumen (5%)");
        total = total * 0.95; 
        }
        double total_IVA = total + (total * TASA_IVA);
        System.out.println("Total Neto: " + total);
        System.out.println("Total con IVA (" + (TASA_IVA*100) + "%): " + total_IVA);
        System.out.println("--------------------------------------------------");
        // --- CLIENTE 1: GUARDADO EN ARCHIVO (Responsabilidad mezclada) ---
        try {
        FileWriter myWriter = new FileWriter("pedido_" + identificadorCliente + ".txt");
        myWriter.write("FACTURA\n");
        myWriter.write("Cliente: " + nombreCliente + "\n");
        myWriter.write("Direccion: " + direccionCliente + "\n");
        myWriter.write("Total a pagar: " + total_IVA + "\n");
        myWriter.close();
        System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        System.out.println("\n\n"); // Espacios feos

        
        for (int i = 0; i < productoNombre2.size(); i++) {
        total2 = total2 + productoPrecio2.get(i);
        System.out.println("Item " + (i+1) + ": " + productoNombre2.get(i) + " - " +
        productoPrecio2.get(i) + " EUR");
        }
        // Lógica de descuento repetida (y si cambiamos una, la otra se queda desactualizada)
        if (total2 > 3000) {
        System.out.println("Aplica descuento por gran volumen (5%)");
        total2 = total2 * 0.95;
        }
        double total2_IVA = total2 + (total2 * TASA_IVA);
        System.out.println("Total Neto: " + total2);
        System.out.println("Total con IVA (" + (TASA_IVA*100) + "%): " + total2_IVA);
        System.out.println("--------------------------------------------------");
        try {
        FileWriter myWriter = new FileWriter("pedido_" + identificadorCliente2 + ".txt");
        myWriter.write("FACTURA\n");
        myWriter.write("Cliente: " + nombreCliente2 + "\n");
        myWriter.write("Direccion: " + direccionCliente2 + "\n");
        myWriter.write("Total a pagar: " + total2_IVA + "\n");
        myWriter.close();
        System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
}