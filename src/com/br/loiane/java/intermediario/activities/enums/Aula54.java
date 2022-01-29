package com.br.loiane.java.intermediario.activities.enums;

import com.br.loiane.java.intermediario.models.Data;
import com.br.loiane.java.intermediario.models.DiaSemana;

public class Aula54 {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEGUNDA;
        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }
}
