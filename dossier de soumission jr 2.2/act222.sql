SELECT offername, unitPriceTTC, quantity, totalTTC  FROM   offer , quotationcontent , quotation
WHERE quotationcontent.id_quotation=quotation.id AND quotationcontent.id_offer=offer.ID AND quotation.id = 10;

SELECT ID, firstname , lastname , email FROM quotation , user 
WHERE quotation.ID_user= user.ID AND (user.email LIKE '%gmail.com' OR user.email LIKE '%GMAIL.COM');