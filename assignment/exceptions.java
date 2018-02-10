public class Exceptions {
   
  public static void main(String[] args) {
 
  String languages[] = { "C", "C++", "Java", "Perl", "Python" };
 
  try {
    for (int c = 0; c <=5; c++) {
      System.out.println(languages[c]);
    }System.out.println("Finished");
  }
   
      
  
  catch (Exception e) {
    System.out.println(e);
      }
  finally{
      System.out.println("Finished");
  }
  }
}


