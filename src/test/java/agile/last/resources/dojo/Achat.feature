@tag
  Feature: F_01 Acheter une boisson
    En tant que Mickael, je veux pouvoir acheter une boisson
    afin de l'ajouter à mon inventaire.


  Scenario: Acheter une bouteille.
    Given Mickael choisit une bouteille
    When Mickael passe en caisse
    Then Mickael obtient une bouteille.
		
	
  Scenario Outline: Mickael ne peut pas acheter la bouteille
	Given Mickael choisit une bouteille
	When Mickael passe en caisse
	Then Achat refuse avec le message <messageErreur>.
	
	Examples:
	| messageErreur      |
  | pas assez d'argent |