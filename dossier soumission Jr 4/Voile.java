public class Voile{
public int largueur ;
private int longueur ; 
private int hauteur ; 
protected String couleur;
private boolean enroule;
private boolean deroule;
final int IDENTIFIANT6=6;

Voile(){
}

Voile(int largueur,int longueur,int hauteur,String couleur,boolean enroule,boolean deroule,int IDENTIFIANT6){
this.largueur=largueur;
this.longueur=longueur;
this.couleur=couleur;
this.hauteur=hauteur;
this.enroule=enroule;
this.deroule=deroule;
} 

boolean enrouler(Boolean enroule){ 
return(!enroule);
}

boolean derouler(Boolean deroule){ 
return(!deroule);
}
}