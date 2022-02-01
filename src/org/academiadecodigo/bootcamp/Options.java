package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class Options {
    Scanner scanner = new Scanner(System.in);
    int choice;
    int choiceClient;
    String input;
    public void OptionsMenu() {
        do {
            System.out.println("\n===== OPTIONS =====");
            System.out.println("1. NEW CLIENT");
            System.out.println("2. CHECKOUT");
            System.out.println("3. CHECKIN");
            System.out.println("0. EXIT PROGRAM");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Client name: ");
                    input = scanner.next();
                    //FAZER CHECKIN LOGO ?
                    Client a = new Client(input, ListHotel.NONE);
                    break;
                case 2:
                    Client.showClients("out");
                    choiceClient = scanner.nextInt();
                    Client b = Client.setClient(choiceClient);
                    System.out.println("You choose: " + b.getName());
                    b.checkOut();
                    break;
                case 3:
                    Client.showClients("in");
                    choiceClient = scanner.nextInt();
                    Client c = Client.setClient(choiceClient);
                    System.out.println("You choose: " + c.getName());
                    new MenuHoteis(c);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);


    }
}
