package com.br.loiane.java.intermediario.exercises.threads;

public class ThreadSemafaro implements Runnable {

    private CorSemafaro cor;
    private boolean parar;
    private boolean corMudou;

    public CorSemafaro getCor() {
        return cor;
    }

    public ThreadSemafaro() {
        this.cor = CorSemafaro.VERMELHO;
        this.parar = false;
        this.corMudou = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {
            try {
//                switch (this.cor) {
//                    case VERMELHO: Thread.sleep(2000); break;
//                    case AMARELO: Thread.sleep(300); break;
//                    case VERDE: Thread.sleep(1000); break;
//                }

                Thread.sleep(this.cor.getTempoEspera());

                // mudar a cor
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor(){
        switch (this.cor) {
            case VERMELHO: this.cor = CorSemafaro.VERDE; break;
            case AMARELO: this.cor = CorSemafaro.VERMELHO; break;
            case VERDE: this.cor = CorSemafaro.AMARELO; break;
        }

        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar() throws InterruptedException {
        while (!this.corMudou){
            wait();
        }

        this.corMudou = false;
    }

    public synchronized void desligarSemafaro(){
        this.parar = true;
    }
}
