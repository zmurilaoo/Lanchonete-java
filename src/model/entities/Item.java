package model.entities;

public abstract class Item {
    private Integer id;
    private String nome;
    private Double preco;

    public Item() {
    }

    public Item(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome= nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract  void calcular();

}
