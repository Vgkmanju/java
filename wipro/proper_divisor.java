package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Proper_divisors {
public static void main(String []arg) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}System.out.println(sum);
}
}
