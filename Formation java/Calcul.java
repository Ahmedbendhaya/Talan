import java.util.Scanner;
public class Calcul{
public static void main(String[] args) { 
Scanner scanner= new Scanner(System.in);
int a,b;
double f = 1; 
System.out.println("donner le premier entier");
a = scanner.nextInt();
System.out.println("donner le deuxiéme entier");
b = scanner.nextInt();
int S = a+b;
if (a < b) {
   	if (b!=0 & b!=1) {
	   for (int i =1 ; i<b+1 ; i++) { 
		f=f*i; }    
	} else 
	{f=1 ;}
} else {  for (int i =2 ; i<a+1 ; i++) { 
		f=f*i;    }
     }
System.out.println("la Somme est" + S);
System.out.println("la factorielle est" + f);
                }
}