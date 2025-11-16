package src;

public abstract class Imovel {
    private int codigo;
    private String endereco;
    private double valorLocacao;
    private int vagasGaragem;
    private int quartos;
    private int banheiros;

    public Imovel(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valorLocacao = valorLocacao;
        this.vagasGaragem = vagasGaragem;
        this.quartos = quartos;
        this.banheiros = banheiros;
    }

    public abstract double calcularAluguel();

    public double getValorLocacao() {
        return valorLocacao; 
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getQuartos() {
        return quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }
}