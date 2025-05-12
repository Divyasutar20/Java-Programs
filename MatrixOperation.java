import java.util.*;

public class MatrixOperation
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) 
          {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
             {
                b[i][j] = sc.nextInt();
            }
        }
        
         System.out.println("Choose operation: \n1. Multiplication \n2. Addition \n3. Transpose of a \n4. Transpose of b");
        int choice = sc.nextInt();
       sc.close();
        switch (choice) 
     {
                case 1:
                for (int i = 0; i < 2; i++) 
                   {
                    for (int j = 0; j < 2; j++) 
                     {
                        c[i][j] = 0;
                        for (int k = 0; k < 2; k++)
                     {
                            c[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                System.out.println("Result of Multiplication:");
                break;
            case 2:
                for (int i = 0; i < 2; i++) 
                  {
                    for (int j = 0; j < 2; j++) 
                     {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                System.out.println("Result of Addition:");
                break;
            
            case 3:
                   for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) 
                   {
                        c[i][j]=a[j][i];
                    }
                    }
                System.out.println("Result of Transpose of First Matrix a:");
                break;
            case 4:
                  for (int i = 0; i < 2; i++) 
                    {
                    for (int j = 0; j < 2; j++) 
                   {
                        c[i][j]=b[j][i];
                    }
                    
                }
                System.out.println("Transpose of First Matrix b:");
                break;
            default:
               { System.out.println("Invalid choice");
                return;
        }
       for(int i=0;i<2;i++)
       {
          for(int j=0;j<2;j++)
       {
           System.out.println(c[i][j]=" ");
}}
}}
}