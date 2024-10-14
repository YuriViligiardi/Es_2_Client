package it.viligiardi;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Menu m = new Menu();
        Operation o = new Operation();
        String in = m.ottieniStringa();
        int scelta = m.ottieniscelta();
        
        switch (scelta) {
            case 1:
                String out1 = o.trasMaiuscolo(in);
                System.out.println("La Stringa da inviare è: " + out1);
                break;
            case 2:
                String out2 = o.trasMinuscolo(in);
                System.out.println("La Stringa da inviare è: " + out2);
                break;
            case 3:
                String out3 = o.ribalta(in);
                System.out.println("La Stringa da inviare è: " + out3);
                break;
            case 4:
                int out4 = o.contaCaratteri(in);
                System.out.println("Il numero da inviare è: " + out4);
                break;
        
            default:
                break;
        }
        
        /** 
        try {

            System.out.println("Il client è partito");

            Socket mySocket = new Socket("localhost", 5637); //Creazione Socket del server che andrà in comunicazione con quello del server
            System.out.println("Il client si è collegato");
    
            BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
            DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());

            String stringaDaInviare = "ciao sono Yuri";
            out.writeBytes(stringaDaInviare + "\n");
            System.out.println("La stringa inviata: " + stringaDaInviare);

            String stringaRicevuta = in.readLine();
            System.out.println("La stringa ricevuta: " + stringaRicevuta);

            mySocket.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("Errore durante l'instanza del client");
            System.exit(1);

        }
        */
    }
}