package ges_Session_Groupe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import coucheControler.Metier;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import partieConsole.Session;

public class controllerSessionGroupe {
	
	Metier metier = new Metier();
	  @FXML
	    private JFXButton btDeconnexion;

	    @FXML
	    private JFXButton btRetour;

	    @FXML
	    private TableView<?> tViewGroupe;

	    @FXML
	    private TableColumn<?, ?> viewIdGroupe;

	    @FXML
	    private TableColumn<?, ?> viewNomGroupe;

	    @FXML
	    private TableColumn<?, ?> viewExamGroupe;

	    @FXML
	    private TableColumn<?, ?> viewSalleGroupe;

	    @FXML
	    private TableColumn<?, ?> viewSessionGroupe;

	    @FXML
	    private TableColumn<?, ?> viewModuleGroupe;

	    @FXML
	    private TableColumn<?, ?> viewHrGroupe;

	    @FXML
	    private JFXTextField tIdGroupe;

	    @FXML
	    private JFXTextField tNomGroupe;

	    @FXML
	    private JFXTextField tLibelleMatiere;

	    @FXML
	    private JFXComboBox<?> tHrGroupe;

	    @FXML
	    private JFXDatePicker dateExam;

	    @FXML
	    private JFXComboBox<?> cSalle;

	    @FXML
	    private JFXComboBox<?> cSession;

	    @FXML
	    private JFXComboBox<?> cModule;

	    @FXML
	    private JFXButton ajoutGroupe;

	    @FXML
	    private JFXButton annulerGroupe;

	    @FXML
	    private JFXButton SupGroupe;

	    @FXML
	    private JFXButton AfficherGroupe;

	    @FXML
	    private JFXTextField tSupMatiere;

	    @FXML
	    private TableView<?> tViewSession;

	    @FXML
	    private TableColumn<?, ?> viewIdSession;

	    @FXML
	    private TableColumn<?, ?> viewAnneeSession;

	    @FXML
	    private TableColumn<?, ?> viewNomSession;

	    @FXML
	    private TableColumn<?, ?> viewDdSession;

	    @FXML
	    private TableColumn<?, ?> viewNivMat1;

	    @FXML
	    private TableColumn<?, ?> viewNivMat11;

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
	    private JFXButton ajoutSession;

	    @FXML
	    private JFXButton annulerSession;

	    @FXML
	    private JFXButton SupSession;

	    @FXML
	    private JFXButton AfficherSession;

	    @FXML
	    private JFXTextField tSupSession;

	    @FXML
	    void AfficherGroupe(ActionEvent event) {

	    }

	    @FXML
	    void AfficherSession(ActionEvent event) {
	    	  if(tIdSession.getText()!= null && tAnneeSession.getText()!= null && tNomSession.getText()!= null
		 	    		&& dateDebutSession.getValue()!= null && DateFinSession.getValue()!= null) {
		 	    	int id =Integer.parseInt(tIdSession.getText());
		 	    	int anne =Integer.parseInt(tAnneeSession.getText());
		 	    	Session session = new Session(id,anne,tNomSession.getText(),
		 	    			dateDebutSession.getValue(),DateFinSession.getValue());
		 	    	metier.AjouterSession(session);
		 	    	System.out.println("Succès!!!");
		 	    	
		 	    }
		 	    else{
		 	    	System.out.println("Error!!!");
		 	    }
		 	   tIdSession.clear();
		    	tAnneeSession.clear();
		    	tNomSession.clear();
		    }

	    
   /**
	    @FXML
	    void AjouterGroupe(ActionEvent event) {

	    }

	    @FXML
	    void AjouterSession(ActionEvent event) throws Exception {
	 	    if(tIdSession.getText()!= null && tAnneeSession.getText()!= null && tNomSession.getText()!= null
	 	    		&& dateDebutSession.getValue()!= null && DateFinSession.getValue()!= null) {
	 	    	int id =Integer.parseInt(tIdSession.getText());
	 	    	int anne =Integer.parseInt(tAnneeSession.getText());
	 	    	Session session = new Session(id,anne,tNomSession.getText(),
	 	    			dateDebutSession.getValue(),DateFinSession.getValue());
	 	    	metier.AjouterSession(session);
	 	    	System.out.println("Succès!!!");
	 	    	
	 	    }
	 	    else{
	 	    	System.out.println("Error!!!");
	 	    }
	 	   tIdSession.clear();
	    	tAnneeSession.clear();
	    	tNomSession.clear();
	    }*/

	    @FXML
	    void AnnulerGroupe(ActionEvent event) {

	    }

	    @FXML
	    void AnnulerSession(ActionEvent event) {
	    	tIdSession.clear();
	    	tAnneeSession.clear();
	    	tNomSession.clear();
	    	//dateDebutSession.getValue().
	    	//DateFinSession.clear();

	    }

	    @FXML
	    void SupprimerGroupe(ActionEvent event) {

	    }

	    @FXML
	    void SupprimerSession(ActionEvent event) {
	    	

	    }

}
