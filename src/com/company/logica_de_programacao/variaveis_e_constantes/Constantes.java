package com.company.logica_de_programacao.variaveis_e_constantes;

import java.util.Scanner;

public class Constantes {

    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar carteira.");
        } else {
            System.out.println("Nao! Ele(a) não pode tirar carteira.");
        }

        scanner.close();
    }
}
