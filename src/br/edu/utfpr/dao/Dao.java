package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;

public interface Dao {
    public void adicionar(Pessoa p);
    public void remover(Pessoa p);
    public void listarTudo();
}
