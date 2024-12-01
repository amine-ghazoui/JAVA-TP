package com.example.tp_javafx;

import com.example.dao.DepartementDao;
import com.example.dao.ProfesseurDao;
import com.example.entite.Departement;
import com.example.entite.Professeur;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AffecterProfesseur implements Initializable {

    private ProfesseurDao professeurDa = new ProfesseurDao();
    private DepartementDao departementDa = new DepartementDao();
    private Professeur professeur;
    private HelloController helloController;

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @FXML
    private ComboBox<String> comBox;
    List<Departement> departements = departementDa.findAll();

    @FXML
    void affecterProfDep(MouseEvent event){
        int idProf = professeur.getId_prof();
        int idDepart = comBox.getSelectionModel().getSelectedItem().charAt(0)-'0';
        professeurDa.assignToDepartment(idProf, idDepart);
        helloController.refresh();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Departement departement : departements) {
            String item = departement.getId_dept() + " - " + departement.getNom();
            comBox.getItems().add(item);
        }
    }

    public void setController(HelloController helloController) {
        this.helloController = helloController;
    }
}
