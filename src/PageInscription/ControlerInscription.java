package PageInscription;	
	import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

	public class ControlerInscription implements Initializable {
		
		ObservableList<Integer> groupeList = FXCollections.observableArrayList(1,2,3,4);
		ObservableList<Integer> sessionList = FXCollections.observableArrayList(1,2,3,4);

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private JFXButton bDeconnexion;

	    @FXML
	    private Label identifiant;

	    @FXML
	    private JFXTextField tIdentifiant;

	    @FXML
	    private Label date;

	    @FXML
	    private JFXTextField tDate;

	    @FXML
	    private Label groupe;

	    @FXML
	    private JFXComboBox<Integer> cGroupe;

	    @FXML
	    private Label session;

	    @FXML
	    private JFXComboBox<Integer> cSession;

	    @FXML
	    private Label Paiement;

	    @FXML
	    private JFXTextField tPaiement;

	    @FXML
	    private JFXButton bAnnuler;

	    @FXML
	    private JFXButton bValider;
	    

	    public ControlerInscription(ResourceBundle resources, URL location, JFXButton bDeconnexion, Label identifiant,
				JFXTextField tIdentifiant, Label date, JFXTextField tDate, Label groupe, JFXComboBox<Integer> cGroupe,
				Label session, JFXComboBox<Integer> cSession, Label paiement, JFXTextField tPaiement, JFXButton bAnnuler,
				JFXButton bValider) {
			super();
			this.resources = resources;
			this.location = location;
			this.bDeconnexion = bDeconnexion;
			this.identifiant = identifiant;
			this.tIdentifiant = tIdentifiant;
			this.date = date;
			this.tDate = tDate;
			this.groupe = groupe;
			this.cGroupe = cGroupe;
			this.session = session;
			this.cSession = cSession;
			Paiement = paiement;
			this.tPaiement = tPaiement;
			this.bAnnuler = bAnnuler;
			this.bValider = bValider;
		}

		public ResourceBundle getResources() {
			return resources;
		}

		public void setResources(ResourceBundle resources) {
			this.resources = resources;
		}

		public URL getLocation() {
			return location;
		}

		public void setLocation(URL location) {
			this.location = location;
		}

		public JFXButton getbDeconnexion() {
			return bDeconnexion;
		}

		public void setbDeconnexion(JFXButton bDeconnexion) {
			this.bDeconnexion = bDeconnexion;
		}

		public Label getIdentifiant() {
			return identifiant;
		}

		public void setIdentifiant(Label identifiant) {
			this.identifiant = identifiant;
		}

		public JFXTextField gettIdentifiant() {
			return tIdentifiant;
		}

		public void settIdentifiant(JFXTextField tIdentifiant) {
			this.tIdentifiant = tIdentifiant;
		}

		public Label getDate() {
			return date;
		}

		public void setDate(Label date) {
			this.date = date;
		}

		public JFXTextField gettDate() {
			return tDate;
		}

		public void settDate(JFXTextField tDate) {
			this.tDate = tDate;
		}

		public Label getGroupe() {
			return groupe;
		}

		public void setGroupe(Label groupe) {
			this.groupe = groupe;
		}

		public JFXComboBox<?> getcGroupe() {
			return cGroupe;
		}

		public void setcGroupe(JFXComboBox<Integer> cGroupe) {
			this.cGroupe = cGroupe;
		}

		public Label getSession() {
			return session;
		}

		public void setSession(Label session) {
			this.session = session;
		}

		public JFXComboBox<Integer> getcSession() {
			return cSession;
		}

		public void setcSession(JFXComboBox<Integer> cSession) {
			this.cSession = cSession;
		}

		public Label getPaiement() {
			return Paiement;
		}

		public void setPaiement(Label paiement) {
			Paiement = paiement;
		}

		public JFXTextField gettPaiement() {
			return tPaiement;
		}

		public void settPaiement(JFXTextField tPaiement) {
			this.tPaiement = tPaiement;
		}

		public JFXButton getbAnnuler() {
			return bAnnuler;
		}

		public void setbAnnuler(JFXButton bAnnuler) {
			this.bAnnuler = bAnnuler;
		}

		public JFXButton getbValider() {
			return bValider;
		}

		public void setbValider(JFXButton bValider) {
			this.bValider = bValider;
		}

		@FXML
	    void Annuler(ActionEvent event) {

	    }

	    @FXML
	    void seDeconnecter(ActionEvent event) {

	    }

	    @FXML
	    /*void initialize() {
	        assert bDeconnexion != null : "fx:id=\"bDeconnexion\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert identifiant != null : "fx:id=\"identifiant\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert tIdentifiant != null : "fx:id=\"tIdentifiant\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert tDate != null : "fx:id=\"tDate\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert groupe != null : "fx:id=\"groupe\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert cGroupe != null : "fx:id=\"cGroupe\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert session != null : "fx:id=\"session\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert cSession != null : "fx:id=\"cSession\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert Paiement != null : "fx:id=\"Paiement\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert tPaiement != null : "fx:id=\"tPaiement\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert bAnnuler != null : "fx:id=\"bAnnuler\" was not injected: check your FXML file 'ViewInscription.fxml'.";
	        assert bValider != null : "fx:id=\"bValider\" was not injected: check your FXML file 'ViewInscription.fxml'.";

	    }*/

		public void initialize() {
			cGroupe.setValue(1);
			cGroupe.setItems(groupeList);
			cSession.setValue(1);
			cSession.setItems(sessionList);
			
		}
		

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	}



