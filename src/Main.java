import lugares.Atendimento;
import lugares.CentroCirurgico;
import lugares.Consultorio;
import pessoas.*;

public class Main {
    public static void main(String[] args) {
        //Salas
        Atendimento recepcao = new Atendimento();
        CentroCirurgico salaCirurgia = new CentroCirurgico();
        Consultorio salaDoMedico = new Consultorio();

        //Pessoas
        Cirurgiao maria = new Cirurgiao("Maria", 52, "987.498.514-65");
        Medico jose = new Medico("José", 38, "000.000.000-00");
        Atendente pedro = new Atendente("Pedro", 27, "123.456.789-00");

        pedro.entrarNaSala(recepcao);

        Paciente joao = new Paciente("Joao", 79);
        Paciente lucas = new Paciente("Lucas", 19);
        Paciente ruth = new Paciente("Ruth", 25);
        Paciente madalena = new Paciente("Madalena", 45);


        joao.entrarNaSala(recepcao);
        lucas.entrarNaSala(recepcao);
        ruth.entrarNaSala(recepcao);
        madalena.entrarNaSala(recepcao);

        //joao ira realizar cirurgia
        pedro.realizarAtendimento();
        maria.moverPaciente(joao, salaCirurgia);
        maria.realizarCirurgia(joao);

        //lucas tem febre e ira se consultar
        pedro.realizarAtendimento();

        jose.moverPaciente(lucas,salaDoMedico);
        lucas.adicionarSintomas(Sintomas.Febre);
        jose.realizarDiagnostico(lucas);
        System.out.println(lucas.getDoenca());

        //madalena tem tosse e ira se consultar
        madalena.adicionarSintomas(Sintomas.Tosse);

        pedro.realizarAtendimento();
        jose.moverPaciente(madalena,salaDoMedico);
        jose.realizarDiagnostico(madalena);
        System.out.println(madalena.getDoenca());
    }
}