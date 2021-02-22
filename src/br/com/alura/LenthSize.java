package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class LenthSize {

    public static void main(String[] args) {

        // lenth é a quantidade de caracteres dentro da string
        System.out.println("daniele".length());

        // size é a quantidade de itens da lista
        List<String> nomes = new ArrayList<String>();
        nomes.add("Felipe");
        nomes.add("Daniele");
        System.out.println(nomes.size());
    }
}
