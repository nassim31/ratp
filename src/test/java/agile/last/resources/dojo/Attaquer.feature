Feature: F_03 Attaquer

	En tant que joueur, je veux pouvoir attaquer un adversaire jusqu'à ce qu'il soit hors d'état de nuire.

	Scenario: Nassim veut jouer au jeu contre un adversaire virtuel vivant.
	Given Nassim change arme
	When Nassim attaque ennemi
	Then Ennemi perd la vie
