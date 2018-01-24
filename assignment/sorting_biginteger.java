import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        ArrayList<BigInteger>d=new ArrayList<BigInteger>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String x=in.next();
            BigInteger ss=new BigInteger(x);
            d.add(ss);
        }
        Collections.sort(d);
        for(BigInteger xx:d){
            System.out.println(xx);
        }
        


        
    }
}
