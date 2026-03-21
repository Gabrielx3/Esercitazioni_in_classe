package Zoo.utils;
import Zoo.animali.Animale;
public class Zooutils {

    public static void stampaInfo(Animale a) {
        System.out.println(" INFO ANIMALE ");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Età: " + a.getEta());
    }
}
