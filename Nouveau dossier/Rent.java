package Bibliothéque;


import java.util.Date;

public class Rent {
	private int id;
	private user user ;
	private book book; 
	private Date DatePret;
	private Date DateFin;
	
	// Constructor
	
	public Rent(int id, user user, Bibliothéque.book book, Date datePret, Date dateFin) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		DatePret = datePret;
		DateFin = dateFin;
	}
	
	// Getters and setters
	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public book getBook() {
		return book;
	}

	public void setBook(book book) {
		this.book = book;
	}

	public Date getDatePret() {
		return DatePret;
	}

	public void setDatePret(Date datePret) {
		DatePret = datePret;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	
	
	@Override
	public String toString() {
		return "Rent [id=" + id + ", user=" + user + ", book=" + book + ", DatePret=" + DatePret + ", DateFin="
				+ DateFin + "]";
	}

	public void Afficher_pret() {
		System.out.println(toString());
		}
	public void Verification_deuxinstances(Rent rent1,Rent rent2) {
		if (rent1.getId()==(rent2.getId())) 
				System.out.println("il s'agit du meme membre");
		else System.out.println("ce n'est pas le meme membre");
}
}

