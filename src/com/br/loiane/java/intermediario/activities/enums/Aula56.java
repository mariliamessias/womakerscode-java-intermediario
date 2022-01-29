package com.br.loiane.java.intermediario.activities.enums;

import com.br.loiane.java.intermediario.models.Pessoa;
import com.br.loiane.java.intermediario.models.TipoDocumento;

public class Aula56 {
    public static void main(String[] args) {

        for (TipoDocumento doc : TipoDocumento.values()) {
            System.out.println(doc + " " + doc.geraNumeroTeste());
        }

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);
    }
}
