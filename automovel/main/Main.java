package main;

import automovel.Automovel;

public class Main {

    public static void main(String[] args) {
    Automovel ferrari = new Automovel("Alonso", "Ferrari rapidona vermelha dms", "imzika2020", 1998);

    System.out.println(ferrari.imprimirInformacoes());
    System.out.println("Alonso vendeu o carro");
    ferrari.setNomeDoProprietario("José felipe");
    
    System.out.println(ferrari.imprimirInformacoes());
    }
}