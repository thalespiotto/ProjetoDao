package app;

import dao.*;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João","Silva",20);
        Pessoa thales = new Pessoa("Thales","Lira", 25);
        Pessoa fulano = new Pessoa("Fulano","Ciclano",49);
        Dao dao = new PessoaDaoArrayList();
        dao.adicionar(joao);
        dao.adicionar(thales);
        dao.adicionar(fulano);
        dao.listarTudo();
        
        System.out.println("\n\n ---- Removendo");
        dao.remover(joao);
        dao.remover(thales);
        dao.remover(fulano);
        dao.listarTudo();
    }
}
