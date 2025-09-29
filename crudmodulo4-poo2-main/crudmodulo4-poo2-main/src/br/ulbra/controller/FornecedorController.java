
package br.ulbra.controller;

import br.ulbra.dao.FornecedorDAO;
import br.ulbra.model.Fornecedor;
import java.sql.SQLException;
import java.util.List;

public class FornecedorController {

    private final FornecedorDAO dao;

    public FornecedorController() {
        this.dao = new FornecedorDAO();
    }

    /**
     * Salva (cria) um novo fornecedor.
     */
    public void salvar(Fornecedor f) throws SQLException {
        dao.inserir(f);
    }

    /**
     * Atualiza um fornecedor existente.
     */
    public void atualizar(Fornecedor f) throws SQLException {
        dao.atualizar(f);
    }

    /**
     * Exclui um fornecedor pelo id.
     */
    public void excluir(int id) throws SQLException {
        dao.excluir(id);
    }

    /**
     * Lista todos os fornecedores.
     */
    public List<Fornecedor> listar() throws SQLException {
        return dao.listar();
    }

    /**
     * Busca um fornecedor pelo ID.
     */
    public Fornecedor buscarPorId(int id) throws SQLException {
        return dao.obterPorId(id);
    }
}