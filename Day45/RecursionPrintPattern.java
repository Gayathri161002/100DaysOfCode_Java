public class RecursionPrintPattern
{
    static void printPattern(int row,int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row)
        {
            System.out.print("* ");
            printPattern(row,col+1);
        }
        else
        {
            System.out.println();
            printPattern(row-1,0);
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

* * * * * 
* * * * 
* * * 
* * 
* 

*/