public class prova {
    
    class Persona{
    String nome;
    int eta;

    void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.nome = "Marco";
        p1.eta = 30;

        Persona p2 = new Persona();
        p2.nome = "Luca";
        p2.eta = 25;

        p1.presentati();
        p2.presentati();
    }
}


