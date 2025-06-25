package model.entities;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private  List<String> nome;
    private Integer numeroMesa;

    public Cliente(){
    }

    public Cliente(List<String> nome, Integer numeroMesa) {
        this.nome = nome;
        this.numeroMesa = numeroMesa;
    }

    public List<String> getNome() {
        return nome;
    }

    public Cliente(List<String> nome) {
        this.nome = nome;
    }

    public void setNome(List<String> nome) {
        this.nome = nome;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void receberClinte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Poderia informar seu nome?:");

        String nome = scanner.nextLine();

        if (nome == null || nome.trim().isEmpty()) {
            throw  new IllegalArgumentException("Esse campo não pode ser vazio!");
        }

        if (!nome.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\s]+$")) {
            System.out.println("Esse campo não pode conter numeros!");
        }

        List<String> adicionarNome = new ArrayList<>();

        adicionarNome.add(nome);



        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");


    }



}
