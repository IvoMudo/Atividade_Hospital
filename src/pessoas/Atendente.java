package pessoas;

import lugares.Atendimento;

import java.util.Random;

public class Atendente extends Funcionario{
    public Atendente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }
    public void iniciarAtendimento(Paciente paciente){
        if (this.getOndeEsta() instanceof Atendimento){
            Atendimento lugar = (Atendimento) this.getOndeEsta();
            System.out.println(paciente+"você é o"+lugar.getTamanhoFila()+"a ser atendido pelo medico");
            lugar.adicionarNaFila(paciente);
        }
    }
}
