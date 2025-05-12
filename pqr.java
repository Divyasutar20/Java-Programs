import java.lang.*;
import java.util.*;

class NegativeAgeException extends Exception {
    public string toString() {
        return "Enter Posiive Age";
    }
}

class pqr {
    public static void main(String args[])
    {

    try
    {
        int age;
        Scanner Sc=new Scanner(System.in);
        int age=Sc.nextInt();
        if(age<0)
        {
            throw new NegativeAgeException();}else{System.out.println("Age"+age);}
            catch(

    NegativeAgeException e)
    { System.out.println(e);
        }
}
    }
}