package be.vdab.jpfhfdst20;


import java.util.TreeMap;

public class VBTreeMap {
    public static void main(String[] args) {
        var landen = new TreeMap<String, String>();
        landen.put("B", "Belgie");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");

        var eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        var vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);


        System.out.println("\n*** View van de Keys ***");
        for (var eenLandcode : landen.keySet()) {
            System.out.println(eenLandcode);
        }

        System.out.println("\n*** View van de Keys met bijhorende value-waarde ***");
        for (var eenLandcode : landen.keySet()){
            System.out.println(eenLandcode + " heeft als landnaam: " + landen.get(eenLandcode));
        }

        System.out.println("\n*** View van de Values ***");
        for (var eenLandnaam : landen.values()) {
            System.out.println(eenLandnaam);
        }

        System.out.println("\n*** View van de Key-Value-paren ***");
        for (var eenLandEntry : landen.entrySet()) {
            System.out.println(eenLandEntry);
        }
    }
}
