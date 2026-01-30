public class Pedido {

    String nombreCliente = "TechSolutions SL";
    String identificadorCliente = "B12345678";
    String direccionCliente = "Calle Industria 55, Madrid";

    private static double TASA_IVA = 0.21; // Esto es el IVA
    public Pedido (){
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
    }
}
