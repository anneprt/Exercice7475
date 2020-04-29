public class Livre {


    private String titre;
    private String categorie;
    private String isbn;
    private String nomAuteur;
    private String prenomAuteur;
    private String code;

    public void setTitre(String valeur) {
        titre = valeur;
    }

    public void setCategorie(String valeur) {
        categorie = valeur;
    }

    public void setIsbn(String valeur) {
        isbn = valeur;
    }

    public void setNomAuteur(String valeur) {
        nomAuteur = valeur;
    }

    public void setPrenomAuteur(String valeur) {
        prenomAuteur = valeur;
    }


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

