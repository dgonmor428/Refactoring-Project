public class Cliente {
        private String nombre;
        private String identificador;
        private String direccion;

        public Cliente (String nombre, String identificador, String direccion){
            this.nombre = nombre;
            this.identificador = identificador;
            this.direccion = direccion;
        }

        public String getNombre(){
            return nombre;
        }

        public String getIdentificador(){
            return identificador;
        }

        public String getDireccion(){
            return direccion;
        }
    
}