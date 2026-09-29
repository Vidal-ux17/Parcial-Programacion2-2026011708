package parcial;

public class ComisionPersonalizada implements EstrategiaComision {
    private int letrasNombre;

    public ComisionPersonalizada(String nombre) {
        this.letrasNombre = nombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + letrasNombre) / 100.0;
        return montoVenta * porcentaje;
    }
}

