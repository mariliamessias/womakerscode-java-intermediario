package com.br.loiane.java.intermediario.models;

public enum TipoDocumento {

    CPF{
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf();
        }
    },
    CNPJ{
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTeste();
}
