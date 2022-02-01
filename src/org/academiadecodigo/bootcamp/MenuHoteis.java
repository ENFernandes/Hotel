package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class MenuHoteis {
    Scanner sc = new Scanner(System.in);
    private String name;
    public MenuHoteis(Client client)
    {
        System.out.printf("\nBoa " + client.getName() + " agora diga-me qual o hotel que pretende ficar:");
        System.out.printf("\n1-" + ListHotel.CALI + "\n2-" + ListHotel.TOKYO + "\n3-" + ListHotel.PORTOBONERA + "\nOpção:");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                client.setHotel(ListHotel.CALI);
                client.locationClient();
                break;
            case 2:
                client.setHotel(ListHotel.TOKYO);
                client.locationClient();
                break;
            case 3:
                client.setHotel(ListHotel.PORTOBONERA);
                client.locationClient();
                break;
        }
    }
    public MenuHoteis(int qunt)
    {
        while (qunt != 0) {
            System.out.print("\nOlá! diga-me o seu nome por favor: ");
            name = sc.next();
            System.out.printf("Boa " + name + " agora diga-me qual o hotel que pretende ficar:");
            System.out.printf("\n1-" + ListHotel.CALI + "\n2-" + ListHotel.TOKYO + "\n3-" + ListHotel.PORTOBONERA + "\nOpção:");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Client a = new Client(name, ListHotel.CALI);
                    a.locationClient();

                    qunt -= 1;
                    break;
                case 2:
                    Client b = new Client(name, ListHotel.TOKYO);
                    b.locationClient();

                    qunt -= 1;
                    break;
                case 3:
                    Client c = new Client(name, ListHotel.PORTOBONERA);
                    c.locationClient();
                    qunt -= 1;
                    break;
            }
        }

    }
}
