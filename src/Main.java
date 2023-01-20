import lugares.Atendimento;
import lugares.CentroCirurgico;
import lugares.Consultorio;
import pessoas.*;

public class Main {
    public static void main(String[] args) {
        Atendimento recepcao = new Atendimento();
        CentroCirurgico salaCirurgia = new CentroCirurgico();
        Consultorio salaDoMedico = new Consultorio();

        Pessoa maria = new Paciente("maria",52);
        maria.entrarNaSala(recepcao);
        System.out.println(maria.getOndeEsta());
        maria.entrarNaSala(salaCirurgia);
        System.out.println(maria.getOndeEsta());
        maria.entrarNaSala(salaDoMedico);
        System.out.println(maria.getOndeEsta());
    }
}