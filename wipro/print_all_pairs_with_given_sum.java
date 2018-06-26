
package pairs;

import java.util.*;
import java.io.*;
public class Pairs {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i,j,c=0;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=s.nextInt();
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if((a[i]+a[j])==sum){
                    System.out.print("("+a[i]+","+a[j]+")"+" ");
                    c++;
                }
            }
        }
        if(c==0){
            System.out.println("-1");
        }
        
    }
    
}
