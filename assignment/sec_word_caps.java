import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        String [] a=s.split(" ");
        for(String ss:a)
        {
            c++;
        }
        if(c<2)
        {
            System.out.println("null");
        }
        else
        {
            a[1]=a[1].toUpperCase();
            System.out.println(a[1]);
        }
    }
}

