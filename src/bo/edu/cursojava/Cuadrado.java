package bo.edu.cursojava;

public class Cuadrado {
    double lado ;

    public Cuadrado (double lado) {
        this.lado=lado;
    }

    private double getLado() {
        return lado;
    }

    public double obtenerPerimetro() {
        return getLado() * 4;
    }

    public double calcularArea() {
        double res;
        return res = Math.pow(lado, 2);
    }

}
