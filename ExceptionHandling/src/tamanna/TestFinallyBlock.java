package tamanna;
public class TestFinallyBlock {    
  public static void main(String args[]){    
  try{    
   int data=25/5;    
   System.out.println(data);    
  }     
  catch(NullPointerException e){  
System.out.println(e);  
}      
 finally {  
System.out.println("finally block will be executed");  
}    
    
System.out.println("rest of code");    
  }    
}    