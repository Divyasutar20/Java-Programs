import java.util.*;
public class Matrix

{
    public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
int [][] a=new int [2][2];
int [][] b=new int [2][2];
int [][] c=new int [2][2];
System.out.println("Enter element foe matrix a");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
{
   a[i][j]=sc.nextInt();
}
System.out.println();
}
System.out.println("Enter element foe matrix b");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
{
   b[i][j]=sc.nextInt();
}
System.out.println();
}
System.out.println("choose Operation\n1.Multiplication\n2.Addition\n3.Transpose of a\n4.Transpose of b");
int choice;
choice=sc.nextInt();
switch(choice)
{
  case 1:
System.out.println("Multiplication");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
{ 
   for(int k=0;k<2;k++)
{
   c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
}
System.out.println("Multiplication"+c[i][j]);
}
}  break;
case 2:
System.out.println("Addition");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
{
    c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Addition"+c[i][j]);

   break;
case 3:
System.out.println("Transpose of a");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
{
    c[i][j]=a[j][i];
}

}
System.out.println("Addition"+c[i][j]);

   break;
case 4:
System.out.println("Transpose of a");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
{
    c[i][j]=b[j][i];
}
}

System.out.println("Transpose"+c[i][j]);

   break;
default:
System.out.println("Invalid Choice");
}
}}







 