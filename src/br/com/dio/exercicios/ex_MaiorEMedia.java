package br.com.dio.exercicios;

import java.util.Scanner;

public class ex_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        double soma = 0;
        double media;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count = count + 1;

            media = soma/5;
            soma = soma + numero;
            if(numero > maior) maior = numero;
        }while(count < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Media: " + media);
    }
}
