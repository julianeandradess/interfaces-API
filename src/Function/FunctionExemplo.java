package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizado para transferir ou mapear os elementos dos Stream em outros valores ou tipos.
 * Usar a function com expressão lambda para dobrar todos os números.
 * Esse Integer, Integer. É o tipo do argumento e do retorno.(Se for uma string e quiser um double, é só colocar.
 * map é usado bastante para mapear.
 */
public class FunctionExemplo {
    public static void main(String[] args) {

        //Criar uma lista de números inteiros.
        List<Integer> numeros = asList(1, 2, 3, 4);


        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a function para dobrar todos os números do Stream e armazená-lo em outra lista.
        List<Integer> numerosDobrados =  numeros.stream()
                .map(dobrar)
                .toList();

        //imprimir lista de números dobrados.

        numerosDobrados.forEach(System.out::println);

    }
}
