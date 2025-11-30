/*O cartão de crédito possui o valor total da compra, número do cartão de crédito, nome
do titular do cartão, data de validade e código de segurança. Todos os dados do cartão devem ser
inicializado no momento da criação do objeto. Além disso, deve possibilitar que o cartão de crédito
efetue o pagamento do valor total da compra, neste caso, uma mensagem deve ser exibida em
console com todos os dados do cartão de crédito. */
package ex02;

public class CartaoCredito extends Pagamentos{
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;

    public CartaoCredito(double valorTotal, String numeroCartao, String nomeTitular, String dataValidade,
            String codigoSeguranca) {
        super(valorTotal);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    protected void pagar() {
        System.out.println("Cartão de Crédito");
        super.pagar();
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Data de Validade: " + dataValidade);
        System.out.println("Código de Segurança: " + codigoSeguranca);
    }
}
