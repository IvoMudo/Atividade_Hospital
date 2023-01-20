package pessoas;

import lugares.Sala;

import java.util.Objects;

public abstract class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private Sala ondeEsta;

    private Pessoa() {
        //Todas pessoas devem ser identificadas
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos
    public void entrarNaSala(Sala sala) {
        if (sala.addPessoa(this)) {
            ondeEsta = sala;
        }
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sala getOndeEsta() {
        return ondeEsta;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && nome.equals(pessoa.nome);
    }
}
