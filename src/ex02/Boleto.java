/*Por fim, o boleto possui o valor total da compra, data do vencimento e código de barras (valor inteiro).
Todos os dados do boleto devem ser inicializado no momento da criação do objeto. Semelhante aos
outros modos de pagamento, o boleto também deve possibilitar a realização do pagamento do valor
total da compra. Quando esta funcionalidade for executada, uma mensagem com todos os dados do
boleto deve ser exibida.*/
package ex02;

public class Boleto extends Pagamentos{
    private String dataVencimento;
    private int codigoBarras;

    public Boleto(double valorTotal, String dataVencimento, int codigoBarras) {
        super(valorTotal);
        this.dataVencimento = dataVencimento;
        this.codigoBarras = codigoBarras;
    }

    @Override
    protected void pagar() {
        System.out.println("Boleto");
        super.pagar();
        System.out.println("Data de Vencimento: " + dataVencimento);
        System.out.println("Código de Barras: " + codigoBarras);
    }

}
