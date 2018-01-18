/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skcet
 */
public class Sentence_Case {
	
	public static String output1;
	
	public static void usermain(String input)
	
	{
		int array_size=0,i=0;
		char first_char;
		String temp="";
		String[] array=input.split(" ");
		
		
		for(String ss:array)
		{
			array_size++;
			
					
		}
		for(int j=0;j<array_size;j++)
		{
			//System.out.print(array[j]+"\n");
			
			char fUpper = Character.toUpperCase(array[i].charAt(0));
			//System.out.print(fUpper);
			//char dummy=array[i].charAt(0);
			
			array[i]=array[i].substring(1,array[i].length());
                    
			
			temp=temp + fUpper+array[i]+" ";
			
			i++;
                    
			
			
			
		}
		System.out.print(temp);
		
	}

	public static void main(String[] args) {
		
		usermain("hello activa");
		usermain("sena sudsh");
		
		

	}

}
