package bo.edu.cursojava;

public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    private int getBase() {
        return base;
    }

    private int getAltura() {
        return altura;
    }

    public int obtenerPerimetro() {
        return getBase() * 2 + getAltura() * 2;
    }

    public int obtenerArea() {
        return getBase() * getAltura();
    }
}
