package model.entities;

import java.util.HashMap;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private HashMap<Item, Integer> itens = new HashMap<>();

    public Pedido() {
    }

    public Pedido(Integer id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HashMap<Item, Integer> getItens() {
        return itens;
    }

    public void setItens(HashMap<Item, Integer> itens) {
        this.itens = itens;
    }

    public void listarPedido() {
        for(Item chave : itens.keySet()) {
            Integer dado = itens.get(chave);

            System.out.println( "Items " + chave + " dados " + dado);
        }
    }


    public void calcularTotal() {
    }
}
