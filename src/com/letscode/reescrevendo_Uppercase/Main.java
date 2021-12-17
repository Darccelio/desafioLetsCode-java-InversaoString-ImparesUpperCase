package com.letscode.reescrevendo_Uppercase;

import com.letscode.reescrevendo_Uppercase.service.Reversao;
import com.letscode.reescrevendo_Uppercase.utils.Impressora;
import com.letscode.reescrevendo_Uppercase.utils.Leitor;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String palavra =  Leitor.escanearString();
        String palavraInvertida = Reversao.inverterString(palavra);

        Impressora.imprimirResultado(palavraInvertida);

    }
}
