@tag
Feature: F_10 Rollback 
  En tant que Popeye, 
  je veux pouvoir sauvegarder mon etat afin de retracer mes modifications.

  @tag1
  Scenario: Popeye sauvegarde son etat
    Given Popeye sauvegarde son etat
    When Popeye est attaque par Pluto
    Then Popeye peut comparer ses points de vie actuels et ceux precedents
