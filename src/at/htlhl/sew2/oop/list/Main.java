package at.htlhl.sew2.oop.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static void main() {
        List<String> einkaufsListe = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System. out.println("Brauchen wir noch etwas j/n");
            String s = scanner.next();
            if (s. equals("j")) {
                System.out.println("Was brauchen wir noch?");
                String produkt = scanner.next();
                einkaufsListe.add(produkt);
            } else if (s.equals("n")) {
                System.out.println("Hier ist die Einkaufsliste: ");
                for (String produkt : einkaufsListe) {
                    System.out.println(produkt);
                }
                break;
            }
        }
    }
}
