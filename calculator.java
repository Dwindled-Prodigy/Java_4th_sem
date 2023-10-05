import java.util.*;
public class calculator{
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println("Enter operation to be Performed");
        String o=x.next();
        switch(o){
            case "+":
            int r=a+b;
            System.out.println(a+" + " + b +" = "+r);
            break;
            case "-":
            r=a-b;
            System.out.println(a+" - "+ b +" = "+ r);
            break;
            case "*":
            r=a*b;
            System.out.println(a+" * "+b+" = "+r);
            break;
            default:
            System.out.println("Invalid Input");
            System.exit(0);
        }
        x.close();
    }
}