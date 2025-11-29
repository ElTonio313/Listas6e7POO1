/*Desenvolva um sistema para calcular as áreas e perímetros das seguintes figuras geométricas:
Círculo, Quadrado, Retângulo, Trapézio e Losango. Sabe-se que todas as figuras possuem um cor
que deve ser inicializada no momento de sua criação. Além disso, para cada uma das figuras
geométricas citadas haverá os métodos calcularArea( ) e calcularPerimetro( ) que devem ser
implementadas com suas respectivas fórmulas. Obs.: Para a resolução deste exercício, utilize os
conceitos de herança, classe abstrata e método abstrato. */
package ex01;

public abstract class FigurasGeometricas{
    protected  String cor;

    public FigurasGeometricas(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
