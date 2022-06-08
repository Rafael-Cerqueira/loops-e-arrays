package br.com.dio.exercicios;

import java.util.Scanner;

public class ex_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {2, 35, 41, 55, 98, 63 };

        int count = 0;

        while(count < (vetor.length)){
            System.out.println(vetor[count] + " ");
            count++;
        }

        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }

    }
}
