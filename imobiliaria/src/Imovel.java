public abstract class Imovel {
    protected int codigo;
    protected String endereco;
    protected double valorLocacao;
    protected int vagasGaragem;
    protected int quartos;
    protected int banheiros;

    public Imovel(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros){
        this.codigo = codigo;
        this.endereco = endereco;
        this.valorLocacao = valorLocacao;
        this.vagasGaragem = vagasGaragem;
        this.quartos = quartos;
        this.banheiros = banheiros;
    }

    public abstract double calcularAluguel();

    public int getCodigo(){
        return codigo;
    }

    public String getEndereco(){
        return endereco;
    }

    public double getValorLocacao(){
        return valorLocacao;
    }

    public int getVagasGaragem(){
        return vagasGaragem;
    }

    public int getQuartos(){
        return quartos;
    }

    
}
