package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_static_e_final_5_11;

public class TesteMatematica {
    public static void main(String[] args) {
        int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
        System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
        double areaCirculo = MatematicaUtil.calcularAreaCirculo(Math.ceil(104.8));
        System.out.println("Área do círculo: " + areaCirculo);

    }
}