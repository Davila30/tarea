package ejercicio5;

    public class Pizza {
        private String tipo;
        private String talla;
        private String estado;

        // Variables estáticas para contar las pizzas pedidas y servidas
        private static int totalPedidas = 0;
        private static int totalServidas = 0;

        // Constructor
        public Pizza(String tipo, String talla) {
            this.tipo = tipo;
            this.talla = talla;
            this.estado = "pedida";
        Pizza.totalPedidas++;
        }

        // Getters
        public String getTipo() {
            return tipo;
        }
        public String getTalla() {
            return talla;
        }
        public String getEstado() {
            return estado;
    }

        // Setters
        public void sirve() {
        if (this.estado.equals("servida")) {
            System.out.println("esa Pizza ya se ha servido");
        } else {
            this.estado = "servida";
            Pizza.totalServidas++;
        }
        }
        // Métodos estáticos para obtener el total de pizzas pedidas y servidas


        public static int getTotalPedidas() {
            return totalPedidas;
        }

        public static int getTotalServidas() {
            return totalServidas;
        }
        
        // Método toString para representar la pizza
        @Override
        public String toString() {
            return  " Pizza " + this.tipo + " " + this.talla  + ", " + this.estado;
        }
}
