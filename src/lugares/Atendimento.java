package lugares;

import pessoas.Paciente;
import pessoas.Pessoa;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Atendimento extends Sala {
    private Queue<Paciente> fila = new LinkedList<>();

    public Atendimento() {
        super(false);
    }

    @Override
    public boolean addPessoa(Pessoa pessoa) {
        if (pessoa instanceof Paciente) adicionarNaFila((Paciente) pessoa);
        pessoasNaSala.add(pessoa);
        return true;
    }

    public void adicionarNaFila(Paciente paciente) {
        fila.add(paciente);
        System.out.println(paciente + " sua ficha é a de nº" + this.getTamanhoFila() + " por favor aguarde sua vez de ser atendido pelo medico.");
    }

    public void encaminharPaciente() {
        try {
            System.out.printf("Vez de %s, por favor dirija-se ao consultório.\n", fila.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Não há ninguém na fila.");
        }
    }

    public int getTamanhoFila() {
        return fila.size();
    }

}
