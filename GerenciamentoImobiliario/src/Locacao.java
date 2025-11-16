package src;

import java.util.Date;

public class Locacao {
    private Date dataInicio;
    private Date dataTermino;
    private Date dataPagamento;
    private Locatario locatario; 
    private Imovel imovel;       
    private Corretor corretor;   
    private Proprietario proprietario; 

    public Locacao(Date dataInicio, Date dataTermino, Locatario locatario, Imovel imovel, Corretor corretor, Proprietario proprietario) {
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.locatario = locatario;
        this.imovel = imovel;
        this.corretor = corretor;
        this.proprietario = proprietario;
    }

    public void enviarCobranca() {
        double valorAluguel = this.imovel.calcularAluguel();
        System.out.println("--- Envio de Cobrança ---");
        System.out.println("E-mail: " + this.locatario.getEmail());
        System.out.println("O valor referente ao seu aluguel neste mês foi de R$" + String.format("%.2f", valorAluguel) + ".");
        System.out.println("-------------------------");
    }

    public void pagarProprietario() {
        double aluguelTotal = this.imovel.calcularAluguel();
        
        double valorComissao = aluguelTotal * this.corretor.getComissao();
        double valorLiquidoProprietario = aluguelTotal - valorComissao;

        System.out.println("\n--- Processamento de Pagamento (R$" + String.format("%.2f", aluguelTotal) + ") ---");
        
        this.corretor.receberValor(valorComissao);

        this.proprietario.receberValor(valorLiquidoProprietario);
        
        System.out.println("--- Fim do Processamento ---\n");
    }

    public Locatario getLocatario() {
        return locatario;
    }
    
    public Imovel getImovel() {
        return imovel;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}