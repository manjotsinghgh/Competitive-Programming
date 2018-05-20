import java.util.Scanner;
class BreakupApp
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,j=0,k=0,l,len,x=0,y=0,z=0;
        n=s.nextInt();
        s.nextLine();
        for(i=0;i<n;i++)
        {
            String str=s.nextLine();
            len=str.length();
            if(str.charAt(0)=='G')
            {
                if(str.contains("19"))
                {
                    x+=2;
                }
                if(str.contains("20"))
                {
                    y+=2;
                }
                if(str.contains("21"))
                {
                    z+=2;
                }
            }
            else
            {
                if(str.contains("19"))
                {
                    x++;
                }
                if(str.contains("20"))
                {
                    y++;
                }
                if(str.contains("21"))
                {
                    z++;
                }
            }
        }
        if(z>x)
        System.out.println("No Date");
        else if(x==y)
        System.out.println("No Date");
        else
        System.out.println("Date");
    }
}
