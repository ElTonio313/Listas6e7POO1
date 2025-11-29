package ex01;

public class Losango extends FigurasGeometricas {
    private double diagonalMaior;
    private double diagonalMenor;
    private double lado;

    public Losango(String cor, double diagonalMaior, double diagonalMenor, double lado) {
        super(cor);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
