package ges_Session_Groupe;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import coucheControler.Metier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import partieConsole.Groupe;
import partieConsole.Horaire;
import partieConsole.Module;
import partieConsole.Salle;
import partieConsole.Session;

public class controllerSessionGroupe implements Initializable {

	Metier metier = new Metier();
	ObservableList<Session> listSession = FXCollections.observableArrayList();
	ObservableList<Integer> listSalle = FXCollections.observableArrayList(metier.ChargerSalle());
	ObservableList<Integer> listSession1 = FXCollections.observableArrayList(metier.ChargerSession());
	ObservableList<Integer> listModule = FXCollections.observableArrayList(metier.ChargerModule());
	ObservableList<Integer> listHoraire = FXCollections.observableArrayList(1, 2, 3, 4, 5);
	ObservableList<Groupe> listGroupe = FXCollections.observableArrayList();
	
	@FXML
	private JFXButton btDeconnexion;

	@FXML
	private JFXButton btRetour;

	@FXML
	private TableView<Groupe> tViewGroupe;

	@FXML
	private TableColumn<Groupe, Integer> viewIdGroupe;

	@FXML
	private TableColumn<Groupe, String> viewNomGroupe;

	@FXML
	private TableColumn<Groupe, Date> viewExamGroupe;

	@FXML
	private TableColumn<Groupe, Integer> viewSalleGroupe;

	@FXML
	private TableColumn<Groupe, Integer> viewSessionGroupe;

	@FXML
	private TableColumn<Groupe, Integer> viewModuleGroupe;

	@FXML
	private TableColumn<Groupe, Integer> viewHrGroupe;

	@FXML
	private JFXTextField tIdGroupe;

	@FXML
	private JFXTextField tNomGroupe;

	@FXML
	private JFXTextField tLibelleMatiere;

	@FXML
	private JFXComboBox<Integer> tHrGroupe;

	@FXML
	private JFXDatePicker dateExam;

	@FXML
	private JFXComboBox<Integer> cSalle;

	@FXML
	private JFXComboBox<Integer> cSession;

	@FXML
	private JFXComboBox<Integer> cModule;

	@FXML
	private JFXButton annulerGroupe;

	@FXML
	private JFXButton SupGroupe;

	@FXML
	private JFXButton AfficherGroupe;

	@FXML
	private JFXTextField tSupGroupe;

	@FXML
	private TableView<Session> tViewSession;

	@FXML
	private TableColumn<Session, Integer> viewIdSession;

	@FXML
	private TableColumn<Session, Integer> viewAnneeSession;

	@FXML
	private TableColumn<Session, String> viewNomSession;

	@FXML
	private TableColumn<Session, Date> viewDdSession;

	@FXML
	private TableColumn<Session, Date> viewDfSession;

	@FXML
	private JFXTextField tIdSession;

	@FXML
	private JFXTextField tAnneeSession;

	@FXML
	private JFXTextField tNomSession;

	@FXML
	private JFXDatePicker dateDebutSession;

	@FXML
	private JFXDatePicker DateFinSession;

	@FXML
	private JFXButton annulerSession;

	@FXML
	private JFXButton SupSession;

	@FXML
	private JFXButton AfficherSession;

	@FXML
	private JFXTextField tSupSession;

	@FXML
	private JFXButton ajouterSession;

	@FXML
	void AfficherGroupe(ActionEvent event) {
		listGroupe = FXCollections.observableArrayList(metier.AfficherGroupe());
     
		viewIdGroupe.setCellValueFactory(new PropertyValueFactory<>("idGroupe"));
		viewNomGroupe.setCellValueFactory(new PropertyValueFactory<>("nomGroupe"));
		viewExamGroupe.setCellValueFactory(new PropertyValueFactory<>("dateExamen"));
		viewSalleGroupe.setCellValueFactory(new PropertyValueFactory<>("salle"));
		viewSessionGroupe.setCellValueFactory(new PropertyValueFactory<>("session"));
		viewModuleGroupe.setCellValueFactory(new PropertyValueFactory<>("module"));
		viewHrGroupe.setCellValueFactory(new PropertyValueFactory<>("horaire"));

		tViewGroupe.setItems(listGroupe);

	}

	@FXML
	void AfficherSession(ActionEvent event) {

		refresh();
		listSession = FXCollections.observableArrayList(metier.AfficherSession());

		viewIdSession.setCellValueFactory(new PropertyValueFactory<>("idSession"));
		viewAnneeSession.setCellValueFactory(new PropertyValueFactory<>("anneeSession"));
		viewNomSession.setCellValueFactory(new PropertyValueFactory<>("nomSession"));
		viewDdSession.setCellValueFactory(new PropertyValueFactory<>("dateDebutSession"));
		viewDfSession.setCellValueFactory(new PropertyValueFactory<>("dateFinSession"));

		tViewSession.setItems(listSession);
		// listSession.clear();

	}

	@FXML
	void AjouterGroupe(ActionEvent event) {
		if (tIdGroupe.getText() != null && tNomGroupe.getText() != null && dateExam.getValue() != null
				&& tHrGroupe.getValue() != null && cSalle.getValue() != null && cSession.getValue() != null
				&& cModule.getValue() != null) {
			int id = Integer.parseInt(tIdGroupe.getText());
			Groupe groupe = new Groupe(id, tNomGroupe.getText(), dateExam.getValue());
			int salle = cSalle.getValue();
			int session = cSession.getValue();
			int module = cModule.getValue();
			metier.AjouterGroupe(groupe, tHrGroupe.getValue(), session, salle, module);
			System.out.println("Succès!!!");
		} else {
			System.out.println("Error!!!");
		}

	}

	@FXML
	void AddSession(ActionEvent event) {
		if (tIdSession.getText() != null && tAnneeSession.getText() != null && tNomSession.getText() != null
				&& dateDebutSession.getValue() != null && DateFinSession.getValue() != null) {
			int id = Integer.parseInt(tIdSession.getText());
			int anne = Integer.parseInt(tAnneeSession.getText());
			Session session = new Session(id, anne, tNomSession.getText(), dateDebutSession.getValue(),
					DateFinSession.getValue());
			metier.AjouterSession(session);
			System.out.println("Succès!!!");

		} else {
			System.out.println("Error!!!");
		}
		/*
		 * tIdSession.clear(); tAnneeSession.clear(); tNomSession.clear();
		 */

	}

	@FXML
	void AnnulerGroupe(ActionEvent event) {
		tIdGroupe.clear();
		tNomGroupe.clear();
		tLibelleMatiere.clear();
		dateExam.setValue(null);
		tHrGroupe.setValue(null);
		cSalle.setValue(null);
		cSession.setValue(null);
		cModule.setValue(null);

	}

	@FXML
	void AnnulerSession(ActionEvent event) {
		tIdSession.clear();
		tAnneeSession.clear();
		tNomSession.clear();
		tViewSession.setItems(null);
		// dateDebutSession.getValue().
		// DateFinSession.clear();

	}

	@FXML
	void SupprimerGroupe(ActionEvent event) {
		int id = Integer.parseInt(tSupGroupe.getText());
		if (tSupGroupe.getText() != null) {
			metier.SupprimerGroupe(id);
		} else {
			System.out.println("Error de suppression verifier le champ!!!!");
		}
		tSupGroupe.clear();


	}

	@FXML
	void SupprimerSession(ActionEvent event) {
		int id = Integer.parseInt(tSupSession.getText());
		if (tSupSession.getText() != null) {
			metier.SupprimerSession(id);
		} else {
			System.out.println("Error de suppression verifier le champ!!!!");
		}
		tSupSession.clear();

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		refresh();
		// cSalle.setValue("OUI");
		cSession.setItems(listSession1);
		cSalle.setItems(listSalle);
		cModule.setItems(listModule);
		tHrGroupe.setItems(listHoraire);
		
	}

	public void refresh() {
		tViewSession.setItems(null);
		viewIdSession.setCellValueFactory(null);
		viewAnneeSession.setCellValueFactory(null);
		viewNomSession.setCellValueFactory(null);
		viewDdSession.setCellValueFactory(null);
		viewDfSession.setCellValueFactory(null);
	}

}
