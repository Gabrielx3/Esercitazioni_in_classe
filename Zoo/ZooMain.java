package Zoo;

import Zoo.animali.*;
import Zoo.utils.Zooutils;

import java.util.ArrayList;
import java.util.List;

public class ZooMain {

    public static void main(String[] args) {

        List<Animale> animali = new ArrayList<>();

        animali.add(new Leone("Leon", 5));
        animali.add(new Scimmia("Monkey", 3));
        animali.add(new Leone("Carlo", 8));
        animali.add(new Scimmia("Jeffrey", 2));

        for (Animale a : animali) {
            Zooutils.stampaInfo(a);
            a.verso();
            a.muovi();
            System.out.println();
        }
    }
}
