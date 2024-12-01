package com.example.tp_javafx;

import com.example.dao.ProfesseurDao;
import com.example.entite.Professeur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfesseuerController implements Initializable {

    ProfesseurDao professeur = new ProfesseurDao();
    @FXML
    private TextField AdresseInput;

    @FXML
    private TextField DateInput;

    @FXML
    private TableView<Professeur> table;

    @FXML
    private TableColumn<Professeur, String> DateProf;

    @FXML
    private TextField EmailInput;

    @FXML
    private TextField IDDepartInput;

    @FXML
    private TextField IDInput;

    @FXML
    private TableColumn<Professeur, Integer> ID_departProf;

    @FXML
    private TextField NomInput;

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
    private TableColumn<Professeur, String> emailProf;

    @FXML
    private TableColumn<Professeur, Integer> idProf;

    @FXML
    private TableColumn<Professeur, String> nomProf;

    @FXML
    private TableColumn<Professeur, String> prenomProf;

    @FXML
    private TableColumn<Professeur, String> teleProf;

    ObservableList<Professeur> profs = FXCollections.observableArrayList(professeur.findAll());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idProf.setCellValueFactory(new PropertyValueFactory<Professeur, Integer>("id_prof"));
        nomProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("nom"));
        prenomProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("prenom"));
        cinProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("cin"));
        adresseProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("adresse"));
        teleProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("telephone"));
        emailProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("email"));
        DateProf.setCellValueFactory(new PropertyValueFactory<Professeur, String>("dete_recrutement"));
        ID_departProf.setCellValueFactory(new PropertyValueFactory<Professeur, Integer>("id_depart"));

        table.setItems(profs);

    }

    @FXML
    void ajouter(MouseEvent event) {
        Professeur profe = new Professeur(Integer.parseInt(IDInput.getText()),
                NomInput.getText(), PrenomInput.getText(),
                cinInput.getText(), AdresseInput.getText(),
                TelephoneInput.getText(),EmailInput.getText(),
                DateInput.getText(), Integer.parseInt(IDDepartInput.getText()));

        professeur.add(profe);
        profs.add(profe);
    }

    @FXML
    void supprimer(MouseEvent event) {
        ProfesseurDao prof = new ProfesseurDao();
        int selectedID = table.getSelectionModel().getFocusedIndex();
        table.getItems().remove(selectedID);
        prof.delete(selectedID+1);

    }

    @FXML
    void rowClicked(MouseEvent event) {

        Professeur prof = table.getSelectionModel().getSelectedItem();

        IDInput.setText(String.valueOf(prof.getId_prof()));
        NomInput.setText(String.valueOf(prof.getNom()));
        PrenomInput.setText(String.valueOf(prof.getPrenom()));
        cinInput.setText(String.valueOf(prof.getCin()));
        AdresseInput.setText(String.valueOf(prof.getAdresse()));
        TelephoneInput.setText(String.valueOf(prof.getTelephone()));
        EmailInput.setText(String.valueOf(prof.getEmail()));
        DateInput.setText(String.valueOf(prof.getDete_recrutement()));
        idProf.setText(String.valueOf(prof.getId_depart()));


    }

    @FXML
    void modifier(MouseEvent event) {
        // pour rendre l'objet professeur qui est selectionner
        Professeur prof = table.getSelectionModel().getSelectedItem();

        int idProf = Integer.parseInt(IDInput.getText());
        String nom = NomInput.getText();
        String prenom = PrenomInput.getText();
        String cin = cinInput.getText();
        String adresse = AdresseInput.getText();
        String tele = TelephoneInput.getText();
        String email = EmailInput.getText();
        String date = DateInput.getText();
        int idDep = Integer.parseInt(IDInput.getText());

        Professeur profModifier = new Professeur(idProf, nom, prenom, cin, adresse, tele, email, date, idDep);
        professeur.update(profModifier);
        // pour rendre l'index du professeur selectionner
        int selectIndex = table.getSelectionModel().getFocusedIndex();
        table.getItems().set(selectIndex, profModifier);

    }

}
