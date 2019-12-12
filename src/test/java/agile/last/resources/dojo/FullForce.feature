@tag
Feature: F_06 Choisir une strategie
  En tant que Popeye, 
  je veux pouvoir utiliser la strategie fullForce et voir ma force encore plus augmenter.

  @tag1
  Scenario: Popeye choisit la strategie full
    Given Ploto attaque Popeye
    When Popeye choisit la strategie full pour riposter
    Then Popeye voit sa force augmenter encore plus
    