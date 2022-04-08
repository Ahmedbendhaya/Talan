

public class Voile {
	private int idVoile = 5;
	public float largeur;
	private float longeur;
	private float hauteur;
	protected String couleur;
	private boolean enroule;
	private boolean deroule;

	public Voile() {
		this.largeur = 0;
		this.longeur = 0;
		this.hauteur = 0;
		this.couleur = "";
		this.enroule = false;
		this.deroule = false;
	}

	public Voile(int largeur, int longeur, int hauteur, String couleur, boolean enroule, boolean deroule) {
		this.largeur = largeur;
		this.longeur = longeur;
		this.hauteur = hauteur;
		this.couleur = couleur;
		this.enroule = enroule;
		this.deroule = deroule;
	}

	boolean enrouler(Boolean enroule) {
		boolean a = !enroule;
		return a;
	}
	
	boolean derouler(Boolean deroule) {
		boolean a = !deroule;
		return a;
	}

	public int getIdVoile() {
		return idVoile;
	}

	public void setIdVoile(int idVoile) {
		this.idVoile = idVoile;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public float getLongeur() {
		return longeur;
	}

	public void setLongeur(float longeur) {
		this.longeur = longeur;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isEnroule() {
		return enroule;
	}

	public void setEnroule(boolean enroule) {
		this.enroule = enroule;
	}

	public boolean isDeroule() {
		return deroule;
	}

	public void setDeroule(boolean deroule) {
		this.deroule = deroule;
	}
	
	
}
