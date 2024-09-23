public class Problema3 {
    public static void main(String[] args) {
        int[] casillas = {12, 7, 0, 2, 3, 19, 6, 0, 1, 72, -3, 9};  // Valor desconocido en casilla 3 (casillas[2])

        // Paso 1: Restar el número de la casilla 12 del número en la casilla 12 y poner el resultado en la casilla 9.
        casillas[8] = casillas[11] - casillas[11];  
        System.out.println("Casilla 9 después de restar: " + casillas[8]);

        // Paso 2: Cambie la instrucción 1, restando 2 del último número de casilla que se menciona en dicha instrucción.
        casillas[6] =casillas[11] - casillas[11];  
        System.out.println("Casilla 9 después de restar 2: " + casillas[8]);

        // Paso 3: ¿Son iguales la casilla 9 y la casilla 3?
        // Encontrar el valor faltante para que sean iguales.
        casillas[2] = casillas[8];  // Hacemos que la casilla 3 sea igual a la casilla 9
        System.out.println("El valor faltante en la casilla 3 es: " + casillas[2]);
    }
}
