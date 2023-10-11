package com.mycompany.forca;

import java.text.Normalizer;
import java.util.Scanner;

public class Comparar {

    Tratamento tra = new Tratamento();
    int numeroJogadore = 0;
    String jogador[];
    int encontro = 0;

    public void interfac() {
        Scanner ian = new Scanner(System.in);
        do {
            System.out.println("escolha a quantidade de jogadores [1 A 4] :");
            tra.paraInt();
            numeroJogadore = tra.tratamentoInt;
        } while (numeroJogadore < 1 || numeroJogadore > 4);
        jogador = new String[numeroJogadore];
        System.out.println("Total de jogadores :" + numeroJogadore);
        System.out.println("Escolha os nomes dos jogadores");
        System.out.println("Jogador 1");
        jogador[0] = ian.next();
        if (numeroJogadore > 1) {
            System.out.println("Jogador 2");
            jogador[1] = ian.next();
        }
        if (numeroJogadore > 2) {
            System.out.println("Jogador 3");
            jogador[2] = ian.next();
        }
        if (numeroJogadore > 3) {
            System.out.println("Jogador 4");
            jogador[3] = ian.next();
        }

    }

    public void palpite(Sortea sortea) {
        int erro = 0;
        int escolha = 0;
        String vencedor = "";
        boolean acabo = true;
        Scanner ian = new Scanner(System.in);
        StringBuilder hifado = new StringBuilder();
        for (int p = 0; p < sortea.palavraSorteada.length(); p++) {
            hifado.append("-");
        }
        do {
            acabo = true;
            for (int j = 0; j < numeroJogadore; j++) {
                for (int t = 0; t < sortea.palavraSorteada.length(); t++) {
                    if (hifado.charAt(t) == '-') {
                        encontro = 1;

                    }
                }
                if (encontro == 1) {
                    acabo = false;
                } else {
                    acabo = true;
                }
                encontro = 0;
                if (acabo == true) {
                    break;
                }
                System.out.println("Palavra :" + hifado + ":");
                System.out.println("Turno do jogador :" + jogador[j]);
                vencedor = jogador[j];
                do {
                    erro = 0;
                    System.out.println("[1]-Palpite de letra [2]-Palpite de palavra completa");
                    tra.paraInt();
                    escolha = tra.tratamentoInt;
                    if (escolha < 1 || escolha > 2) {
                        erro = 1;
                        System.out.println("Escolha [1] ou [2]");
                    }
                } while (erro == 1);
                if (escolha == 2) {
                    mpalpite(sortea, hifado);
                } else {
                    System.out.println("Palpite de Letra");
                    tra.paraString();                   
                    String palpilte = tra.tratamentoString;
                    for (int i = 0; i < sortea.palavraSorteada.length(); i++) {
                        if (sortea.palavraSorteada.charAt(i) == palpilte.charAt(0)) {
                            hifado.setCharAt(i, sortea.palavraSorteadaB.charAt(i));

                        }

                    }
                }
            }

        } while (acabo == false);
        System.out.println("Vencedor Jogaodr :" + vencedor);
        System.out.println(sortea.palavraSorteadaB);

    }

    public void mpalpite(Sortea sortea, StringBuilder hifado) {
        Scanner ian = new Scanner(System.in);
        System.out.println("Escreva o Palpite de Palavra");
        tra.paraString();
        String mPalpite = tra.tratamentoString;
        if (mPalpite.equals(sortea.palavraSorteada)) {
            hifado.setLength(0);
            hifado.append(sortea.palavraSorteada);
        }

    }

}
