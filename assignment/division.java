

import java.util.Scanner;
 
class Division {
  public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
  int a, b, result;
 
    System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
 
  result = a / b;
 
  System.out.println("Result = " + result);
  }
}
