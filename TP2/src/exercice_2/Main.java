package exercice_2;

public class Main {
    public static void main(String[] args) {

        // Création d'un objet Ingénieur
        Ingenieur ing  = new Ingenieur("Mohamed_Amine", "GHAZOUI", "ghazouimohamedamine@gmail.com", "0655691205", 12000, "Java_Spring");

        // Création d'un objet Manager
        Manager man = new Manager("Youssef", "GHAZOUI", "ysfghazoui@gmail.com", "0662159571", 30000, "Chef de projet");

        // Affichage des informations de l'ingénieur
        System.out.println("les information de l'ingéniieur :");
        System.out.println(ing.toString());

        // Affichage des informations du manager
        System.out.println("les information de Manager :");
        System.out.println(man.toString());
    }
}
