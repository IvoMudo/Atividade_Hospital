package pessoas;

public class Medico extends Funcionario {

    public Medico(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public void realizarDiagnostico(Paciente paciente) {
        for (int i = 0; i < paciente.getSintomas().size(); i++) {
            switch (paciente.getSintomas().get(i)) {
                case Enjoo -> paciente.diagnosticarDoenca(this, "Gravida");
                case Febre -> paciente.diagnosticarDoenca(this, "Dengue");
                case Tosse -> paciente.diagnosticarDoenca(this, "Tuberculose");
            }
        }
    }
}
