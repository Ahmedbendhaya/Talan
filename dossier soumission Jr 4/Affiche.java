public class Affiche {  
public static void main(String[] args) {
Bateau b = new Bateau();
Cabine c  = new Cabine();
Coque co = new Coque();
Mat m= new Mat();
Pont p= new Pont();
Voile v = new Voile();

System.out.println("le bateau n" + b.getNumber(), "est constitué de :");
System.out.println("la coque n" + co.getNumber());
System.out.println("la cabine n" + c.getNumber());
System.out.println("la pont n" + p.getNumber(), " est constitué de la voile" + v.getNumber() );

}
}