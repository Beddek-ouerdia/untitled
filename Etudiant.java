public class Etudiant extends human {

    // Attributs d'instance
    private int nbetudiant;
    private String niveau;

    // Constructeur
    public Etudiant(String genre, String nom, int age, String sexe, int nbEtudiant, String niveau) {
        super(genre, nom, age, sexe);
        this.nbetudiant = nbEtudiant;
        this.niveau = niveau;
    }
    public int getNbEtudiant() {
        return nbetudiant;
    }

    public void setNbEtudiant(int nbEtudiant) {
        this.nbetudiant = nbEtudiant;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }



    // Méthode pour afficher les informations de l'etudiant
    public void afficherInfo() {
        super.afficherInfos();
        System.out.println("mon numero etudiant est: " + this.nbetudiant +" "+ "et mon niveau est :"+this.niveau);

    }
}


