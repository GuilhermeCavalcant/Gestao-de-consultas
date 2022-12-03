package fichario;

import modelo.Endereco;
import modelo.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioPaciente {
    private ArrayList<Paciente> pacienteArrayList;
    private ArrayList<Endereco> enderecoArrayList = new ArrayList<Endereco>();
    private Scanner inserting;
    FicharioEndereco ficharioEndereco = new FicharioEndereco(enderecoArrayList);

    // TODO: medo construtor
    public FicharioPaciente(ArrayList<Paciente> pacienteArrayList, ArrayList<Endereco> endereco){
        this.pacienteArrayList = pacienteArrayList;
        inserting = new Scanner(System.in);
        this.enderecoArrayList = endereco;
    }


    public void cadastrar(){
        String nome, identidade, telefone, cpf, nomeConvenio;
        int numeroConvenio, posicaoEndereco;

        System.out.println("\n\n<--> REGISTERNING PATIENT <-->");
        System.out.print("° Nome...............: ");
        nome = inserting.nextLine();
        System.out.print("° CPF................: ");
        cpf = inserting.nextLine();
        System.out.print("° Identidade.........: ");
        identidade = inserting.nextLine();
        System.out.print("° Telefone...........: ");
        telefone = inserting.nextLine();
        System.out.print("° Nome do Convenio...: ");
        nomeConvenio = inserting.nextLine();
        System.out.print("° Numero do Convenio.: ");
        numeroConvenio = inserting.nextInt();
        inserting.skip("\n");

        //RECEBENDO POSIÇÃO DO endereco
        System.out.println("Qual a posição do Paciente no vetor? ");
        posicaoEndereco = inserting.nextInt();
        inserting.skip("\n");

        //EXISTE ESTE endereco?
        if (enderecoArrayList.get(posicaoEndereco) != null) {
            System.out.println(enderecoArrayList.get(posicaoEndereco));
        } else {
            System.out.println(" Posicao inválida. ");
        }



        Paciente paciente = new Paciente( nomeConvenio, numeroConvenio,  nome, identidade, cpf, telefone,  enderecoArrayList, posicaoEndereco);
        if(pacienteArrayList.contains(paciente)){
            System.out.println("Paciente já cadastrado!");
        }else{
            pacienteArrayList.add(paciente);
        }
    }

    public void alterar(){
        String nome, identidade, telefone, cpf, nomeConvenio;
        int numeroConvenio, posicao;
        System.out.println("\n\n<--> CHANGE PATIENT <-->");
        System.out.println("Em qual posicao esta o Paciente a ser alterado? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (pacienteArrayList.get(posicao) != null) {

            System.out.println("Nome atual.........................: " + pacienteArrayList.get(posicao).getNome()); //get_ pega valor do objeto
            System.out.print("Digite o novo Nome.................: ");
            nome = inserting.nextLine();
            pacienteArrayList.get(posicao).setNome(nome);

            System.out.println("Numero da identidade atual.........: " + pacienteArrayList.get(posicao).getIdentidade()); //get_ pega valor do objeto
            System.out.print("Digite o novo numero da identidade.: ");
            identidade = inserting.nextLine();
            pacienteArrayList.get(posicao).setIdentidade(identidade);


            System.out.println("CPF atual..........................: " + pacienteArrayList.get(posicao).getCpf()); //get_ pega valor do objeto
            System.out.print("Digite o novo CPF..................: ");
            cpf = inserting.nextLine();
            pacienteArrayList.get(posicao).setCpf(cpf);


            System.out.println("Tefone atual.......................: " + pacienteArrayList.get(posicao).getTelefone()); //get_ pega valor do objeto
            System.out.print("Digite o novo Telefone.............: ");
            telefone = inserting.nextLine();
            pacienteArrayList.get(posicao).setTelefone(telefone);

            System.out.println("Nome do convenio atual.............: " + pacienteArrayList.get(posicao).getNomeConvenio()); //get_ pega valor do objeto
            System.out.print("Digite o novo nome do convenio.....: ");
            nomeConvenio = inserting.nextLine();
            pacienteArrayList.get(posicao).setNomeConvenio(nomeConvenio);

            System.out.println("Numero do convenio atual...........: " + pacienteArrayList.get(posicao).getNumeroConvenio()); //get_ pega valor do objeto
            System.out.print("Digite o novo numero do convenio...: ");
            numeroConvenio = inserting.nextInt();
            pacienteArrayList.get(posicao).setNumeroConvenio(numeroConvenio);
            inserting.skip("\n");


        } else {
            System.out.println("\n\n Posicao inválida. !!!");
        }


    }

    public void excluir(){
        int posicao, confirmation;

        System.out.println("\n\n<--> PATIENT EXCLUSION <-->");
        System.out.println("Qual a posição deseja excluir? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (pacienteArrayList.get(posicao) != null) {
            System.out.println(pacienteArrayList.get(posicao));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            confirmation = inserting.nextInt();
            inserting.skip("\n");

            if (confirmation == 1) {
                pacienteArrayList.remove(posicao); // exclui um objeto do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }

        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void consultar(){
        int posicao;

        System.out.println("<--> CONSULTING PATIENT <-->");
        System.out.println("° Qual posicao deseja consultar? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (pacienteArrayList.get(posicao) != null) {
            System.out.println(pacienteArrayList.get(posicao));
        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void relatorio(){
        System.out.println("<--> PATIENT REPORT <-->");

        for(Paciente paciente: pacienteArrayList){
            System.out.println(paciente);
            System.out.println("---------------------");
        }

    }

}
