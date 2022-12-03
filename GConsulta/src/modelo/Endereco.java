package modelo;

public class Endereco {
    private String complemento;
    private String logradouro;
    private String municipio;
    private String bairro;
    private String numero;
    private String cep;
    private int tipo;

    //TODO: Metodo Construtor Endereco

    public Endereco(String complemento, String logradouro, String municipio, String bairro, String numero, String cep, int tipo) {
        setComplemento(complemento);
        setLogradouro(logradouro);
        setMunicipio(municipio);
        setBairro(bairro);
        setNumero(numero);
        setTipo(tipo);
        setCep(cep);
    }

    //TODO: Getters Endereco

    public String getComplemento() {
        return complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public int getTipo() {
        return tipo;
    }


    //TODO: Setters Endereco
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    @Override
    public String toString() {
        return ">>Paciente<< \n{" + "\n" +
                "° Cep.............:" + getCep() +    "\n" +
                "° Municipio.......:" + getMunicipio() +    "\n" +
                "° Bairro..........:" + getBairro() +    "\n" +
                "° Complemento.....:" + getComplemento() +    "\n" +
                "° Tipo............:" + getTipo() +    "\n" +
                '}' + "\n\n" ;

    }
}

