package automovel;

public class Automovel {
    private String nomeDoProprietario;
    private String modelo;
    private String placa;
    private int ano;

    public Automovel(String nomeDoProprietario, String modelo, String placa, int ano) {
        setNomeDoProprietario(nomeDoProprietario);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
    }

    public void setNomeDoProprietario(String nome) {
        this.nomeDoProprietario = nome;
    }

    public String getNomeDoProprietario() {
        return this.nomeDoProprietario;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    private void setPlaca(String numeroDaPlaca) {
        this.placa = numeroDaPlaca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno(int anoDoVeiculo) {
        return this.ano;
    }

    public String imprimirInformacoes() {
        return String.format("O nome do proprietario é: %s\nO modelo do veiculo é: %s\n fabricado no ano de: %d portador da placa: %s", this.nomeDoProprietario, this.modelo, this.ano, this.placa);
    }
}
