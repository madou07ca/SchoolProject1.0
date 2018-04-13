package coucheControler;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import partieConsole.Administrateur;
import partieConsole.Comptable;
import partieConsole.Enseignant;
import partieConsole.Etudiant;
import partieConsole.Groupe;
import partieConsole.Horaire;
import partieConsole.Inscription;
import partieConsole.Matiere;
import partieConsole.Module;
import partieConsole.Notes_Etudiant;
import partieConsole.Paiement;
import partieConsole.Salle;
import partieConsole.Secretaire;
import partieConsole.Session;

public class Metier implements IMetier {
	List<Etudiant> listEtudiant = new ArrayList<>();
	List<Enseignant> listEnseignant = new ArrayList<>();
	List<Comptable> listComptable = new ArrayList<>();
	List<Administrateur> listAdmin = new ArrayList<>();
	List<Secretaire> listSecretaire = new ArrayList<>();
	List<Salle> listSalle = new ArrayList<>();
	List<Session> listSession = new ArrayList<>();
	List<Inscription> listInscris = new ArrayList<>();
	List<Groupe> listGroupe = new ArrayList<>();
	List<Matiere> listMatiere = new ArrayList<>();
	List<Module> listModule = new ArrayList<>();
	List<Notes_Etudiant> listNotes = new ArrayList<>();

	@Override
	public void AjouterEtudiant(Etudiant e) {
		// Connection conn = ConnexionBD.getConnexion();
		PreparedStatement ps = null;
		String insert = "insert into etudiant(ID_Etudiant,Nom_Etudiant,Prenom_Etudiant,Genre,Date_Naissance,Lieu_Naissance,Niveau,Domaine,Profil,Competence,Lang_Maternelle,Lang_Parlee,Telephone,Email,Adresse_Etudiant) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			ps = ConnexionBD.getConnection().prepareStatement(insert);

			ps.setInt(1, e.getIdIndividu());
			ps.setString(2, e.getNomIndividu());
			ps.setString(3, e.getPrenomIndividu());
			ps.setString(4, e.getGenreIndividu());
			ps.setDate(5, e.getDateNaissIndividu());
			ps.setString(6, e.getLieuNaissIndividu());
			ps.setString(7, e.getNiveauIndividu());
			ps.setString(8, e.getDomEtudeIndividu());
			ps.setString(9, e.getProfilIndividu());
			ps.setString(10, e.getDomCompetenceIndividu());
			ps.setString(11, e.getLangMaternelleIndividu());
			ps.setString(12, e.getLangParleIndividu());
			ps.setString(13, e.getNumTel());
			ps.setString(14, e.getMail());
			ps.setString(15, e.getAdresseIndividu());
			ps.executeUpdate();
			ps.close();
			listEtudiant.add(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Etudiant> AfficherAllEtudiant() {
		Connection conn = ConnexionBD.getConnection();
		List<Etudiant> listes = new ArrayList<Etudiant>();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from etudiant");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Etudiant e = new Etudiant();
				e.setIdIndividu(res.getInt("ID_Etudiant"));
				e.setNomIndividu(res.getString("Nom_Etudiant"));
				e.setPrenomIndividu(res.getString("Prenom_Etudiant"));
				e.setGenreIndividu(res.getString("Genre"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau"));
				e.setDomCompetenceIndividu(res.getString("Domaine"));
				e.setProfilIndividu(res.getString("Profil"));
				e.setDomCompetenceIndividu(res.getString("Competence"));
				e.setLangMaternelleIndividu(res.getString("Lang_Maternelle"));
				e.setLangParleIndividu(res.getString("Lang_Parlee"));
				e.setNumTel(res.getString("Telephone"));
				e.setMail(res.getString("Email"));
				;
				e.setAdresseIndividu(res.getString("Adresse_Etudiant"));
				listes.add(e);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listes;
	}

	@Override
	public Etudiant ModifierEtudiant(Etudiant o, int numEtudiant) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("UPDATE Etudiant SET ID_Etudiant = ?, Nom_Etudiant = ?, Prenom_Etudiant = ?,"
							+ "Genre = ?, Date_Naissance = ?, Lieu_Naissance = ?, Niveau = ?, Domaine = ?,"
							+ "Profil = ?, Competence = ?, Lang_Maternelle = ?, Lang_Parlee = ?, "
							+ "Telephone = ?, Email = ?, Adresse_Etudiant = ?");
			for (Etudiant e : listEtudiant) {
				if (e.getIdIndividu() == o.getIdIndividu()) {
					e.setIdIndividu(o.getIdIndividu());
					e.setNomIndividu(o.getNomIndividu());
					e.setPrenomIndividu(o.getPrenomIndividu());
					e.setGenreIndividu(o.getGenreIndividu());
					e.setDateNaissIndividu(o.getDateNaissIndividu());
					e.setNiveauIndividu(o.getNiveauIndividu());
					e.setDomEtudeIndividu(o.getDomEtudeIndividu());
					e.setPrenomIndividu(o.getProfilIndividu());
					e.setDomCompetenceIndividu(o.getDomCompetenceIndividu());
					e.setLangMaternelleIndividu(o.getLangMaternelleIndividu());
					e.setNumTel(o.getNumTel());
					e.setMail(o.getMail());
					e.setAdresseIndividu(o.getAdresseIndividu());
				}
				return e;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void SupprimerEtudiant(int idEtudiant) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete *from Etudiant where ID_Etudiant = ?");
			ps.setInt(1, idEtudiant);
			for (Etudiant e : listEtudiant) {
				if (e.getIdIndividu() == idEtudiant) {
					listEtudiant.remove(e);
					System.out.println("Etudiant supprimé avec succès");
				} else
					System.out.println("Sorry , id not exist !!!");
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Etudiant> RechercherEtudiantMC(String word) {
		List<Etudiant> listEtudiant = new ArrayList<>();
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from etudiant where Nom_Etudiant like ?");
			ps.setString(1, "%" + word + "%");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Etudiant e = new Etudiant();
				e.setIdIndividu(res.getInt("ID_Etudiant"));
				e.setNomIndividu(res.getString("Nom_Etudiant"));
				e.setPrenomIndividu(res.getString("Prenom_Etudiant"));
				e.setGenreIndividu(res.getString("Genre"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau"));
				e.setDomCompetenceIndividu(res.getString("Domaine"));
				e.setProfilIndividu(res.getString("Profil"));
				e.setDomCompetenceIndividu(res.getString("Competence"));
				e.setLangMaternelleIndividu(res.getString("Lang_Maternelle"));
				e.setLangParleIndividu(res.getString("Lang_Parlee"));
				e.setNumTel(res.getString("Telephone"));
				e.setMail(res.getString("Email"));
				;
				e.setAdresseIndividu(res.getString("Adresse_Etudiant"));
				listEtudiant.add(e);

			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listEtudiant;
	}

	@Override
	public Etudiant RechercherEtudiantMatricule(int matricule) {
		// List <Etudiant> listEtudiant = new ArrayList<>();
		Etudiant e = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from etudiant where ID_Etudiant = ?");
			ps.setInt(1, matricule);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				e = new Etudiant();
				e.setIdIndividu(res.getInt("ID_Etudiant"));
				e.setNomIndividu(res.getString("Nom_Etudiant"));
				e.setPrenomIndividu(res.getString("Prenom_Etudiant"));
				e.setGenreIndividu(res.getString("Genre"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau"));
				e.setDomCompetenceIndividu(res.getString("Domaine"));
				e.setProfilIndividu(res.getString("Profil"));
				e.setDomCompetenceIndividu(res.getString("Competence"));
				e.setLangMaternelleIndividu(res.getString("Lang_Maternelle"));
				e.setLangParleIndividu(res.getString("Lang_Parlee"));
				e.setNumTel(res.getString("Telephone"));
				e.setMail(res.getString("Email"));
				;
				e.setAdresseIndividu(res.getString("Adresse_Etudiant"));

			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;
	}

	// ------------------------- GESTION ENSEIGNANT ---------------------

	@Override
	public void AjouterEnseignant(Enseignant e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("insert into enseignant values (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?);");

			ps.setInt(1, e.getIdIndividu());
			ps.setString(2, e.getNomIndividu());
			ps.setString(3, e.getPrenomIndividu());
			ps.setString(4, e.getGenreIndividu());
			ps.setDate(5, e.getDateNaissIndividu());
			ps.setString(6, e.getLieuNaissIndividu());
			ps.setString(7, e.getNiveauIndividu());
			ps.setString(8, e.getDomEtudeIndividu());
			ps.setString(9, e.getProfilIndividu());
			ps.setString(10, e.getDomCompetenceIndividu());
			ps.setString(11, e.getLangMaternelleIndividu());
			ps.setString(12, e.getLangParleIndividu());
			ps.setString(13, e.getNumTel());
			ps.setString(14, e.getMail());
			ps.setString(15, e.getAdresseIndividu());

			ps.executeUpdate();
			ps.close();
			listEnseignant.add(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Enseignant> AfficherAllEnseignant() {
		Connection conn = ConnexionBD.getConnection();

		List<Enseignant> maList = new ArrayList<Enseignant>();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from enseignant");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Enseignant e = new Enseignant();
				e.setIdIndividu(res.getInt("ID_Enseignant"));
				e.setNomIndividu(res.getString("Nom_Enseignant"));
				e.setPrenomIndividu(res.getString("Prenom_Enseignant"));
				e.setGenreIndividu(res.getString("Genre_Enseignant"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Enseignant"));
				e.setDomEtudeIndividu(res.getString("Domaine_Enseignant"));
				e.setProfilIndividu(res.getString("Profil_Enseignant"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Email"));
				e.setAdresseIndividu(res.getString("Adresse_Enseignant"));

				maList.add(e);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return maList;
	}

	@Override
	public Enseignant ModifierEnseignant(Enseignant o, int numEnseigant) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(
					"UPDATE Enseignant SET ID_Enseignant = ?, Nom_Enseignant = ?, Prenom_Enseignant = ?,"
							+ "Genre_Enseignant = ?, Date_Naissance = ?, Lieu_Naissance = ?, Niveau-Enseignant = ?, Domaine_Enseignant = ?,"
							+ "Profil_Enseignant = ?, Domaine_Competence = ?, Lang_Maternelle = ?, Lang_Parlee = ?, "
							+ "Numero_Telephone = ?, Email = ?, Adresse_Enseignant = ?");
			for (Enseignant e : listEnseignant) {
				if (e.getIdIndividu() == o.getIdIndividu()) {
					e.setIdIndividu(o.getIdIndividu());
					e.setNomIndividu(o.getNomIndividu());
					e.setPrenomIndividu(o.getPrenomIndividu());
					e.setGenreIndividu(o.getGenreIndividu());
					e.setDateNaissIndividu(o.getDateNaissIndividu());
					e.setNiveauIndividu(o.getNiveauIndividu());
					e.setDomEtudeIndividu(o.getDomEtudeIndividu());
					e.setPrenomIndividu(o.getProfilIndividu());
					e.setDomCompetenceIndividu(o.getDomCompetenceIndividu());
					e.setLangMaternelleIndividu(o.getLangMaternelleIndividu());
					e.setNumTel(o.getNumTel());
					e.setMail(o.getMail());
					e.setAdresseIndividu(o.getAdresseIndividu());
				}
				return e;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void SupprimerEnseignant(int numEnseignant) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete *from Enseignant where ID_Enseignant = ?");
			ps.setInt(1, numEnseignant);
			for (Enseignant e : listEnseignant) {
				if (e.getIdIndividu() == numEnseignant) {
					listEnseignant.remove(e);
					System.out.println("Enseignant supprimé avec succès");
				} else
					System.out.println("Sorry , id not exist !!!");
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Enseignant> RechercherEnseignantMC(String word) {
		List<Enseignant> listes = new ArrayList<>();
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from enseignant where Nom_Enseignant like ?");
			ps.setString(1, "%" + word + "%");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Enseignant e = new Enseignant();
				e.setIdIndividu(res.getInt("ID_Enseignant"));
				e.setNomIndividu(res.getString("Nom_Enseignant"));
				e.setPrenomIndividu(res.getString("Prenom_Enseignant"));
				e.setGenreIndividu(res.getString("Genre_Enseignant"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Enseignant"));
				e.setDomEtudeIndividu(res.getString("Domaine_Enseignant"));
				e.setProfilIndividu(res.getString("Profil_Enseignant"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Email"));
				e.setAdresseIndividu(res.getString("Adresse_Enseignant"));
				listes.add(e);

			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listes;
	}

	@Override
	public Enseignant RechercherEnseigantantMatricule(int matricule) {
		Enseignant e = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from enseignant where ID_Enseignant = ?");
			ps.setInt(1, matricule);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				e = new Enseignant();
				e.setIdIndividu(res.getInt("ID_Enseignant"));
				e.setNomIndividu(res.getString("Nom_Enseignant"));
				e.setPrenomIndividu(res.getString("Prenom_Enseignant"));
				e.setGenreIndividu(res.getString("Genre_Enseignant"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Enseignant"));
				e.setDomEtudeIndividu(res.getString("Domaine_Enseignant"));
				e.setProfilIndividu(res.getString("Profil_Enseignant"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Email"));
				e.setAdresseIndividu(res.getString("Adresse_Enseignant"));

			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;
	}

	// ************** GESTION DU COMPTABLE ***********************

	@Override
	public void AjouterComptable(Comptable e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("insert into comptable values (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?);");

			ps.setInt(1, e.getIdIndividu());
			ps.setString(2, e.getNomIndividu());
			ps.setString(3, e.getPrenomIndividu());
			ps.setString(4, e.getGenreIndividu());
			ps.setDate(5, e.getDateNaissIndividu());
			ps.setString(6, e.getLieuNaissIndividu());
			ps.setString(7, e.getNiveauIndividu());
			ps.setString(8, e.getDomEtudeIndividu());
			ps.setString(9, e.getProfilIndividu());
			ps.setString(10, e.getDomCompetenceIndividu());
			ps.setString(11, e.getLangMaternelleIndividu());
			ps.setString(12, e.getLangParleIndividu());
			ps.setString(13, e.getNumTel());
			ps.setString(14, e.getMail());
			ps.setString(15, e.getAdresseIndividu());

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public List<Comptable> RechercherComptableMC(String word) {
		List<Comptable> listes = new ArrayList<>();
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from comptable where Nom_Comptable like ?");
			ps.setString(1, "%" + word + "%");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Comptable e = new Comptable();
				e.setIdIndividu(res.getInt("ID_Comptable"));
				e.setNomIndividu(res.getString("Nom_Comptable"));
				e.setPrenomIndividu(res.getString("Prenom_Comptable"));
				e.setGenreIndividu(res.getString("Genre_Comptable"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Comptable"));
				e.setDomEtudeIndividu(res.getString("Domaine_Comptable"));
				e.setProfilIndividu(res.getString("Profil_Comptable"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Adresse_Email"));
				e.setAdresseIndividu(res.getString("Adresse_Comptable"));
				listes.add(e);

			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listes;
	}

	@Override
	public Comptable RechercherComptableMatricule(int matricule) {
		Comptable e = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from comptable where ID_Comptable = ?");
			ps.setInt(1, matricule);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				e = new Comptable();
				e.setIdIndividu(res.getInt("ID_Comptable"));
				e.setNomIndividu(res.getString("Nom_Comptable"));
				e.setPrenomIndividu(res.getString("Prenom_Comptable"));
				e.setGenreIndividu(res.getString("Genre_Comptable"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Comptable"));
				e.setDomEtudeIndividu(res.getString("Domaine_Comptable"));
				e.setProfilIndividu(res.getString("Profil_Comptable"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Adresse_Email"));
				e.setAdresseIndividu(res.getString("Adresse_Comptable"));

			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;

	}

	public List<Comptable> AfficherAllComptable() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from Comptable");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Comptable e = new Comptable();
				e.setIdIndividu(res.getInt("ID_Comptable"));
				e.setNomIndividu(res.getString("Nom_Comptable"));
				e.setPrenomIndividu(res.getString("Prenom_Comptable"));
				e.setGenreIndividu(res.getString("Genre_Comptable"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Comptable"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Comptable"));
				e.setProfilIndividu(res.getString("Profil_Comptable"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangParleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Adresse_Email"));
				;
				e.setAdresseIndividu(res.getString("Adresse_Comptable"));
				listComptable.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listComptable;
	}

	public void SupprimerComptable(int numComptable) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete *from Comptable where ID_Comptable = ?");
			ps.setInt(1, numComptable);
			for (Comptable e : listComptable) {
				if (e.getIdIndividu() == numComptable) {
					listComptable.remove(e);
					System.out.println("Comptable supprimé avec succès");
				} else
					System.out.println("Sorry , id not exist !!!");
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Comptable ModifierComptable(Comptable o) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("UPDATE Comptable SET ID_Comptable = ?, Nom_Comptable = ?, Prenom_Comptable = ?,"
							+ "Genre_Comptable = ?, Date_Naissance = ?, Lieu_Naissance = ?, Niveau_Comptable = ?, Domaine_Comptable = ?,"
							+ "Profil_Comptable = ?, Domaine_Competence = ?, Lang_Maternelle = ?, Lang_Parlee = ?, "
							+ "Numero_Telephone = ?, Adresse_Email = ?, Adresse_Comptable = ?");
			for (Comptable e : listComptable) {
				if (e.getIdIndividu() == o.getIdIndividu()) {
					e.setIdIndividu(o.getIdIndividu());
					e.setNomIndividu(o.getNomIndividu());
					e.setPrenomIndividu(o.getPrenomIndividu());
					e.setGenreIndividu(o.getGenreIndividu());
					e.setDateNaissIndividu(o.getDateNaissIndividu());
					e.setNiveauIndividu(o.getNiveauIndividu());
					e.setDomEtudeIndividu(o.getDomEtudeIndividu());
					e.setPrenomIndividu(o.getProfilIndividu());
					e.setDomCompetenceIndividu(o.getDomCompetenceIndividu());
					e.setLangMaternelleIndividu(o.getLangMaternelleIndividu());
					e.setNumTel(o.getNumTel());
					e.setMail(o.getMail());
					e.setAdresseIndividu(o.getAdresseIndividu());
				}
				return e;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// ************** GESTION D'ADMINISTRATEUR *******************

	@Override

	public void AjouterAdministarteur(Administrateur e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(
					"insert into administrateur values (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?);");

			ps.setInt(1, e.getIdIndividu());
			ps.setString(2, e.getNomIndividu());
			ps.setString(3, e.getPrenomIndividu());
			ps.setString(4, e.getGenreIndividu());
			ps.setDate(5, e.getDateNaissIndividu());
			ps.setString(6, e.getLieuNaissIndividu());
			ps.setString(7, e.getNiveauIndividu());
			ps.setString(8, e.getDomEtudeIndividu());
			ps.setString(9, e.getProfilIndividu());
			ps.setString(10, e.getDomCompetenceIndividu());
			ps.setString(11, e.getLangMaternelleIndividu());
			ps.setString(12, e.getLangParleIndividu());
			ps.setString(13, e.getNumTel());
			ps.setString(14, e.getMail());
			ps.setString(15, e.getAdresseIndividu());

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public List<Administrateur> RechercherAdministrateurMC(String word) {
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from administrateur where Nom_Admin like ?");
			ps.setString(1, "%" + word + "%");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Administrateur e = new Administrateur();
				e.setIdIndividu(res.getInt("ID_Admin"));
				e.setNomIndividu(res.getString("Nom_Admin"));
				e.setPrenomIndividu(res.getString("Prenom_Admin"));
				e.setGenreIndividu(res.getString("Genre_Admin"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Admin"));
				e.setDomEtudeIndividu(res.getString("Domaine_Admin"));
				e.setProfilIndividu(res.getString("Profil_Admin"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Email"));
				e.setAdresseIndividu(res.getString("Adresse_Admin"));
				listAdmin.add(e);

			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listAdmin;

	}

	public Administrateur RechercherAdministrateurMatricule(int matricule) {
		Administrateur e = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from administrateur where ID_Admin = ?");
			ps.setInt(1, matricule);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				e = new Administrateur();
				e.setIdIndividu(res.getInt("ID_Admin"));
				e.setNomIndividu(res.getString("Nom_Admin"));
				e.setPrenomIndividu(res.getString("Prenom_Admin"));
				e.setGenreIndividu(res.getString("Genre_Admin"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Admin"));
				e.setDomEtudeIndividu(res.getString("Domaine_Admin"));
				e.setProfilIndividu(res.getString("Profil_Admin"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Email"));
				e.setAdresseIndividu(res.getString("Adresse_Admin"));

			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;

	}

	@Override
	public List<Administrateur> AfficherAllAdmin() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from Administrateur");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Administrateur e = new Administrateur();
				e.setIdIndividu(res.getInt("ID_Admin"));
				e.setNomIndividu(res.getString("Nom_Admin"));
				e.setPrenomIndividu(res.getString("Prenom_Admin"));
				e.setGenreIndividu(res.getString("Genre_Admin"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Admin"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Admin"));
				e.setProfilIndividu(res.getString("Profil_Admin"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangParleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Email"));
				;
				e.setAdresseIndividu(res.getString("Adresse_Admin"));
				listAdmin.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listAdmin;
	}

	@Override
	public void SupprimerAdministrateur(int numAdmin) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete *from Administrateur where ID_Admin = ?");
			ps.setInt(1, numAdmin);
			for (Administrateur e : listAdmin) {
				if (e.getIdIndividu() == numAdmin) {
					listAdmin.remove(e);
					System.out.println("Comptable supprimé avec succès");
				} else
					System.out.println("Sorry , id not exist !!!");
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Administrateur ModifierAdmin(Administrateur o) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("UPDATE Administrateur SET ID_Admin = ?, Nom_Admin = ?, Prenom_Admin = ?,"
							+ "Genre_Admin = ?, Date_Naissance = ?, Lieu_Naissance = ?, Niveau_Admin = ?, Domaine_Admin = ?,"
							+ "Profil_Admin = ?, Domaine_Competence = ?, Lang_Maternelle = ?, Lang_Parlee = ?, "
							+ "Numero_Telephone = ?, Email = ?, Adresse_Admin = ?");
			for (Administrateur e : listAdmin) {
				if (e.getIdIndividu() == o.getIdIndividu()) {
					e.setIdIndividu(o.getIdIndividu());
					e.setNomIndividu(o.getNomIndividu());
					e.setPrenomIndividu(o.getPrenomIndividu());
					e.setGenreIndividu(o.getGenreIndividu());
					e.setDateNaissIndividu(o.getDateNaissIndividu());
					e.setNiveauIndividu(o.getNiveauIndividu());
					e.setDomEtudeIndividu(o.getDomEtudeIndividu());
					e.setPrenomIndividu(o.getProfilIndividu());
					e.setDomCompetenceIndividu(o.getDomCompetenceIndividu());
					e.setLangMaternelleIndividu(o.getLangMaternelleIndividu());
					e.setNumTel(o.getNumTel());
					e.setMail(o.getMail());
					e.setAdresseIndividu(o.getAdresseIndividu());
				}
				return e;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// *********** GESTION DE SECRETAIRE ********************
	@Override

	public void AjouterSecretaire(Secretaire e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("insert into secretaire values (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?);");

			ps.setInt(1, e.getIdIndividu());
			ps.setString(2, e.getNomIndividu());
			ps.setString(3, e.getPrenomIndividu());
			ps.setString(4, e.getGenreIndividu());
			ps.setDate(5, e.getDateNaissIndividu());
			ps.setString(6, e.getLieuNaissIndividu());
			ps.setString(7, e.getNiveauIndividu());
			ps.setString(8, e.getDomEtudeIndividu());
			ps.setString(9, e.getProfilIndividu());
			ps.setString(10, e.getDomCompetenceIndividu());
			ps.setString(11, e.getLangMaternelleIndividu());
			ps.setString(12, e.getLangParleIndividu());
			ps.setString(13, e.getNumTel());
			ps.setString(14, e.getMail());
			ps.setString(15, e.getAdresseIndividu());

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public List<Secretaire> RechercherSecretaireMC(String word) {
		List<Secretaire> listes = new ArrayList<>();
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from secretaire where Nom_Secretaire like ?");
			ps.setString(1, "%" + word + "%");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Secretaire e = new Secretaire();
				e.setIdIndividu(res.getInt("ID_Secretaire"));
				e.setNomIndividu(res.getString("Nom_Secretaire"));
				e.setPrenomIndividu(res.getString("Prenom_Secretaire"));
				e.setGenreIndividu(res.getString("Genre_Secretaire"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Secretaire"));
				e.setDomEtudeIndividu(res.getString("Domaine_Secretaire"));
				e.setProfilIndividu(res.getString("Profil_Secretaire"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Adresse_Email"));
				e.setAdresseIndividu(res.getString("Adresse_Secretaire"));
				listes.add(e);

			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listes;

	}

	public Secretaire RechercherSecretaireMatricule(int matricule) {
		Secretaire e = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select * from Secretaire where ID_Secretaire = ?");
			ps.setInt(1, matricule);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				e = new Secretaire();
				e.setIdIndividu(res.getInt("ID_Secretaire"));
				e.setNomIndividu(res.getString("Nom_Secretaire"));
				e.setPrenomIndividu(res.getString("Prenom_Secretaire"));
				e.setGenreIndividu(res.getString("Genre_Secretaire"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Secretaire"));
				e.setDomEtudeIndividu(res.getString("Domaine_Secretaire"));
				e.setProfilIndividu(res.getString("Profil_Secretaire"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangMaternelleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Adresse_Email"));
				e.setAdresseIndividu(res.getString("Adresse_Secretaire"));

			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;
	}

	@Override
	public List<Secretaire> AfficherAllSecretaire() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from Secretaire");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Secretaire e = new Secretaire();
				e.setIdIndividu(res.getInt("ID_Secretaire"));
				e.setNomIndividu(res.getString("Nom_Secretaire"));
				e.setPrenomIndividu(res.getString("Prenom_Secretaire"));
				e.setGenreIndividu(res.getString("Genre_Secretaire"));
				e.setDateNaissIndividu(res.getDate("Date_Naissance"));
				e.setLieuNaissIndividu(res.getString("Lieu_Naissance"));
				e.setNiveauIndividu(res.getString("Niveau_Secretaire"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Secretaire"));
				e.setProfilIndividu(res.getString("Profil_Secretaire"));
				e.setDomCompetenceIndividu(res.getString("Domaine_Competence"));
				e.setLangMaternelleIndividu(res.getString("Langue_Maternelle"));
				e.setLangParleIndividu(res.getString("Langue_Parlee"));
				e.setNumTel(res.getString("Numero_Telephone"));
				e.setMail(res.getString("Adresse_Email"));
				;
				e.setAdresseIndividu(res.getString("Adresse_Secretaire"));
				listSecretaire.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listSecretaire;
	}

	@Override
	public void SupprimerSecretaire(int numSecretaire) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete *from Secretaire where ID_Secretaire = ?");
			ps.setInt(1, numSecretaire);
			for (Secretaire e : listSecretaire) {
				if (e.getIdIndividu() == numSecretaire) {
					listSecretaire.remove(e);
					System.out.println("Secretaire supprimé avec succès");
				} else
					System.out.println("Sorry , id not exist in the data base !!!");
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Secretaire ModifierSecretaire(Secretaire o) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(
					"UPDATE  Secretaire SET ID_Secretaire = ?, Nom_Secretaire = ?, Prenom_Secretaire = ?,"
							+ "Genre_Secretaire = ?, Date_Naissance = ?, Lieu_Naissance = ?, Niveau_Secretaire = ?, Domaine_Secretaire = ?,"
							+ "Profil_Secretaire = ?, Domaine_Competence = ?, Lang_Maternelle = ?, Lang_Parlee = ?, "
							+ "Numero_Telephone = ?, Adresse_Email = ?, Adresse_Secretaire = ?");
			for (Secretaire e : listSecretaire) {
				if (e.getIdIndividu() == o.getIdIndividu()) {
					e.setIdIndividu(o.getIdIndividu());
					e.setNomIndividu(o.getNomIndividu());
					e.setPrenomIndividu(o.getPrenomIndividu());
					e.setGenreIndividu(o.getGenreIndividu());
					e.setDateNaissIndividu(o.getDateNaissIndividu());
					e.setNiveauIndividu(o.getNiveauIndividu());
					e.setDomEtudeIndividu(o.getDomEtudeIndividu());
					e.setPrenomIndividu(o.getProfilIndividu());
					e.setDomCompetenceIndividu(o.getDomCompetenceIndividu());
					e.setLangMaternelleIndividu(o.getLangMaternelleIndividu());
					e.setNumTel(o.getNumTel());
					e.setMail(o.getMail());
					e.setAdresseIndividu(o.getAdresseIndividu());
				}
				return e;
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// **********************************GESTION DES
	// SALLES**********************************
	@Override
	public void AjouterSalle(Salle e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into salle values (?, ?, ?, ?);");

			ps.setInt(1, e.getIdSalle());
			ps.setString(2, e.getNomSalle());
			ps.setInt(3, e.getCapaciteSalle());
			ps.setString(4, e.getDisponibiliteSalle());
			ps.executeUpdate();
			listSalle.add(e);
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void SupprimerSalle(int id) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete  from salle where ID_Salle = ? ;");
			ps.setInt(1, id);
			for (Salle s : listSalle) {
				if (s.getIdSalle() == id) {
					listSalle.remove(s);
				} else {
					System.out.println("L'id renseigné ne correspond à aucune salle");
				}

			}
			ps.executeUpdate();
			System.out.println("Succès!!!");

			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public int CapaciteSalle(int id) {
		int capacite = 0;
		try {
			PreparedStatement ps = ConnexionBD.getConnection()
					.prepareStatement("select Capacite_Salle from salle where ID_Salle = ?");
			ps.setInt(1, id);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				// e = new Salle() ;
				capacite = res.getInt("Capacite_Salle");

			}
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return capacite;
	}

	@Override
	public List<Salle> AfficherSalle() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from salle");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Salle e = new Salle();
				e.setIdSalle(res.getInt("ID_Salle"));
				e.setNomSalle(res.getString("Nom_Salle"));
				e.setCapaciteSalle(res.getInt("Capacite_Salle"));
				e.setDisponibiliteSalle(res.getString("Disonibilite"));
				listSalle.add(e);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSalle;

	}
	
	public List<Integer> ChargerSalle()  {
		List <Integer> listsa = new ArrayList<>();
		Connection conn = ConnexionBD.getConnection();
		
		
			PreparedStatement ps;
			try {
				ps = conn.prepareStatement("Select * from salle");
			
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Salle e = new Salle();
				int id =res.getInt("ID_Salle");
				/*e.setNomSalle(res.getString("Nom_Salle"));
				e.setCapaciteSalle(res.getInt("Capacite_Salle"));
				e.setDisponibiliteSalle(res.getString("Disonibilite"));*/
				listsa.add(id);
			}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		
		

		return listsa;

	}

	@Override
	public List<Salle> ChercherSalle(int capacite) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from Salle where capacite_Salle >= ?");
			ps.setInt(1, capacite);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Salle s = new Salle();
				s.setIdSalle(res.getInt("ID_Salle"));
				s.setNomSalle(res.getString("Nom_Salle"));
				s.setCapaciteSalle(res.getInt("Capacite_Salle"));
				s.setDisponibiliteSalle(res.getString("Disonibilite"));
				listSalle.add(s);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listSalle;
	}

	// ********************************SESSION*********************************
	@Override
	public void AjouterSession(Session e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into sessions values (?, ?, ?, ? , ?);");

			ps.setInt(1, e.getIdSession());
			ps.setInt(2, e.getAnneeSession());
			ps.setString(3, e.getNomSession());
			ps.setDate(4, e.getDateDebutSession());
			ps.setDate(5, e.getDateFinSession());
			ps.executeUpdate();
			listSession.add(e);
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void SupprimerSession(int id) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Delete  from sessions where ID_Session = ? ;");
			ps.setInt(1, id);
			ps.executeUpdate();
			for (Session s : listSession) {
				if (s.getIdSession() == id) {
					listSession.remove(s);
					
					System.out.println("Succès!!!");
				} else {
					System.out.println("L'id renseigné ne correspond à aucune session");
				}
			}

			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Session> AfficherSession() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from sessions");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Session e = new Session();
				e.setIdSession(res.getInt("ID_Session"));
				e.setAnneeSession(res.getInt("ID_Annee"));
				e.setNomSession(res.getString("Nom_Session"));
				e.setDateDebutSession(res.getDate("Date_Debut_Session"));
				e.setDateFinSession(res.getDate("Date_Fin_Session"));
				listSession.add(e);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSession;

	}
	
	
	public List<Integer> ChargerSession() {
		List <Integer> listSes= new ArrayList<>();
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from sessions");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Session e = new Session();
				int id =res.getInt("ID_Session");
				
				listSes.add(id);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSes;

	}

	// ****************************INSCRIPTION******************************************
	@Override
	public void AjouterInscription(Inscription e, int idEtudiant, int idSession, int idGroupe, int idPaiement) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into inscription values (?, ?, ?, ?, ?, ?);");
			ps.setInt(1, e.getIdInscription());
			ps.setInt(2, idEtudiant);
			ps.setDate(6, (Date) e.getDateInscription());
			ps.setInt(4, idSession);
			ps.setInt(3, idGroupe);
			ps.setInt(5, idPaiement);
			ps.executeUpdate();
			listInscris.add(e);
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Inscription> AfficherInscription() {

		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from incription");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Inscription e = new Inscription();
				e.setIdInscription(res.getInt(1));
				int idEtudiant = res.getInt(2);
				e.setDateInscription(res.getDate(3));
				int idSession = res.getInt(4);
				int idGroupe = res.getInt(5);
				int idPaiement = res.getInt(6);
				PreparedStatement ps1 = conn.prepareStatement("select * from etudiant where ID_Etudiant =?");
				ps1.setInt(1, idEtudiant);
				ResultSet res1 = ps1.executeQuery();
				if (res1.next()) {
					Etudiant etude = new Etudiant();
					etude.setIdIndividu(res1.getInt(1));
					e.setEtudiant(etude);
					ps1.close();
				}
				PreparedStatement ps2 = conn.prepareStatement("select * from sessions where ID_Session =?");
				ps2.setInt(1, idSession);
				ResultSet res2 = ps2.executeQuery();
				if (res2.next()) {
					Session s = new Session();
					s.setIdSession(res2.getInt(1));
					e.setSession(s);
					ps2.close();
				}
				PreparedStatement ps3 = conn.prepareStatement("select * from groupe where ID_Groupe =?");
				ps3.setInt(1, idGroupe);
				ResultSet res3 = ps3.executeQuery();
				if (res3.next()) {
					Groupe g = new Groupe();
					g.setIdGroupe(res3.getInt(1));
					e.setGroupe(g);
					ps3.close();
				}
				PreparedStatement ps4 = conn.prepareStatement("select * from paiement where ID_Paiement =?");
				ps4.setInt(1, idPaiement);
				ResultSet res4 = ps4.executeQuery();
				if (res4.next()) {
					Paiement p = new Paiement();
					p.setIdpaiement(res4.getInt(1));
					e.setPaiement(p);
					ps4.close();
				}

				listInscris.add(e);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listInscris;
	}

	// *****************************Groupe********************

	public void AjouterGroupe(Groupe e, int idHoraire, int idSession, int idSalle, int idModule) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO groupe VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, e.getIdGroupe());
			ps.setString(2, e.getNomGroupe());
			ps.setDate(3, (Date) e.getDateExamen());
			ps.setInt(4, idHoraire);
			ps.setInt(5, idSession);
			ps.setInt(6, idSalle);
			ps.setInt(7, idModule);
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	// SUPPRIMER GROUPE
	public void SupprimerGroupe(int id) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete from Groupe where ID_Groupe = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
			for (Groupe g : listGroupe) {
				if (g.getIdGroupe() == id) {
					listGroupe.remove(g);
					System.out.println("Suppression effectué avec succès");
				} else
					System.out.println("Id inconnu , sorry !!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Groupe> AfficherGroupe() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from groupe");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Groupe g = new Groupe();
				g.setIdGroupe(res.getInt("ID_Groupe"));
				g.setNomGroupe(res.getString("Nom_Groupe"));
				int idHoraire = res.getInt("ID_Horaire");
				int idSession = res.getInt("ID_Session");
				int idSalle = res.getInt("ID_Salle");
				int idModule = res.getInt("ID_Module");
				PreparedStatement ps1 = conn.prepareStatement("Select * from horaire where ID_Horaire =" +idHoraire);
				//ps1.setInt(1, idHoraire);
				ResultSet res1 = ps1.executeQuery();
				if (res1.next()) {
					Horaire h = new Horaire();
					h.setIdHoraire(res1.getInt("ID_Horaire"));
					g.setHoraire(h);
				}
				PreparedStatement ps2 = conn.prepareStatement("Select * from sessions where ID_Session =" + idSession);
				//ps.setInt(1, idSession);
				ResultSet res2 = ps2.executeQuery();
				if (res2.next()) {
					Session s = new Session();
					s.setIdSession(res2.getInt("ID_Session"));
					g.setSession(s);
				}
				PreparedStatement ps3 = conn.prepareStatement("Select * from salle where ID_Salle =" + idSalle);
				//ps3.setInt(1, idSalle);
				ResultSet res3 = ps3.executeQuery();
				if (res3.next()) {
					Salle sal = new Salle();
					sal.setIdSalle(res3.getInt("ID_Salle"));
					g.setSalle(sal);
				}
				PreparedStatement ps4 = conn.prepareStatement("Select * from module where ID_Module = " + idModule);
				//ps4.setInt(1, idModule);
				ResultSet res4 = ps4.executeQuery();
				if (res4.next()) {
					Module mod = new Module();
					mod.setIdModule(res4.getInt("ID_Module"));
					g.setModule(mod);

				}
				listGroupe.add(g);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listGroupe;
	}

	// ****************** GESTION DE MATIERE ******************************

	@Override
	public void AjouterMatiere(Matiere e, int numModule) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Insert into matiere Values (?, ?, ?, ?, ?, ?) ;");
			ps.setInt(1, e.getIdMatiere());
			ps.setString(2, e.getNomMatiere());
			ps.setString(3, e.getLibelleMatiere());
			ps.setString(4, e.getLangLibelleMatiere());
			ps.setString(5, e.getNivMatiere());
			ps.setInt(6, numModule);
			ps.executeUpdate();

			ps.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void SuppridmerMatiere(int id) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete  from matiere where ID_Matiere = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
			for (Matiere m : listMatiere) {
				if (m.getIdMatiere() == id) {
					listMatiere.remove(m);
					
					System.out.println("Suppression effectué avec succès");
				} else
					System.out.println("Id inconnu , sorry !!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Matiere> AfficherMatiere() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from matiere ");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Matiere e = new Matiere();
				e.setIdMatiere(res.getInt("ID_Matiere"));
				e.setNomMatiere(res.getString("Nom_Matiere"));
				e.setLibelleMatiere(res.getString("Libele_Matiere"));
				e.setLangLibelleMatiere(res.getString("Lang_Libele_Matiere"));
				e.setNivMatiere(res.getString("Niveau_Matiere"));
				int idModule = res.getInt("ID_Module");
				PreparedStatement ps2 = conn.prepareStatement("Select * from module where ID_Module = " + idModule);

				//ps2.setInt(1, idModule);
				ResultSet res2 = ps2.executeQuery();
				if (res2.next()) {
					Module m = new Module();
					m.setIdModule(res2.getInt("ID_Module"));
					m.setLibeleModole(res2.getString("Libele_Module"));
					e.setModule(m);
					ps2.close();
				}
				listMatiere.add(e);
				
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listMatiere;

	}

	// ***************** GESTION DE MODULE ***********************************

	public void AjouterModule(Module e) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Module Values(?, ?)");
			ps.setInt(1, e.getIdModule());
			ps.setString(2, e.getLibeleModole());
			ps.executeUpdate();

			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void SupprimerModule(int id) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete * from Module where ID_Module = ? ;");
			ps.setInt(1, id);
			for (Module m : listModule) {
				if (m.getIdModule() == id) {
					listModule.remove(m);
					ps.executeUpdate();
					System.out.println("Succès!!!");
				} else {
					System.out.println("L'id renseigné ne correspond à aucune Module");
				}
			}

			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public List<Module> AfficherModule() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from module");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Module e = new Module();
				e.setIdModule(res.getInt("ID_Module"));
				e.setLibeleModole(res.getString("Libele_Module"));
				listModule.add(e);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listModule;
	}
	
	public List<Integer> ChargerModule() {
		List <Integer> listMod = new ArrayList<>();
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from module");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Module e = new Module();
				int id =res.getInt("ID_Module");
				
				listMod.add(id);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listMod;
	}

	// *******************************GESTIONS DES NOTES**********************
	@Override
	public void AjouterNotes(Notes_Etudiant e, int idEtudiant, int idMatiere) {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into note values (?, ?, ?);");

			ps.setInt(1, idEtudiant);
			ps.setInt(2, idMatiere);
			ps.setDouble(3, e.getNote());
			ps.executeUpdate();
			listNotes.add(e);
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Notes_Etudiant> AfficherNotes() {
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from note");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Notes_Etudiant e = new Notes_Etudiant();
				e.setNote(res.getDouble("Note"));
				int idEtudiant = res.getInt("ID_Etudiant");
				int idMatiere = res.getInt("ID_Matiere");
				PreparedStatement ps2 = conn.prepareStatement("Select * from Etudiant where ID_Etudiant = ?");

				ps2.setInt(1, idEtudiant);
				ResultSet res2 = ps2.executeQuery();
				if (res2.next()) {
					Etudiant m = new Etudiant();
					m.setIdIndividu(res2.getInt("ID_Etudiant"));
					e.setEtudiant(m);
				}

				PreparedStatement ps3 = conn.prepareStatement("Select * from Matiere where ID_Matiere = ?");

				ps2.setInt(1, idMatiere);
				ResultSet res3 = ps3.executeQuery();
				if (res3.next()) {
					Matiere m = new Matiere();
					m.setLibelleMatiere(res2.getString("Libele_Matiere"));
					e.setMatiere(m);
				}
				listNotes.add(e);
				ps2.close();
				ps3.close();
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listNotes;
	}

	@Override
	public Notes_Etudiant RechercheNotes(int idEtud) {
		Notes_Etudiant e = null;
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from note where ID_Etudiant = ?");
			ps.setInt(1, idEtud);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				e = new Notes_Etudiant();
				e.setNote(res.getDouble("Note"));
				int idEtudiant = res.getInt("ID_Etudiant");
				int idMatiere = res.getInt("ID_Matiere");
				PreparedStatement ps2 = conn.prepareStatement("Select * from Etudiant where ID_Etudiant = ?");

				ps2.setInt(1, idEtudiant);
				ResultSet res2 = ps2.executeQuery();
				if (res2.next()) {
					Etudiant m = new Etudiant();
					m.setIdIndividu(res2.getInt("ID_Etudiant"));
					e.setEtudiant(m);
				}

				PreparedStatement ps3 = conn.prepareStatement("Select * from Matiere where ID_Matiere = ?");

				ps2.setInt(1, idMatiere);
				ResultSet res3 = ps3.executeQuery();
				if (res3.next()) {
					Matiere m = new Matiere();
					m.setLibelleMatiere(res2.getString("Libele_Matiere"));
					e.setMatiere(m);
				}
				// listNotes.add(e) ;
				ps2.close();
				ps3.close();
			}
			ps.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

		return e;
	}

	@Override
	public Double MoyenneNotes(int idEtudiant) {
		Notes_Etudiant e = null;
		double somme = 0;
		int nbre = 0;
		Connection conn = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from note where ID_Etudiant = ?");
			ps.setInt(1, idEtudiant);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				e = new Notes_Etudiant();
				somme += res.getDouble("Note");
				nbre++;
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return (somme / nbre);

	}
}
