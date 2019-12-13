@tag
Feature: F_05 Choisir 
  En tant que Popeye, 
  je veux pouvoir utiliser la strategie eco et voir ma force augmenter.

  @tag1
  Scenario: Popeye choisit la strategie eco
    Given Popeye est attaque par ploto
    When Popeye choisit la strategie eco pour riposter
    Then Popeye voit sa force augmenter
