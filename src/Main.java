import lugares.Atendimento;
import lugares.CentroCirurgico;
import lugares.Consultorio;
import pessoas.Funcionario;
import pessoas.Paciente;
import pessoas.Pessoa;
import pessoas.Sintomas;

public class Main {
    public static void main(String[] args) {
        Atendimento recepcao = new Atendimento();
        CentroCirurgico salaCirurgia = new CentroCirurgico();
        Consultorio salaDoMedico = new Consultorio();

        Pessoa maria = new Funcionario("maria",52,"89.154.196");
        maria.entrarNaSala(recepcao);
        System.out.println(maria.getOndeEsta());
        maria.entrarNaSala(salaCirurgia);
        System.out.println(maria.getOndeEsta());
        maria.entrarNaSala(salaDoMedico);
        System.out.println(maria.getOndeEsta());
    }
}