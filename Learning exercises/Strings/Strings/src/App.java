public class App {
    public static void main(String[] args) throws Exception {

           // Declaración

            String name = "Brais";
            var surname = new String("Moure");
        
        // 1. Concatena dos cadenas de texto.
        String word = "Hola";
        String word2 = "Mundo";
        String space = " ";

        System.out.println(word+space+word2);

        // 2. Muestra la longitud de una cadena de texto.
        String result = (word+space+word2);
        int count = result.length();
        System.out.println(count); 

        // 3. Muestra el primer y último carácter de un string.
        /*
        * Gracias al ejercicio anterior sabemos que son 10 caracteres. 
        */
        System.out.println(result.charAt(0)); // Primer carácter
        System.out.println(result.charAt(9)); // Ultimo carácter

        
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(result.toUpperCase()); // Mayusculas
        System.out.println(result.toLowerCase()); // Minusculas


        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(result.contains("Java")); // false
        System.out.println(result.contains("hola")); // false
        System.out.println(result.contains("HOLA")); // false
        System.out.println(result.contains("Hola")); // true

        
        // 6. Formatea un string con un entero.
        int num = 4;    
        System.out.printf("Se contar hasta %d de uno en uno", num);
        System.out.println();


        // 7. Elimina los espacios en blanco al principio y final de un string.
        String words = " Hola mi nombre es Henry y Tengo 21 años ";
        System.out.println(words.trim());
        System.out.println(words);

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(words.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(word.equals("Hola")); // true
        System.out.println(words.equals("Una")); // false

        
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(word.length()== words.length()); // false
    }
}
