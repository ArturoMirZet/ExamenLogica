public class Problema1 {
public static void main(String[] args) {
    int[]casillas={2,3,1,5,7,6,21,7,11,9,0,2};
    System.out.println("Paso 1: Sumar el número que está en la casilla 3 al número que está en la casilla 11 y poner el total en la casilla 11.");
    casillas[10]= Suma(casillas, 2, 10);
    System.out.println("Casilla 11 después de sumar Casilla 3: " + casillas[10]);
    System.out.println("\n Paso 2: Sumar el número que está en la casilla 1 al número en la casilla cuyo número está en la casilla 9 Y poner el Resultado en la casilla 5  " );
    casillas[4]= Suma(casillas, 0, 8);
    System.out.println("Casilla 5 ahora: " + casillas[4]);
    System.out.println("\n  Paso 3: Multiplicar el número que está en la casilla 12 por sí mismo" );
    casillas[11] *= casillas[11];
    System.out.println("Casilla 12 después de multiplicarse por sí misma: " + casillas[11]);
System.out.println("\nPaso 4: ¿Es el número que está en la casilla 5 igual al número que está en la casilla 10?");
boolean esIgual = casillas[4] == casillas[9];
 System.out.println("¿Casilla 5 es igual a Casilla 10?: " + esIgual);
System.out.println("\n Paso 5: Restar 2 del número que está en la casilla 12 y poner el resultado en la casilla 12");
casillas[11] -= 2;
System.out.println("Casilla 12 después de restar 2: " + casillas[11]);

 System.out.println("\nPaso 6: Sumar el número que está en la casilla 5 al número que está en la casilla 2 y poner el total en la casilla 5");
casillas[4]=Suma(casillas, 1, 4);
System.out.println("Casilla 5 después de sumar Casilla 2: " + casillas[4]);

System.out.println("\n Paso 7: Restar el número que está en la casilla 5 del número que está en la casilla 7 y poner el resultado en la casilla 8");
casillas[7] = casillas[6] - casillas[4];
System.out.println("Casilla 8 después de la resta: " + casillas[7]);
System.out.println("\n Paso 8: Sumar el número que está en la casilla 12 al número que está en la casilla 8 y poner el total en la casilla 6");
casillas[5] = Suma(casillas, 7, 11);
System.out.println("Casilla 6 después de sumar Casilla 12 y Casilla 8: " + casillas[5]);
System.out.println("\n");
}
public static int Suma(int[] casillas, int inicio, int fin ){
    int suma = 0;
    for (int i = inicio; i <= fin; i++) {
        suma += casillas[i];
    }
    return suma;
}
}


