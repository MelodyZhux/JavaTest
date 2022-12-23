import java.util.Scanner;

public class swapNumbers {
    public static void main(String args[]) {
        int number1;
        int number2;
        int number3;
        System.out.println("Please input two numbers:");
        Scanner s= new Scanner(System.in);
        number1 = s.nextInt();
        number2 = s.nextInt();
        swapNumbers swap= new swapNumbers();
     //   swap.reverseNumber(number1,number2);

        swap.reverseNumberWithoutTemp(number1,number2);
    }
     public void reverseNumber(int a1,int a2)
     {
         int temp;
         System.out.println("number1 is "+ a1);
         System.out.println("number2 is "+ a2);
         temp = a1;
         a1= a2;
         a2 = temp;
         System.out.println("number1 changed to "+a1);
         System.out.println("number2 changed to "+a2);
     }

    public void reverseNumberWithoutTemp(int a1,int a2)
    {
        System.out.println("number1 is "+ a1);
        System.out.println("number2 is "+ a2);
        a1 =a1+a2;
        a2 = a1-a2;
        a1= a1-a2;

        System.out.println("number1 changed to "+a1);
        System.out.println("number2 changed to "+a2);
    }
}
