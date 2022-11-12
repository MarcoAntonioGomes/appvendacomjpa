package br.edu.infnet.orm.modelo.persistence;

import br.edu.infnet.orm.modelo.entidade.Cliente;

import java.util.List;

public interface IDAO<T> {

    void salvar(T t);

    void atualizar(T t);

    void excluir(T t);

    T obter(Long codigo);

    List<T> listarTodos();
}
