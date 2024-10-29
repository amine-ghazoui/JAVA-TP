package exercice_2;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String tele, double salire, String specialite){
        super(nom, prenom, email, tele, salire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalire(){
        salaire += salaire + salaire * 0.15;
        return salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
