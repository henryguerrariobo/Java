
public class App {
    public static void main(String[] args) throws Exception {


        
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
            int  age = 21; 
            //int  age = 18; 
            //int  age = 17; 
            System.out.println(age >= 18);

            if (age > 18) {

                System.out.println("Puede votar");
            }
            else if (age == 18) {
                System.out.println("Puede votar");
                
            } else {
                System.out.println("No puede votar, no cumple con la mayoria de edad.");
                
            }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
            int num1 = 22;
            int num2 = 2;

            System.out.println(num1 == num2);
            System.out.println(num1 < num2);
            System.out.println(num1 > num2);
 

            if (num1 > num2) {

                System.out.println("ES MAYOR");
            }
            else if (num1 < num2) {
                System.out.println("ES MENOR");
                
            } else if (num1 == num2){
                
                System.out.println("sON IGUALES");

            }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
              
            System.out.println(num1);    

            if (num1 > 0) {

                System.out.println("positivo");
            }
            else if (num1 < 0) {
                System.out.println("negativo");
                
            } else if (num1 == 0){
                
                System.out.println("cero");

            }

        // 4. Crea un programa que diga si un número es par o impar.
                
            System.out.println((num1));    

            if (num1 % 2 == 0) {

                System.out.println("Par");
            }
            else {
                System.out.println("Impar");
            }
            

        // 5. Verifica si un número está en el rango de 1 a 100.
            
            if (num1 >= 1 && num1 <= 100) {
            System.out.println("Está dentro del rango");
            } else {
            System.out.println("No está dentro del rango");
            }
            
            
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
            
            int day= 2;
            
            switch (day) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4: 
                    System.out.println("Jueves");
                break;

                case 5: 
                    System.out.println("Viernes");
                break;

                case 6: 
                    System.out.println("Sabado");
                break;

                case 7: 
                    System.out.println("Domingo");
                break;
            }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

                int note = 30;

            if (note >= 90 && note <= 100) {
                System.out.println("Sobresaliente");
            } else if (note >= 60) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Suspenso");
            }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

            int ageOfClient = 18;
            boolean accompanied = true;

            if (ageOfClient >= 15) {
                System.out.println("Ingreso normal");
            } else if (accompanied) {
                System.out.println("Ingreso con acompañante");
            } else {
                System.out.println("No puede ingresar");
            }
            
        // 9. Crea un programa que diga si una letra es vocal o consonante.

        /* El proceso es este:
            1. Inicialmente: isVowel = false, porque todavía no hemos encontrado una vocal.
            2. Durante el for: si encuentra una coincidencia, ejecuta isVowel = true.
            3. Al terminar el for: la variable conserva el último valor que se le asignó.
            4. En el if:
                - Si isVowel es true, entra al if e imprime «Es una vocal».
                - Si isVowel sigue siendo false, entra al else e imprime «No es una vocal».
         */        
            String[] vowels = {"a","e","i","o","u"}; // se debe declara en el tipo de dato que es una array String[]
            boolean isVowel = false;
            String chosenLetter = "z";
            for (int i = 0; i < vowels.length; i++) {
                if (vowels[i].equals(chosenLetter)) {
            isVowel = true; // si se encuentra un coincidencia realizamos el cambio a true. 
        }
            }

            if (isVowel) {
                System.out.println("Es una vocal");
            }else {
                System.out.println("Es una consonante");
            }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        /**
        * Busca el número mayor entre tres valores utilizando un arreglo y un ciclo for.
        *
        * Se inicializa la variable "mayor" con el primer elemento del arreglo.
        * Luego, se recorre el arreglo comparando cada elemento con el valor actual
        * de "mayor". Si se encuentra un número más grande, se actualiza la variable.
        *
        * Finalmente, se muestra el número mayor encontrado.
        */

        int a = 15;
        int b = 8;
        int c = 23;

        int[] arrayNumb = {a, b, c};
        
        int mayor = arrayNumb[0];
        
        for (int i = 1; i < arrayNumb.length ; i++ ){
            if (arrayNumb[i] > mayor) {
            mayor = arrayNumb[i];
            }
        }
        System.out.printf("El numero mayor es %d", mayor);


    }
}
