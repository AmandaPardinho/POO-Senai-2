public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String cpf;
    protected String endereco;

    public Pessoa(String nome, String telefone, String cpf, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public String endereco(){
        return endereco;
    }
}
