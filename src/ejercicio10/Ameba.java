package ejercicio10;

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3; // Peso inicial de la ameba
    }

    void come(int pesoComida){
        this.peso += pesoComida - 1; // Incrementa el peso, restando
    }
    void come(Ameba a) {
    this.peso += a.peso - 1;
    a.peso = 0; // la ameba comida se queda sin sustancia
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }

}
