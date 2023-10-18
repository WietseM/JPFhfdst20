package be.vdab.jpfhfdst20;

import java.util.ArrayList;
import java.util.List;
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

        // Natuurlijke volgorde
        var fruitSet = new TreeSet<String>();
        fruitSet.addAll(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        for(var stukFruit : fruitSet){
            System.out.print(stukFruit + " ");
        }

        System.out.println("\n");

        // Eigen volgorde met Set
        fruitSet = new TreeSet<String>(new DescendingComparator());
        fruitSet.addAll(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        for(var stukFruit : fruitSet){
            System.out.print(stukFruit + " ");
        }

        System.out.println("\n");

        // Eigen volgorde met List
        var fruitList = new ArrayList<String>();
        fruitList.add("Banaan");
        fruitList.add("Appel");
        fruitList.add("Peer");
        fruitList.add("Aardbei");
        fruitList.add( "Druif");
        fruitList.sort(new DescendingComparator());

        for(var stukFruit : fruitList){
            System.out.print(stukFruit + " ");
        }



    }
}
