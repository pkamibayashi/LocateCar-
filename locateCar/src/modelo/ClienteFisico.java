package modelo;

import java.util.List;

public class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(String nome, String endereco, List<Carro> carrosAlugados, String cpf) {
        super(nome, endereco, carrosAlugados);
        this.cpf = cpf;
    }

    public ClienteFisico() {}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + ", cpf='"+this.cpf+"'}";
    }

    @Override
    public String getId() {
        return cpf;
    }
}