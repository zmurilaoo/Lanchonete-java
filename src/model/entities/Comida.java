package model.entities;

public   class Comida extends Item {
    private  String tipo;

    public Comida(){
    }

    @Override
    public void calcular() {

    }

    public Comida(Integer id, String nome, Double preco, String tipo) {
        super(id, nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
