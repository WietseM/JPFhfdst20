package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Mandje {
    private final HashMap<Product, Integer> mandje = new LinkedHashMap<>();

    public Mandje() {
        /* maakt vers mandje aan met alle producten uit catalogus en als aantal = 0;
        mandje = new HashMap<>();
        var catalogus = new Catalogus();
        for (var product : catalogus.getProducten()) {
            mandje.put(product, 0);
        }
        */
    }

    public void add(Product product, int aantal) {
        controleerProduct(product);
        controleerAantal(aantal);
        if (!mandje.containsKey(product)) {
            mandje.put(product, 0);
        }
        var huidigeAantal = mandje.get(product);
        mandje.put(product, huidigeAantal + aantal);
    }

    private void controleerProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("product moet ingevuld worden");
        }
    }

    private void controleerAantal(int aantal) {
        if (aantal <= 0) {
            throw new IllegalArgumentException("aantal moet positief zijn");
        }
    }

    public void remove(Product p) {
        controleerProduct(p);
        // verwijdert gehele product: mandje.remove(p);
        if (mandje.containsKey(p) && mandje.get(p) > 0) {
            mandje.put(p, mandje.get(p) - 1);
        }
    }

    public void clear() {
        //verwijdert gehele mandje: mandje.clear();
        for (var product : mandje.keySet()) {
            mandje.put(product, 0);
        }
    }

    public BigDecimal getTotalePrijs() {
        var totalePrijs = BigDecimal.ZERO;
        for (var product : mandje.keySet()) {
            var prijs = product.getPrijs();
            var aantal = mandje.get(product);
            var prijsProductInMandje = prijs.multiply(new BigDecimal(aantal));
            totalePrijs = totalePrijs.add(prijsProductInMandje);
        }
        return totalePrijs;
    }


    public HashMap<Product, Integer> getMandje() {
        return mandje;
    }

    @Override
    public String toString() {
        return mandje.toString();
    }
}
