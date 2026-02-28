import java.util.*;
class fact{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            

        }
        System.out.print("factorial:"+f);


    }

}