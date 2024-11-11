package it.viligiardi;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Menu m = new Menu();
        String in = m.ottieniStringa();
        int scelta = m.ottieniscelta();

        Socket s = new Socket("localhost", 5200);
        MyThread t = new MyThread(s, in, scelta);
        t.start();
    }
}