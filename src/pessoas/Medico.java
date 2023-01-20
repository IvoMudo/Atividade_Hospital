package pessoas;

public class Medico extends Funcionario{

    public Medico(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    void realizarDiagnostico(Paciente paciente){
        paciente.getSintomas();
    }
}
