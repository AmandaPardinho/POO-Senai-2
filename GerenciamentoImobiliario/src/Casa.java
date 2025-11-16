package src;

public class Casa extends Imovel {
    private int qtdadeAndares;

    public Casa(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros, int qtdadeAndares) {
        super(codigo, endereco, valorLocacao, vagasGaragem, quartos, banheiros);
        this.qtdadeAndares = qtdadeAndares;
    }
    @Override
    public double calcularAluguel() {
        
        return getValorLocacao();
    }

    public int getQtdadeAndares() {
        return qtdadeAndares;
    }
  
}
