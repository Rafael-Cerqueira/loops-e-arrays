package br.com.dio.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Tabuada: ");
        int tabuada1 = scan.nextInt();

        System.out.println("Tabuada de " + tabuada1);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada1 + "x" + i + " = " + (tabuada1*i));
        }

    }
}
