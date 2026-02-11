import java.io.FileWriter;
import java.io.IOException;

public class App {

    private static final double IVA = 0.21;
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("TechSolutions SL", "B12345678", "Calle Industria 55");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(new Producto("Servidor Dell", 2500.0));
        pedido1.agregarProducto(new Producto("Windows Server", 800.0));
        pedido1.agregarProducto(new Producto("Servidor Dell PowerEdge", 2500.00));

        procesarPedido(pedido1);

        Cliente cliente2 = new Cliente("Libreria Moderna", "A98765432", "Av. Diagonal 200, Barcelona");
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(new Producto("Pack Libros Escolares", 2500.0));
        pedido2.agregarProducto(new Producto("Estantería Metálica", 800.0));

        procesarPedido(pedido2);
       }

        private static void procesarPedido(Pedido pedido){
            imprimirPedido(pedido);
            generarFicheroPedido(pedido);
        }
                
        private static void imprimirPedido(Pedido pedido) {
            System.out.println(String.format("Procesando pedido para: %s", pedido.getCliente().getNombre()));
            System.out.println(String.format("ID Cliente: %s", pedido.getCliente().getIdentificador()));
            for (int i = 0; i < pedido.getlistaProductos().size(); i++){
                System.out.println(String.format("Item %d : %s - %.2f EUR", (i+1), pedido.getlistaProductos().get(i).getNombre(), pedido.getlistaProductos().get(i).getPrecio()));
            }
            if(pedido.aplicaDescuento()){
                System.out.println("Aplica descuento por gran volumen (5%)");
            }
            System.out.println(String.format("Total Neto: %.2f", pedido.calcularSubtotal()));
            System.out.println(String.format("Total con IVA (%.2f %%): %.2f", (IVA * 100), pedido.calcularSubtotalConIVA()));
            System.out.println("--------------------------------------------------");
        }
                                
        private static void generarFicheroPedido(Pedido pedido) {
            try {
                FileWriter myWriter = new FileWriter(String.format("pedido_%s.txt", pedido.getCliente().getIdentificador()));
                myWriter.write("FACTURA\n");
                myWriter.write(String.format("Cliente: %s \n", pedido.getCliente().getNombre() ));
                myWriter.write(String.format("Direccion: %s \n", pedido.getCliente().getDireccion()));
                myWriter.write(String.format("Total a pagar: %.2f\n ", pedido.calcularSubtotalConIVA()));
                myWriter.close();
                System.out.println("Archivo guardado correctamente.");
                } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        
}



