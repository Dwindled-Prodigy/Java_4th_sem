import java.util.*;
class ovl{
    Scanner x=new Scanner(System.in);
    ovl(){
        System.out.println("enter 2 numbers");
        int a=x.nextInt();
        int b=x.nextInt();
        display(a,b);
    }

    void display(int a, int b)
    {
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public ovl(float a, float b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public void display(int x)
    {
        System.out.println(x*x);
    }

    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        ovl o=new ovl();
        o.display(4);
        System.out.println("Enter float values");
        float r=x.nextFloat();
        float s=x.nextFloat();
        ovl e=new ovl(r, s);
        e.display(3);
        x.close();
    }
}

