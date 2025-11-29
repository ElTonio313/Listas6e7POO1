package ex01;

import java.util.Scanner;

public class FigurasTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FigurasGeometricas figura = null;
        int escolha = 1;

        do {
            System.out.println("Escolha a figura geométrica (1- Quadrado, 2- Retângulo, 3- Losango, 4 - Trapézio, 5 - Círculo, 6 - Sair): ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    figura = new Quadrado("Azul", 5);
                    break;
                case 2:
                    figura = new Retangulo("Vermelho", 4, 6);
                    break;
                case 3:
                    figura = new Losango("Verde", 8, 6, 5);
                    break;
                case 4:
                    figura = new Trapezio("Amarelo", 10, 6, 4, 5, 5);
                    break;
                case 5:
                    figura = new Circulo("Roxo", 7);
                    break;
                default:
                    break;
            }

            if (escolha < 6 && escolha > 0) {
                System.out.println("Área da figura: " + figura.calcularArea());
                System.out.println("Perímetro da figura: " + figura.calcularPerimetro());
            }
        } while (escolha < 6 && escolha > 0);

    }
}
