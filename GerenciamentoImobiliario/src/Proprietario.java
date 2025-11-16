package src;

public class Proprietario extends Pessoa implements ReceberValor {
    private String conta; 
    private String agencia; 

    public Proprietario(String nome, String telefone, String endereco, String cpf, String conta, String agencia) {
        super(nome, telefone, endereco, cpf);
        this.conta = conta;
        this.agencia = agencia;
    }

    @Override
    public void receberValor(double valor) {
        
        System.out.println("O proprietário " + getNome() + " está recebendo o valor de R$" + String.format("%.2f", valor)); // [cite: 50]
    }

    
    public String getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }
    
}