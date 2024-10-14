package it.viligiardi;

public class Operation {

    public String trasMaiuscolo(String s){
        return s.toUpperCase();
    }

    public String trasMinuscolo(String s){
        return s.toLowerCase();
    }

    public String ribalta(String s){
        String reversedStr = "";

        for (int i = s.length(); i < 0; i--) {
            reversedStr += s.charAt(i);
        }
        return reversedStr;
    }

    public int contaCaratteri(String s){
        return s.length();
    }
}
