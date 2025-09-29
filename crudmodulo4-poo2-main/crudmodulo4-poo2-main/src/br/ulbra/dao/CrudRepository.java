package br.ulbra.dao;

import java.util.List;
import java.sql.SQLException;


public interface CrudRepository <T> {
    
    public void salvar(T obj) throws SQLException;
    
    public T buscarPorId(int id)throws SQLException;
    
    public List<T> listar()throws SQLException;
    
    public void atualizar (T obj)throws SQLException;
    
    public void remover (int id) throws SQLException;
    
}
