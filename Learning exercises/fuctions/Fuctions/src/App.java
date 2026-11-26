import java.util.ArrayList;

/**
 * Contiene diferentes ejercicios prácticos sobre la creación
 * y utilización de métodos en Java.
 *
 * Se trabajan parámetros, valores de retorno, operaciones
 * matemáticas, condicionales, ciclos y colecciones.
 *
 * @author Henry
 * @version 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
    
        printMessage();
        
        String myName = "Alexander";
        hiName(myName);

        int subtrac = subtract(10, 5); //se puede hacer cunado se espera un return
        
        int arithmeticPowers = arithmeticPowers(5);

        int evenOrOdd =55; 
        evenOrOdd(evenOrOdd); // asi toca cunado no se usa return.
         
        System.out.println(isOfLegalAge(18));

        System.out.println(stringLength(myName));


        int[] numbers = {10, 20, 30, 40, 50};
        double result = calculateAverage(numbers);
        System.out.println("La media es: " + result);

        int factorialResult = calculateFactorial(5);
        System.out.println("El factorial es: " + factorialResult);

        
        ArrayList<String> names = new ArrayList<>();

        names.add("Alexander");
        names.add("Java");
        names.add("Programacion");

        showElements(names);

    }
        
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        /**
        * Imprime un mensaje de bienvenida al curso de Java.
        *
        * Este método no recibe parámetros ni devuelve ningún valor.
        */
        public static void printMessage(){
             System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
        }
        
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        /**
        * Recibe un nombre y muestra un mensaje de bienvenida personalizado.
        *
        * @param name nombre de la persona a quien se dirige el saludo.
        */
        public static void hiName(String name){
            System.out.printf("Hola %s le doy la bienvenida a esta prueba.",
                name
            );
            System.out.println();
        }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        /**
        * Calcula la resta entre dos números enteros.
        *
        * Recibe dos números, realiza la operación aritmética
        * y devuelve el resultado obtenido.
        *
        * @param a primer número entero.
        * @param b segundo número entero que se resta del primero.
        * @return resultado de la resta entre a y b.
        */
        public static int subtract(int a, int b){
            int result = a-b;
            System.out.printf("El resultado de la resta es: %d."
            , result);
            System.out.println();
            return result;
        }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        /**
        * Calcula el cuadrado de un número entero.
        *
        * Multiplica el número recibido por sí mismo
        * y devuelve el resultado.
        *
        * @param q número entero al que se le calculará el cuadrado.
        * @return resultado de multiplicar q por q.
        */
        public static int arithmeticPowers (int q){
            int result = q*q; 
            System.out.printf("El  resultado de la potencia es: %d. ",
                result);
                System.out.println();
                return result;  
        }

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        /**
        * Determina si un número entero es par o impar.
        *
        * Utiliza el operador módulo (%) para obtener el residuo
        * de la división del número entre dos.
        *
        * @param e número entero que se desea evaluar.
        */
        public static void evenOrOdd(int e){
          int result = e % 2;          
          if (result==0) {
            System.out.println("El numero es par");
          } 
          else{
            System.out.println("El numero es impar.");
          }
        }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        /**
        * Comprueba si una persona cumple con la mayoría de edad.
        *
        * Considera que una persona es mayor de edad cuando
        * su edad es igual o superior a 18 años.
        *
        * @param age edad de la persona.
        * @return true si la edad es igual o superior a 18;
        *         false en caso contrario.
        */
        public static boolean isOfLegalAge(int age){
            return age >= 18; 
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        /**
        * Obtiene la cantidad de caracteres de una cadena de texto.
        *
        * Utiliza el método length() de String para determinar
        * la longitud de la cadena recibida.
        *
        * @param text cadena de texto que se desea evaluar.
        * @return cantidad de caracteres de la cadena.
        */
        public static int stringLength(String text){
           int result = text.length();
            return result;
        } 

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        /**
        * Calcula el promedio de los números almacenados en un array.
        *
        * Recorre el arreglo mediante un ciclo for, acumula sus valores
        * y divide la suma entre la cantidad de elementos.
        *
        * @param numbers arreglo de números enteros que se utilizarán
        *                para calcular el promedio.
        * @return promedio de los valores almacenados en el arreglo.
        */
        public static double calculateAverage(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        return average;
        }

        // 9. Escribe un método que reciba un número y retorna su factorial.
        /**
        * Calcula el factorial de un número entero.
        *
        * Utiliza un ciclo for para multiplicar progresivamente
        * los números enteros desde el valor recibido hasta uno.
        *
        * @param number número entero del cual se calculará el factorial.
        * @return resultado del factorial calculado.
        */
            public static int calculateFactorial(int number) {
        int result = 1;

        for (int i = number; i >= 1; i--) {
            result *= i;
        }

        return result;
        }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

        /**
        * Recorre una lista de nombres e imprime cada uno de sus elementos.
        *
        * Utiliza un ciclo for-each para acceder directamente
        * a cada elemento almacenado en el ArrayList.
        *
        * @param names lista de cadenas de texto que contiene los nombres
        *              que se desean mostrar.
        */
        public static void showElements(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name);}
        }
}
