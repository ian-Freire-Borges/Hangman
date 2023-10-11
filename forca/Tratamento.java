package com.mycompany.forca;

import java.text.Normalizer;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tratamento {

    int tratamentoInt = 0;
    String tratamentoString = "";

    public void paraInt() {
        Scanner ian = new Scanner(System.in);
        boolean validarImput = false;
        do {
            validarImput = false;
            try {
                tratamentoInt = ian.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha um numero");
                ian.nextLine();
                validarImput = true;
            }
        } while (validarImput == true);

    }

    public void paraString() {
        String tratamentoString2;
        boolean validarImput = false;
        Scanner ian = new Scanner(System.in);
        while (validarImput == false) {
            validarImput = true;
            tratamentoString = ian.next();
            tratamentoString = tratamentoString.toUpperCase();
            tratamentoString2 = tratamentoString;
            tratamentoString = Normalizer.normalize(tratamentoString, Normalizer.Form.NFD);
            tratamentoString = tratamentoString.replaceAll("[^\\p{ASCII}]", "");
            if (tratamentoString.equals("") || !tratamentoString.equals( tratamentoString2)) {
                System.out.println("Escolha uma palavra sem acento");
                validarImput = false;
            }
        }

    }

}
