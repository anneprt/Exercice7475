import java.util.Scanner;

public class Bibliotheque {
    public static void main(String[] arg) {
        Scanner lectureClavier = new Scanner(System.in);

        Livre livrePoche = new Livre();

        System.out.print("Entrez le titre : ");
        livrePoche.titre = lectureClavier.next();

        System.out.print("Entrez la categorie : ");
        livrePoche.categorie = lectureClavier.next();

        System.out.print("Entrez le nom de l'auteur : ");
        livrePoche.nomAuteur = lectureClavier.next();

        System.out.print("Entrez le prenom de l'auteur : ");
        livrePoche.prenomAuteur = lectureClavier.next();

        System.out.print("Entrez le numero ISBN : ");
        livrePoche.isbn = lectureClavier.next();

        livrePoche.afficherUnLivre();

        System.out.println("code du livre : " + livrePoche.calculerLeCode());
    }
}
