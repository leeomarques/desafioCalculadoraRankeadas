package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeHeroi;
        int qtdVitorias;
        int qtdDerrotas;
        String nivelHeroi = "";
        boolean condicao = false;
        int operacao;

        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Seja bem vindo a Calculadora de partidas Rankeadas");
            System.out.println("Digite 1 para continuar");
            System.out.println("Digite 0 para sair");
            System.out.println("----------------------------------------------------------------");
            operacao = scanner.nextInt();
            if (operacao == 1) {
                condicao = true;
            } else if (operacao == 0) {
                System.out.println("Até mais ver !");
                break;
            }

            System.out.println("Digite o nome do Herói");
            nomeHeroi = scanner.next();
            System.out.println("Digite a quantidade de derrotas do Herói");
            qtdDerrotas = scanner.nextInt();
            System.out.println("Digite a quantidade de vitórias do Herói");
            qtdVitorias = scanner.nextInt();

            int resultado = calcRankHero(qtdVitorias, qtdDerrotas);

            if (resultado < 10) {
                nivelHeroi = "Ferro";
            } else if ((resultado >= 11) && (resultado <= 20)) {
                nivelHeroi = "Bronze";
            } else if ((resultado >= 21) && (resultado <= 50)) {
                nivelHeroi = "Prata";
            } else if ((resultado >= 51) && (resultado <= 80)) {
                nivelHeroi = "Ouro";
            } else if ((resultado >= 81) && (resultado <= 90)) {
                nivelHeroi = "Diamante";
            } else if ((resultado >= 91) && (resultado <= 100)) {
                nivelHeroi = "Lendário";
            } else if (resultado >= 101) {
                nivelHeroi = "Imortal";
            }

            System.out.println("O Herói " + nomeHeroi + " tem de saldo de " + qtdVitorias + " está no nível de " + nivelHeroi);
            System.out.println("----------------------------------------------------------------");

        } while (condicao);
    }

    public static int calcRankHero(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }
}