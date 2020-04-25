public class Livre {


    String titre;
    String categorie;
    String isbn;
    String nomAuteur;
    String prenomAuteur;
    String code;

    public void afficherUnLivre() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);
        System.out.println("Catégorie : " + categorie);
        System.out.println("ISBN : " + isbn);
    }

    public String calculerLeCode() {
        String debutNom;
        String debutPrenom;
        String debutCategorie;
        int longueurIsbn;
        String finIsbn;

        debutNom = nomAuteur.substring(0, 2);
        debutPrenom = prenomAuteur.substring(0, 2);

        debutCategorie = categorie.substring(0, 2);

        longueurIsbn = isbn.length();

        finIsbn = isbn.substring((longueurIsbn - 2), longueurIsbn);

        return debutNom + debutPrenom + debutCategorie + finIsbn;

    }
}

