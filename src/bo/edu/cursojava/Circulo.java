package bo.edu.cursojava;

public class Circulo {
    double radio = 0.00 % 2f;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double obtenerPerimetro() {
        return 2 * Math.PI * getRadio();
    }

}
