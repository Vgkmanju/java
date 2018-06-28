package manju;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Add_non_prime_indices {
public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int i,t=0;
    for(i=0;i<10;i++) {
        a[i]=sc.nextInt();
    }
    int x=10;
    int y=2;
 
    int[]b=new int[10];
    for(i=y+1;i<x;i++)
    {
        for(int j=2;j<x;j++)
        {
            if(i!=j)
            {
                if((i%j==0))
                {
                   b[t]=i;
                   System.out.println(b[t]);
                   t++;
                   break;
                }
            }
        }
    }
    int sum=a[0]+a[1];
    int n,s=0;
    for(i=0;i<t;i++) {
         n=b[i];
        s=s+a[n];
            }
    int add=sum+s;
    System.out.println(add);
}
}

