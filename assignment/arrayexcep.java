import java.util.*;
import java.io.*;
public class arrayexcep {
    

  public static void main(String[] args) {
 
  int a[]={ 2,4,5};
  try{
  	System.out.println(a[3]);
  }
 catch(Exception e){
 	System.out.println("Array out of bound");
 }
   System.out.println("hi");
  }
}
    

