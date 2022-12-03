package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private Medico medico;
    private Paciente paciente;

    private LocalDate data;
    private LocalTime hora;
    //TODO: Metodo Construtor
    public Consulta(Medico medico, Paciente paciente,LocalDate data, LocalTime hora) {
        this.setPaciente(paciente);
        this.setMedico(medico);
        this.setData(data);
        this.setHora(hora);
    }



    // TODO: Getters Consulta
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalTime getHora() {
        return hora;
    }

    public LocalDate getData() {
        return data;
    }




    //TODO: Setters Consulta
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "CONSULTA \n{" + "\n" +
                "° nome.do.medico....: "+ getMedico().getNome()+      "\n" +
                "° nome.do.paciente..: "+ getPaciente().getNome() +   "\n" +
                "° Hora.da.consulta..: "+ getHora() +                 "\n" +
                "° Data.da.consulta..: "+ getData() +                 "\n" +
                '}' + "\n\n" ;
    }
}

