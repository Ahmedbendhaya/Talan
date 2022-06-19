Feature: RechercherDesArticles

  @findbyparameter
  Scenario Outline: Rechercher un article en tapant un paramétre
    Given Je suis sur la page d accueil de MyTek
    When Je clique sur la barre de recherche
    And je tape <parametre>
    And je clique sur la suggestion
    Then l article doit etre affiche

    Examples: 
      | parametre                                                                                                                                                                                                                                     |
      | ASUS CHROMEBOOK                                                                                                                                                                                                                               |
      | C204MA-GJ0203                                                                                                                                                                                                                                 |
      | PC PORTABLE ASUS GRIS FONCÉ                                                                                                                                                                                                                   |
      | 545,000 TND                                                                                                                                                                                                                                   |
      | Écran 11.6 HD - Processeur: Intel Celeron N4020 (1,10 GHz up to 2.80 GHz, 4 Mo de mémoire cache, Dual-Core) - Système d exploitation: Chrome OS - Mémoire RAM: 4 Go LPDDR4 - Disque Dur: 32 Go eMMC - Carte Graphique: Intel UHD 600 Graphics |
