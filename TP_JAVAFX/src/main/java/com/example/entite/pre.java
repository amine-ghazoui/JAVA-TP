package com.example.entite;

import com.example.dao.DepartementDao;
import com.example.dao.ProfesseurDao;

public class pre {
    public static void main(String[] args) {

//        Departement dep1 = new Departement( 1, "informatique");
//        Departement dep2 = new Departement( 2, "mathématique");
//        Departement dep3 = new Departement( 3, "physique ");
//        Departement dep4 = new Departement( 4, "chimie");


        Professeur prof1 = new Professeur( 1, "Elbermi", "Lahcen", "U5677", "ERRACHIDIA", "0662159576", "elbermi@gmail.com","12-01-2009", 1 );
        Professeur prof2 = new Professeur( 2, "Hajar", "Moha", "U1777", "Tinghir", "0662769576", "hajar@gmail.com","17-09-2014", 2 );
        Professeur prof3 = new Professeur( 3, "Amounas", "Fatima", "PA1777", "GOULMIMA", "0662909576", "amounasF@gmail.com","19-11-2017", 1 );
        Professeur prof4 = new Professeur( 4, "Daya", "Abdelmajid", "Z1777", "ASAFI", "0662458476", "dayaAb@gmail.com","10-05-2020", 3 );


        DepartementDao departement = new DepartementDao();
        ProfesseurDao professeur = new ProfesseurDao();

//        departement.add(dep1);
//        departement.add(dep2);
//        departement.add(dep3);

//        professeur.add(prof1);
//        professeur.add(prof2);
//        professeur.add(prof3);
//        professeur.add(prof4);

        // professeur.update(prof4);
        //professeur.delete(2);
        //professeur.assignToDepartment(1, 2);

        professeur.findByDepartement(1);



    }
}
