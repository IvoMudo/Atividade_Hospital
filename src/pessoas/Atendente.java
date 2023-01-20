package pessoas;

import lugares.Atendimento;

public class Atendente extends Funcionario{
    public Atendente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }
    public void realizarAtendimento(){
        if (this.getOndeEsta() instanceof Atendimento){
            ((Atendimento) this.getOndeEsta()).encaminharPaciente();
        }
    }
}
