import java.util.Scanner;

public class Chaine
{
    public static void main(String[] args) 
    {
        int nbr;
        String tmp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de mots : ");
        nbr = scanner.nextInt();
    
        String tab[] = new String[nbr];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez la liste des noms:");
    
        for(int i=0; i < nbr; i++)
        {
            tab[i] = scanner1.nextLine();
        }
        for (int i=0; i < nbr; i++) 
        {
            for (int j=i+1; j < nbr; j++) 
            {
                if (tab[i].compareTo(tab[j]) > 0) 
                {
                    tmp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = tmp;
                }
            }
        }
        System.out.print("Liste de noms dans l'ordre trié est : ");
        for (int i=0; i < nbr-1; i++) 
        {
            System.out.print(tab[i] + ",");
        }
        System.out.print(tab[nbr - 1]);
    }
}