<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création compte</title>
</head>
<body>

	<h1>Test de connexion</h1>

	<form action="<%=request.getContextPath()%>/CreationUtilisateur" method="post">
	
		<label for="idNom">Nom : </label><input type="text" id="idNom" name="nom" value=""/>
		<br/>
		<label for="idPrenom">Prénom : </label><input type="text" id="idPrenom" name="prenom" value=""/>
		<br/>
		<input type="submit" value="Valider"/>
	</form>

	<h1>Création d'un nouvel utilisateur</h1>

		<div>
		<form method="post" action="<%=request.getContextPath()%>/CreationUtilisateur">
		
			<div> 
				<div>
				
					<div>
					<label for="pseudo">Pseudo* : </label>
		            <input type="text" placeholder="pseudo" name="pseudo">
		            </div>
		            
		            <div>
		            <label for="prenom">Prénom* : </label>
		            <input type="text"  placeholder="Prénom" name="prenom">
		            </div>
		            
		            <div>
		            <label for="telephone">Téléphone : </label>
		            <input type="text" placeholder="0611223344" name="telephone">
		            </div>
		            
		            <div>
		            <label for="codepostal">Code postal* : </label>
		            <input type="text" placeholder="44000" name="codepostal">
		            </div>
		            
		            <div>
		            <label for="mdp">Mot de passe* : </label>
		            <input type="password" name="mdp">
		            </div>
	            
				</div>
				
				<div>
				
					<div>
					<label for="nom">Nom* : </label>
		            <input type="text" placeholder="Nom" name="nom">
		            </div>
		            
		            <div>
		            <label for="email">Email* : </label>
		            <input type="text"  placeholder="monemail@gmail.com" name="email">
		            </div>
		            
		            <div>
		            <label for="rue">Rue* : </label>
		            <input type="text" placeholder="rue de l'océan" name="rue">
		            </div>
		            
		            <div>
		            <label for="ville">Ville* : </label>
		            <input type="text" placeholder="Nantes" name="ville">
		            </div>
		            
		            <div>
		            <label for="confirmationMdp">Confirmation* : </label>
		            <input type="password" name="confirmationMdp">
		            </div>
	            
				</div>
			</div>	
			
			<div>
				<input type="submit" value="Créer" name="boutonCreer">	
				
				<a href="%=request.getContextPath()%>/Accueil"><input type="button" value="Annuler" name="boutonAnnuler"></a>			
			</div>
		
		</form>
		</div>
		
		
		<p>* : ces champs sont obligatoires.</p>


</body>
</html>