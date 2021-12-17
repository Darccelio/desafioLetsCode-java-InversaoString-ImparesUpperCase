package com.letscode.reescrevendo_Uppercase.utils;

public class Impressora {

    private final static String MENSAGEM_SOLICITACAO_STRING = "Por favor, digite uma palavra .....: ";

    private final static String MENSAGEM_RESULTADO = "A palavra digitada em ordem invertida é .....: ";

    public static void imprimirSolicitacaoString() {
        System.out.print(MENSAGEM_SOLICITACAO_STRING);
    }

    public static void imprimirResultado ( String novaPalavra ) {

        System.out.println(MENSAGEM_RESULTADO + novaPalavra);
    }
}
