package src;

public class Apartamento extends Imovel {
    private int andar;
    private int numero;
    private double condominio;
    private double fundoReserva;
    private double investimentos;

    public Apartamento(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros, int andar, int numero, double condominio, double fundoReserva, double investimentos) {
        super(codigo, endereco, valorLocacao, vagasGaragem, quartos, banheiros); // Chamada correta
        this.andar = andar;
        this.numero = numero;
        this.condominio = condominio;
        this.fundoReserva = fundoReserva;
        this.investimentos = investimentos;
    }

    @Override
    public double calcularAluguel() { 
        double aluguel = getValorLocacao() + this.condominio - this.fundoReserva - this.investimentos;
        return aluguel > 0 ? aluguel : 0.0;
    }

    public int getAndar() {
        return andar;
    }

    public int getNumero() {
        return numero;
    }
    
    public double getCondominio() {
        return condominio;
    }
    
    public double getFundoReserva() {
        return fundoReserva;
    }

    public double getInvestimentos() {
        return investimentos;
    }
}