/**
 * Ejercicios de declaración, inicialización y manipulación de variables
 * en Java.
 *
 * Se trabajan los tipos de datos primitivos, cadenas de texto,
 * constantes, operadores aritméticos y conversión entre tipos.
 *
 * @author Henry
 * @version 1.0
 */






public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        /**
        * Almacena el nombre del usuario.
        * String permite almacenar cadenas de texto.
        */    
        String name = "Henry";

        // 2. Crea una variable de tipo int y asígnale tu edad. 
        /**
        * Almacena la edad del usuario.
        * int permite almacenar números enteros.
        */
        int age = 21;

        // 3. Crea una variable double con tu altura en metros.
        /**
        * Almacena la altura del usuario en metros.
        * double permite almacenar números decimales con mayor precisión
        * que float.
        */    
        double height  = 1.72;
               
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        /**
        * Indica si al usuario le gusta programar.
        * boolean únicamente permite almacenar dos valores: true o false.
        */
        boolean  iLikeToCode = true; 
        
        // 5. Declara una constante con tu email.
        /**
        * Almacena el correo electrónico.
        *
        * final impide que la variable reciba una nueva asignación
        * después de su inicialización.
        *
        * var permite que Java infiera automáticamente el tipo de dato.
        */
        final var EMAIL = "pruebadecorreo123@gmail.com";
        
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        /**
        * Almacena la inicial del nombre.
        *
        * char permite guardar un único carácter y utiliza comillas simples
        * para representar su valor.
        */
        char initial = 'H'; // Si usamos el char para guardar caracteres debe ser con comillas simples. 
        
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        /**
        * Almacena inicialmente el nombre de una localidad.
        *
        * Las variables String pueden recibir una nueva asignación,
        * aunque el objeto String en sí mismo es inmutable.
        */   
        String locate = "Soacha";
        // Modifica el valor de la variable con una nueva cadena de texto.

        locate = "Bogota";
        // Imprime el valor actualizado de la variable.

        System.out.println(locate);
        
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
           
        /**
        * Almacena el primer número entero de la operación.
        **/
        int a = 1;
        int b = 2;
        int c = a+b;
        System.out.printf("El resultado de %d + %d = %d",
            a,b,c);
            
        

        // 9. Imprime el tipo de dos variables creadas anteriormente.7
        /*
        * getClass() permite consultar la clase a la que pertenece un objeto.
        *
        * Los tipos primitivos como int, double y boolean no tienen
        * acceso directo al método getClass().
        *
        * Integer es la clase envoltorio (Wrapper Class) de int.
        * Permite trabajar con números enteros como objetos.
        */
        Integer d = 1;
        Integer f = 2;
        Integer g = d+f;
        System.out.println();
        System.out.printf("El resultado de %d + %d = %d",
            d,f,g);

        System.out.println();
        System.out.println(locate.getClass().getSimpleName());
        System.out.println(g.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        /**
        * Declara una variable String sin asignarle inicialmente un valor.
        *
        * Al ser una variable local, Java exige que sea inicializada
        * antes de utilizarla.
        */
        String nameTag;
        nameTag = name;
        System.out.println(nameTag);

        




    }
}
