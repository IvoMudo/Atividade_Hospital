package pessoas;

import lugares.CentroCirurgico;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class Cirurgiao extends Medico {

    public Cirurgiao(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }


    public void realizarCirurgia(Paciente paciente) {
        if (!(this.getOndeEsta() instanceof CentroCirurgico)) {
            System.out.println("Se dirija a um centro cirúrgico para iniciar a cirurgia.");
            return;
        }
        if (!(this.getOndeEsta().getPessoasNaSala().contains(paciente))) {
            System.out.println("O paciente não se encontra nesta sala.%nPor favor, traga-o parar a realização da cirurgia.");
            return;
        }
        ((CentroCirurgico) this.getOndeEsta()).setEstaTendoCirurgia(true);
        System.out.printf("%s deu inicio a cirurgia de %s%n", this.getNome(), paciente.getNome());


        try {
            TimeUnit.SECONDS.sleep(3);//Pausa dramatica de 5s antes de saber o resultado da cirurgia
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random rand = new Random();
        double gaussianNumber = rand.nextGaussian();//gera um numero aleatorio segundo gauss
        if (gaussianNumber > 1) {
            System.out.println("A cirurgia foi um completo sucesso, o paciente está bem e terá rápida recuperação.");
        } else if (gaussianNumber > 0) {
            System.out.printf("A cirurgia foi um sucesso, o paciente %s se encontra em recuperação.", paciente.getNome());
        } else if (gaussianNumber > -1) {
            System.out.printf("Cirurgia terminada, foi um processo complicado.O paciente %s se encontra-se em recuperação, porém muito debilitado.", paciente.getNome());
        } else {
            System.out.println("Infelizmente o paciente não resistiu a cirurgia e veio a óbito");
        }

        ((CentroCirurgico) this.getOndeEsta()).setEstaTendoCirurgia(false);
    }
}
