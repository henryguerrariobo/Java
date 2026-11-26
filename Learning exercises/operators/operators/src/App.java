public class App {
    public static void main(String[] args) throws Exception {
    
        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("2 parte");

        // 2. Crea una variable para cada tipo de operación de asignación.
            
        a = b;
        System.out.println(a); //cambiando el valor a la variable a. 
        a += 5;
        System.out.println(a);

        a = b * 2;
        System.out.println(a); // multiplicando * 2 el valor de a.

        a += 1; // a = a + 1 
        System.out.println(a); // incrementando a sumandole un 1.

        a -= 1;
        System.out.println(a); // restandole  un 1 al valor de a.
        a *= 2;
        System.out.println(a); //multiplicando el valor por 2 al valor de a
        a /= 2;
        System.out.println(a); // divide entre dos. 
        a %= 2;
        System.out.println(a); //  Muestra el residuo de la division. 

    // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int d= 2;
        int e = 4;

        System.out.println(d != e);
        
        int c= d+e;
        System.out.println(c==6);

        System.out.println(d <= e);

    // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        int g= 2;
        int h = 4;

        System.out.println(g != 2);
        
        System.out.println(h==6);

        System.out.println(g >= h);
    
    // 5. Utiliza el operador lógico and.
        System.out.println(true && true); // true
        System.out.println(true && false); //false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println(3 > 2 && 5 == 2); // false 
    
    // 6. Utiliza el operador lógico or.
        
        //Devuelve true cuando al menos una de las dos condiciones es verdadera.
        System.out.println("OR");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); //true
        System.out.println(false || false); // false

        System.out.println(3 > 2 || 5 == 2); // true 
    
    // 7. Combina ambos operadores lógicos.
        
        boolean isAdmin = false;
        boolean hasPermission = true;
        boolean isActive = true;

        /*  No es admin pero si tiene permisos y esta activo, los dos que estan en parentecis
            Son una condicion a aprte que se resuleve primero y da un valor que se compara con ||.
            Al tener la condicion || mientras que una sea true simepre devolvera true. 
                - Primero se evalúa hasPermission && isActive → true.
                - Después se evalúa isAdmin || true → true.
                - Como al menos una condición del OR es verdadera, el resultado final es true.
        */
        System.out.println(isAdmin || (hasPermission && isActive));

    // 8. Añade alguna negación.

        int num = 1;
        int num2 = 2;

        boolean result = !(num == num2);

        System.out.println(result); // true // Equivale a num != num2 
        System.out.println(!(num != num2)); // false // Equivale a num == num2
        System.out.println(); 
    
    // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int num3= 2;

        System.out.println(+num3);  // Asigna valores positivos sin modificar el valor de la variable. 
        System.out.println(-num3); // Asigan valores negativos sin modificar el valor de la variable. 
        System.out.println(++num3); // Primero incrementa la variable y después utiliza su valor.
        System.out.println(num3++); // Primero utiliza el valor actual y después incrementa la variable.
        System.out.println(num3); // 3
        System.out.println(--num3); //Primero resta y después utiliza el valor.
        System.out.println(num3--); //Primero utiliza el valor y después resta.
        System.out.println(num3); //2
    
    // 10. Combina operadores aritméticos, de comparación y lógicos.
        int num4 = 1;
        int num5 = 2;

        boolean resul = (num4 + num5 > 2) && !(num4 == num5);

        System.out.println(resul); // true porque en la primera parte es verdadero ya que el resltado de la suma si es mayor a 2
                                   // y  la segunda parte tambien es true porque si es correcto que num4 y num5 son difrenetes. 




    }
}
