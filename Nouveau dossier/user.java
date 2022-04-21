package Bibliothéque;



public class user {
	private int id ;
	private String prenom ; 
	private String nom ;
	private String address; 
	private String numTel; 
	private String mail ; 
	private Rent [] tab ;
	


	public user(int id, String prenom, String nom, String address, String numTel, String mail, Rent[] tab) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.address = address;
		this.numTel = numTel;
		this.mail = mail;
		this.tab = tab;
	}
	

	public user(int id, String prenom, String nom, String address, String numTel, String mail) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.address = address;
		this.numTel = numTel;
		this.mail = mail;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Rent[] getTab() {
		return tab;
	}

	public void setTab(Rent[] tab) {
		this.tab = tab;
	}
	
	@Override
	public String toString() {
		return "user [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", address=" + address + ", numTel=" + numTel
				+ ", mail=" + mail + "]";
	}


	public void Afficher_utilisateur() {
		System.out.println(toString());
		}
	public void Verification_deuxinstances(user user1,user user2) {
		if (user1.getId()==(user2.getId()) & user1.getNom().equals(user2.getNom())& user1.getPrenom().equals(user2.getPrenom()))  
				System.out.println("il s'agit du meme membre");
		else System.out.println("ce n'est pas le meme membre");
}
}
