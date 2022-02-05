package com.br.loiane.java.intermediario.activities.scope;

import com.br.loiane.java.intermediario.models.EscopoVariaveis;

public class Aula60 {
    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor());
        System.out.println(escopo.calculaValor(20));
        System.out.println(escopo.getValor());
    }
}
