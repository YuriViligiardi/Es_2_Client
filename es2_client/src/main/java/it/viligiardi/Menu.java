package it.viligiardi;

import java.util.Scanner;

public class Menu {

    public String ottieniStringa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String input = scanner.nextLine();
        System.out.println("Hai inserito: " + input);
        System.out.println("Ora scegli l'operazione che vuoi effettuare: ");
        return input;
    }

    public int ottieniscelta() {
        int scelta;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------------------------------");
            System.out.println("1) Trasformare stringa in maiuscolo");
            System.out.println("2) Trasformare stringa in minuscolo");
            System.out.println("3) Ribaltare i caratteri della stringa");
            System.out.println("4) Contare il numero di caratteri");
            scelta = scanner.nextInt();
            System.out.println("Hai scelto L'operazione " + scelta);
            System.out.println("----------------------------------------");
        } while (!(scelta >= 1 || scelta <= 4));

        return scelta;
    }
    
}
