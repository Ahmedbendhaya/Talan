import java.util.Scanner;
import java.util.Arrays;
public class maxmin{
public static void main(String[] args) { 
Scanner sc= new Scanner(System.in);
int i,j;
System.out.println("donner la taille du 1er tableau");
int size1 = sc.nextInt();
System.out.println("donner la taille du 2eme tableau");
int size2 = sc.nextInt();
int tab1[] = new int [size1];
int tab2[] = new int [size2];
System.out.println("donner les elements du 1er tableau" );
for (i=0;i<size1;i++)
{
tab1[i]=sc.nextInt();
}
System.out.println("donner les elements du 2eme tableau");
for (j=0;j<size2;j++)
{
tab2[j]=sc.nextInt();
}
System.out.println("donner un entier");
int x=sc.nextInt();

int max1=tab1[0];
int min1 =tab1[0];

for (i=0;i<size1;i++)
{ if (max1<tab1[i]){
max1=tab1[i]; }
if (min1>tab1[i])
{min1=tab1[i];
}
}
System.out.println("le minimum du tableau 1 est" + min1);
System.out.println("le maximum du tableau 1 est" + max1);

int max2=tab2[0];
int min2 =tab2[0];

for (i=0;i<size1;i++)
{ if (max2<tab2[i]){
max2=tab2[i]; }
if (min2>tab2[i])
{min2=tab2[i];
}
}
boolean found1 = false;
boolean found2 = false;
System.out.println("le minimum du tableau 2 est" + min2);
System.out.println("le maximum du tableau 2 est" + max2);

System.out.println("le resultat de l'existence de x dans le tableau1 est : ");
for(i=0; i<size1;i++){
  if(tab1[i] ==x){
     found1 = true;
   }}
System.out.println(found1);


System.out.println("le resultat de l'existence de x dans le tableau2 est : ");
for(i=0; i<size2;i++){
  if(tab2[i] ==x){
     found2 = true;
   }}
System.out.println(found2);
}
}