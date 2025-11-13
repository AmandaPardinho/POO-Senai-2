public abstract class Imovel {
    protected int codigo;
    protected String endereco;
    protected double locacao;
    protected int vagasGaragem;
    protected int quartos;
    protected int banheiros;

    public Imovel(int codigo, String endereco, double locacao, int vagasGaragem, int quartos, int banheiros){
        this.codigo = codigo;
        this.endereco = endereco;
        this.locacao = locacao;
        this.vagasGaragem = vagasGaragem;
        this.quartos = quartos;
        this.banheiros = banheiros;
    }

    public abstract double calcularAluguel();
}
