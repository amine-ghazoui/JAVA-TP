package exercice_2;

public class Main {
    public static void main(String[] args) {

        Ingenieur ing  = new Ingenieur("Mohamed_Amine", "GHAZOUI", "ghazouimohamedamine@gmail.com", "0655691205", 12000, "Java_Spring");
        Manager man = new Manager("Youssef", "GHAZOUI", "ysfghazoui@gmail.com", "0662159571", 30000, "Chef de projet");

        System.out.println("les information de l'ingéniieur :");
        System.out.println("Nom : " +ing.getNom());
        System.out.println("Prenom : " +ing.getPrenom());
        System.out.println("Email : " +ing.getTele());
        System.out.println("Salire : " +ing.getSalaire());
        System.out.println("Spécialité : " +ing.calculerSalire());

        System.out.println("********************************");
        System.out.println("les information de Manager :");
        System.out.println("Nom : " +man.getNom());
        System.out.println("Prenom : " +man.getPrenom());
        System.out.println("Email : " +man.getTele());
        System.out.println("Salire : " +man.getSalaire());
        System.out.println("Spécialité : " +man.calculerSalire());
    }
}
