//This problem is solved using AP.

import java.util.*;
public class MultiplesOf3and5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t,n;
        long x,y,z;
        t=s.nextInt();
        while(t!=0)
        {
            t--;
            n=s.nextInt()-1;
            x=n/3;
            x=x*(3+x*3)/2;
            y=n/5;
            y=y*(5+y*5)/2;
            z=n/15;
            z=z*(15+z*15)/2;
            System.out.println(x+y-z);
        }
    }
}
