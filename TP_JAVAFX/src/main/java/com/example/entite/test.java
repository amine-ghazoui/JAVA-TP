package com.example.entite;

import com.example.dao.DepartementDao;
import com.example.dao.ProfesseurDao;

public class test {
    public static void main(String[] args) {

        Departement dep1 = new Departement( 1, "informatique");
        Departement dep2 = new Departement( 2, "mathématique");
        Departement dep3 = new Departement( 3, "physique ");
        Departement dep4 = new Departement( 4, "chimie");

        

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

//        professeur.findByDepartement(1);

//        departement.add(dep1);
//        departement.add(dep2);
//        departement.add(dep3);
//        departement.add(dep4);


        departement.update(dep3);





    }
}
