// byValueExercise.java
// rename to Main.java


package aloni.main; // check that the package name is correct

public class Main {
 
   public static void main(String[] args){

   int num = 10;   
   System.out.println(num);
   
   // >>>>>>>>>>>  01  >>>>>>>>>>>
   // add the proper source code
   // in order to change to increase
   // the value of num with a method call
   
    
    
    

    num = increase(num);    
   
    
    
    
    
   // <<<<<<<<<<  01  <<<<<<<<<<
   
   System.out.println(num);
   
}
   
   // >>>>>>>>>>>  02  >>>>>>>>>>>
   // you can change the method below
   // in any way you want
   static int increase(int x)
    {
        x += 1;
        return x;
    }
   // <<<<<<<<<<  02  <<<<<<<<<<   
   
} // end of class Main
