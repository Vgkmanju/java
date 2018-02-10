public class Multicatch {
  
    public static void main(String a[]){
        int b,c[]={3,4,5};
        try{
            b=5/0;
            System.out.println(c[3]);
            
        }
        catch(ArithmeticException ex){
            System.out.println("out of memory");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
