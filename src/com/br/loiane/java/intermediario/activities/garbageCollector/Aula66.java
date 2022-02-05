package com.br.loiane.java.intermediario.activities.garbageCollector;

import com.br.loiane.java.intermediario.models.Contato;

public class Aula66 {

    public static void obterMemoriaUsada(){
        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }

    public static void main(String[] args) {
        Contato[] contatos = new Contato[10000000];
        Contato contato;
        for(int i = 0; i< contatos.length; i++){
             contato = new Contato("Contato" + i, "123"+i,"email"+i+"@email.com" );
             contatos[i] = contato;
        }

        System.out.println("Contatos Criados");
        obterMemoriaUsada();
        contatos = null;

        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();
    }
}
