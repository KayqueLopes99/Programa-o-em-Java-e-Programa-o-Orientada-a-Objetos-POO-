package lista4.ComputadorEquipamento61;

public class Equipamento {
    private String nome;
    private String marca;

    public Equipamento(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", marca: " + this.nome;
    }

}