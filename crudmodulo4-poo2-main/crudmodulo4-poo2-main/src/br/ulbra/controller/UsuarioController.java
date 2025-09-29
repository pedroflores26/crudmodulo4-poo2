 package br.ulbra.controller;

import br.ulbra.dao.UsuarioDAO;
import br.ulbra.model.Usuario;
import java.sql.SQLException;
import java.util.List;

public class UsuarioController {

    private UsuarioDAO dao;

    public UsuarioController() {
        dao = new UsuarioDAO();
    }

    public void salvar(Usuario u) throws SQLException {
        dao.salvar(u);
    }

    public void atualizar(Usuario u) throws SQLException {
        dao.atualizar(u);
    }

    public void excluir(int id) throws SQLException {
        dao.remover(id);
    }

    public List<Usuario> listar() throws SQLException {
        return dao.listar();
    }

    public Usuario buscarPorId(int id) throws SQLException {
        return dao.buscarPorId(id);
    }

 public Usuario autenticar(String login, String senha) throws Exception {
        if (login == null || login.trim().isEmpty() || senha == null || senha.trim().isEmpty()) {
            return null;
        }
        return dao.autenticar(login.trim(), senha.trim());
    }
}
