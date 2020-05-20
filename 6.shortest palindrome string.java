We have a Letter or a word then we need add some letters to it and need to find out shortest palindrome
For example we take "S": S will be the shortest palindrome string.
If we take "xyz": zyxyz will be the shortest palindrome string
So we need to add some characters to the given string or character and find out what will be the shortest palindrome string by using simple java program.



class GFG
{
    static boolean ispalindrome(String s)
    {
        int l=s.length();
        for(int i=0,j=l-1;i<=j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="xyz";
        int cnt=0;
        int flag=0;
        while(s.length()>0)
        {
            if(ispalindrome(s))
            {
                flag=1;
                break;
            }
            else
            {
                cnt++;
                s=s.substring(0,s.length() - 1);
            }
        }
        if(flag==1)
        {
            System.out.println(cnt);
        }
    }
}
