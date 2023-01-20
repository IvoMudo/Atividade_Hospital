package pessoas;

import java.util.LinkedList;
import java.util.List;

public final class Paciente extends Pessoa {

    private List<Sintomas> sintomas = new LinkedList<>();
    private String doença;

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
        doença = nomeDaDoenca;
    }

    public List<Sintomas> getSintomas() {
        return sintomas;
    }

    public String getDoenca() {
        return (doença == null || doença.isBlank() || doença.isEmpty())
                ? "Doenca ainda não diagnosticada, procure um médico."
                : doença;
    }
}
