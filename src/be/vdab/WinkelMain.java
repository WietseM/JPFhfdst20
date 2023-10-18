package be.vdab;

import be.vdab.winkel.Catalogus;
import be.vdab.winkel.Mandje;
import be.vdab.winkel.Product;

import java.math.BigDecimal;

public class WinkelMain {
    public static void main(String[] args) {
        var catalogus = new Catalogus();
        var mandje = new Mandje();

        var teller = 1;
        for (var product : catalogus.getProducten()) {
            if (teller % 2 == 0) {
                mandje.add(product, teller);
            }
            teller++;
        }

        var p1 = new Product("1kg peren", BigDecimal.valueOf(1.56));
        var p2 = new Product("1kg tenen", BigDecimal.valueOf(1.56));
        mandje.add(p1, 5);
        mandje.add(p2, 10);
        mandje.remove(p2);
        // mandje.clear();

        System.out.println("U kocht:");
        for (var entry : mandje.getMandje().entrySet()) {
            System.out.println((entry.getKey()) + "; aantal stuks: "
                    + entry.getValue());
        }



        System.out.println("Totale prijs van het mandje bedraagt: " + mandje.getTotalePrijs());

    }
}
