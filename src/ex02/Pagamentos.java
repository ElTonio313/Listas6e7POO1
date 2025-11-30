/*Desenvolva um sistema de pagamentos. Sabe-se que o pagamento pode ser por cartão de crédito,
pix ou boleto. O cartão de crédito possui o valor total da compra, número do cartão de crédito, nome
do titular do cartão, data de validade e código de segurança. Todos os dados do cartão devem ser
inicializado no momento da criação do objeto. Além disso, deve possibilitar que o cartão de crédito
efetue o pagamento do valor total da compra, neste caso, uma mensagem deve ser exibida em
console com todos os dados do cartão de crédito.
O pix possui o valor total da compra, chave pix e nome do destinatário. Todos os dados do pix devem
ser inicializado no momento da criação do objeto. Similar ao cartão de crédito, o pix também deve
possibilitar que seja efetuado o pagamento do valor total da compra. Ao ser invocada esta
funcionalidade, deve-se mostrar uma mensagem com todos os dados do pix efetuado.
Por fim, o boleto possui o valor total da compra, data do vencimento e código de barras (valor inteiro).
Todos os dados do boleto devem ser inicializado no momento da criação do objeto. Semelhante aos
outros modos de pagamento, o boleto também deve possibilitar a realização do pagamento do valor
total da compra. Quando esta funcionalidade for executada, uma mensagem com todos os dados do
boleto deve ser exibida.
Para realizar a instanciação dos objetos e invocação de seus métodos, utilize uma classe de testes.
Obs.: Para a resolução deste exercício, utilize os conceitos de herança, classe abstrata e
método abstrato. */
package ex02;

public abstract class Pagamentos {
    protected double valorTotal;

    public Pagamentos(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    protected void pagar(){
        System.out.println("Pagamento no valor de: R$" + valorTotal + " realizado com sucesso!");
    };

    
}
