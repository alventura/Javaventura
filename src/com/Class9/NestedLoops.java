package com.Class9;

public class NestedLoops {

	public static void main(String[] args) {
//      for (int i=0; i<=5; i++) {
//      System.out.print(i);
//  }

  /*I want to print pattern
   * 123456789 -->rows =5, columns=9
   * 123456789
   * 123456789
   * 123456789
   * 123456789
   */
  
  for (int i=1; i<=5; i++) {
      
      for (int y=1; y<=9; y++) {
          
          System.out.print(y);//12345
      }
      System.out.println();
  }
  
  /*I want to print pattern
   * 1111111 --> rows=7, columns=7
   * 2222222
   * 3333333
   * 4444444
   * 5555555
   * 6666666
   * 7777777
   */
  
  for (int i=1; i<=7; i++) {
      
      for (int y=1; y<=7; y++) {
          System.out.print(i);//1111111 //2222222
      }
      System.out.println();
		}
  
  for(int i=1; i<5; i++) {
	  
	  for(int e=1; e<=i; e++) {
		  
		  System.out.print("*");
	  }
	  System.out.println();
  }
  
  
  }
  

	}


