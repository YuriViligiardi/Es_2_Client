package it.viligiardi;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyThread extends Thread {
    // attributes
    private Socket s;
    private String out;
    private int o;

    // methods and constructions
    public MyThread(Socket s, String out, int o) {
        this.s = s;
        this.out = out;
        this.o = o;
    }

    @Override
    public void run() {
        try {
            BufferedReader bIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream bOut = new DataOutputStream(s.getOutputStream());

            bOut.writeBytes(out + "\n");
            bOut.writeInt(o);
            System.out.println("Stringa inviata: " + out);
            System.out.println("Operazione inviata: " + o);

            String sIn = bIn.readLine();
            System.out.println("Stringa ricevuta: " + sIn);

        } catch (Exception e) {
            System.out.println("Errore, comunicazione fallita");
        }
    }
    
}
