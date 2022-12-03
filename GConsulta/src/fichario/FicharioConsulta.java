package fichario;

import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


public class FicharioConsulta implements Fichario {
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Consulta> consultas;

    private  Scanner entrada;

    public FicharioConsulta(ArrayList<Consulta> consultas, ArrayList<Medico> medicos, ArrayList<Paciente> pacientes){
    this.medicos = medicos;
        this.pacientes = pacientes;
        this.consultas = consultas;
        entrada = new Scanner(System.in);
    }

    public void cadastrar() {
        int posicaoMedico, posicaoPaciente;
        String dataConsulta, horaConsulta;
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm:ss");



        System.out.println(" === Cadastrar CONSULTA === ");

        //RECEBENDO POSIÇÃO DO MEDICO
        System.out.println("Qual a posição da Medico no vetor? ");
        posicaoMedico = entrada.nextInt();
        entrada.skip("\n");

        //EXISTE ESTE MEDICO?
        if (medicos.get(posicaoMedico) != null) {
            System.out.println(medicos.get(posicaoMedico));
        } else {
            System.out.println(" Posicao inválida. ");
        }

        //RECEBENDO POSIÇÃO DO PACIENTE
        System.out.println("Qual a posição do Paciente no vetor? ");
        posicaoPaciente = entrada.nextInt();
        entrada.skip("\n");

        //EXISTE ESTE PACIENTE?
        if (pacientes.get(posicaoPaciente) != null) {
            System.out.println(pacientes.get(posicaoPaciente));
        } else {
            System.out.println(" Posicao inválida. ");
        }


        //RECEBENDO DADOS DE DATA DA CONSULTA
        System.out.println("Digite a data da consulta[dd/MM/yyyy]:");
        dataConsulta = entrada.nextLine();
        LocalDate data = LocalDate.parse(dataConsulta, formatoData);

        //RECEBENDO DADOS DA HORA DA CONSULTA
        System.out.println("Digite a hora da consulta[hh:mm:ss]");
        horaConsulta = entrada.nextLine();
        LocalTime hora = LocalTime.parse(horaConsulta, formatoHora);


        Consulta consulta; //objeto CONSULTA para cada posição
        if((medicos.get(posicaoMedico) != null) && (pacientes.get(posicaoPaciente) != null)){

            consulta = new Consulta(medicos.get(posicaoMedico), pacientes.get(posicaoPaciente), data, hora);

            if(consultas.contains(consulta)){
                System.out.println("CONSULTA já cadastrado!");
            }else{
                consultas.add(consulta);
                System.out.println("CONSULTA CADASTRADA COM SUCESSO!!");
            }


        }else{
            System.out.println("Um dos campos esta null");
        }




    }

    @Override
    public void alterar() {

    }

    public void excluir() {
        int posicao, resposta;

        System.out.println(" --==[Excluir Consulta]==-- ");
        System.out.println("Qual a posição do vetor deseja excluir? ");
        posicao = entrada.nextInt();
        entrada.skip("\n");

        if (consultas.get(posicao) != null) {
            System.out.println(consultas.get(posicao));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resposta = entrada.nextInt();
            entrada.skip("\n");

            if (resposta == 1) {
                consultas.remove(posicao); //Realiza exclusao do Objeto Consulta do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }
        } else {
            System.out.println(" Posição inválida. ");
        }
    }

    public void consultar() {
        int posicao;

        System.out.println(" --==[Consultar Consulta]==-- ");
        System.out.println("Qual a posição do vetor deseja consultar? ");
        posicao = entrada.nextInt();
        entrada.skip("\n");

        //ja existe esta consulta?
        if (consultas.get(posicao) != null) {
            System.out.println(consultas.get(posicao));
        } else {
            System.out.println(" Posição inválida. ");
        }
    }


    public void relatorio() {

        System.out.println("[Relatório de Consulta]");

        for(Consulta consulta: consultas){
            System.out.println(consulta);
            System.out.println("---------------------");
        }

    }
}
