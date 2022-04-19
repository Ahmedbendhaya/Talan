-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 19 avr. 2022 à 09:43
-- Version du serveur : 8.0.27
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_abd`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `abonnements` enum('premium','Vip','classique') NOT NULL,
  `intérêt` set('sport','cinema','musique') NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`ID`, `nom`, `telephone`, `abonnements`, `intérêt`) VALUES
(1, 'Ali', '92 164 946 ', 'premium', 'cinema,musique'),
(2, 'Samir', '94587587', 'Vip', 'musique'),
(3, 'Marwen', '55518415', 'classique', 'sport,cinema'),
(4, 'Sami', '58484878', 'Vip', 'musique'),
(5, 'anis', '25195205', 'Vip', 'cinema');

-- --------------------------------------------------------

--
-- Structure de la table `fournisseurs`
--

DROP TABLE IF EXISTS `fournisseurs`;
CREATE TABLE IF NOT EXISTS `fournisseurs` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `fournisseurs`
--

INSERT INTO `fournisseurs` (`ID`, `nom`) VALUES
(1, 'Delice '),
(2, 'Natilait'),
(3, 'Vitalait');

-- --------------------------------------------------------

--
-- Structure de la table `produits`
--

DROP TABLE IF EXISTS `produits`;
CREATE TABLE IF NOT EXISTS `produits` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `marque` varchar(50) NOT NULL,
  `Reference fournisseurs` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `produits`
--

INSERT INTO `produits` (`ID`, `nom`, `type`, `marque`, `Reference fournisseurs`) VALUES
(1, 'Oikos', 'Yaourt', 'Delice', 1),
(2, 'Blendy ', 'Yaourt', 'Delice', 1),
(3, 'Lait', 'Lait', 'Delice', 1),
(4, 'Fromage', 'Fromage', 'Delice', 1),
(5, 'Yaourt natilait', 'Yaourt', 'Natilait', 2),
(6, 'Lait natilait', 'Lait', 'Natilait', 2),
(7, 'Yaourt vitalait', 'Yaourt', 'vitalait', 3),
(8, 'Lait Vitalait', 'Yaourt', 'vitalait', 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
