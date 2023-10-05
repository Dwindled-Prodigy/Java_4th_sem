import java.util.*;
public class num{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int temp=a<b?a:b;
        int small=temp<c?temp:c;
        System.out.println("Smallest number is ");
        System.out.println(small);
        s.close();
    }
}