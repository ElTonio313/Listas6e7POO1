package ex01;

public class Trapezio extends FigurasGeometricas {
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapezio(String cor, double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
        super(cor);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public double calcularPerimetro() {
        return baseMaior + baseMenor + lado1 + lado2;
    }
}
