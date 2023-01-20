package lugares;

import pessoas.Funcionario;
import pessoas.Pessoa;

public class Consultorio extends Sala{
    public Consultorio() {
        super(true);
    }

    @Override
    public boolean addPessoa(Pessoa pessoa) {
        if (pessoa instanceof Funcionario) {
            pessoasNaSala.add(pessoa);
            return true;
        }
        System.out.println("Essa sala tem acesso restrito, você não pode entrar aqui!");
        return false;
    }
}
