package com.br.loiane.java.intermediario.exercises.enums;

public class Exer01 {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;

        for(Calculadora.Operacao op: Calculadora.Operacao.values()){
            System.out.print(x + " " );
            System.out.print(op.toString() + " ");
            System.out.print(y + " =  " );
            System.out.println(op.executarOperacao(x, y));
        }
    }
}
