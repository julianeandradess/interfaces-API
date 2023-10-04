package Supplier;


import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;
import static java.util.stream.Stream.generate;

/**
 * Representa uma operação que não aceita nenhum argumento() e retorna um resultado do tipo T.
 * É comunente usado para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExemplo {
    //Usar o Supplier com expressões lambda para fornecer uma saudação personalizada.

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //Usar o Supplier para obter uma lista com 5 saudações.
        List<String> listaSaudacao = (List<String>) Stream.generate(saudacao)
                .limit(5)
                .toList(); //.collect(collector.toList());

         //imprimir as saudações geradas.
        listaSaudacao.forEach(out::println);
    }
}
