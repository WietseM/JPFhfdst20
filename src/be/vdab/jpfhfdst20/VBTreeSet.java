package be.vdab.jpfhfdst20;

import java.util.TreeSet;

public class VBTreeSet {
    public static void main(String[] args) {
        var ts = new TreeSet<>();
        ts.add("fiets");
        ts.add("even");
        ts.add("dak");
        ts.add("citroen");
        ts.add("boom");
        ts.add("aap");

        //ts.add(null);
        ts.add("dak");


        System.out.println("Voorbeeld van een TreeSet:");
        for (var woord : ts) {
            System.out.println(woord);
        }

        System.out.println("\nExtra methods:");
        System.out.println("Eerste element: " + ts.first());
        System.out.println("Laatste element: " + ts.last());

    }
}
