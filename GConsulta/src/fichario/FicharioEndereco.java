package fichario;

import modelo.Consulta;
import modelo.Endereco;
import modelo.Medico;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioEndereco implements Fichario {

    private ArrayList<Endereco> enderecoArrayList;
    private Scanner inserting;

    public FicharioEndereco(ArrayList<Endereco> enderecoArrayList) {
        this.enderecoArrayList = enderecoArrayList;
        inserting = new Scanner(System.in);
    }

    @Override
    public void cadastrar() {
        String complemento, logradouro, municipio, bairro, numero, cep;
        int tipo;


        System.out.println("\n\n<--> REGISTERNING ENDEREÇO <-->");
        System.out.print("° Complemento........: ");
        complemento = inserting.nextLine();
        System.out.print("° logradouro.........: ");
        logradouro = inserting.nextLine();
        System.out.print("° Municipo...........: ");
        municipio = inserting.nextLine();
        System.out.print("° Bairro.............: ");
        bairro = inserting.nextLine();
        System.out.print("° Numero.............: ");
        numero = inserting.nextLine();
        System.out.print("° Cep................: ");
        cep = inserting.nextLine();
        System.out.print("° Tipo...............: ");
        tipo = inserting.nextInt();
        inserting.skip("\n");

        Endereco endereco = new Endereco( complemento, logradouro, municipio, bairro, numero, cep, tipo);
        if(enderecoArrayList.contains(endereco)){
            System.out.println("endereco já cadastrado!");
        }else{
            enderecoArrayList.add(endereco);
            System.out.println("Endereco cadastrado com sucesso");
        }
    }

    @Override
    public void alterar() {
        String complemento, logradouro, municipio, bairro, numero, cep;
        int tipo, posicao;
        System.out.println("\n\n<--> CHANGE Endereco <-->");
        System.out.println("Em qual posicao esta o endereco a ser alterado? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (enderecoArrayList.get(posicao) != null) {

            System.out.println("Complemento.atual..................: " + enderecoArrayList.get(posicao).getComplemento());
            System.out.print("Digite.o.novo.Complento............: ");
            complemento = inserting.nextLine();
            enderecoArrayList.get(posicao).setComplemento(complemento);

            System.out.println("logradouro.atual...................: " + enderecoArrayList.get(posicao).getLogradouro());
            System.out.print("Digite o novo logradouro.............: ");
            logradouro = inserting.nextLine();
            enderecoArrayList.get(posicao).setLogradouro(logradouro);


            System.out.println("Bairro.atual.......................: " + enderecoArrayList.get(posicao).getBairro());
            System.out.print("Digite o novo Bairro...............: ");
            bairro = inserting.nextLine();
            enderecoArrayList.get(posicao).setBairro(bairro);


            System.out.println("Municipio.atual....................: " + enderecoArrayList.get(posicao).getMunicipio());
            System.out.print("Digite o novo Municipio............: ");
            municipio = inserting.nextLine();
            enderecoArrayList.get(posicao).setMunicipio(municipio);

            System.out.println("numero.atual.......................: " + enderecoArrayList.get(posicao).getNumero());
            System.out.print("Digite o novo numero.................: ");
            numero = inserting.nextLine();
            enderecoArrayList.get(posicao).setNumero(numero);

            System.out.println("Cep atual..........................: " + enderecoArrayList.get(posicao).getCep());
            System.out.print("Digite o novo cep..................: ");
            cep = inserting.nextLine();
            enderecoArrayList.get(posicao).setCep(cep);

            System.out.println("Tipo atual.........................: " + enderecoArrayList.get(posicao).getTipo());
            System.out.print("Digite o novo tipo.................: ");
            tipo = inserting.nextInt();
            enderecoArrayList.get(posicao).setTipo(tipo);
            inserting.skip("\n");


        } else {
            System.out.println("\n\n Posicao inválida. !!!");
        }


    }

    @Override
    public void excluir() {
        int posicao, resposta;

        System.out.println(" --==[Excluir Endereço]==-- ");
        System.out.println("Qual a posição do vetor deseja excluir? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (enderecoArrayList.get(posicao) != null) {
            System.out.println(enderecoArrayList.get(posicao));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resposta = inserting.nextInt();
            inserting.skip("\n");

            if (resposta == 1) {
                enderecoArrayList.remove(posicao); //Realiza exclusao do Objeto Consulta do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }
        } else {
            System.out.println(" Posição inválida. ");
        }
    }

    @Override
    public void consultar() {
        int posicao;

        System.out.println(" --==[Consultar enderecos]==-- ");
        System.out.println("Qual a posição do vetor deseja consultar? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        //ja existe este endereço
        if (enderecoArrayList.get(posicao) != null) {
            System.out.println(enderecoArrayList.get(posicao));
        } else {
            System.out.println(" Posição inválida. ");
        }
    }

    @Override
    public void relatorio() {
        System.out.println("[Relatório de Endereço]");

        for(Endereco endereco: enderecoArrayList){
            System.out.println(endereco);
            System.out.println("---------------------");
        }
    }
}
