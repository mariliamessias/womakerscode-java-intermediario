package com.br.loiane.java.intermediario.activities.threads;

import com.br.loiane.java.intermediario.models.Calculadora;

public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada");
        int soma = 0;
        try {
            soma = calc.somaArray(this.nums);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);

        System.out.println(this.nome + " terminada");

    }
}
