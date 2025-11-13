public class Locatario extends Pessoa{
    private String email;
    private String salario;

    public Locatario(String nome, String telefone, String cpf, String endereco, String email, String salario){
        super(nome, cpf, telefone, endereco);
        this.email = email;
        this.salario = salario;
    }
}
