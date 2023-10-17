package be.vdab.jpfhfdst20;

import java.util.ArrayList;

public class VBArrayList {
    public static void main(String[] args) {
        var al = new ArrayList<String>();
        al.add("fiets");
        al.add(null);
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen");
        al.add("boom");
        al.add("aap");

        System.out.println("4e element is: " + al.get(3));
        al.add(3, "test");

        // met for-each lus
        System.out.println("Voorbeeld van een ArrayList:");
        for (var woord : al){
            System.out.println(woord);
        }

        // met iterator met for-lus
        System.out.println("\nWeergave m.b.v. iterator met for-lus");
        for (var i = al.iterator(); i.hasNext();){
            var woord = i.next();
            System.out.println(woord);
        }

        // met iterator met while-lus
        System.out.println("\nWeergave m.b.v. iterator met while-lus");
        var j = al.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }

    }
}
