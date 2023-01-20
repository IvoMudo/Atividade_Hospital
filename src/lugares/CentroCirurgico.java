package lugares;

import pessoas.Cirurgiao;
import pessoas.Funcionario;
import pessoas.Pessoa;

public class CentroCirurgico extends Sala {
    private boolean estaTendoCirurgia = false;

    public CentroCirurgico() {
        super(true);
    }

    public CentroCirurgico(Cirurgiao cirurgiao) {
        this();
    }

    @Override
    public boolean addPessoa(Pessoa pessoa) {
        if (estaTendoCirurgia) {
            System.out.println("Está havendo uma cirurgia nessa sala, por favor não interrompa");
            return false;
        }
        if (pessoa instanceof Funcionario) {
            pessoasNaSala.add(pessoa);
            return true;
        }
        System.out.println("Essa sala tem acesso restrito, você não pode entrar aqui!");
        return false;
    }

    public boolean getEstaTendoCirurgia() {
        return estaTendoCirurgia;
    }

    public void setEstaTendoCirurgia(boolean estaTendoCirurgia) {
        this.estaTendoCirurgia = estaTendoCirurgia;
    }
}
