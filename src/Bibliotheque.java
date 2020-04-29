import java.util.Scanner;

public class Bibliotheque {
    public static void main(String[] arg) {
        Scanner lectureClavier = new Scanner(System.in);

        Livre livrePoche = new Livre();

        Livre unPolar = new Livre("Le mystère de la chambre jaune", "Leroux", "Gaston",
                "Policier", "2253005495");
        unPolar.afficherUnLivre();

        livrePoche.afficherUnLivre();


        System.out.println("code du livre : " + livrePoche.getTitre() + livrePoche.getCode());
    }
}
