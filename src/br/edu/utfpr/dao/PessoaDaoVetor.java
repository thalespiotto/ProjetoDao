package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;

public class PessoaDaoVetor implements Dao {

    private Pessoa lista[];
    
    public PessoaDaoVetor() {
        lista = new Pessoa[5];
    }
    
    @Override
    public void adicionar(Pessoa p) {
        
    }

    @Override
    public void remover(Pessoa p) {
        
    }

    @Override
    public void listarTudo() {
        
    }
        
}
