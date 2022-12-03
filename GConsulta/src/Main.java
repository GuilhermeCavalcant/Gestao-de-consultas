import fichario.FicharioConsulta;
import fichario.FicharioMedico;
import fichario.FicharioPaciente;
import modelo.Consulta;
import modelo.Endereco;
import modelo.Medico;
import modelo.Paciente;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inserting = new Scanner(System.in);
        ArrayList<Medico> medicoArrayList = new ArrayList<Medico>();
        ArrayList<Paciente> pacienteArrayList = new ArrayList<Paciente>();
        ArrayList<Consulta> consultaArrayList = new ArrayList<Consulta>();
        ArrayList<Endereco> enderecoArrayList = new ArrayList<Endereco>();
        FicharioPaciente ficharioPaciente = new FicharioPaciente(pacienteArrayList, enderecoArrayList);
        FicharioMedico ficharioMedico = new FicharioMedico(medicoArrayList);
        FicharioConsulta ficharioConsulta = new FicharioConsulta (consultaArrayList, medicoArrayList, pacienteArrayList);

        int operacaoGeral, opcadastropaciente, opcadastroMedico, opCadastroConsulta;
        do {
            System.out.println(" === GESTAO DE CONSULTAS === ");
            System.out.println("1 - PACIENTE ");
            System.out.println("2 - MEDICO ");
            System.out.println("3 - CONSULTA ");
            System.out.println("0 - Sair ");
            operacaoGeral = inserting.nextInt();
            inserting.skip("\n");

            switch (operacaoGeral) {
                case 1: // cadastro de aluno
                    do {
                        System.out.println(" === PACIENTE === ");
                        System.out.println("1 - Cadastrar PACIENTE ");
                        System.out.println("2 - Alterar PACIENTE ");
                        System.out.println("3 - Excluir PACIENTE ");
                        System.out.println("4 - Consultar PACIENTE ");
                        System.out.println("5 - Relatório do PACIENTE ");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        opcadastropaciente = inserting.nextInt();
                        inserting.skip("\n");

                        switch (opcadastropaciente) {
                            case 1:
                                ficharioPaciente.cadastrar();
                                break;
                            case 2:
                                ficharioPaciente.alterar();
                                break;
                            case 3:
                                ficharioPaciente.excluir();
                                break;
                            case 4:
                                ficharioPaciente.consultar();
                                break;
                            case 5:
                                ficharioPaciente.relatorio();
                                break;
                            default:
                                if (opcadastropaciente != 0) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (opcadastropaciente != 0);

                    break; // fim do case aluno


                case 2: // cadastro de professor
                    do {
                        System.out.println(" === MEDICO === ");
                        System.out.println("1 - Cadastrar MEDICO ");
                        System.out.println("2 - Alterar MEDICO ");
                        System.out.println("3 - Excluir MEDICO ");
                        System.out.println("4 - Consultar MEDICO ");
                        System.out.println("5 - Relatório do MEDICO ");
                        System.out.println("0 - Voltar ao menu MEDICO");
                        System.out.println("Opção: ");
                        opcadastroMedico = inserting.nextInt();
                        inserting.skip("\n");

                        switch (opcadastroMedico) {
                            case 1:
                                ficharioMedico.cadastrar();
                                break;
                            case 2:
                                ficharioMedico.alterar();
                                break;
                            case 3:
                                ficharioMedico.excluir();
                                break;
                            case 4:
                                ficharioMedico.consultar();
                                break;
                            case 5:
                                ficharioMedico.relatorio();
                                break;
                            default:
                                if (opcadastroMedico != 0) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (opcadastroMedico != 0);

                    break; // fim do case medico

                case 3: // cadastro de consulta
                    do {
                        System.out.println(" === CONSULTA === ");
                        System.out.println("1 - Cadastrar CONSULTA ");
                        System.out.println("3 - Excluir CONSULTA ");
                        System.out.println("4 - Consultar CONSULTA ");
                        System.out.println("5 - Relatório do CONSULTA ");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        opCadastroConsulta = inserting.nextInt();
                        inserting.skip("\n");

                        switch (opCadastroConsulta) {
                            case 1:
                                ficharioConsulta.cadastrar();
                                break;
                            case 3:
                                ficharioConsulta.excluir();
                                break;
                            case 4:
                                ficharioConsulta.consultar();
                                break;
                            case 5:
                                ficharioConsulta.relatorio();
                                break;
                            default:
                                if (opCadastroConsulta != 0) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (opCadastroConsulta != 0);

                    break; // fim do case da consulta
                default:
                    if (operacaoGeral != 0) {
                        System.out.println("Opção inválida.");
                    }
            }
        } while (operacaoGeral != 0);
    }
}
