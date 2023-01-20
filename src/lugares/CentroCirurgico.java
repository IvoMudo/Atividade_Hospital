package lugares;

import pessoas.Cirurgiao;
import pessoas.Pessoa;

public class CentroCirurgico extends Sala {
    private Cirurgiao cirurgiao;
    private boolean estaTendoCirurgia = false;

    public CentroCirurgico() {
        super(true);
    }

    public CentroCirurgico(Cirurgiao cirurgiao) {
        this();
        this.cirurgiao = cirurgiao;
    }

    @Override
    public boolean addPessoa(Pessoa pessoa) {
        if (estaTendoCirurgia) {
            System.out.println("Está havendo uma cirurgia nessa sala, por favor não interrompa");
            return false;
        }
        return super.addPessoa(pessoa);
    }

    public boolean getEstaTendoCirurgia() {
        return estaTendoCirurgia;
    }

    public void setEstaTendoCirurgia(boolean estaTendoCirurgia) {
        this.estaTendoCirurgia = estaTendoCirurgia;
    }
}
