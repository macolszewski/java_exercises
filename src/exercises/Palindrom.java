package exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrom {


    public static boolean czyPalindrom(String tekst) {
        tekst = tekst.toLowerCase();
        String tekstOdwrocony = "";
        for (int i = tekst.length() - 1; i >= 0; i--) {
            tekstOdwrocony = tekstOdwrocony.concat(String.valueOf(tekst.charAt(i)));
        }

        //TODO lepiej zrobić tak: return  (tekst.equals(tekstOdwrocony)) ? true : false;
        if (tekst.equals(tekstOdwrocony)) {
            return true;
        } else return false;

    }

}


