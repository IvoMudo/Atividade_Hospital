package pessoas;

import lugares.Sala;
import pessoas.Pessoa;

import java.util.Objects;

public abstract class Funcionario extends Pessoa {
    //Atributos
    private String cpf;

    //Construtor
    public Funcionario(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    //Métodos
    public void moverPaciente(Paciente paciente, Sala sala) {
        sala.addPessoa(this,paciente);
        this.entrarNaSala(sala);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Funcionario)) return false;

        Funcionario funcionario = (Funcionario) obj;
        return Objects.equals(cpf, funcionario.cpf);
    }
}
