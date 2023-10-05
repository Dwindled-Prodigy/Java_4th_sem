import java.util.*;
public class ana{
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter 1 word");
        String a=x.next();
        System.out.println("Enter 2 word");
        String b=x.next();
        a.toLowerCase();
        b.toLowerCase();
        if (a.length()==b.length()){
            char[]c=a.toCharArray();
            char[]d=b.toCharArray();
            Arrays.sort(d);
            Arrays.sort(c);
            boolean w=Arrays.equals(c,d);
            if(w){
                System.out.println("it is anagram");
            }
            else{
                System.out.println("Not an anagram");
            }
            System.exit(0);
        }
        x.close();
        System.out.println("Darshan Kumar T");
        System.out.println("Darshan Kumar T");
        System.out.println("Darshan Kumar T");
        System.out.println("Darshan Kumar T");
        System.out.println("Darshan Kumar T");
        System.out.println("Darshan Kumar T");
        System.out.println("Darshan Kumar T");
    }
}