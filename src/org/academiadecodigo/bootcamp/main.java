package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nQuantos clientes vão viajar:");
        int qunt = sc.nextInt();
        new MenuHoteis(qunt);
    }
}
