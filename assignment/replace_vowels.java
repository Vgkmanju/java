/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skcet
 */
public class VowelsReplacing {
	public static String output;
	public static char c;
	public static char z='z';
	public static int len,i;
	public static String t="";
	public static void usermain(String input1)
	{
		//input1=input1.toUpperCase();
		len=input1.length();
		char[] vowel={'a','e','i','o','u'};
		//char anotherString="";
		for(i=0;i<len;i++)
		{
			c=input1.charAt(i);
			//if(input1.equalsIgnoreCase(anotherString))
			if((c==65)||(c==69)||(c==73)||(c==79)||(c==85)||(c==97)||(c==101)||(c==105)||(c==111)||(c==117))
			{
				t=t+z;
			}
			else
			{
				t=t+c;
			}
                        
		}
		output=t;
		System.out.println(output);
		
	}

	public static void main(String[] args) {
		usermain("super");

	}

}
