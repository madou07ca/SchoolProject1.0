package coucheControler;

import partieConsole.Etudiant;
import partieConsole.Inscription;
import partieConsole.Salle;
import partieConsole.Secretaire;
import partieConsole.Administrateur;
import partieConsole.Comptable;
import partieConsole.Enseignant;
import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import partieConsole.Etudiant;

public class Main {

	public static void main(String[] args) {

		Connection conn = ConnexionBD.getConnection();

		Metier metier = new Metier();
		// metier.AjouterEtudiant(new Etudiant (2, "DIALLO", "Thierno Souleymane",
		// "Homme", null, "Pita Timbi Madina", "Licence 3", "Miage", "Etudiant", "Java",
		// "Peulh","Français", "0783058507", "thierno@gmail.com", "Paris"));
		Date date1 = null;
		// metier.AjouterEnseignant(new Enseignant (3, "Ikram", "Ikram", "M", null,
		// "France à Paris", "Docteur ", "Informatique", "Enseignant", "Java",
		// "Arabe","Français", "0645454578", "balbali.paris@gmail.com", "Pais "));
		// metier.AjouterComptable(new Comptable(1, "Presi", "Le President", "M", null,
		// "France à Paris", "Docteur ", "Comptabilité", "Enseignant", "Java",
		// "Fraçais","Français", "0645454578", "president@gmail.com", "Pais "));

		// metier.AjouterEnseignant(new Enseignant (2, "BOBO MAMADOU", "BARRY", "M",
		// null, "France à Paris", "Docteur ", "Informatique", "Enseignant", "Java",
		// "Arabe","Français", "0645454578", "mamadou.paris@gmail.com","Evry"));
		List<Etudiant> maList = metier.AfficherAllEtudiant();

		for (Etudiant e : maList) {
			System.out.println("Adresse Etudiant : " + e.getAdresseIndividu() + "Mail : " + e.getMail());
		}

		List<Enseignant> lists = metier.AfficherAllEnseignant();

		for (Enseignant e : lists) {
			System.out.println("Adresse Enseignant : " + e.getAdresseIndividu() + "Mail : " + e.getMail());
		}
		System.out.println("Enseignant par mot clé");
		List<Enseignant> listes = metier.RechercherEnseignantMC("a");

		for (Enseignant e : listes) {
			System.out.println(e.toString());
			// System.out.println("Adresse Enseignant : "+e.getAdresseIndividu() + "Mail : "
			// +e.getMail());

		}
		System.out.println("Etudiant par mot clé");
		List<Etudiant> listees = metier.RechercherEtudiantMC("a");

		for (Etudiant ee : listees) {
			System.out.println(ee.toString());

		}
		System.out.println("Etudiant par mat");
		Etudiant etud = metier.RechercherEtudiantMatricule(1);
		System.out.println(etud.toString());
		// ****************************
		System.out.println("Enseignant par mat");
		Enseignant ensei = metier.RechercherEnseigantantMatricule(2);
		System.out.println(ensei.toString());
		// **************Test pour le Comptable******************************
		System.out.println("Comptable par mot clé");
		List<Comptable> listComptable = metier.RechercherComptableMC("p");

		for (Comptable comp : listComptable) {
			System.out.println(comp.toString());

		}
		/*
		 * System.out.println("Comptable par mat"); Comptable comp =
		 * metier.RechercherComptableMatricule(1); System.out.println(comp.toString());
		 * //**************Test pour la Secretaire******************************
		 * //metier.AjouterSecretaire(new Secretaire (2, "Marie", "Sow", "M", null,
		 * "France à Paris", "Docteur ", "Informatique", "Saisie", "Java",
		 * "Arabe","Français", "0645454578", "marie.paris@gmail.com","Evry"));
		 * 
		 * System.out.println("Secretaire par mot clé"); List<Secretaire > listsec =
		 * metier.RechercherSecretaireMC("m");
		 * 
		 * for(Secretaire sec: listsec) { System.out.println(sec.toString());
		 * 
		 * } System.out.println("Secretaire par mat"); Secretaire sec =
		 * metier.RechercherSecretaireMatricule(1); System.out.println(sec.toString());
		 * //**************Test pour l'Administrateur******************************
		 * //metier.AjouterAdministarteur(new Administrateur (1, "Root", "Root", "M",
		 * null, "France à Paris", "Docteur ", "Informatique", "Saisie", "Java",
		 * "Arabe","Français", "0645454578", "marie.paris@gmail.com","Evry"));
		 * 
		 * System.out.println("Administrateur par mot clé"); List <Administrateur >
		 * listadmin = metier.RechercherAdministrateurMC("o");
		 * 
		 * for(Administrateur ad: listadmin) { System.out.println(ad.toString());
		 * 
		 * } System.out.println("Administrateur par mat"); Administrateur ad =
		 * metier.RechercherAdministrateurMatricule(1);
		 * System.out.println(ad.toString());
		 */
		// **************Test pour la Salle******************************
		/*
		 * metier.AjouterSalle(new Salle (1, "Amphi", 170, "oui"));
		 * metier.AjouterSalle(new Salle (2, "Amphi", 150, "oui"));
		 * metier.AjouterSalle(new Salle (3, "Amphi", 130, "non"));
		 */
		// List <Salle> listsalle = metier.SupprimerSalle(1);
		// metier.SupprimerSalle(2);
		// System.out.println(metier.CapaciteSalle(2));

		List<Salle> maListe = metier.AfficherSalle();

		for (Salle e : maListe) {
			System.out.println(e.toString());
		}
		
		/*Inscription inscris = new Inscription(idInscris,null,id,idGroupe,pay,idSession);
		metier.AjouterInscription(inscris, id,idGroupe,pay,idSession);
		//m.AjouterInscription(inscris, id, 10, 201801, pay);
		System.out.println("Ajouter");*/

	}

}