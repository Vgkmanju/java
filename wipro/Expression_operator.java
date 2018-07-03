package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Expression_operator {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String a="(\\+|\\-|\\*|/|=)";
		String x[]=s.split(a);
		Integer[] n=new Integer[x.length];
	    int i=0;
	    for(String str:x){
	        n[i]=Integer.parseInt(str);
	        i++;
	    }
		if(n[0]+n[1]==n[2]) {
			System.out.println("+");
		}
		if(n[0]-n[1]==n[2]) {
			System.out.println("-");
		}
		if(n[0]*n[1]==n[2]) {
			System.out.println("*");
		}
		if(n[0]/n[1]==n[2]) {
			System.out.println("/");
		}
		
	}
}
