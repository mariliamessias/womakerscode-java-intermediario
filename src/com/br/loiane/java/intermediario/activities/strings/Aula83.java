package com.br.loiane.java.intermediario.activities.strings;

public class Aula83 {
    public static void main(String[] args) {
        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        for (String letra : letras) {
            alfabeto += letra;
        }

        System.out.println(alfabeto);

        //ThreadSafe
        StringBuffer sb = new StringBuffer();

        for (String letra : letras) {
           sb.append(letra);
        }

        alfabeto = sb.toString();

        System.out.println(alfabeto);
        System.out.println(sb.reverse());

        StringBuilder sb_ = new StringBuilder();

        for (String letra : letras) {
            sb_.append(letra);
        }
    }
}
