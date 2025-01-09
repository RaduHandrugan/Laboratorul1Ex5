/*
5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci.
 */

package Exercitiul5;

import java.util.Random;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int nr = random.nextInt(21);
        System.out.println("Nr: " + nr);

        //Fibonacci

        int a = 0, b = 1;  // iau primele numere din sirul lui Fibonacci
        boolean VERIFICARE = false;

        if (nr == 0 || nr == 1)
        {
            VERIFICARE = true;
        }
        else
        {
            while (b < nr)      //construiesc restul sirului prin insumarea primilor 2 termeni
            {
                int save = b;
                b = a + b;
                a = save;
            }
            if (b == nr)
            {
                VERIFICARE = true;
            }
        }
        if (VERIFICARE)
        {
            System.out.println("Nr " + nr + " face parte din sirul lui Fibonacci.");
        }

        else
        {
            System.out.println("Nr " + nr + " NU face parte din sirul lui Fibonacci.");
        }
    }
}


/*Numerele Fibonacci sunt numere naturale care fac parte din următorul șir, în care fiecare număr este egal cu suma celor două de dinainte:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …
* */