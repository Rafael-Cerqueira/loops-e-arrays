package br.com.dio.exercicios;

import java.util.Scanner;

public class ex_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplicação = 1;

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        for(int i = fatorial; i >= 1; i--){
            multiplicação = multiplicação * i;
            System.out.println(fatorial + " x " + i + " = " + (fatorial*i));
        }
        System.out.println(multiplicação);
    }
}
