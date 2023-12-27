public class RecursionPalindrome 
{
    static int palindrome(int num,int temp)
    {
        if(num == 0)
            return temp;
            
        temp = (temp * 10) + (num % 10);
        return palindrome(num/10,temp);
    }
    public static void main(String args[]) 
    {
        int num = 5445;
        int result = palindrome(num,0);
        if(result == num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}