@tag
Feature: F_03 V�rifier l'inventaire
		Myriam veut pouvoir v�rifier si elle poss�de des boissons dans son inventaire

  Scenario Outline: Myriam v�rifie son inventaire
    Given Myriam est une cliente
    When Myriam verifie son inventaire
    Then Myriam constate que son inventaire n'est pas vide

  Scenario Outline: L'inventaire de Myriam est vide
    Given Myriam est une cliente
    When Myriam verifie son inventaire
    Then Myriam constate que son inventaire est vide
