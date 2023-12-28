public class RecursionPrintPattern2
{
    static void printPattern(int row,int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row)
        {
            printPattern(row,col+1);
            System.out.print("* ");
        }
        else
        {
            printPattern(row-1,0);
            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
        int row = 5;
        int col = 0;
        printPattern(row,col);
    }
}

/*
Output :

* 
* * 
* * * 
* * * * 
* * * * * 

*/