package be.vdab;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Voertuig;
import be.vdab.voertuigen.Vrachtwagen;

import java.util.TreeSet;

public class TestProgramma {
    public static void main(String[] args) {
        var voertuigen = new TreeSet<Voertuig>();
        var p1 = new Personenwagen("Simon de Pauw", 15000F, 95, 5.06F, "IK-BEN-GAY", 4, 4);
        var v1 = new Vrachtwagen("Glen Meel", 10000F, 460, 30.5F, "IK-BEN-GAYER", 15000F);
        var p2 = new Personenwagen("Wietse Mees", 250000F, 1109, 20.0F, "IK-BEN-COOL", 2,
                3);
        var v2 = new Vrachtwagen("Khana Steger", 1000F, 60, 10.5F, "IK-BEN-GAYST", 1500F);
        voertuigen.add(p1);
        voertuigen.add(v1);
        voertuigen.add(p2);
        voertuigen.add(v2);

        System.out.println("\n*** TreeSet van voertuigen ***");
        for (var voertuig : voertuigen){
            System.out.println(voertuig);
        }

    }
}

