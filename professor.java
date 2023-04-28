public class professor extends human {

    // Attributs d'instance

        private String module;
        private double salaire;


        // Constructeur
    public professor(String genre, String nom, int age, String sexe,String module, double salaire) {
        super(genre, nom, age,sexe);

        this.module = module;
        this.salaire=salaire;

    }
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module= module;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }






    // Méthode pour afficher les informations du professeur
    public void afficherInfo() {
        super.afficherInfos();
        System.out.println("j'enseigne les " + this.module+" "+" je touche "+this.salaire);

    }
}


