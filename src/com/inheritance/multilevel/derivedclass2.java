package com.inheritance.multilevel;

public class derivedclass2  extends baseclass {
		
		
		public void multilevel()
		{
			System.out.println("Run the Process...");
			
		}
		public static void main(String args[])  {
			
			 baseclass b1,b3;
			 derivedclass1 b2;
		 
	      
	       b1 = new baseclass();
	       b2 = new derivedclass1();
	       b3 = new derivedclass2();
	       
	       b1.multilevel();
	       b2.display();
	       b3.multilevel();
	      
	     }

}
