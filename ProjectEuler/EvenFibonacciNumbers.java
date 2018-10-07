import java.util.*;
public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int t;
        long n,i,j,k,sum;
        t=s.nextInt();
        while(t!=0)
        {
            t--;
            n=s.nextLong();
            i=1;
            j=2;
            sum=2;
            while(j<n)
            {
                k=i+j;
                i=j;
                j=k;
                if(j<=n && (j&1)==0)
                    sum=sum+j;
            }
            System.out.println(sum);
        }
    }
}
