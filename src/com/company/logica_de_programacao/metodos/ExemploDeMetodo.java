package com.company.logica_de_programacao.metodos;

public class ExemploDeMetodo {
    public static void main(String[] args) {
        Integer numero = 3;
        Integer resultado = somaMaisUm(numero);
        System.out.println(resultado);
    }

    private static Integer somaMaisUm(Integer parametro) {
        parametro++;
        return parametro;
    }
}
