import java.util.*;
class BishuAndSoldiers 
{
    public static void main(String args[] )
    {
        Scanner s=new Scanner(System.in);
        int n,i,j,k;
        n=s.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        j=s.nextInt();
        int ans,m;
        for(i=0;i<j;i++)
        {
            ans=0;
            k=s.nextInt();
            for(m=0;m<n;m++)
            {
                if(arr[m]<=k)
                ans+=arr[m];
                else
                break;
            }
            System.out.println(m+" "+ans);
        }
    }
}
