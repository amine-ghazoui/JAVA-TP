package com.example.tp_javafx;

import com.example.entite.Departement;
import com.example.dao.DepartementDao;
import com.example.dao.ProfesseurDao;
import com.example.entite.Professeur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {



    @FXML
    private TextField rechercheInput;
    @FXML
    private TextField AdresseInput;

    @FXML
    private TextField DateInput;

    @FXML
    private TableColumn<Professeur, String> DateProf;

    @FXML
    private TextField EmailInput;

    @FXML
    private TableColumn<Departement, Integer> IDDepart;

    @FXML
    private TextField IDDepartInput;

    @FXML
    private TextField IDDepart_ProfInput;

    @FXML
    private TextField IDInput;

    @FXML
    private TableColumn<Departement, String> NomDepart;

    @FXML
    private TextField NomDepartInput;

    @FXML
    private TextField Nom_ProfInput;

    @FXML
    private TextField PrenomInput;

    @FXML
    private TextField TelephoneInput;

    @FXML
    private TableColumn<Professeur, String> adresseProf;

    @FXML
    private TextField cinInput;

    @FXML
    private TableColumn<Professeur, String> cinProf;

    @FXML
    private TableColumn<Professeur, Integer> ID_departProf;

    @FXML
    private TableColumn<Professeur, String> emailProf;

    @FXML
    private TableColumn<Professeur, Integer> idProf;

    @FXML
    private TabPane mainTabPan;

    @FXML
    private TableColumn<Professeur, String> nomProf;

    @FXML
    private TableColumn<Professeur, String> prenomProf;

    @FXML
    private TableView<Departement> tableDepartment;

    @FXML
    private TextField rechercheDep;

    @FXML
    private TableView<Professeur> tableProfesseur;

    @FXML
    private TableColumn<Professeur, String> teleProf;

    ProfesseurDao professeur = new ProfesseurDao();
    DepartementDao departement = new DepartementDao();

    ObservableList<Professeur> profs = FXCollections.observableArrayList(professeur.findAll());
    ObservableList<Departement> departs = FXCollections.observableArrayList(departement.findAll());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Professeurs
        idProf.setCellValueFactory(new PropertyValueFactory<Professeur, Integer>("id_prof"));
        nomProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("nom"));
        prenomProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("prenom"));
        cinProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("cin"));
        adresseProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("adresse"));
        teleProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("telephone"));
        emailProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("email"));
        DateProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("dete_recrutement"));
        ID_departProf.setCellValueFactory(new PropertyValueFactory<Professeur, Integer>("id_depart"));

        tableProfesseur.setItems(profs);

        //Departements
        IDDepart.setCellValueFactory(new PropertyValueFactory<Departement, Integer>("id_dept"));
        NomDepart.setCellValueFactory(new PropertyValueFactory<Departement, String>("nom"));

        tableDepartment.setItems(departs);
    }

    @FXML
    void afficherProfPDepart(MouseEvent event) {

    }

    @FXML
    void ajouterDepart(MouseEvent event) {
        Departement depart = new Departement(Integer.parseInt(IDDepartInput.getText()),
                NomDepartInput.getText());
        departement.add(depart);
        departs.add(depart);
    }

    @FXML
    void ajouterProfesseur(MouseEvent event) {
        Professeur prof = new Professeur(Integer.parseInt(IDInput.getText()),
                Nom_ProfInput.getText(), PrenomInput.getText(),
                cinInput.getText(), AdresseInput.getText(),
                TelephoneInput.getText(), EmailInput.getText(),
                DateInput.getText(), Integer.parseInt(IDDepart_ProfInput.getText()));
        professeur.add(prof);
        profs.add(prof);

    }

    @FXML
    void supprimerDepart(MouseEvent event) {
        DepartementDao depart = new DepartementDao();
        int selectID = tableDepartment.getSelectionModel().getFocusedIndex();
        tableDepartment.getItems().remove(selectID);
        departement.delete(selectID);
    }
    @FXML
    void supprimerProfesseur(MouseEvent event) {
        ProfesseurDao prof = new ProfesseurDao();
        int selectID = tableProfesseur.getSelectionModel().getFocusedIndex();
        tableProfesseur.getItems().remove(selectID);
        prof.delete(selectID);
    }

    @FXML
    void chercherDepart(MouseEvent event) {
        departs.clear();
        int idDep = Integer.parseInt(rechercheDep.getText());
        Departement dep = departement.findById(idDep);
        departs.add(dep);
    }

    @FXML
    void rechercherProf(MouseEvent event) {
        profs.clear();
        int idProf = Integer.parseInt(rechercheInput.getText());
        Professeur prof = professeur.findById(idProf);
        profs.add(prof);
    }

    @FXML
    void rowClickedDep(MouseEvent event) {
        Departement depart = tableDepartment.getSelectionModel().getSelectedItem();

        IDDepartInput.setText(String.valueOf(depart.getId_dept()));
        NomDepartInput.setText(String.valueOf(depart.getNom()));
    }

    @FXML
    void modifierDepart(MouseEvent event) {

        int idDepart = Integer.parseInt(IDDepartInput.getText());
        String nomDepart = NomDepartInput.getText();

        Departement depart = new Departement(idDepart, nomDepart);
        departement.update(depart);

        int indexDepart = tableDepartment.getSelectionModel().getFocusedIndex();
        tableDepartment.getItems().set(indexDepart, depart);

    }


    @FXML
    void rowClicked(MouseEvent event) {

        Professeur prof = tableProfesseur.getSelectionModel().getSelectedItem();

        IDInput.setText(String.valueOf(prof.getId_prof()));
        Nom_ProfInput.setText(prof.getNom());
        PrenomInput.setText(prof.getPrenom());
        cinInput.setText(prof.getCin());
        AdresseInput.setText(prof.getAdresse());
        TelephoneInput.setText(prof.getTelephone());
        EmailInput.setText(prof.getEmail());
        DateInput.setText(String.valueOf(prof.getDete_recrutement()));
        IDDepart_ProfInput.setText(String.valueOf(prof.getId_depart()));
    }

    @FXML
    void modifierProfesseur(MouseEvent event) {
        // pour rendre l'objet professeur qui est selectionner
        //Professeur prof = tableProfesseur.getSelectionModel().getSelectedItem();

        int idProf = Integer.parseInt(IDInput.getText());
        String nom = Nom_ProfInput.getText();
        String prenom = PrenomInput.getText();
        String cin = cinInput.getText();
        String adresse = AdresseInput.getText();
        String tele = TelephoneInput.getText();
        String email = EmailInput.getText();
        String date = DateInput.getText();
        int idDep = Integer.parseInt(IDDepart_ProfInput.getText());

        Professeur profModifier = new Professeur(idProf, nom, prenom, cin, adresse, tele, email, date, idDep);
        professeur.update(profModifier);
        // pour rendre l'index du professeur selectionner
        int indexProf = tableProfesseur.getSelectionModel().getFocusedIndex();
        tableProfesseur.getItems().set(indexProf, profModifier);
    }

    @FXML
    void affecterProf(MouseEvent event) throws IOException {
        Professeur selectedP = tableProfesseur.getSelectionModel().getSelectedItem();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("affecterProfesseur-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            AffecterProfesseur controller = fxmlLoader.getController();

            Stage stage = new Stage();
            stage.setTitle("Affecter Departement!");
            stage.setScene(scene);
            stage.show();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void refresh(){
        profs = FXCollections.observableArrayList(professeur.findAll());
        tableProfesseur.setItems(profs);
        departs = FXCollections.observableArrayList(departement.findAll());
        tableDepartment.setItems(departs);
    }

}

