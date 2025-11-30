package ex02;

import java.util.Scanner;

public class PagamentosTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Pagamentos pagamento = null;
        do {
            System.out.println("Escolha uma opçao de pagamento:");
            System.out.println("1 - Cartão de Crédito\n2 - Pix\n3 - Boleto\n0 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    pagamento = new CartaoCredito(500.0, "1234 5678 9012 3456", "Benjamin", "12/25", "123");
                    break;
                case 2:
                    pagamento = new Pix(250.0, "abcdef@gmail.com", "Alice");
                    break;
                case 3:
                    pagamento = new Boleto(150.0, "30/09/2024", 123456789);
                    break;
                case 0:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            if (opcao >= 1 && opcao <= 3) {
                pagamento.pagar();
            }
        } while (opcao != 0);
    }
}
