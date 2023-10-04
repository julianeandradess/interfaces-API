package Predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um convite do tipo T e retorna um valor booleano(true e false).
 * É comunente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExemplo {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //Criar predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar o Stream para filtrar palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
