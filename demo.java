import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

class demo
{
    public static void main(String[] args) 
    {
      
      Scanner obj=new Scanner(System.in);

      int base;
      System.out.print("Enter the base: ");
      base =obj.nextInt();
      int power;
      System.out.print("Enter the power: ");
      power =obj.nextInt();
      int result=1;
      
      for(int i=1;i<=power;i++)
      {
        result*=base;
      }
      System.out.println("Power of given element is : "+result);
    }
}

