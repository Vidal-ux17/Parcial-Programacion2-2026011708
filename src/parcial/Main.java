package parcial;

public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Vidal", 1000, new ComisionPersonalizada("Vidal"));

        v.mostrarDetalle();

        // Cambiar estrategia a personalizada
        v.cambiarEstrategia(new ComisionPersonalizada("Vidal"));
        v.mostrarDetalle();
    }
}
