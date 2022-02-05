package com.br.loiane.java.intermediario.activities.threads;

public class Aula67 extends Thread {
    public static void main(String[] args) {

        // start - inicia a thread (executa o método run)
        // run - executa a tarefa da thread
        // sleep - coloca a thread para dormir por X milissegundos

        MinhaThread thread = new MinhaThread("Thread #1", 600);
        MinhaThread thread2 = new MinhaThread("Thread #2", 900);
        MinhaThread thread3 = new MinhaThread("Thread #3", 500);

        //thread.start();
    }
}
