package com.br.loiane.java.intermediario.activities.enums;

import com.br.loiane.java.intermediario.models.DiaSemana;
import com.br.loiane.java.intermediario.models.DiaSemanaConstantes;

public class Aula53 {

    public static void main(String[] args) {
        usandoConstantes();
        System.out.println("");
        usandoEnum();
    }

    private static void usandoConstantes(){
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no java: ");

        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);

    }

    private static void imprimeDiaSemana(int dia){
        switch (dia){
            case 1: System.out.println("segunda-feira"); break;
            case 2: System.out.println("terça-feira"); break;
            case 3: System.out.println("quarta-feira"); break;
            case 4: System.out.println("quinta-feira"); break;
            case 5: System.out.println("sexta-feira"); break;
            case 6: System.out.println("sábado"); break;
            case 7: System.out.println("domingo"); break;
        }
    }

    private static void imprimeDiaSemana(DiaSemana dia){
        switch (dia){
            case SEGUNDA: System.out.println("segunda-feira"); break;
            case TERCA: System.out.println("terça-feira"); break;
            case QUARTA: System.out.println("quarta-feira"); break;
            case QUINTA: System.out.println("quinta-feira"); break;
            case SEXTA: System.out.println("sexta-feira"); break;
            case SABADO: System.out.println("sábado"); break;
            case DOMINGO: System.out.println("domingo"); break;
        }
    }

    private static void usandoEnum(){
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Teste utilizando enums no java: ");

        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }
}
