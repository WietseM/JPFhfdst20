package be.vdab;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TienkamperMain {
    public static void main(String[] args) {
        var atleet1 = new Tienkamper("Wietse", 65);
        var atleet2 = new Tienkamper("Simon", 70);
        var atleet3 = new Tienkamper("Glen", 51);
        var atleet4 = new Tienkamper("Jelle", 42);
        var atleet5 = new Tienkamper("Khana", 90);
        var atleet6 = new Tienkamper("Wietse", 100);

        var lijst = new ArrayList<Tienkamper>();
        lijst.addAll(List.of(atleet1, atleet2, atleet3, atleet4, atleet5, atleet6));

        System.out.println("Alle tienkampers uit de arraylist (=volgorde van toevoegen):");
        for (var atleet : lijst){
            System.out.println(atleet);
        }

        var set = new TreeSet<Tienkamper>();
        set.addAll(lijst);

        System.out.println("\nAlle tienkampers uit de treeset (=gesorteerd op naam):");
        for (var atleet : set){
            System.out.println(atleet);
        }
    }
}
