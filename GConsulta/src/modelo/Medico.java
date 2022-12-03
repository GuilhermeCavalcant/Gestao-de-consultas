package modelo;

import java.util.Objects;

public class Medico extends Pessoa{
    private String especialidade;
    private String crm;
    private int ctps;

    //TODO: metodo construtor medico
    public Medico(String nome, String identidade, String cpf, String telefone, String especialidade, String crm, int ctps){
        this.setEspecialidade(especialidade);
        this.setIdentidade(identidade);
        this.setTelefone(telefone);
        this.setCtps(ctps);
        this.setNome(nome);
        this.setCpf(cpf);

    }

    //TODO: geters Medico

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public int getCtps() {
        return ctps;
    }


    //TODO: seters Medico

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }


    @Override
    public String toString() {
        return "Medico \n{" + "\n" +
                "° nome............: "+ getNome() +         "\n" +
                "° Identidade......: "+ getIdentidade() +   "\n" +
                "° cpf.............: "+ getCpf() +          "\n" +
                "° Telefone........: "+ getTelefone() +     "\n" +
                "° especialidade...:" + especialidade +     "\n" +
                "° crm.............:'"+ crm +               "\n" +
                "° ctps............:" + ctps +              "\n" +
                '}' + "\n\n" ;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return Objects.equals(getIdentidade(), medico.getIdentidade());

    }
}

