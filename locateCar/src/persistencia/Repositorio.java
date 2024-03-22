package persistencia;

import modelo.Entidade;

import java.util.List;

public interface Repositorio<T extends Entidade<ID>, ID> {

    T salvar(T entidade);

    void remover(T entidade);

    boolean removerPorId(String identificador);

    List<T> listarTodos();

    T buscarPorId(String identificador);

}