package BinaryOperator;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina 2 argumentos do tipo T e retorma um resultado do mesmo tipo T.
 * É usada para realizar operações de reduções em pares de elementos, como somar números e combinar objetos.
 */
public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar BinaryOperator com expressões lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usar o BinaryOperator para somar todos os números do Stream
        //.reduce é praticamente uma variável temporária
        int resultado = numeros.stream()
                .reduce(0, somar);


        //Imprimir os resultados da soma
        System.out.println("A soma dos números são " + resultado);

    }
}
