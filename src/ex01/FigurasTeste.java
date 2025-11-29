package ex01;

import java.util.Scanner;

public class FigurasTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FigurasGeometricas figura = null;

        
        System.out.println("Escolha a figura geométrica (1- Quadrado, 2- Retângulo, 3- Losango, 4 - Trapézio, 5 - Círculo): ");
        int escolha = input.nextInt();

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

        System.out.println("Área da figura: " + figura.calcularArea());
        System.out.println("Perímetro da figura: " + figura.calcularPerimetro());
    
    }
}   
