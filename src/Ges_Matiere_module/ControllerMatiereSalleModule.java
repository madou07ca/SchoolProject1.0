package Ges_Matiere_module;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import coucheControler.Metier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import partieConsole.Matiere;
import partieConsole.Module;
import partieConsole.Salle;

public class ControllerMatiereSalleModule implements Initializable {
	
	
	Metier metier = new Metier();
	ObservableList<String> DispoList = FXCollections.observableArrayList("OUI","NON");
	ObservableList<Integer> listModule = FXCollections.observableArrayList(1,2,3,4,5);
	ObservableList<Matiere> matList = FXCollections.observableArrayList(metier.AfficherMatiere());
	//matList.addAll(metier.AfficherMatiere());
	
	
	
	@FXML
    private AnchorPane anchorPrincipale;

    @FXML
    private JFXTextField tIdSalle;

    @FXML
    private JFXTextField tNomSalle;

    @FXML
    private JFXTextField tCapaciteSalle;

    @FXML
    private JFXComboBox<String> cDispoSalle;

    @FXML
    private TableView<Salle> tViewSalle;
    
    @FXML
    private TableColumn<Salle, Integer> viewId; 

    @FXML
    private TableColumn<Salle, String> viewNom;

    @FXML
    private TableColumn<Salle, Integer> viewCapacite;

    @FXML
    private TableColumn<Salle, String> DispoView;

    @FXML
    private JFXButton ajoutSalle;

    @FXML
    private JFXButton annulerSalle;

    @FXML
    private JFXButton afficherSalle;

    @FXML
    private JFXTextField tSaisirCapaciteSalle;

    @FXML
    private JFXButton validerSalle;

    @FXML
    private TableView<Matiere> tViewMatiere;
    
    @FXML
    private TableColumn<Matiere, Integer> viewIdMat;

    @FXML
    private TableColumn<Matiere, String> viewNomMat;

    @FXML
    private TableColumn<Matiere, String> viewLibMat;

    @FXML
    private TableColumn<Matiere, String> viewLangMat;

    @FXML
    private TableColumn<Matiere, String> viewNivMat;

    @FXML
    private TableColumn<Matiere, String> viewHrMat;

    @FXML
    private TableColumn<Matiere, Integer> viewModuleMat;

    @FXML
    private JFXTextField tIdMatiere;

    @FXML
    private JFXTextField tNomMatiere;

    @FXML
    private JFXTextField tLibelleMatiere;

    @FXML
    private JFXTextField tLangueMatiere;

    @FXML
    private JFXTextField tNiveauMatiere;

    @FXML
    private JFXTextField tNbreHeures;

    @FXML
    private JFXComboBox<Integer> cMatiere;

    @FXML
    private JFXButton ajoutMatiere;

    @FXML
    private JFXButton annulerMatiere;

    @FXML
    private JFXButton SupMatiere;

    @FXML
    private JFXButton AfficherMatiere;

    @FXML
    private JFXTextField tSupMatiere;

    @FXML
    private JFXTextField tIdModule;

    @FXML
    private JFXTextField tNomModule;

    @FXML
    private JFXButton ajoutModule;

    @FXML
    private JFXButton annulerModule;
    
    
    
    public AnchorPane getAnchorPrincipale() {
		return anchorPrincipale;
	}

	public void setAnchorPrincipale(AnchorPane anchorPrincipale) {
		this.anchorPrincipale = anchorPrincipale;
	}

	public JFXTextField gettIdSalle() {
		return tIdSalle;
	}

	public void settIdSalle(JFXTextField tIdSalle) {
		this.tIdSalle = tIdSalle;
	}

	public JFXTextField gettNomSalle() {
		return tNomSalle;
	}

	public void settNomSalle(JFXTextField tNomSalle) {
		this.tNomSalle = tNomSalle;
	}

	public JFXTextField gettCapaciteSalle() {
		return tCapaciteSalle;
	}

	public void settCapaciteSalle(JFXTextField tCapaciteSalle) {
		this.tCapaciteSalle = tCapaciteSalle;
	}

	public JFXComboBox<String> getcDispoSalle() {
		return cDispoSalle;
	}

	public void setcDispoSalle(JFXComboBox<String> cDispoSalle) {
		this.cDispoSalle = cDispoSalle;
	}

	public TableView<Salle> gettViewSalle() {
		return tViewSalle;
	}

	public void settViewSalle(TableView<Salle> tViewSalle) {
		this.tViewSalle = tViewSalle;
	}

	public JFXButton getAjoutSalle() {
		return ajoutSalle;
	}

	public void setAjoutSalle(JFXButton ajoutSalle) {
		this.ajoutSalle = ajoutSalle;
	}

	public JFXButton getAnnulerSalle() {
		return annulerSalle;
	}

	public void setAnnulerSalle(JFXButton annulerSalle) {
		this.annulerSalle = annulerSalle;
	}

	public JFXButton getAfficherSalle() {
		return afficherSalle;
	}

	public void setAfficherSalle(JFXButton afficherSalle) {
		this.afficherSalle = afficherSalle;
	}

	public JFXTextField gettSaisirCapaciteSalle() {
		return tSaisirCapaciteSalle;
	}

	public void settSaisirCapaciteSalle(JFXTextField tSaisirCapaciteSalle) {
		this.tSaisirCapaciteSalle = tSaisirCapaciteSalle;
	}

	public JFXButton getValiderSalle() {
		return validerSalle;
	}

	public void setValiderSalle(JFXButton validerSalle) {
		this.validerSalle = validerSalle;
	}

	public TableView<?> gettViewMatiere() {
		return tViewMatiere;
	}

	public void settViewMatiere(TableView<Matiere> tViewMatiere) {
		this.tViewMatiere = tViewMatiere;
	}

	public JFXTextField gettIdMatiere() {
		return tIdMatiere;
	}

	public void settIdMatiere(JFXTextField tIdMatiere) {
		this.tIdMatiere = tIdMatiere;
	}

	public JFXTextField gettNomMatiere() {
		return tNomMatiere;
	}

	public void settNomMatiere(JFXTextField tNomMatiere) {
		this.tNomMatiere = tNomMatiere;
	}

	public JFXTextField gettLibelleMatiere() {
		return tLibelleMatiere;
	}

	public void settLibelleMatiere(JFXTextField tLibelleMatiere) {
		this.tLibelleMatiere = tLibelleMatiere;
	}

	public JFXTextField gettLangueMatiere() {
		return tLangueMatiere;
	}

	public void settLangueMatiere(JFXTextField tLangueMatiere) {
		this.tLangueMatiere = tLangueMatiere;
	}

	public JFXTextField gettNiveauMatiere() {
		return tNiveauMatiere;
	}

	public void settNiveauMatiere(JFXTextField tNiveauMatiere) {
		this.tNiveauMatiere = tNiveauMatiere; 
	}

	public JFXTextField gettNbreHeures() {
		return tNbreHeures;
	}

	public void settNbreHeures(JFXTextField tNbreHeures) {
		this.tNbreHeures = tNbreHeures;
	}

	public JFXComboBox<?> getcMatiere() {
		return cMatiere;
	}

	public void setcMatiere(JFXComboBox<Integer> cMatiere) {
		this.cMatiere = cMatiere;
	}

	public JFXButton getAjoutMatiere() {
		return ajoutMatiere;
	}

	public void setAjoutMatiere(JFXButton ajoutMatiere) {
		this.ajoutMatiere = ajoutMatiere;
	}

	public JFXButton getAnnulerMatiere() {
		return annulerMatiere;
	}

	public void setAnnulerMatiere(JFXButton annulerMatiere) {
		this.annulerMatiere = annulerMatiere;
	}

	public JFXButton getSupMatiere() {
		return SupMatiere;
	}

	public void setSupMatiere(JFXButton supMatiere) {
		SupMatiere = supMatiere;
	}

	public JFXButton getAfficherMatiere() {
		return AfficherMatiere;
	}

	public void setAfficherMatiere(JFXButton afficherMatiere) {
		AfficherMatiere = afficherMatiere;
	}

	public JFXTextField gettSupMatiere() {
		return tSupMatiere;
	}

	public void settSupMatiere(JFXTextField tSupMatiere) {
		this.tSupMatiere = tSupMatiere;
	}

	public JFXTextField gettIdModule() {
		return tIdModule;
	}

	public void settIdModule(JFXTextField tIdModule) {
		this.tIdModule = tIdModule;
	}

	public JFXTextField gettNomModule() {
		return tNomModule;
	}

	public void settNomModule(JFXTextField tNomModule) {
		this.tNomModule = tNomModule;
	}

	public JFXButton getAjoutModule() {
		return ajoutModule;
	}

	public void setAjoutModule(JFXButton ajoutModule) {
		this.ajoutModule = ajoutModule;
	}

	public JFXButton getAnnulerModule() {
		return annulerModule;
	}

	public void setAnnulerModule(JFXButton annulerModule) {
		this.annulerModule = annulerModule;
	}

	@FXML
    void AfficherMatiere(ActionEvent event) {
		
    	viewIdMat.setCellValueFactory(new PropertyValueFactory<>("idMatiere"));
    	viewNomMat.setCellValueFactory(new PropertyValueFactory<>("nomMatiere"));
    	viewLibMat.setCellValueFactory(new PropertyValueFactory<>(" libelleMatiere"));
    	viewLangMat.setCellValueFactory(new PropertyValueFactory<>("langLibelleMatiere"));
    	viewNivMat.setCellValueFactory(new PropertyValueFactory<>("nivMatiere"));
    	viewHrMat.setCellValueFactory(new PropertyValueFactory<>("nbreHeures"));
    	viewModuleMat.setCellValueFactory(new PropertyValueFactory<>("module"));
    	
    	tViewMatiere.setItems(matList);

    }

    @FXML
    void AfficherSalle(ActionEvent event) {
    	ObservableList<Salle> salleList = FXCollections.observableArrayList();
    	
    	
    	
    	viewId.setCellValueFactory(new PropertyValueFactory<>(""));
    	viewNom.setCellValueFactory(new PropertyValueFactory<>(""));
    	viewCapacite.setCellValueFactory(new PropertyValueFactory<>(""));
    	DispoView.setCellValueFactory(new PropertyValueFactory<>(""));
    	 tViewSalle.refresh();
    	 tViewSalle.setItems(salleList);
    	//***********************************
    	salleList.addAll(metier.AfficherSalle());
    	viewId.setCellValueFactory(new PropertyValueFactory<>("idSalle"));
    	viewNom.setCellValueFactory(new PropertyValueFactory<>("nomSalle"));
    	viewCapacite.setCellValueFactory(new PropertyValueFactory<>("capaciteSalle"));
    	DispoView.setCellValueFactory(new PropertyValueFactory<>("disponibiliteSalle"));
    	
    	tViewSalle.setItems(salleList);

    }

    @FXML
    void AjouterMatiere(ActionEvent event) {
      if(tIdMatiere.getText()!= null && tLibelleMatiere.getText()!= null && tLangueMatiere.getText()!= null
    		  && tNomMatiere.getText()!=null &&tNiveauMatiere.getText()!= null && tNbreHeures.getText()!=null && cMatiere.getValue()!= 0) {
    	int numModule =cMatiere.getValue();
    	int id =Integer.parseInt(tIdMatiere.getText());
    	  Matiere matiere = new Matiere (id, tNomMatiere.getText(),tLibelleMatiere.getText(),tLangueMatiere.getText(),
    			  tNiveauMatiere.getText(),tNbreHeures.getText())  ;
    	metier.AjouterMatiere(matiere, numModule);
    	System.out.println("Succès!!!");
      }
      else {
    	  System.out.println("Error!!!");
      }
      tIdMatiere.clear();
	    tNomMatiere.clear();
	    tLibelleMatiere.clear();
	    tLangueMatiere.clear();
	    tNiveauMatiere.clear();
	    tNbreHeures.clear();
      
    }

    @FXML
    void AjouterModule(ActionEvent event) {
    	int id=Integer.parseInt(tIdModule.getText());
    	String nom= tNomModule.getText();
    	Module module = new Module(id,nom);
    	metier.AjouterModule(module);
    	tNomModule.clear();
    	tIdModule.clear();

    }

    @FXML
    void AjouterSalle(ActionEvent event) {
    	int id=Integer.parseInt(tIdSalle.getText());
    	String nom= tNomSalle.getText();
    	int capacite =Integer.parseInt(tCapaciteSalle.getText());
    	if((tIdSalle.getText()!=null)&&(tNomSalle.getText()!=null)&&(tCapaciteSalle.getText()!= null)&&(cDispoSalle.getValue()!=null)) {
    		Salle salle = new Salle(id,nom,capacite,cDispoSalle.getValue());
    		metier.AjouterSalle(salle);
    		
    	}
    	tIdSalle.clear();
	    tNomSalle.clear();
	    tCapaciteSalle.clear();

    }

    @FXML
    void AnnulerMatiere(ActionEvent event) {
    	    tIdMatiere.clear();
    	    tNomMatiere.clear();
    	    tLibelleMatiere.clear();
    	    tLangueMatiere.clear();
    	    tNiveauMatiere.clear();
    	    tNbreHeures.clear();
    	    

    }

    @FXML
    void AnnulerModule(ActionEvent event) {
    	tNomModule.clear();
    	tIdModule.clear();

    }

    @FXML
    void AnnulerSalle(ActionEvent event) {
    	    tIdSalle.clear();
    	    tNomSalle.clear();
    	    tCapaciteSalle.clear();

    }

    @FXML
    void SupprimerMatiere(ActionEvent event) {
    	int id =Integer.parseInt(tSupMatiere.getText());
    	if(tSupMatiere.getText()!= null) {
    		metier.SuppridmerMatiere(id);
    	}
    	else {
    		System.out.println("Error de suppression verifier le champ!!!!");
    	}
    	tSupMatiere.clear();

    }
    
    
    @FXML
    void ValiderRechercheSalle(ActionEvent event) {
    	int capacite =Integer.parseInt(tSaisirCapaciteSalle.getText());
        ObservableList<Salle> ListFetch = FXCollections.observableArrayList(metier.ChercherSalle(capacite));
    	viewId.setCellValueFactory(new PropertyValueFactory<>("idSalle"));
    	viewNom.setCellValueFactory(new PropertyValueFactory<>("nomSalle"));
    	viewCapacite.setCellValueFactory(new PropertyValueFactory<>("capaciteSalle"));
    	DispoView.setCellValueFactory(new PropertyValueFactory<>("disponibiliteSalle"));
    	tViewSalle.setItems(ListFetch);
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tViewSalle.refresh();
		tViewSalle.setItems(null);
		cDispoSalle.setValue("OUI");
		cDispoSalle.setItems(DispoList);
		cMatiere.setItems(listModule);
		AfficherSalle(null);
		//cDispoSalle.getItems().addAll("OUI","NON");
		
	}

}
