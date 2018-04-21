package com.FaysalBinHasan;


public class LinearArray{
	  public static void main(String [] args){
	    int [] a = {10, 20, 30, 40, 50, 60};
	    
	    System.out.println("\n///// TEST 01: Copy Array example /////");
	    int [] b = copyArray(a, a.length);
	    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    
	    System.out.println("\n///// TEST 02: Print Reverse example /////");
	    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
	    
	    
	    System.out.println("\n///// TEST 03: Reverse Array example /////");
	    reverseArray(b);
	    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
	    
	    
	    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
	    b = copyArray(a, a.length);
	    b=shiftLeft(b,3);
	    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
	    
	    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
	    b = copyArray(a, a.length); 
	    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    b=rotateLeft(b,3);
	    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
	    
	    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
	    b = copyArray(a, a.length);
	    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    b=shiftRight(b,3);
	    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
	    
	    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
	    b = copyArray(a, a.length);
	    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    b=rotateRight(b,3);
	    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
	    
	    
	    System.out.println("\n///// TEST 08: Insert example 1 /////");
	    
	    b = copyArray(a, a.length);
	    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
	    System.out.println(bol); // This Should Print: false
	    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
	    
	    System.out.println("\n///// TEST 09: Insert example 2 /////");
	    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
	    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
	    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
	    System.out.println(bol); // This Should Print: true
	    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
	    
	    System.out.println("\n///// TEST 10: Insert example 3 /////");
	    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
	    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
	    System.out.println(bol); // This Should Print: true
	    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
	    
	    System.out.println("\n///// TEST 11: Remove example 1 /////");
	    
	    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
	    bol=removeAll(c,7,90);
	    System.out.println(bol); // This Should Print: false
	    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
	    
	    System.out.println("\n///// TEST 12: Remove example 2 /////");
	    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
	    bol=removeAll(c,7,70);
	    System.out.println(bol); // This Should Print: true
	    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
	  }
	  
	  // Prints the contents of the source array
	  public static void printArray(int [] source){
	    // TO DO
	 
	   for(int i=0;i<source.length;i++){
	         System.out.print(source[i]+" ");
	    }
	  }
	  
	  // Prints the contents of the source array in reverse order
	  public static void printReverse(int [] source){
	    int i;
	    for(i=source.length-1;i>=0;i--){
	     System.out.print(source[i]+" ");;
	    }
	     
	    // TO DO
	    
	  }
	  
	  // creates a copy of the source array and returns the reference of the newly created copy array
	  public static int [] copyArray(int [] source, int len){
	    // TO DO
	    int copy[]=new int[len];
	    for(int i=0;i<len;i++){
	         copy[i]=source[i];
	    }
	    return copy; // remove this line    
	  }
	  
	  // creates a reversed copy of the source array and returns the reference of the newly created reversed array
	  public static void reverseArray(int [] source){
	    // TO DO
	      int i=0;
	    int j=source.length-1;
	    while(i<j){
	      int tmp=source[i];
	      source[i]=source[j];
	      source[j]=tmp;
	      i++;
	      j--;        
	    }
	  }
	  
	  // Shifts all the elements of the source array to the left by 'k' positions
	  // Returns the updated array
	  public static int [] shiftLeft(int [] source, int k){
	    // TO DO
//	    if(k<0||k>source.length){
//	    }
	    int size=source.length;
	    for(int i=k;i<size;i++){
	      source[i-k]=source[i];  
	    }
	    for(int i=size-k;i<size;i++){
	      source[i]=0;
	    }
	    return source; // remove this line    
	  }
	  
	  // Rotates all the elements of the source array to the left by 'k' positions
	  // Returns the updated array
	  public static int [] rotateLeft(int [] source, int k){
	    // TO DO

	      for(int i=0;i<k;i++){
	      int temp=source[0];
	      for(int j=0;j<source.length-1;j++){
	        source[j]=source[j+1];
	      }
	      source[source.length-1]=temp; 
	    }
	    return  source; 
	  } 
	  // remove this line    
	  
	  // Shifts all the elements of the source array to the right by 'k' positions
	  // Returns the updated array
	  public static int [] shiftRight(int [] source, int k){
	    // TO DO
	    int size=source.length;
	    for(int i=size-1;i>k;i--){
	      source[i]=source[i-k];
	    }
	    for(int i=0;i<k;i++){
	    source[i]=0;
	    }
	    
	    return source; // remove this line    
	  }
	  
	  // Rotates all the elements of the source array to the right by 'k' positions
	  // Returns the updated array
	  
	  public static int [] rotateRight(int [] source, int k){
	    // TO DO
	    
	    for(int p=0;p<k;p++){
	      int temp=source[source.length-1];
	      for(int i = source.length-1, j = i-1; i > 0; i--, j--){
	        source[i]=source[j];
	      }
	      source[0]=temp; 
	    }
	    return source; // remove this line    
	  }
	  
	
	    
	  public static boolean insert(int [] arr, int size, int elem, int index){
	    // TO DO
	    if(size==arr.length){
	      System.out.println("no space left");
	        return false;
	    }else{
	      if(size<arr.length){
	        {
	          System.out.println("number of Insertion After" +" " +(size+1));
	        
	        }
	     for(int i=size;i>index;i--){
	      arr[i]=arr[i-1];
	     }
	    }     
	    arr[index]=elem;
	    }
	    return true; // remove this line    
	  }
	  
	  /** 
	   * removes all the occurences of the given element
	   * @param arr the reference to the linear array
	   * @param size the number of elements that exists in the array. size<=arr.length
	   * @param elem the element to be removed
	   * @return true if removal is successful; return false otherwise
	   * if removal is successful, print the 'Number of elements after removal' is completed
	   */  
	  public static boolean removeAll(int [] arr, int size, int elem){
	    // TO DO
	    int index;
	    for(index=0;index<arr.length;index++){
	      if((arr[index])==(elem)){
	         for(int i=index+1;i<size;i++)
	         {
	           arr[i-1]=arr[i];
	           arr[size-1]=0;
	         }
	          size--;
	          return true;
	        }
	      }
	      return false;
	    }
	     // remove this line 
	}