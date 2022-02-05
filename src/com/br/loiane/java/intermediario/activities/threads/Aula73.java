package com.br.loiane.java.intermediario.activities.threads;

public class Aula73 {
    public static void main(String[] args) throws InterruptedException {
        MinhaThreadNova t1 = new MinhaThreadNova("#1");
        MinhaThreadNova t2 = new MinhaThreadNova("#2");

        System.out.println("Pausando a Thread #1");

        t1.suspend();

        Thread.sleep(200);

        System.out.println("Pausando a Thread #2");

        t2.suspend();

        System.out.println("Resumindo a Thread #1");
        t1.resume();

        System.out.println("Resumindo a Thread #2");
        t2.resume();

        System.out.println("Terminando a Thread #2");
        t2.stop();
    }
}
