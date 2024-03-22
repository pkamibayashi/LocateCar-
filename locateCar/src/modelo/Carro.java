package modelo;

public class Carro implements Entidade<Integer> {

    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private Tamanho tamanho;

    private boolean alugado;

    public Carro(String modelo, String marca, String cor, String placa, Tamanho tamanho, boolean alugado) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.tamanho = tamanho;
        this.alugado = alugado;
    }

    @Override
    public String getNome() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getId() {
        return placa;
    }

    public void setPlaca( String placa) {
        this.placa = placa;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}