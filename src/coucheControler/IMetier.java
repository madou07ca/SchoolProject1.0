package coucheControler;

import java.util.List;

import partieConsole.Administrateur;
import partieConsole.Comptable;
import partieConsole.Enseignant;
import partieConsole.Etudiant;
import partieConsole.Groupe;
import partieConsole.Inscription;
import partieConsole.Matiere;
import partieConsole.Module;
import partieConsole.Notes_Etudiant;
import partieConsole.Salle;
import partieConsole.Secretaire;
import partieConsole.Session;

public interface IMetier {
 
	//************ETUDIANT**********************
	public void AjouterEtudiant(Etudiant e);
	public Etudiant ModifierEtudiant(Etudiant o, int numEtudiant);
	public void SupprimerEtudiant(int idEtudiant);
	public List<Etudiant> AfficherAllEtudiant();
	public List<Etudiant> RechercherEtudiantMC(String word);
	public Etudiant RechercherEtudiantMatricule(int matricule);
	//************ENSEIGNANT**********************
	
	public void AjouterEnseignant(Enseignant e);
	public Enseignant ModifierEnseignant(Enseignant o, int numEnseigant);
	public void SupprimerEnseignant(int numEnseignant);
	public List<Enseignant> AfficherAllEnseignant();
	public List<Enseignant> RechercherEnseignantMC(String word);
	public Enseignant RechercherEnseigantantMatricule(int matricule);
	
	//********************   COMPTABLE   ***********************
	
	public void AjouterComptable(Comptable e);
	public Comptable ModifierComptable(Comptable o);
	public List<Comptable> RechercherComptableMC(String word);
	public Comptable RechercherComptableMatricule(int matricule);
	public List<Comptable> AfficherAllComptable();
	public void SupprimerComptable(int numComptable);
	//public List<Comptable> AfficherComptable() ;
	
	//******************GESTION ADMINISTRATUER*******************
	
	public void AjouterAdministarteur(Administrateur e);
	public Administrateur ModifierAdmin(Administrateur o);
	public List<Administrateur> RechercherAdministrateurMC(String word);
	public Administrateur RechercherAdministrateurMatricule(int matricule);
	public void SupprimerAdministrateur(int numAdmin);
	public List<Administrateur> AfficherAllAdmin();
	//***************** GESTION DE SECRETAIRE  ******************
	
	public void AjouterSecretaire(Secretaire e);
	public Secretaire ModifierSecretaire(Secretaire o);
	public List<Secretaire> RechercherSecretaireMC(String word);
	public Secretaire RechercherSecretaireMatricule(int matricule);
	public List<Secretaire> AfficherAllSecretaire();
	public void SupprimerSecretaire(int numSecretaire);
	//***************** GESTION DES SALLES  ******************
	public void AjouterSalle(Salle e);
	public void SupprimerSalle(int id);
	public int CapaciteSalle(int id);
	public List <Salle> AfficherSalle();
	public List <Salle> ChercherSalle(int capacite);
	public List<Integer> ChargerSalle();
	//***************** GESTION DES SESSION  ******************
	public void AjouterSession(Session e);
	public void SupprimerSession(int id);
	public List <Session> AfficherSession();
	public List<Integer> ChargerSession();
	//***************** GESTION DES INSCRIPTIONS  ******************
	public void AjouterInscription(Inscription e,int idEtudiant, int idSession, int idGroupe, int idPaiement);
	public List<Inscription> AfficherInscription();
	//***************** GROUPE  ******************
	public List<Groupe> AfficherGroupe();
	public void AjouterGroupe(Groupe e, int idHoraire, int idSession, int idSalle, int idModule);
	public void SupprimerGroupe(int id);
	//***************** MATIERE  ******************
	public void AjouterMatiere(Matiere e, int numModule);
	public void SuppridmerMatiere(int id);
	public List<Matiere> AfficherMatiere();
	//***************** MODULE  ******************
	public void AjouterModule(Module e);
	public void SupprimerModule(int id);
	public List<Module> AfficherModule();
	public List<Integer> ChargerModule();
	//*************Gestion des notes****************
	public void AjouterNotes(Notes_Etudiant e, int idEtudiant, int idMatiere);
	public List <Notes_Etudiant> AfficherNotes();
	public Notes_Etudiant RechercheNotes(int idEtudiant);
	public Double MoyenneNotes (int idEtudiant);
	
	

}
