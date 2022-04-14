package Streaming;
import java.util.ArrayList;
import java.util.List;
public class PlayListeImpl {
	final int MAX_MUSIQUE=100;
	private String nom;
	private String genre;
	private int nombreTitres;
	ArrayList<MusiqueImpl> list = new ArrayList<MusiqueImpl>();

		
		
	public PlayListeImpl(String nom, String genre, int nombreTitres, ArrayList<MusiqueImpl> list) {
		this.nom = nom;
		this.setGenre(genre);
		this.setNombreTitres(nombreTitres);
		this.list = list;
	}

		@Override
		public String toString() {
			return "PlayListeImpl [list=" + list + "]";
		}
		public void afficherPlayListe() {
		System.out.println(list.toString());	
		}


		public void Ajouter(MusiqueImpl music) {
			if (list.size() < MAX_MUSIQUE)
			{
		list.add(music);
			}
		else {
		 System.out.println("la playlist est charg�e");
		}
		}

		public List<MusiqueImpl> getList() {
			return list;
		}

		public void setList(ArrayList<MusiqueImpl> list) {
			this.list = list;
		}

		public String getNom() {
			return nom;
}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public int getNombreTitres() {
			return nombreTitres;
		}

		public void setNombreTitres(int nombreTitres) {
			this.nombreTitres = nombreTitres;
		}
}