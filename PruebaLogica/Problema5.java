public class Problema5 {
    public static void main(String[] args) {
        // Inicializamos las casillas sin valores específicos excepto para la casilla 5
        int[] casillas = new int[11];  // Tenemos casillas de 1 a 10, por eso el tamaño es 11 (casillas[0] no se usa)

        // Paso 1: Poner un cero en la casilla 5
        casillas[4] = 0;
        System.out.println("Casilla 5: " + casillas[5]);

        // Sume el número que está en la casilla 1 al número que está en la casilla 5 y ponga el total en la casilla 5.
        casillas[0] = 3;  // Supongamos un valor inicial para la casilla 1
        casillas[4] += casillas[1];  // Casilla 5 = Casilla 5 + Casilla 1
        System.out.println("Casilla 5 después de sumar Casilla 1: " + casillas[5]);

        // Paso 3: ¿Es el número que está en la casilla 1 menor que el número en la casilla 10?
        casillas[9] = 8;  // Supongamos un valor inicial para la casilla 10
        boolean esMenor = casillas[0] < casillas[9];
        System.out.println("¿Casilla 1 es menor que Casilla 10?: " + esMenor);

        // Paso 4: Sumar el número en la casilla 5 al número en la casilla 9 y poner el total en la casilla 5
        casillas[8] = 5;  // Supongamos un valor para la casilla 9
        casillas[4] += casillas[8];  // Casilla 5 = Casilla 5 + Casilla 9
        System.out.println("Casilla 5 después de sumar Casilla 9: " + casillas[4]);

        // Paso 5: Cambiar la instrucción 2, aumentando en 1 el primer número de casilla
        casillas[1] += 1;  // Aumentamos Casilla 1 en 1
        System.out.println("Casilla 1 después de aumentar 1: " + casillas[1]);

        // Paso 6: Cambiar la instrucción 4, disminuyendo en 1 el segundo número de casilla
        casillas[8] -= 1;  // Disminuimos Casilla 9 en 1
        System.out.println("Casilla 9 después de restar 1: " + casillas[8]);

        // Pregunta final: ¿Qué número debe haber en la casilla 10?
        System.out.println("Casilla 10: " + casillas[9]);
    }
}
