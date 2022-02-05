package com.br.loiane.java.intermediario.activities.strings;

public class Aula76 {
    public static void main(String[] args) {
        String curso = "Curso";
        String java = "Java";

        String cursoJava = curso + java;
        System.out.println(cursoJava);

        String resultado2Com2 = "Resultado 2 + 2 = " + (2 + 2);
        System.out.println(resultado2Com2);

        String resultado2Com2_ = "Resultado 2 + 2 = " + 2 + 2;
        System.out.println(resultado2Com2_);

        String um = String.valueOf(1);
        System.out.println(um);

        String concatenacao = "s simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type " +
                "specimen book. It has survived not only five centuries, but also the leap into" +
                " electronic typesetting, remaining essentially unchanged. It was popularised in " +
                "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including " +
                "versions of Lorem Ipsum.";

        System.out.println(concatenacao);

        // Strings são imutáveis, ou seja, seu valor não muda.

        String concatenacao2 = "s simply dummy text of the printing and typesetting industry. ";
        concatenacao2 += "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, ";
        concatenacao2 += "when an unknown printer took a galley of type and scrambled it to make a type ";

        System.out.println(concatenacao2);
    }
}
