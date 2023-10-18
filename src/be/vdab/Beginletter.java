package be.vdab;

import java.util.HashMap;

public class Beginletter {
    private static final  String[] dieren ={"Varken", "Vos", "Mees", "Koe", "Kip", "Paard", "Lama", "Vis"};
    public static void main(String[] args) {
        var dierenHashMap = new HashMap<String, Integer>();
        for (var dier : dieren){
            var beginLetter = dier.substring(0,1);
            var aantal = dierenHashMap.get(beginLetter);
            // if (!dierenHashMap.containsKey(beginLetter)
            if (aantal == null){
                aantal = 0;
            }
            aantal ++;
            dierenHashMap.put(beginLetter, aantal);
        }

        System.out.println("\n*** Aantal woorden per letter ***");
        System.out.println(dierenHashMap);

        System.out.println("\n*** Grootte HashMap ***");
        System.out.println(dierenHashMap.size());

        System.out.println("\n*** Is de HashMap leeg? ***");
        System.out.println(dierenHashMap.isEmpty());

        System.out.println("\n*** View van de Keys ***");
        for (var key : dierenHashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n*** View van de Values ***");
        for (var value : dierenHashMap.values()) {
            System.out.println(value);
        }

        System.out.println("\n*** View van de Entries ***");
        for (var entry : dierenHashMap.entrySet()) {
            System.out.println(entry);
            System.out.println(" of anders: " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
