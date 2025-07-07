/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos de
tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde los parámetros que se le pasan
al constructor son las horas, los minutos y los segundos respectivamente. Crea el método toString para ver
los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el resultado
debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar que la clase funciona bien.
1h 20m 30s + 0h 30m 40s = 1h 51m 10s
0h 30m 40s - 0h 35m 20s = -(0h 4m 40s)
 */


package ejercicio6;

public class App {
    public static void main(String[] args) {
    Tiempo t1 = new Tiempo(1, 20, 30);
    Tiempo t2 = new Tiempo(0, 30, 40);
    Tiempo t3 = new Tiempo(0, 35, 20);
        
    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
    }
}

