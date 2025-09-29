package br.ulbra.controller;

import br.ulbra.dao.ClienteDAO;
import br.ulbra.model.Cliente;
import java.sql.SQLException;
import java.util.List;

public class ClienteController {
    
    private ClienteDAO dao = new ClienteDAO();
    
    public void salvar(Cliente c) throws SQLException {
        dao.salvar(c);
    }    
    
    public Cliente buscar(int id) throws SQLException {
        return dao.buscarPorId(id);
    }
    
    public List<Cliente> listar() throws SQLException {
        return dao.listar();
    }
    
    public void atualizar(Cliente c) throws SQLException {
        dao.atualizar(c);
    }
    
    public void remover(int id) throws SQLException {
        dao.remover(id);
    }
    
}
