public abstract class human {
    private String genre;
    private String nom;
    private int age;
    private String sexe;

    public human(String genre, String nom, int age, String sexe) {
        this.genre = genre;
        this.nom= nom;
        this.age = age;
        this.sexe = sexe;
    }





        public String getGenre(){
            return genre;
        }
        public void setGenre(String genre){
            this.genre = genre;
        }

        public String getNom(){
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public int getAge() {
        return age;
        }

        public void setAge(int age) {
        this.age = age;
        }
         public String getSexe() {
        return sexe;
        }

        public void setSexe(String sexe) {
        this.sexe=sexe;
}





    public void afficherInfos() {
            System.out.println("Genre : " + this.genre);
            System.out.println("Nom : " + this.nom);
            System.out.println("Age : " + this.age);
            System.out.println("sexe : " + this.sexe);

        }
    }