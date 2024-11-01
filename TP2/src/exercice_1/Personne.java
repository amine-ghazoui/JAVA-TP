package exercice_1;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String tele;
    private int age;

    public Personne(String nom, String prenom, String email, String tele, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tele = tele;
        this.age = age;
    }

    public void afficher(){
        System.out.println("nom : "+nom);
        System.out.println(" prenom : "+prenom);
        System.out.println(" email : "+email);
        System.out.println(" tele : "+tele);
        System.out.println(" age : "+age);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getTele() {

        return tele;
    }

    public void setTele(String tele) {

        this.tele = tele;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

}
