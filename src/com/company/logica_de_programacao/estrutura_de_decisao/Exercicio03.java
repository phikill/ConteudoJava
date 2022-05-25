package com.company.logica_de_programacao.estrutura_de_decisao;
/*
System.out.print("Digite o número referente ao dia da semana: ");
Imprima o nome do dia da semana (domingo, segunda-feira, etc.)
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o numero referente ao dia da semana: ");
        int diaDaSemana = scanner.nextInt();
        String dia;

        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "invalido";
        }
        System.out.println("O dia da semana é: " + dia);
        scanner.close();


    }
}

