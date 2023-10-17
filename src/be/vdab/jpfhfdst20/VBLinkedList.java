package be.vdab.jpfhfdst20;

import java.util.LinkedList;

public class VBLinkedList {
    public static void main(String[] args) {
        var ll = new LinkedList<String>();
        ll.add("fiets");
        ll.add(null);
        ll.add("even");
        ll.add("dak");
        ll.add("citroen");
        ll.add("citroen");
        ll.add("boom");
        ll.add("aap");

        System.out.println("4e element is: " + ll.get(3));

        ll.add(3, "test");

        // met for-each lus
        System.out.println("Voorbeeld van een LinkedList:");
        for (var woord : ll){
            System.out.println(woord);
        }

        // met iterator met for-lus
        System.out.println("\nWeergave m.b.v. iterator met for-lus");
        for (var i = ll.iterator(); i.hasNext();){
            var woord = i.next();
            System.out.println(woord);
        }

        System.out.println("\nExtra methods");
        var lijst = ll;
        System.out.println(lijst.getFirst());
        System.out.println(lijst.getLast());

        lijst.addFirst("eerste");
        lijst.addLast("laatste");

        System.out.println(lijst.getFirst());
        System.out.println(lijst.getLast());

        System.out.println(lijst.removeFirst());
        System.out.println(lijst.removeLast());

        System.out.println(lijst.getFirst());
        System.out.println(lijst.getLast());

    }
}
