package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Zoho {
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	String psd=sc.next();
	char a[]=psd.toCharArray();
	int i,u=0,l=0,d=0,s=0;
	for(i=0;i<psd.length();i++) {
		if(a[i]>=65&&a[i]<=90) {
			u++;
		}
		if(a[i]>=97&&a[i]<=122) {
			l++;
		}
		if(a[i]>=48&&a[i]<=57) {
			d++;
		} if(a[i]>=33&&a[i]<=64){
			s++;
		}
	}System.out.println(u+" "+l+" "+d+" "+s);
	
	if((psd.length()>=8)&&(u>=1)&&(l>=1)&&(d>=1)&&(s>=1)) {
		System.out.println("Strong");
		
	}
	else if((psd.length()>=6)&&(u>=1)&&(l>=1)&&(s>=1)) {
		System.out.println("Moderate");
	}
	else {
		System.out.println("weak");
	}
}
}
