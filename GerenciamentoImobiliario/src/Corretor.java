package src; 

import java.util.Date;

public class Corretor extends Pessoa implements ReceberValor {
    private String registro;
    private Date dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public Corretor(String nome, String telefone, String endereco, String cpf, String registro, Date dataAdmissao, double comissao) {
        super(nome, telefone, endereco, cpf);
        this.registro = registro;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.totalComissaoAcumulada = 0.0;
    }

    @Override
    public void receberValor(double valor) {
        System.out.println("O corretor " + getNome() + " está recebendo o valor de R$" + String.format("%.2f", valor));
        this.totalComissaoAcumulada += valor;
    }

    public void sacarComissoes(double valor) {
        if (valor <= totalComissaoAcumulada) {
            this.totalComissaoAcumulada -= valor;
            System.out.println("Comissão de R$" + String.format("%.2f", valor) + " sacada pelo corretor " + getNome());
        } else {
            System.out.println("Erro: Valor de saque excede o total acumulado. Valor disponível: R$" + String.format("%.2f", totalComissaoAcumulada));
        }
    }

    public String getRegistro() {
        return registro;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public double getComissao() {
        return comissao;
    }

    public double getTotalComissaoAcumulada() {
        return totalComissaoAcumulada;
    }
    
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}