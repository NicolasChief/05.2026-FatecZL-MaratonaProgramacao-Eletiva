package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            List<String> linhas = new ArrayList<>();

            while (input.hasNextLine()) {

                String linha = input.nextLine().trim();

                if (linha.equals("*")) {
                    System.out.println(0);
                    return;
                }

                if (linha.isEmpty()) break;

                linhas.add(linha);
            }

            long resultado = 0;
            int potencia = 0;

            for (int i = linhas.size() - 1; i >= 0; i--) {
                String linha = linhas.get(i);

                int valor = 0;

                if (linha.equals("*")) {
                    valor = 0;
                } else {
                    for (char c : linha.toCharArray()) {
                        if (c == '.') valor += 1;
                        if (c == '-') valor += 5;
                    }
                }

                resultado += valor * Math.pow(20, potencia);
                potencia++;
            }

            System.out.println(resultado);
        }
    }
}