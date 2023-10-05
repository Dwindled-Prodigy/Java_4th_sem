import java.util.*;
public class stud{
    void getdetails(){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter name");
        String name = x.next();
        System.out.println("Enter USN");
        int USN = x.nextInt();
        System.out.println("Name: "+name);
        System.out.println("USN: "+ USN); 
        x.close();
    }
    public static void main(String [] agrs){
        Scanner r=new Scanner(System.in);
        System.out.println("enter number or students");
        int a=r.nextInt();
        stud[] s=new stud[a];
        for(int i=0;i<a;i++){
            s[i]=new stud();
            System.out.println("Enter details of "+ (i+1) +" Student");
            s[i].getdetails();
        }
        r.close();
    } 
}