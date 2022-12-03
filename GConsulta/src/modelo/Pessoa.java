package modelo;

public abstract class Pessoa {
    private String identidade;
    private String telefone;
    private String nome;
    private String cpf;




    //TODO: geters pessoa
    public String getIdentidade() {
        return identidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }



    //TODO: seters pessoa
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
