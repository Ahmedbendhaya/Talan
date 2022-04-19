INSERT INTO `clients` (`ID`, `nom`, `telephone`, `abonnements`, `intérêt`) VALUES (NULL, 'hishem', '11851959', 'Vip', 'sport');

SELECT * FROM `clients`;

SELECT * FROM `produits`;

SELECT DISTINCT type FROM produits; 

SELECT type ,COUNT(*) FROM produits GROUP BY type;

SELECT * FROM clients WHERE nom LIKE '%s%' ;

ALTER TABLE produits
ADD prix float;

UPDATE produits SET prix = 200;

SELECT nom , type , prix , nomf FROM produits , fournisseurs 
WHERE produits.Reference_fournisseurs = fournisseurs.ID;
 
SELECT nomf,Reference_fournisseurs ,COUNT(*) FROM produits, fournisseurs
WHERE produits.Reference_fournisseurs = fournisseurs.ID
GROUP BY Reference_fournisseurs;

