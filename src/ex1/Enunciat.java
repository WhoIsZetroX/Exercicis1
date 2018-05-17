package ex1;
import java.util.Scanner;

/**
 *  La classe MyMath conté un únic mètode que permet calcular expressions matemàtiques, com per exemple les següents:
 *      a + b
 *      a - b * c
 *      (a - b) * c
 *      a / c - (c * (d + e))
 *
 *  Desenvolupa un joc de proves SENZILL que comprovi que les següents expressions funcionen correctament:
 *      a + b
 *      a - b
 *      a * b
 *      a / b
 */
public class Enunciat {
    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write a mathematical expression:");
        String expression = scanner.nextLine();

        float result = MyMath.resolve(expression);
        System.out.println(result);
    }
}