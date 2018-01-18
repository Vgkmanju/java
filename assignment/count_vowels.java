/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skcet
 */
public class Counting_Vowels {
	public static int output1;
public static void usermain(String input)
{
	input=input.toLowerCase();
char[] array=input.toCharArray();
int len=input.length();


int i,j;
for(i=0;i<len-1;i++)
{
	for(j=i+1;j<len;j++)
	{
		if(array[i]==array[j])
		{
			array[j]='\n';
		}
	}
}

String news=new String(array).toString();
news = news.replaceAll("\\s+","");
int second_len=news.length(),count=0;
char []second_array=news.toCharArray();

for(i=0;i<second_len;i++)
{
if(second_array[i]=='a'||second_array[i]=='e'||second_array[i]=='i'||second_array[i]=='o'||second_array[i]=='u')
{
	count++;
}
}
output1=count;
System.out.println(output1);
}

	public static void main(String[] args) 
	{
		usermain("manjumanju");

	}


}
