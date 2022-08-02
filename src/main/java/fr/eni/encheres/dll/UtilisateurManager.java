package fr.eni.encheres.dll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.DAOFactory;
import fr.eni.encheres.dal.UtilisateurDAO;
import fr.eni.encheres.messages.BusinessException;
import fr.eni.javaee.encheres.bll.CodesResultatBLL;

public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public void ajouterUtilisateur() {
		this.utilisateurDAO.testConnexion();
		
	}
	
	/**
	 * Méthode de création d'un nouvelle utilisateur de la plateforme
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param mdp
	 * @throws BusinessException 
	 */
	public void creationUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String mdp) throws BusinessException {
		
		Utilisateur utilisateur = null;
		BusinessException be = new BusinessException(); 
		// la validation de tous les champs sera à faire ici
		
		validationNom(utilisateur, be);
		
		if (!be.hasErreurs()) {
		
		utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, mdp, 500, 0);
		this.utilisateurDAO.ajouterUtilisateur(utilisateur);
		}
		else
		{
			System.out.println("erreur : "+be.getMessage());
		}
	}
	
	private void validationNom(Utilisateur utilisateur, BusinessException be) {

		if (utilisateur.getNom() == null || utilisateur.getNom().isEmpty() || utilisateur.getNom().length() > 30) {
			be.ajouterErreur(CodesResultatBLL.USER_NOM_ERREUR);
		}
	}
	
	
}
