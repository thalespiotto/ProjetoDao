package br.edu.utfpr.dao;

import java.util.ArrayList;
import br.edu.utfpr.modelo.Pessoa;

public class PessoaDaoArrayList implements Dao {
    
    private ArrayList<Pessoa> lista;

    public PessoaDaoArrayList() {
        lista = new ArrayList<>();
    }
    

    @Override
    public void adicionar(Pessoa p) {
        lista.add(p);
        System.out.println("A pessoa \"" + p.getNome() + "\" foi adicionada.");
    }

    @Override
    public void remover(Pessoa p) {
        lista.remove(p);
        System.out.println("A pessoa \"" + p.getNome() + "\" foi removida.");
    }

    @Override
    public void listarTudo() {
        System.out.println(":: Inicio da Relação ::");
        for (Pessoa elementoDaLista : lista) {
            System.out.println(elementoDaLista);            
        }
        System.out.println(":: Fim da Relação ::");
    }
    
}
