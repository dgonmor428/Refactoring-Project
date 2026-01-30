import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class SistemasPedidos {
    public static void main(String[] args) {
        Cliente Cliente = new Cliente("TechSolutions SL", "B12345678", "Calle Industria 55");
        Pedido Pedido = new Pedido(Cliente);
        pedido1.agregarProducto(new Producto("Servidor Dell", 2500.0));
        pedido1.agregarProducto(new Producto("Windows Server", 800.0));
        
        servicioFacturacion.procesar(pedido1);
       }
}
