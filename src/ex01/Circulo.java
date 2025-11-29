package ex01;

public class Circulo extends FigurasGeometricas {
    private double raio;
    private final double PI = 3.14;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

}
