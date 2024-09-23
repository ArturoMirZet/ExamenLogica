
public class Problema2 {
    public static void main(String[] args) {
        int[] casillas = {-8, 13, 1, 6, 2, 5, 13, 6, 4, 7, 5, 2, 6, 7, 9};  // Casillas del 1 al 15

        // Paso 1: Restar el número que está en la casilla cuyo número está en la casilla 7 (13) del número que está en la casilla 4 (6)
        casillas[0] = casillas[6] - casillas[3];
        System.out.println("Casilla 1 después de la resta: " + casillas[0]);

        // Paso 2: Sumar el número que está en la casilla 1 al número que está en la casilla 6 y ponga el total en la casilla 1
        casillas[0]=Suma(casillas, 0, 5);
        System.out.println("Casilla 1 después de sumar Casilla 6: " + casillas[0]);

        // Paso 3: ¿Es el número que está en la casilla 1 un múltiplo de 4?
        boolean esMultiploDe4 = casillas[0] % 4 == 0;
        System.out.println("¿Casilla 1 es múltiplo de 4?: " + esMultiploDe4);

        // Paso 4: Cambiar la instrucción 2 sumando al segundo número de casilla que se menciona el número que está en la casilla cuyo número está en la casilla 11 (casilla 5)
        casillas[0]= Suma(casillas, 0, 10);
        System.out.println("Casilla 1 después de sumar el valor de Casilla 11: " + casillas[0]);

        // Paso 5: ¿Es el número que está en la casilla 2 mayor que el segundo número de casilla de la instrucción 2?
        boolean esMayor = casillas[1] > casillas[5];
        System.out.println("¿Casilla 2 es mayor que el número en Casilla cuyo número está en Casilla 6?: " + esMayor);

        // Paso 6: Restar 2 del número que está en la casilla 10
        casillas[9] -= 2;
        System.out.println("Casilla 10 después de restar 2: " + casillas[9]);
        System.out.println("¿Qué número hay ahora en la casilla 1?");
        System.out.println(casillas[0]);
        System.out.println("¿Qué número hay ahora en la casilla 6?");
        System.out.println(casillas[5]);
    }
    public static int Suma(int[] casillas, int inicio, int fin ){
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += casillas[i];
        }
        return suma;
    }
}
