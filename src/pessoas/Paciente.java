package pessoas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class Paciente extends Pessoa {

    private List<Sintomas> sintomas = new LinkedList<>();
    private List<String> doenca = new LinkedList<>();

    public Paciente(String nome, int idade) {
        super(nome, idade);
    }

    public void printSintomas() {
        System.out.printf("%s apresenta os seguintes sintomas:%n", super.getNome());
        sintomas.forEach(System.out::println);
    }

    public void adicionarSintomas(Sintomas... sintomasNovos) {
        for (Sintomas sintoma : sintomasNovos) {
            sintomas.add(sintoma);
        }
    }

    public void diagnosticarDoenca(Pessoa pessoa, String nomeDaDoenca) {
        if (!(pessoa instanceof Medico)) {
            System.out.println("Somente um médico pode diagnosticar qual a sua doença.");
            return;
        }
        doenca.add(nomeDaDoenca);
    }

    public List<Sintomas> getSintomas() {
        return sintomas;
    }

    public String getDoenca() {
        return (doenca == null  || doenca.isEmpty())
                ? "Doenca ainda não diagnosticada, procure um médico."
                : doenca.toString();
    }
}
