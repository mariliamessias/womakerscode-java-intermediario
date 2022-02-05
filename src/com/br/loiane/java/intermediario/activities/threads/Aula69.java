package com.br.loiane.java.intermediario.activities.threads;

public class Aula69 {
    public static void main(String[] args) throws InterruptedException {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        //join - espera a execução da thread para depois seguir na execução do código
        t1.join(500);
        t2.join(500);
        t3.join(500);

    //Exemplo
//        while (t1.isAlive() || t2.isAlive() || t3.isAlive()){
//            Thread.sleep(200);
//        }

        System.out.println("Programa finalizado");

    }
}
