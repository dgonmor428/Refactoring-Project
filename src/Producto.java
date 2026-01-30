import java.util.ArrayList;

public class Producto {
    String nombreCliente = "TechSolutions SL";
    String identificadorCliente = "B12345678";
    String direccionCliente = "Calle Industria 55, Madrid";
    String nombreCliente2 = "Libreria Moderna";
    String identificadorCliente2 = "A98765432";
    String direccionCliente2 = "Av. Diagonal 200, Barcelona";

    public Producto (){
        // --- CLIENTE 1: Lista de productos (Arrays paralelos, mala práctica) ---
        ArrayList<String> productoNombre = new ArrayList<>(); // Nombres productos
        productoNombre.add("Servidor Dell PowerEdge");
        productoNombre.add("Licencia Windows Server");
        productoNombre.add("Cableado Estructurado");
        
        ArrayList<Double> productoPrecio = new ArrayList<>(); // Precios productos
        productoPrecio.add(2500.00);
        productoPrecio.add(800.00);
        productoPrecio.add(250.50);
        // --- CLIENTE 2: Lista de productos
        ArrayList<String> productoNombre2 = new ArrayList<>();
        productoNombre2.add("Pack Libros Escolares");
        productoNombre2.add("Estantería Metálica");
        
        ArrayList<Double> productoPrecio2 = new ArrayList<>();
        productoPrecio2.add(1200.00);
        productoPrecio2.add(300.00);
    }
}
