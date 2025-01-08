package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lanchonete {
    private List<Item> itemsT = new ArrayList<>();
    private  List<Cliente> clientesT = new ArrayList<>();
    private  List<Pedido> pedidosT =  new ArrayList<>();

    public  Lanchonete() {
    }

    public List<Item> getItemsT() {
        return itemsT;
    }

    public void setItemsT(List<Item> itemsT) {
        this.itemsT = itemsT;
    }

    public List<Cliente> getClientesT() {
        return clientesT;
    }

    public void setClientesT(List<Cliente> clientesT) {
        this.clientesT = clientesT;
    }

    public List<Pedido> getPedidosT() {
        return pedidosT;
    }

    public void setPedidosT(List<Pedido> pedidosT) {
        this.pedidosT = pedidosT;
    }

    public void adicionarCliente(Cliente cli) {
        clientesT.add(cli);
    }

    public void  removerCliente(Cliente cliente) {
        clientesT.remove(cliente);
    }


    public void AdicionarItem(Item items) {
        itemsT.add(items);
    }

    public void  removerItem(Item item) {
        itemsT.remove(item);
    }

   public Pedido criarPedido(Cliente cliente, Map<Item, Integer> items) {
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setItens();
        return pedido;

   }


}
