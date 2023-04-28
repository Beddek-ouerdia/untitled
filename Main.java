public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("homme", "kiki", 24, "hommr",10,"l2");
        Etudiant e2 = new Etudiant("femme", "didou", 24, "femme",15,"m1");

        professor p1=new professor("homme","yoan",31,"homme","math",100.1);

        e1.afficherInfo();
        e2.afficherInfo();
        p1.afficherInfo();
    }
}