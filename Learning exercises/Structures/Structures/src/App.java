import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array={2,5,4,7,9};
        System.out.println(array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(array[1]); 
        array[1]= 13;
        System.out.println(array[1]); 



        // 3. Crea un ArrayList vacío.
        ArrayList<Integer> numbers = new ArrayList<>();
        //int[] ArrayList = {}; // array vacio


        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        System.out.println(array); //Puntero??
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        
        numbers.remove(1);  
        System.out.println(numbers);
        

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<Integer> numb = new HashSet<>();
        numb.add(10);
        numb.add(11);
        System.out.println(numb);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        numb.add(10);// en un HashSet jamas se gaurdara valores repetidos
        numb.add(32);
        System.out.println(numb);

        // 7. Elimina uno de los elementos del HashSet.
        numb.remove(10);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> contacts = new HashMap<>();
        /*
        put(clave, valor): agrega un elemento o actualiza su valor si la clave ya existe.
        get(clave): obtiene el valor asociado a esa clave.
        remove(clave): elimina una entrada.
        size(): devuelve la cantidad de entradas.
        containsKey(clave): comprueba si existe una clave.
        */
        contacts.put("Henry","3000000000");
        contacts.put("Alejandra","3111111111");
        contacts.put("Alex","322222222");
        System.out.println(contacts);

        // 9. Modifica uno de los contactos y elimina otro.
        contacts.put("Henry", "3333333333");
        contacts.remove("Alex","322222222");
        System.out.println(contacts);
        

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        int[] array2 = {1, 2, 3, 4};

        // 1. Array -> ArrayList
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            numbers2.add(array2[i]);}
        System.out.println("ArrayList: " + numbers2);

        // 2. ArrayList -> HashSet
        HashSet<Integer> numbersSet = new HashSet<>();
        for (int i = 0; i < numbers2.size(); i++) {
            numbersSet.add(numbers2.get(i));}
        System.out.println("HashSet: " + numbersSet);

        // 3. HashSet -> HashMap
        HashMap<Integer, Integer> numbersMap = new HashMap<>();
        for (Integer number : numbersSet) {
            numbersMap.put(number, number);}
        System.out.println("HashMap: " + numbersMap);

    }
}
