/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairs;

/**
 *
 * @author skcet
 */
import java.util.*;
import java.io.*;
import java.lang.*;
public class Pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String a=s.next().toLowerCase();
        String b=s.next().toLowerCase();
        char a1[]=new char[20];
        char b1[]=new char[20];
        int i,j=0,k;
        if(a.length()!=b.length()){
            System.out.println("-1");
        }
        else{
            for(i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i)){
                    a1[j]=a.charAt(i);
                    b1[j]=b.charAt(i);
                    j++;
                }
                
            }
            /*Arrays.sort(a1);
            Arrays.sort(b1);
            String a2 = a1.toString();
            String b2 = b1.toString();
            if(!a2.equals(b2)){
                System.out.println("-1");
            } else {*/
                k=j/2;
                System.out.println(k);
            //}
        }
        
    }
}
