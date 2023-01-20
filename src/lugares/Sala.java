package lugares;

import pessoas.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public abstract class Sala {
    //Atributos
    private boolean acessoRestrito;
    private List<Pessoa> pessoasNaSala = new LinkedList<>();
    private Set<LocalDate> diasReservados = new HashSet<>();

    //Construtor
    protected Sala(boolean acessoRestrito) {
        this.acessoRestrito = acessoRestrito;
    }

    //Métodos
    public boolean addPessoa(Pessoa pessoa) { //adiciona pessoas na sala
        if (!acessoRestrito) {
            pessoasNaSala.add(pessoa);
            return true;
        }
        if (pessoa instanceof Funcionario) {
            pessoasNaSala.add(pessoa);
            return true;
        }
        System.out.println("Essa sala tem acesso restrito, você não pode entrar aqui!");
        return false;
    }
    public void addPessoa(Funcionario funcionario,Paciente paciente){
        pessoasNaSala.add(paciente);
        pessoasNaSala.add(funcionario);
    }

    public final void printPessoasNaSala() { //printa os nomes das pessoas na sala
        for (int i = 0; i < pessoasNaSala.size(); i++) {
            System.out.println(pessoasNaSala.get(i));
        }
    }

    public void resevarSala(Funcionario responsavel, int dia, int mes, int ano) {
        LocalDate diaParaReservar = LocalDate.of(ano, mes, dia);
        diasReservados.add(diaParaReservar);
        System.out.printf("Foi feita uma reserva para o dia %s por %s",diaParaReservar.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),responsavel);
    }

    //Getters
    public boolean isAcessoRestrito() {
        return acessoRestrito;
    }

    public List<Pessoa> getPessoasNaSala() {
        return pessoasNaSala;
    }

    public Set<LocalDate> getDiasReservados() {
        return diasReservados;
    }
}
