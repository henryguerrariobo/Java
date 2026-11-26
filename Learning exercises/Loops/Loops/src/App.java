import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Imprime los números del 1 al 10 usando while.
        int numb = 1;
        while (numb <=10) {
        // Código que se ejecuta mientras la condición sea verdadera
        System.out.println(numb);
        numb++;
    }


        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> numbers = new ArrayList<>(); // creamos el ArrayList vacia
        
        numbers.add(10); // agregamos datos al ArrayList.
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int i = 0; // variable que usaremos. 

        do {  // Se usa el get para llamar los datos de numbers. 
            System.out.println(numbers.get(i)); // practicamnete el do while es una condición que hara lo que digamos 
            i++;                                // hasta que se cumpla la condicion. 
        } while (i < numbers.size()); //evitas intentar acceder a una posición que no existe.

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int index = 1; index <= 50; index++){
            if (index % 5 == 0)
            System.out.println(index);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] array  ={1,2,3,5,4};
        int sum = 0;   
        for (int z= 0; z < array.length; z++ ){
            sum += array[z];
        }
        System.out.println("la suma total es :"+ sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int a = 0; a < array.length; a++){
            System.out.println(array[a]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        /**
         * Recorre un HashMap utilizando un for-each y keySet().
         *
         * keySet() permite obtener el conjunto de claves almacenadas en el HashMap.
         * En este caso, las claves son los nombres de los contactos.
         *
         * El for-each recorre cada clave del HashMap y almacena temporalmente
         * la clave actual en la variable "name".
         *
         * Finalmente, se imprime cada nombre del contacto.
         */
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Henry", "3001234567");
        contacts.put("Carlos", "3101234567");
        contacts.put("Laura", "3201234567");

        for (String name : contacts.keySet()) {
            System.out.println(name);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int x = 10; x>=1; x--) {
        System.out.println(x);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        /**
        * Recorre los números del 1 al 20 utilizando un ciclo for.
        *
        * Se utiliza el operador módulo (%) para identificar los múltiplos de 3.
        * Si el residuo de dividir el número entre 3 es 0, significa que es
        * múltiplo de 3 y se utiliza continue para saltar esa iteración.
        *
        * De esta manera, los múltiplos de 3 no se imprimen y el ciclo
        * continúa con el siguiente número.
        */
        
        for (int counter = 1; counter <= 20; counter++) {
            if (counter % 3 == 0) {
                continue;
            }

            System.out.println(counter);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        /**
        * Recorre un Array utilizando for-each y detiene el ciclo
        * cuando encuentra el primer número negativo.
        *
        * Se utiliza una condición if para comprobar si el número actual
        * es menor que 0. Si se cumple, break termina el bucle
        * inmediatamente, evitando recorrer los elementos restantes.
        */

        int[] numbersArray = {5, 8, 12, -4, 7, -2};

        for (int countArray : numbersArray) {
            if (countArray < 0) {
                System.out.println("Número negativo encontrado: " + countArray);
                break;
            }

            System.out.println("Número: " + countArray);
        }
        
        // 10. Crea un programa que calcule el factorial de un número dado.
        /**
         * Calcula el factorial de un número dado utilizando un ciclo for.
         * 
         * Se declara una variable para almacenar el número del cual se desea
         * calcular el factorial y una variable acumuladora inicializada en 1.
         *
         * El ciclo for comienza desde el número dado y va disminuyendo hasta 1.
         * En cada iteración, el acumulador multiplica su valor actual por el
         * número de la iteración, almacenando progresivamente el resultado.
         *
         * Al finalizar el ciclo, el acumulador contiene el factorial del número
         * y se imprime el resultado.
         */
        int factorialNumber = 5;
        int resultFactorial = 1;

        for (int factor = factorialNumber; factor >= 1; factor--) {
            resultFactorial *= factor;
        }

        System.out.println("El factorial de " + factorialNumber + " es: " + resultFactorial);

    }
    
}
