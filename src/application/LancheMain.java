package application;

import model.entities.Cardapio;
import model.entities.Cliente;
import model.entities.Pedido;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class LancheMain {
    public static void  main(String[]args ) {
        JOptionPane.showMessageDialog(null, "Seja-Bem-Vindo a lanchonete do Gordão!");

        String caminho = "C:\\Users\\Pichau\\cardapio.txt";

        System.out.println("Cardapio:");

        Cardapio cardapio =  new Cardapio();

        cardapio.exibirCardapio(caminho);

        Cliente cliente = new Cliente();

        cliente.receberClinte();

        Pedido pedido =  new Pedido();

        pedido.montarPedido();





    }
}
