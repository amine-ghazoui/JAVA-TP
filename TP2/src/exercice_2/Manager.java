package exercice_2;

public class Manager extends Employe{
    private String servive;

    public Manager(String nom, String prenom, String email, String tele, double salire, String servive) {
        super(nom, prenom, email, tele, salire);
        this.servive = servive;
    }

    @Override
    public double calculerSalire(){
        salaire += salaire + salaire * 0.2;
        return salaire;
    }

    public String getServive() {
        return servive;
    }

    public void setServive(String servive) {
        this.servive = servive;
    }
}
