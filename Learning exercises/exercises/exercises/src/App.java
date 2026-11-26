
/**
 * Clase principal de la aplicación.
 *
 * Contiene los ejercicios básicos de Java relacionados con:
 * impresión de mensajes, declaración de variables, comentarios,
 * concatenación de cadenas, formato de texto y manejo de excepciones.
 *
 * @author Henry Guerra
 * @version 1.0
 */

public class App {
    /**
     * Método principal y punto de entrada de la aplicación.
     *
     * Desde este método se ejecutan todos los ejercicios
     * desarrollados en la clase App.
     *
     * @param args argumentos recibidos desde la línea de comandos.
     * @throws Exception indica que el método puede propagar excepciones.
     */
    public static void main(String[] args) throws Exception {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
         System.out.println("Hola mi nombre es Henry"+ "\n");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
       
        String helloMesage = ("hola");
        String worldMesage = ("mundo");
        System.out.println(helloMesage + " " + worldMesage);

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        /*                           **primer ejercico**
        La linea 7 utiliza el  sout (System.out.println) y sirve para imprimir.
                                     ** segundo ejercicio**
        La linea 11 y 12 se crean dos variables de tipo String (cadena de texto)
        para luego en la fila 13 imprimir concatenando la palabra con el caracter "+"                             
        */
        // 4. Crea un comentario en varias líneas. 
        /* YA LO HICE JAJAJJA*/
        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        /* 
            Formato	       Significado
            %s	           Texto (String)
            %d	           Enteros (int)
            %f	           Decimales (float/double)
            %.2f	       Decimal con 2 posiciones
        
        */
        int mesageAge = 21; 
        String mesageColor = "Negro";
        String mesageCity = "Bogota";
        System.out.println(String.format(
            "Hola, mi nombre es Henry Guerra, tengo %d años, mi color favorito es el %s y vivo en %s.",
            mesageAge, 
            mesageColor, 
            mesageCity
        ));
        
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        /*   Basicamente es para dar mensajes, uno es para inicializar, otro para dar 
        errores y otro para mostrar datos en consola que es el mismo de toda la vida. */
        System.err.println();
        System.out.println();//"App.main()"
        System.out.println();
        
        /*Creo un pequeño codigo que contine un error, lo que hacemos es imprimir
         todos los procedimientos y utilizamos el print error para dar la informacion,     
         
         catch (Exception error): captura la excepción y almacena el objeto en la variable error.
         error.getMessage(): consulta el mensaje descriptivo de esa excepción.
         System.err.println(): muestra el mensaje por consola.
         
         catch: recibe y captura la excepción.
         error: referencia al objeto de excepción.
         getMessage(): obtiene la descripción del problema.

         */
        System.out.println("[INFO] Iniciando aplicación..."); // "App.main()"
        try {
            System.out.println("[INFO] Conectando con la base de datos...");
            
            // Simulacionde errores 
            int result = 10/0;
        } catch (Exception error) {

            System.err.println("[ERROR] Error en la aplicación: " + error.getMessage());
         }
         System.out.println("[INFO] Finalizando aplicación."+"\n"); 

        // 7. Utiliza varios println para imprimir una frase.
         String hi = "Hola ";
         String my ="mi ";
         String name = "nombre ";
         String is = "es ";
         String tag = "Henry ";
         String and = "y ";
         String me = "me ";
         String like = "gusta ";
         String music = "musica";
         System.out.println(hi+my+name+is+tag+and+me+like+my+music);
         System.out.printf( "%s%s%s%s%s%s%s%s%s%s%n",
            hi,my,name,is,tag,and,me,like,my,music);//marcadores de posicion dependiendo el tipo de formato cambia la letra. 
          System.out.println();
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.print("**   ");
        System.out.println("**");
        System.out.println("   °");
        System.out.println("\\_____/");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

            // El método main() es el punto de entrada de un programa Java.
            // Desde aquí comienza la ejecución del programa y se invocan
            // los métodos y funcionalidades necesarios para realizar las tareas.

    
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

            // En Java, si una clase es public, el nombre del archivo debe coincidir
            // exactamente con el nombre de la clase, respetando mayúsculas y minúsculas.
            // De lo contrario, el compilador genera un error.
 


    }       
    

}
