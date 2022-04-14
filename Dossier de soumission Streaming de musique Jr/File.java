package Streaming;

public class File {
	import java.io.*;
	import java.util.*;


	ArrayList<MusiqueImpl> m = new ArrayList<MusiqueImpl>();
	// Création d’un fileReader pour lire le fichier
	FileReader fileReader = new FileReader("C://Users/PC/Desktop/Musique.txt");
	// Création d’un bufferedReader qui utilise le fileReader
	BufferedReader reader = new BufferedReader (fileReader);

	try {
	// une fonction à essayer pouvant générer une erreur
	String line = reader.readLine();

	while(line != null) {



	// lit les musiques a insérer depuis un fichier
	m.titre = entree.next();
	m.autheur = entree.next();
	m.interprete = entree.next();
	m.genre = entree.next();
	arraylist.add(m);
	



	// lecture de la prochaine ligne
	line = reader.readLine();
	}




	catch (IOException e) {



	e.printStackTrace();




	}



	reader.close();



	set.CollAhmed = CollAhmed.(m);
	List CollAhmed = Collections.synchronizedList(new ArrayList());



	//enregistre la playlist d'un utilisateur dans un autre
	int index=System.out.print("donner l'index du playlist choisit pour l'enregister");
	set.CollAhmed = CollAli.(m);
	List CollAli = Collections.synchronizedList(new ArrayList());



	}



	}
}
