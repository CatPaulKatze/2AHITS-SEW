package at.htlhl.sew2.oop.special;

public class Main {
    static void main() {
        Animal cow = new Animal("cow", 4, true);
        Animal schnappi = new Animal("Crocodile", 4, false);
        Animal seppi = new Animal("Crocodile", 4, false);

        System.out.println( (cow == schnappi) ? "gleich" : "ungleich");
        System.out.println( (schnappi == seppi) ? "gleich" : "ungleich");

        System.out.println( (cow.equals(schnappi)) ? "Attribute gleich" : "Attribute ungleich");
        System.out.println( (schnappi.equals(seppi)) ? "Attribute gleich" : "Attribute ungleich");

    }
}
