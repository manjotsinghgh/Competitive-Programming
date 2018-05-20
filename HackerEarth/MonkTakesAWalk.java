import java.util.Scanner;
class MonkTakesAWalk
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t,i,j,len;
        t=s.nextInt();
        s.nextLine();
        while(t!=0)
        {
            t--;
            j=0;
            String str=s.nextLine();
            len=str.length();
            for(i=0;i<len;i++)
            {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='U'||str.charAt(i)=='O')
                    j++;
            }
            System.out.println(j);
        }
    }
}
