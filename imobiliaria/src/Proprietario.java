public class Proprietario extends Pessoa implements ReceberValor{
    private String conta;
    private String agencia;

    public Proprietario(String nome, String telefone, String cpf, String endereco, String conta, String agencia){
        super(nome, telefone, cpf, endereco);
        this.conta = conta;
        this.agencia = agencia;
    }

    public void receber(double valor){
        System.out.printf("O proprietário %s está recebendo o valor de R$ %.2f%n", nome, valor);
    }
}
