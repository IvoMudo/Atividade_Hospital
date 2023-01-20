package lugares;

import pessoas.Paciente;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Atendimento extends Sala {
    private Queue<Paciente> fila = new LinkedList<>();

    public Atendimento() {
        super(false);
    }

    public void adicionarNaFila(Paciente paciente) {
        fila.add(paciente);
    }

    public void encaminharPaciente() {
        try {
            System.out.printf("Vez de %s, por favor dirija-se ao consultório.", fila.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Não há ninguém na fila.");
        }
    }

    public int getTamanhoFila() {
        return fila.size();
    }
}
