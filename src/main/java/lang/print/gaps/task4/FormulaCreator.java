package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a ");
        int a= input.nextInt();
        System.out.print("Enter b ");
        int b= input.nextInt();
      double formula=(9*Math.pow(a,2)-5*b+2+a-7)*((a+b-4*a*b)/2);
    }
}
