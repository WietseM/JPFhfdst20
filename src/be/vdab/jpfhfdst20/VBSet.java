package be.vdab.jpfhfdst20;

import java.util.HashSet;

public class VBSet {
    public static void main(String[] args) {
        var hs = new HashSet<String>();
        hs.add("fiets");
        hs.add("even");
        hs.add("dak");
        hs.add("citroen");
        hs.add("boom");
        hs.add("aap");

        hs.add(null);
        hs.add("dak");

        System.out.println("Voorbeeld van een HashSet: ");
        for (var woord : hs) {
            //  System.out.println(woord + "\t" + woord.hashCode());
            System.out.println(woord);
        }
    }
}
