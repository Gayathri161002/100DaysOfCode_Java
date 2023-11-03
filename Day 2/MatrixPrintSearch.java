import java.util.*;
public class MatrixPrintSearch
{
    public static void matrixPrint(int r,int c,int[][] A)
    {
        for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            System.out.print(A[i][j]+" ");
	        }
	        System.out.println();
	    }
    }
    
    public static void matrixSearch(int r,int c,int[][] A,int search)
    {
        for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            if(A[i][j]==search)
	            {
	                System.out.println("row : "+ i + " column : " + j);
	                break;
	            }
	        }
	    }
    }
    
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int r=s.nextInt();
	    int c=s.nextInt();
	    int[][] A=new int[r][c];
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            A[i][j]=s.nextInt();
	        }
	    }
	    
	    matrixPrint(r,c,A);
	    
	    int search=s.nextInt();
	    matrixSearch(r,c,A,search);
	    
	}
}
