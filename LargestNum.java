import java.util.*;
public class LargestNum {

    public static void main(String[] args) {

         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the number1: ");
         int n1=sc.nextInt();
         System.out.println("Enter the number2: ");
         int n2=sc.nextInt();
         System.out.println("Enter the number3: ");
         int n3=sc.nextInt();

        if( (n1+n2) >= (n2+n3))
            System.out.println(n1+" and "+n2  + " has the largest sum="+(n1+n2));

        else if ((n1+n3) >= (n2+n3))
            System.out.println(n1+" and "+n3  + " has the largest sum="+(n1+n3));

        else
            System.out.println(n2+" and "+n3  + " has the largest sum="+(n2+n3));

        
        System.out.println("The average of 3 numbers is : "+ ((n1+n2+n3)/3));
    }
}
              