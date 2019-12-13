@tag
Feature: F_08 Verifier l'inventaire
		Myriam veut pouvoir verifier si elle possede des boissons dans son inventaire

  Scenario: Myriam verifie son inventaire
    Given Myriam est une cliente
    When Myriam verifie son inventaire
    Then Myriam constate que son inventaire n'est pas vide

  Scenario: L'inventaire de Myriam est vide
    Given Myriam est une cliente
    When Myriam verifie son inventaire
    Then Myriam constate que son inventaire est vide
