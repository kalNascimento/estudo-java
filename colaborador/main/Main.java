package main;

import colaborador.Colaborador;

public class Main {

    public static void main(String[] args) {
        Colaborador novoCara = new Colaborador("Lucas Augusto", 1500.50);

        System.out.println(novoCara.getSalario());
        System.out.println(novoCara.imprimirInformacoesColaborador());
        novoCara.aumentoSalarial(200);
        System.out.println(novoCara.getSalario());
    }
}