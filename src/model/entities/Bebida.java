package model.entities;

public class Bebida extends Item {
    private Double volume;
    private Boolean Acoolica;

    public Bebida() {
    }

    @Override
    public void calcular() {

    }

    public Bebida(Integer id, String nome, Double preco, Double volume, Boolean acoolica) {
        super(id, nome, preco);
        this.volume = volume;
        this.Acoolica = acoolica;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Boolean getAcoolica() {
        return Acoolica;
    }

    public void setAcoolica(Boolean acoolica) {
        Acoolica = acoolica;
    }
}
