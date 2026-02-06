public class Producto extends SistemasPedidos{
    private String nombre;
    private double precio;

    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getPrecio(){
        return precio;
    }
}
