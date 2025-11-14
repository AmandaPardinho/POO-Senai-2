import java.util.Date;
import java.util.Scanner;

public class Corretor extends Pessoa implements ReceberValor{
    private String registro;
    private Date dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public Corretor(String nome, String telefone, String cpf, String endereco, String registro, Date dataAdmissao, double comissao, double totalComissaoAcumulada){
        super(nome, telefone, cpf, endereco);
        this.registro = registro;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.totalComissaoAcumulada = totalComissaoAcumulada;
    }

    public void receber(double valor){
        this.totalComissaoAcumulada += valor;
        System.out.printf("O corretor %s está recebendo o valor de R$ %.2f%n", nome, valor);
    }
    
    public void sacarComissao(Scanner scanner){
        System.out.println("========== EXTRATO DA CONTA ==========");
        System.out.printf("Nome: %s%nRegistro: %s%nComissão Disponível para Saque: R$ %2.f%n", nome, registro, totalComissaoAcumulada);

        while (true) {
            System.out.println("Informe o valor do saque: ");
            String input = scanner.nextLine();

            try{

                double valor = Double.parseDouble(input);

                if(valor <= 0){
                    System.out.println("Erro: o valor deve ser maior que zero.");
                    continue;
                }

                if (valor <= totalComissaoAcumulada) {
                    double valorRestante = this.totalComissaoAcumulada - valor;
                    
                    System.out.println("========== COMPROVANTE ==========");
                    System.out.printf(
                            "Nome: %s%nRegistro: %s%nComissão Sacada: R$ %2.f%nComissão Disponível para Saque: R$ %2.f%n",
                            nome, registro, valor, valorRestante);
                    break;
                } else {
                    System.out.printf(
                            "Não é possível sacar este valor. Insira um valor menor ou igual ao valor disponível para saque.");
                }
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida. Digite um valor numérico");
            }
        }
    }
}
