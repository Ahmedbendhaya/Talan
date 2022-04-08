
public class Bateau {
	private Integer idBateau = 1;
	private String b1;
	private String b2;
	Coque coque;
	Cabine cabine;
	Pont pont;
	
	public Bateau() {
		this.b1 = "b1";
		this.b2 = "b2";
	}

	public Bateau(String b1, String b2, Coque coque, Cabine cabine, Pont pont) {
		this.b1 = b1;
		this.b2 = b2;
		this.coque = coque;
		this.cabine = cabine;
		this.pont = pont;
	}
	
	public String toString(Bateau bateau) {
		return "Le bateau n° " + bateau.getIdBateau() + " est constitué de: \n" + "La coque n° " + 
	bateau.getCoque().getIdCoque() + "\n La cabine n° " + bateau.getCabine().getIdCabine() + "\n Le pont n° " + bateau.getPont().getIdPont()
	+ " est constitué de la Voile N° " + bateau.getPont().getVoile().getIdVoile(); 
	}

	public Integer getIdBateau() {
		return idBateau;
	}

	public void setIdBateau(Integer idBateau) {
		this.idBateau = idBateau;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public String getB2() {
		return b2;
	}

	public void setB2(String b2) {
		this.b2 = b2;
	}

	public Coque getCoque() {
		return coque;
	}

	public void setCoque(Coque coque) {
		this.coque = coque;
	}

	public Cabine getCabine() {
		return cabine;
	}

	public void setCabine(Cabine cabine) {
		this.cabine = cabine;
	}

	public Pont getPont() {
		return pont;
	}

	public void setPont(Pont pont) {
		this.pont = pont;
	}
	
	

}
