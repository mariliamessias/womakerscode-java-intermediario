package com.br.loiane.java.intermediario.exercises.threads;

public class Exer01 {
    public static void main(String[] args) throws InterruptedException {
        ThreadSemafaro semafaro = new ThreadSemafaro();
        for (int i =0; i<10;i++){
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();
        }

        semafaro.desligarSemafaro();
    }
}
