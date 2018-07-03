package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Invert_floyd_pattern {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,v=0,t,q;
		for(i=n;i>=1;i--) {
			v=v+1;
			t=v;
			q=n;
			for(j=i;j>=1;j--) {
				System.out.print(t+" ");
				t=t+q;
				q--;
			}
			System.out.println();
		}
	}
}
