package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.heranca_e_modificador_protected_5_14;

public class Jogador extends Pessoa {
    protected boolean aindaJoga = false;
    public void dizerSeAindaJoga(){
        System.out.println("Ainda joga? " + aindaJoga);
    }
}