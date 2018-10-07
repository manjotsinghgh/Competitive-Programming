//This is brute force, so it gives terminated due to timeout on HackerRank. For efficient solution, please go through 
//LargestPrimeFactorEfficient.java file in the same repository.

import java.util.*;
public class LargestPrimeFactorBruteForce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t,n,i,j,k,p,q,r;
        t=s.nextInt();
        while(t!=0)
        {
            t--;
            n=s.nextInt();
            r=(int)Math.sqrt(n);
            for(i=2;i<=r;i++)
            {
                if((n%i)==0)
                {
                    break;
                }
            }
            if(i==r+1)
            {
                System.out.println(n);
                continue;
            }
            for(i=n/2;i>1;i--)
            {
                p=(int)Math.sqrt(i);
                for(j=2;j<=p;j++)
                {
                    if((i%j)==0)
                        break;
                }
                if(j==p+1)
                {
                    if((n%i)==0)
                    {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
