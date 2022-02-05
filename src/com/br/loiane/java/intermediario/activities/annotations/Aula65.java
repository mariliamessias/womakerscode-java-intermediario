package com.br.loiane.java.intermediario.activities.annotations;

@InformacaoAula(
        autor = "Marilia",
        aulaNumero = 65,
        blog = "blog.com"
)
public class Aula65 {

    @InformacaoAula(
            autor = "Marilia",
            aulaNumero = 65,
            blog = "blog.com"
    )
    public static void main(String[] args) {

    }
}
