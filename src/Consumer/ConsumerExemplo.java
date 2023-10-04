/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizado principalmente para realizar ações, ou efeitos colaterais dos elementos do Stream sem modificar,
 * ou retonar um valor.
 */

package Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExemplo {

    public static void main(String[] args) {
        //criar lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        /**usar o consumer com expressão lambda para imprimir números pares.
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };*/


        /*usar o consumer para imprimir números pares no Stream
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if(n % 2 == 0){
                    System.out.println(n);
                }

           }
        });*/

        //Os métodos acima é o mesmo mostrado abaixo só que com mais praticidade.
        //usar o stream com lambda para diminuir o código:
        numeros.forEach(n -> {
                if(n % 2 == 0) {
                    System.out.println(n);
                }
        });




    }
}
