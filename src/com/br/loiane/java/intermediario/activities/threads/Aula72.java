package com.br.loiane.java.intermediario.activities.threads;

public class Aula72 {

    public static void main(String[] args) throws InterruptedException {
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

        tique.t.join();
        taque.t.join();
    }
}
