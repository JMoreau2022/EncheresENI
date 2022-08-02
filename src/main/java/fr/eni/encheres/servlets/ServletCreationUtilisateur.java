package fr.eni.encheres.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.encheres.dll.UtilisateurManager;
import fr.eni.encheres.messages.BusinessException;

/**
 * Servlet implementation class CreationUtilisateur
 */
@WebServlet("/CreationUtilisateur")
public class ServletCreationUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationUtilisateur() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/CreationUtilisateur.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		// recupération des paramêtres dans la requête
		String pseudo = request.getParameter("pseudo".trim());
		String nom = request.getParameter("nom".trim());
		String prenom = request.getParameter("prenom".trim());
		String email = request.getParameter("email".trim());
		String telephone = request.getParameter("telephone".trim());
		String rue = request.getParameter("rue".trim());
		String codePostal = request.getParameter("codepostal".trim());
		String ville = request.getParameter("ville".trim());
		String mdp = request.getParameter("mdp".trim());
		//String confMdp = request.getParameter("confirmationMdp".trim());
		
		
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		//utilisateurManager.ajouterUtilisateur();
		try {
			utilisateurManager.creationUtilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, mdp);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
