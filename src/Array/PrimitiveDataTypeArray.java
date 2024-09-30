package Array;

import java.util.Iterator;

public class PrimitiveDataTypeArray {
	public static void main(String[] args) {
		
		 byte[] byteNumber = new byte[555] ;
		 short[] shortNumber = new short[20];
		 int[] intergerNumber = new int[10];
		 long[] longNumber = new long[30] ;
		 float[] floatNumber = new float[10];
		 boolean[] booleanNumber = new boolean[10];
		 char[] charNumber = new char[10];
		 double[] doubleNumber = new double[10] ;
		 
		 byte b = -128;
		 short s = -32768;
		 int in = 0 ;
		 long l = 0 ;
		 double d = 1254.015555;
		 float f = 25.45f;
		 
		 
		  for(int i= 0; i <byteNumber.length;i++) {
			  		  
			  byteNumber[i]=b;
			  b++;
			  System.out.println("Byte Number :- "+byteNumber[i]);
		  }
		  for(int i=0; i<shortNumber.length ; i++) {
			  shortNumber[i]=s;
			  s++;
			  System.out.println("Short Number :-"+shortNumber[i]);
		  }
		  for(int i= 0 ; i<intergerNumber.length ; i++) {
			  intergerNumber[i]=in;
			  in++;
			  System.out.println("Interger Number :- "+intergerNumber[i]);
		  }
		  
		  for (int i = 0; i < longNumber.length; i++) {
			  longNumber[i]=l ;
			  System.out.println("Long Numebr :- "+longNumber[i]);
			  l++ ;
			
		}
		  for (int i = 0; i < doubleNumber.length; i++) {
			  doubleNumber[i]= d;
			  System.out.println("Double Number :-"+doubleNumber[i]);
			  d+=0.55;
			  
			
		}
		  for (int i = 0; i < floatNumber.length; i++) {
			  floatNumber[i] = f ;
			  System.out.println("Float Number :- "+doubleNumber[i]);
			  f+=0.1;
			  
			
		}
		  
			
		
		  
		  
			  
		
		
	}

}
