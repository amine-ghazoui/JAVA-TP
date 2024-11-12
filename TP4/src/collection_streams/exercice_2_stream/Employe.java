package collection_streams.exercice_2_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employe {
    String nom;
    String departement;
    double salaire;

    public Employe(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom + " - " + departement + " - " + salaire;
    }

    public static void main(String[] args) {

        List<Employe> employes = new ArrayList<>();

        employes.add(new Employe("Amine", "Informatique", 50000));
        employes.add(new Employe("ibtissame", "Informatique", 45000));
        employes.add(new Employe("soufiane", "Marketing", 30000));


        // Somme des salaires
        double totalSalire = employes.stream()
                            .mapToDouble(emp -> emp.getSalaire())  // Extraire les salaires des employés
                            .sum(); // Calculer la somme des salaires
        System.out.println("Somme totale des salaires : " + totalSalire);

        /*
        double totalSalaire = employes.stream().reduce(0.0, (acc, employe) -> acc + employe.getSalaire());
        double totalSalaire = employes.stream().mapToDouble(Employe::getSalaire).sum();
         */


        // trier la liste des employés par ordre alphabétique du nom.
        List<Employe> employeTrie = employes.stream()
                                    .sorted(Comparator.comparing(Employe :: getNom )) // Tri par ordre alphabétique du nom
                                    .collect(Collectors.toList());

        employeTrie.forEach(emp -> System.out.println(emp.toString()));


        // Trouver l'employé avec le salaire le plus bas
        Employe employeSalaireBas = employes.stream()
                                .min(Comparator.comparingDouble(Employe :: getSalaire))
                                .orElse(null); // Si la liste est vide, renvoyer null

        if (employeSalaireBas != null) {
            System.out.println("Employé avec salaire le plus bas : " + employeSalaireBas.getNom());
        } else {
            System.out.println("Aucun employé trouvé.");
        }


        // Liste des employés avec un salaire supérieur à 50000
        List<Employe> listEmploye = employes.stream()
                                .filter(map -> map.getSalaire() > 40000)
                                .collect(Collectors.toList());

        listEmploye.forEach(emp -> System.out.println("Employé avec salaire > 40000 est : " + emp.getNom()));


        // Trouver l'employé avec le salaire le plus élevé
        Employe empSalaireEleve = employes.stream()
                                .reduce((emp1, emp2) -> emp1.getSalaire() > emp2.getSalaire() ? emp1 : emp2) // comparer les salires des employés deux par deux
                                .orElse(null); // Si la liste est vide , renvoie null

        if (empSalaireEleve != null) {
            System.out.println("Employé avec le salaire le plus élevé : " + empSalaireEleve.getNom());
        } else {
            System.out.println("Aucun employé trouvé.");
        }


        // Concaténer les noms de tous les employés
        String nomEmpConcat = employes.stream()
                            .map(Employe :: getNom) // Transforme chaque employé en son nom (chaîne de caractères)
                            .reduce("", (noms, nom) -> noms + nom + " " ); // Réduit le stream en une seule chaîne en concaténant chaque nom avec un espace

        System.out.println("Noms concaténés : " + nomEmpConcat);
    }
}
