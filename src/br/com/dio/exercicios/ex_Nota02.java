package br.com.dio.exercicios;

import java.util.Scanner;

public class ex_Nota02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true){

            System.out.println("Nota: ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10){
                System.out.println("Nota invalida! Digite novamente: ");
                nota = scan.nextInt();
            }
        }
    }
}
