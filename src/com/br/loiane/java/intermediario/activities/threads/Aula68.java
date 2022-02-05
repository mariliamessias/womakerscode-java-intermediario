package com.br.loiane.java.intermediario.activities.threads;

public class Aula68 {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
    }
}
