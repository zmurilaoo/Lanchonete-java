package model.entities;

import javax.swing.*;
import java.io.File;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Pedido extends Cliente {
    private LocalDateTime horaPedido;
    private List<Cliente> clientes;

    public  Pedido() {

    }

    public Pedido(LocalDateTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Pedido(List<String> nome, Integer numeroMesa, LocalDateTime horaPedido) {
        super(nome, numeroMesa);
        this.horaPedido = horaPedido;
    }

    public  void montarPedido() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Confirme o nome:");
        String nome = sc.nextLine();

        for (int i = 0; i< clientes.size();i++) {
            if (nome.equalsIgnoreCase(String.valueOf(clientes.get(0).getNome()))) {
                throw  new RuntimeException("Cliente Não encontrado!");
            }
            System.out.println("Perfeito, Seja-Bem-Vindo, Sr(a)" + nome);
        }

        System.out.println("Oque gostaria de comer hoje, Sr(a) " + nome +" ? ");

        System.out.println("Digite o numero do pedido, que será preparado!");

        int numeroPedido = sc.nextInt();



    }

}