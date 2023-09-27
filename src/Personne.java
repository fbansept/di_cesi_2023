public class Personne {

    private String prenom;
    private String nom;
    private int age;

    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = 18;
    }

    public Personne(String nom, int age) {
        this.prenom = "inconnu";
        this.nom = nom;
        this.age = age;
    }

    public String fullName() {
        return nom.toUpperCase() + " " + prenom;
    }

    public String fullName(String civilite) {
        return civilite + "." + nom.toUpperCase() + " " + prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
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


}
