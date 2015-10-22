package modelo;

public class Pessoa {
    private String nome, sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + ", Sobrenome: " + sobrenome + ", Idade: " + idade);
    }
    
    
}
