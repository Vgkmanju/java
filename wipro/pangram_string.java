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
        String n=s.nextLine().toLowerCase();
        n=n.replaceAll(" ","");
        int a[]=new int[26];
        int c=0;
        if(n.length()<26){
            System.out.println("not a pangram");
        }  else{ 
            for(int i=0;i<n.length();i++){
                a[n.charAt(i)-97]++;
            }
            
            for(int i=0;i<26;i++){
        if(a[i]==0){
            System.out.println("Not pangram");break;
        }
        else{
            c++;}
        }
            if(c==26){
                System.out.println("pangram");
            }
        }
        
        
    }
}
