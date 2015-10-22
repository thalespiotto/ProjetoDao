package dao;

import modelo.Pessoa;

public interface Dao {
    public void adicionar(Pessoa p);
    public void remover(Pessoa p);
    public void listarTudo();
}
