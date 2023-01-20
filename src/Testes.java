import lugares.CentroCirurgico;
import pessoas.Cirurgiao;
import pessoas.Paciente;

import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        Cirurgiao ivo = new Cirurgiao("Ivo",23,"9485123");
        CentroCirurgico salaC = new CentroCirurgico();

        Paciente pobreCobaia = new Paciente("Cobaia",52);

        ivo.entrarNaSala(salaC);
        pobreCobaia.entrarNaSala(salaC);

        ivo.realizarCirurgia(pobreCobaia);
    }
}
