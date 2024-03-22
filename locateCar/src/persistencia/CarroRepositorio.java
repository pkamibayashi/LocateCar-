package persistencia;

import modelo.Carro;

import java.util.List;

public interface CarroRepositorio extends Repositorio<Carro, Integer> {

    List<Carro> buscarPorParteNome(String nomeParcial);

    Carro buscarPorPlaca(String placa);
}