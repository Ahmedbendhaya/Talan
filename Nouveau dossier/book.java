package Bibliothéque;


public class book {
private int ID; 
private String title;
private String author;
private String editor;
private int pageNb ; 
private String summary;
private Library library;



//Constructor

public book(int iD, String title, String author, String editor, int pageNb, String summary, Library library) {
	super();
	ID = iD;
	this.title = title;
	this.author = author;
	this.editor = editor;
	this.pageNb = pageNb;
	this.summary = summary;
	this.library = library;
}


//Getters and setters


public book(int iD, String title, String author, String editor, int pageNb) {
	super();
	ID = iD;
	this.title = title;
	this.author = author;
	this.editor = editor;
	this.pageNb = pageNb;
}


public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getEditor() {
	return editor;
}
public void setEditor(String editor) {
	this.editor = editor;
}
public int getPageNb() {
	return pageNb;
}
public void setPageNb(int pageNb) {
	this.pageNb = pageNb;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}

public Library getLibrary() {
	return library;
}

public void setLibrary(Library library) {
	this.library = library;
}


@Override
public String toString() {
	return "book [ID=" + ID + ", title=" + title + ", author=" + author + ", editor=" + editor + ", pageNb=" + pageNb
			+ ", summary=" + summary + ", library=" + library + "]";
}


// Fonction d'affichage

public void afficher_livre() {
System.out.println(toString());
}

// Fonction de vérification 

public void Verification_deuxinstances(book livre1,book livre2) {
if (livre1.getTitle().equals(livre2.getTitle())& livre1.getAuthor().equals(livre2.getAuthor()))  
		System.out.println("il s'agit du meme livre");
else System.out.println("ce n'est pas le meme livre");
}
}