package fichario;

import modelo.Medico;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioMedico implements Fichario {
    private ArrayList<Medico> medicoArrayList;
    private Scanner inserting;

    public FicharioMedico(ArrayList<Medico> medicoArrayList) {
        this.medicoArrayList = medicoArrayList;
        inserting = new Scanner(System.in);
    }

    public void cadastrar(){
        String nome, identidade, telefone, cpf, especialidade, crm;
        int ctps;

        System.out.println("\n\n<--> REGISTERNING DOCTOR <-->");
        System.out.print("° Nome...............: ");
        nome = inserting.nextLine();
        System.out.print("° CPF................: ");
        cpf = inserting.nextLine();
        System.out.print("° Identidade.........: ");
        identidade = inserting.nextLine();
        System.out.print("° Telefone...........: ");
        telefone = inserting.nextLine();
        System.out.print("° Especialidade......: ");
        especialidade = inserting.nextLine();
        System.out.print("° crm................: ");
        crm = inserting.nextLine();
        System.out.print("° ctps...............: ");
        ctps = inserting.nextInt();
        inserting.skip("\n");

        Medico medico = new Medico( nome, identidade, cpf, telefone, especialidade, crm, ctps);
        if(medicoArrayList.contains(medico)){
            System.out.println("medico já cadastrado!");
        }else{
            medicoArrayList.add(medico);
        }
    }

    public void alterar(){
        String nome, identidade, telefone, cpf, especialidade, crm;
        int ctps, posicao;
        System.out.println("\n\n<--> CHANGE DOCTOR <-->");
        System.out.println("Em qual posicao esta o medico a ser alterado? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (medicoArrayList.get(posicao) != null) {

            System.out.println("Nome atual.........................: " + medicoArrayList.get(posicao).getNome()); //get_ pega valor do objeto
            System.out.print("Digite o novo Nome.................: ");
            nome = inserting.nextLine();
            medicoArrayList.get(posicao).setNome(nome);

            System.out.println("Numero da identidade atual.........: " + medicoArrayList.get(posicao).getIdentidade()); //get_ pega valor do objeto
            System.out.print("Digite o novo numero da identidade.: ");
            identidade = inserting.nextLine();
            medicoArrayList.get(posicao).setIdentidade(identidade);


            System.out.println("CPF atual..........................: " + medicoArrayList.get(posicao).getCpf()); //get_ pega valor do objeto
            System.out.print("Digite o novo CPF..................: ");
            cpf = inserting.nextLine();
            medicoArrayList.get(posicao).setCpf(cpf);


            System.out.println("Tefone atual.......................: " + medicoArrayList.get(posicao).getTelefone()); //get_ pega valor do objeto
            System.out.print("Digite o novo Telefone.............: ");
            telefone = inserting.nextLine();
            medicoArrayList.get(posicao).setTelefone(telefone);

            System.out.println("Nome da especialidade..............: " + medicoArrayList.get(posicao).getEspecialidade()); //get_ pega valor do objeto
            System.out.print("Digite o novo nome da especialidade: ");
            especialidade = inserting.nextLine();
            medicoArrayList.get(posicao).setEspecialidade(especialidade);

            System.out.println("crm atual..........................: " + medicoArrayList.get(posicao).getCrm()); //get_ pega valor do objeto
            System.out.print("Digite o novo crm..................: ");
            crm = inserting.nextLine();
            medicoArrayList.get(posicao).setCrm(crm);

            System.out.println("ctps atual.........................: " + medicoArrayList.get(posicao).getCtps()); //get_ pega valor do objeto
            System.out.print("Digite o novo ctps.................: ");
            ctps = inserting.nextInt();
            medicoArrayList.get(posicao).setCtps(ctps);
            inserting.skip("\n");


        } else {
            System.out.println("\n\n Posicao inválida. !!!");
        }


    }

    public void excluir(){
        int posicao, confirmation;

        System.out.println("\n\n<--> DOCTOR EXCLUSION <-->");
        System.out.println("Qual a posição deseja excluir? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (medicoArrayList.get(posicao) != null) {
            System.out.println(medicoArrayList.get(posicao));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            confirmation = inserting.nextInt();
            inserting.skip("\n");

            if (confirmation == 1) {
                medicoArrayList.remove(posicao); // exclui um objeto do vetor
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

        System.out.println("<--> CONSULTING DOCTOR <-->");
        System.out.println("° Qual posicao deseja consultar? ");
        posicao = inserting.nextInt();
        inserting.skip("\n");

        if (medicoArrayList.get(posicao) != null) {
            System.out.println(medicoArrayList.get(posicao));
        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void relatorio(){
        System.out.println("<--> DOCTOR REPORT <-->");

        for(Medico medico: medicoArrayList){
            System.out.println(medico);
            System.out.println("---------------------");
        }

    }
}
