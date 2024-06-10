package com.abhi.oops;

public class Main1
{
	
  public  void method(int ... a)
	  { System.out.println(1); }
	 
 
   public  void method1(int[] a)
    {
        System.out.println(2);
    }
    
    public static void main(String[] args) {
		//Main1 obj = new Main1();
	    //obj.method(1, 2, 3); // Outputs: 1
	    int[] arr = {1, 2, 3};
	    Main1 obj = new Main1();
	    obj.method1(arr);  // Outputs: 2

    
}
}
