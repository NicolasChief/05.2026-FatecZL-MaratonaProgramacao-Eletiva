package org.example;

import java.util.Scanner;

public class Agricultor {

    public static void main(String[] args) {
        
        int P=0;
        double T=0, U=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual a Temperatura atual? ");
        T = Double.parseDouble(input.nextLine());

        System.out.println("Qual a Umidade do Solo? ");
        U = Double.parseDouble(input.nextLine());
        
        System.out.println("Qual a Previsão de Chuva? ");
        P = Integer.parseInt(input.nextLine());

        if (P == 1) {
            System.out.println("Não Regar");
        } else if (T > 30 && U < 50) {
            System.out.println("Regar");
        } else {
            System.out.println("Não regar");
        }

    }

}
