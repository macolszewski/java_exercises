package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Klasy i dziedziczenie


//        Zadanie 1

        Pies pies = new Pies("Pies", 3, RasaPsa.JAMNIK);
        Kot kot = new Kot("Kot", 3, RasaKota.MAINCOON);

        System.out.println(pies.toString());
        System.out.println(kot.toString());

//        Zadanie 2

        System.out.println();
        pies.czymJest();
        kot.czymJest();

//        Zadanie 3     -- Enumy dodane :)

//          Zadanie 4

        DaneAdresowe daneAdresowe =
                new DaneAdresowe("73-110 Stargard, ul. Dębowa 5"
                        , "666777888", "kowalski@op.pl");

        DaneAdresowe daneAdresowe2 = new DaneAdresowe("73-110 Stargard, ul. Koralowa 9"
                , "777888999", "nowak@op.pl");

        Człowiek człowiekZPsem =
                new Człowiek("Jan", "Kowalski", pies, daneAdresowe);
        Człowiek człowiekZKotem =
                new Człowiek("Andrzej", "Nowak", kot, daneAdresowe2);

//          Zadanie 5

        System.out.println(człowiekZKotem.nazwyamSie());
        System.out.println(człowiekZPsem.nazwyamSie());
        System.out.println(człowiekZKotem.nazywamSie("Kocham zwierzęta."));
        System.out.println(człowiekZPsem.nazywamSie("Kocham zwierzęta."));

//        LISTY:

//        Zadanie 6

        List<String> stringList = new ArrayList<String>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("6");
        stringList.add("7");
        stringList.add("8");
        stringList.add("9");
        stringList.add("10");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + ", ");
        }
        System.out.println();

        for (String string : stringList) {
            System.out.print(string + ", ");
        }
        System.out.println();


//        Zadanie 7

        List<Integer> integerList = new ArrayList<Integer>();
        integerList = Arrays.asList(5, 23, 21, 34, 66, 54, 223, 4, 3, 66, 34, 2, 11, 9, 8);
        for (Integer integer : integerList) {
            System.out.print(integer + ", ");
        }
        System.out.println();
        System.out.println("Długość listy: " + integerList.size());
        integerList = integerList.subList(1, integerList.size() - 1);
        System.out.println("Długość listy: " + integerList.size());


//        Zadanie 8
        Książka książka1 =
                new Książka("Super", "Jerzy Korab", 200, "Helion");
        Książka książka2 =
                new Książka("Źle", "Jurij Gagarin", 1, "Zło");
        Książka książka3 =
                new Książka("Nie wiem", "Jerzy Miller", 132, "LSD");
        Książka książka4 =
                new Książka("Będzie dobrze", "Lew Krasowski", 9876, "Fundacja ITAKA");
        Książka książka5 =
                new Książka("Lepszego jutra nie będzię", "Jarosław Kłamczyński", 200, "PiS");
        Książka książka6 =
                new Książka("Konaj razem z nami", "Tadeusz Rydzyk", 200, "Helion");
        Książka książka7 =
                new Książka("O dwóch takich, co już jest jeden", "Zbigniew Stonoga", 200, "Helion");
        Książka książka8 =
                new Książka("Skocz do wody dla ochłody", "Majka Jeżowska", 199, "Helion");
        Książka książka9 =
                new Książka("Tabu", "Adam Kowalski", 201, "Helion");
        Książka książka10 =
                new Książka("Tabaluga", "Jan Jan", 21, "Helion");
        Książka książka11 =
                new Książka("Jedenasty element", "Robert Scheinfeld", 231, "Helion");

        List<Książka> książkaList = new ArrayList<Książka>();
        książkaList.add(książka1);
        książkaList.add(książka2);
        książkaList.add(książka3);
        książkaList.add(książka4);
        książkaList.add(książka5);
        książkaList.add(książka6);
        książkaList.add(książka7);
        książkaList.add(książka8);
        książkaList.add(książka9);
        książkaList.add(książka10);
        książkaList.add(książka11);

        System.out.println(książkaList);

        książkaList.remove(((int) książkaList.size() / 2));

        System.out.println(książkaList);

        for (Książka książka : książkaList) {
            if (książka.getLiczbaStron() == 200) {
                System.out.println(książka);

            }
        }

//Zadanie 9

        List<Książka> książkaList2 = new ArrayList<Książka>();
        książkaList2.add(new Książka("Jak", "Szczepan Jankowski", 43, "PWN"));
        książkaList2.add(new Książka("To", "Szczepan Jankowski", 44, "PWN"));
        książkaList2.add(new Książka("Jest", "Szczepan Jankowski", 45, "PWN"));
        książkaList2.add(new Książka("Zrobione", "Szczepan Jankowski", 46, "PWN"));

        książkaList.addAll(książkaList2);
        System.out.println(książkaList.size());
        System.out.println(książkaList);


//    Zadanie 10

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj imię lub wpisz END: ");
        String imię = input.next();
        List<String> imiona = new ArrayList<String>();
        imiona.add(imię);

        while (true) {
            if (imiona.get(0).equals("END")) {
                imiona.remove(0);
                break;
            }
        System.out.print("Podaj imię lub wpisz END: ");
        imię = input.next();
        if (imiona.contains(imię)) {
            System.out.println("To imię jest już na liście!");
            continue;
        }
        else if (!imię.equals("END")) {
            imiona.add(imię);
            continue;
        } else {
            break;
        }

        }
        System.out.println(imiona.size());
        System.out.println(imiona);


    }
}
