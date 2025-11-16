package src;
// Este é um codigo de teste para verificar a estrutura e funcionamento das classes
import java.util.Date;

public class SistemaImobiliario {
    public static void main(String[] args) {
        Corretor corretor = new Corretor("Richas", "555-QSMP", "Guaramba, VP", "111.111.111-11", "REG-001", new Date(), 0.10);
        Proprietario proprietario = new Proprietario("Celina", "555-VL", "Av. Brasil, Lote 47", "222.222.222-22", "12345-6", "001");
        Locatario locatarioCasa = new Locatario("Flora", "555-VS-A", "Rua da Arena, 300", "333.333.333-33", "fit@vermelhosangue.com", "R$ 5000");
        Locatario locatarioApto = new Locatario("Rafael", "555-QSMP-2", "Rua do Ordo, Ap. 404", "444.444.444-44", "cellbit@qsmp.com", "R$ 6000");

        Casa casa = new Casa(1, "Av. Principal, 50", 1500.00, 2, 3, 2, 2);
        Apartamento apartamento = new Apartamento(2, "Rua do Sol, 100, Ap. 501", 1200.00, 1, 2, 1, 5, 501, 300.00, 50.00, 20.00);

        Locacao locacaoCasa = new Locacao(new Date(), new Date(), locatarioCasa, casa, corretor, proprietario);
        Locacao locacaoApto = new Locacao(new Date(), new Date(), locatarioApto, apartamento, corretor, proprietario);

        System.out.println("### Teste de Cálculo de Aluguel ###");
        double aluguelCasa = casa.calcularAluguel();
        double aluguelApto = apartamento.calcularAluguel();
        System.out.println("Aluguel Casa: R$" + String.format("%.2f", aluguelCasa));
        System.out.println("Aluguel Apartamento: R$" + String.format("%.2f", aluguelApto));
        
        System.out.println("\n### Teste de Envio de Cobrança (Locação Casa) ###");
        locacaoCasa.enviarCobranca();

        System.out.println("### Teste de Pagamento e Recebimento (Locação Casa) ###");
        locacaoCasa.pagarProprietario();
        
        System.out.println("### Teste de Pagamento e Recebimento (Locação Apartamento) ###");
        locacaoApto.pagarProprietario();

        System.out.println("\n### Teste de Sacar Comissões ###");
        System.out.println("Total Comissão Acumulada antes do saque: R$" + String.format("%.2f", corretor.getTotalComissaoAcumulada()));
        
        corretor.sacarComissoes(150.00);
        
        System.out.println("Total Comissão Acumulada após o saque: R$" + String.format("%.2f", corretor.getTotalComissaoAcumulada()));
    }
}