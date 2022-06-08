package br.com.dio.exercicios;

import java.util.Scanner;

public class exLoop01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        Integer idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
