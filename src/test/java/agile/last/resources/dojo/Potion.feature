@tag
Feature: F_09 Effet d'une potion
		En tant que potion, je veux pouvoir afficher mon effet.

  Scenario: La potion de vie donne son effet
    Given La potion possede un nom
    When L'etiquette de la potion est parcourue
    Then La potion de vie renvoie son effet
    
  Scenario: La potion de vie donne son effet
    Given La potion possede un nom
    When L'etiquette de la potion est parcourue
    Then La potion de force renvoie son effet
