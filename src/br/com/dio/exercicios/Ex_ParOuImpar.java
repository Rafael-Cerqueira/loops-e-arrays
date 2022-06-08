package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex_ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumero;
        int count = 0;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de numeros: ");
        qtdNumero = scan.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPares++;
            else qtdImpares++;

            count = count + 1;
        }while(count < qtdNumero);

        System.out.println("Pares: " + qtdPares);
        System.out.println("Impares: " + qtdImpares);

    }
}
