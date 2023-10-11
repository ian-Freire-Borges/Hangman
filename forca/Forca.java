package com.mycompany.forca;

public class Forca {

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("        JOGO DA FORCA");
        System.out.println("===============================");
        Palavras p1 = new Palavras();
        Sortea p2 = new Sortea();
        Comparar p3 = new Comparar();
        p2.sortea(p1);
        p3.interfac();
        p3.palpite(p2);

    }
}
