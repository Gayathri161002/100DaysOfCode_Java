import java.io.*;
import java.util.*;

public class OddEvenExchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sort(a,n);
    }
    
    public static void sort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(a[i]%2!=0){
                    for(int j=i+1;j<n;j++){
                            if(a[j]%2==0){
                                int t = a[j];
                                a[j] = a[i];
                                a[i]=t;
                            }
                    }
                }
            }
            
            if(i%2!=0){
                if(a[i]%2==0){
                    for(int j=i+1;j<n;j++){
                        if(a[j]%2!=0){
                            int t = a[j];
                            a[j] = a[i];
                            a[i]=t;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}