import java.util.*;
public class MatrixAddMul
{
    public static void addition(int r,int c,int[][] A,int[][] B)
    {
        for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            System.out.print((A[i][j]+B[i][j])+" ");
	        }
	        System.out.println();
	    }
    }
    
    
	public static void multiplication(int r,int c,int[][] A,int[][] B)
    {
        for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            System.out.print((A[i][j]*B[i][j])+" ");
	        }
	        System.out.println();
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
	    
	    int[][] B=new int[r][c];
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            B[i][j]=s.nextInt();
	        }
	    }
	    
	    addition(r,c,A,B);
	    multiplication(r,c,A,B);
	    
	}
}
