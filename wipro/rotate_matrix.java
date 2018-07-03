package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Rotate_matrix {
	public static void main(String []arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i,j;
		int a[][]=new int[n][m];
		int b[][]=new int[m][n];
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				b[i][j]=a[j][i];
			}
		}
		for(i=m-1;i>=0;i--) {
			for(j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}
}
