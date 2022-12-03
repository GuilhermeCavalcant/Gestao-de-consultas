package modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Paciente extends Pessoa {
    private String nomeConvenio;
    private int numeroConvenio, posicaoEnde;
    private ArrayList<Endereco> enderecoArrayList = new ArrayList<Endereco>();


    // TODO: Metodo Construtor
    public Paciente(String nomeConvenio, int numeroConvenio, String nome, String identidade, String cpf, String telefone, ArrayList<Endereco> enderecoArrayList, int posicaoEnde){
        this.setNumeroConvenio(numeroConvenio);
        this.setNomeConvenio(nomeConvenio);
        this.setIdentidade(identidade);
        this.setTelefone(telefone);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEnderecoArrayList(enderecoArrayList);
        this.getPosicaoEnde(posicaoEnde);
    }



    // TODO: Getters Paciente
    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public int getPosicaoEnde(int posicaoEnde) {
        return this.posicaoEnde;
    }

    public ArrayList<Endereco> getEnderecoArrayList() {
        return enderecoArrayList;
    }

    // TODO: Setters Paciente

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public void setNumeroConvenio(int numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public void setEnderecoArrayList(ArrayList<Endereco> enderecoArrayList) {
        this.enderecoArrayList = enderecoArrayList;
    }

    public void setPosicaoEnde(int posicaoEnde) {
        this.posicaoEnde = posicaoEnde;
    }

    @Override
    public String toString() {
        return ">>Paciente<< \n{" + "\n" +
                "° nome............: "+ getNome() +         "\n" +
                "° Identidade......: "+ getIdentidade() +   "\n" +
                "° cpf.............: "+ getCpf() +          "\n" +
                "° Telefone........: "+ getTelefone() +     "\n" +
                "° nomeConvenio....:'" + nomeConvenio +     "\n" +
                "° numeroConvenio..:" + numeroConvenio +    "\n" +
                "° ................:" +     "\n" +
                "° .....ENDERECO...:" +     "\n" +
                  enderecoArrayList.get(posicaoEnde)+ "\n" +
                '}' + "\n\n" ;

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(getIdentidade(), paciente.getIdentidade());

    }
    //@Override
    // public int hashCode() {return Objects.hash(getIdentidade());}
}
