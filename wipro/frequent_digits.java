package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Most_frequent_digit {
public static void main(String [] arg) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	String c=sc.next();
	String d=sc.next();
	String e=a+b+c+d;
	int i,k=0;
	int x[]=new int[10];
	for(i=0;i<e.length();i++) {
		x[e.charAt(i)-48]++;
	}
	int max=x[0];
	for(i=9;i>=0;i--) {
		if(max<x[i]) {
			max=x[i];
			k=i;
		}
	}System.out.println(k);
}
}
