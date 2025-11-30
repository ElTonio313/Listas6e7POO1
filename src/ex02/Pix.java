/*O pix possui o valor total da compra, chave pix e nome do destinatário. Todos os dados do pix devem
ser inicializado no momento da criação do objeto. Similar ao cartão de crédito, o pix também deve
possibilitar que seja efetuado o pagamento do valor total da compra. Ao ser invocada esta
funcionalidade, deve-se mostrar uma mensagem com todos os dados do pix efetuado.*/
package ex02;

public class Pix extends Pagamentos{
    private String chavePix;
    private String nomeDestinatario;

    public Pix(double valorTotal, String chavePix, String nomeDestinatario) {
        super(valorTotal);
        this.chavePix = chavePix;
        this.nomeDestinatario = nomeDestinatario;
    }

    @Override
    protected void pagar() {
        System.out.println("Pix");
        super.pagar();
        System.out.println("Chave Pix: " + chavePix);
        System.out.println("Nome do Destinatário: " + nomeDestinatario);
    }

}
