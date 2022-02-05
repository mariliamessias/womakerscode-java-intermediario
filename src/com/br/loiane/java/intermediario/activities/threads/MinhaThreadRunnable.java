package com.br.loiane.java.intermediario.activities.threads;

public class MinhaThreadRunnable implements Runnable{

    private String nome;
    private int tempo;


    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        //Thread t = new Thread(this);
        //t.start();
    }

    @Override
    public void run() {
        System.out.println(nome + " foi iniciada");

        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " tem contador valor " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            System.out.println(nome + " foi interrompida");
        }

        System.out.println(nome + " foi terminada");
    }
}
