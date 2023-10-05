import java.util.*;
class bubble{
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        Random r= new Random();
        System.out.println("Enter number of elements");
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=r.nextInt(0, 100);
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("  ");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        x.close();
    }
}