package com.FaysalBinHasan;

public class CircularArray{
	  
	  private int start;
	  private int size;
	  private Object [] cir;
	  
	  /*
	   * if Object [] lin = {10, 20, 30, 40, null}
	   * then, CircularArray(lin, 2, 4) will generate
	   * Object [] cir = {40, null, 10, 20, 30}
	   */
	  public CircularArray(Object [] lin, int st, int sz){
	    //TO DO
	    Object []cv=new Object[lin.length];
	    size=sz;
	    start=st;
	    int k=st;
	    for(int i=0;i<sz;i++){
	    cv[k]=lin[i];
	    k=(k+1)%lin.length;
	    }
	    cir=cv;
	  }
	  
	  //Prints from index --> 0 to cir.length-1
	  public void printFullLinear(){
	        //TO DO
	      for(int i=0;i<cir.length;i++){
	        System.out.print(cir[i]+"  ");
	      }
	  }
	  
	  // Starts Printing from index start. Prints a total of size elements
	  public void printForward(){
	    //To DO
	    int k=start;
	    System.out.println("\nPrint forward:" + "  ");
	     for(int i=0;i<size;i++){
	        System.out.println(cir[k]+" "); 
	        k=(k+1)%cir.length;
	      }
	  }
	  
	  
	  public void printBackward(){
	   //TO DO
	    int k=(start+size-1)%cir.length;
	    System.out.println(" "+"\nPrint Backward" + " ");
	     for(int i=0;i<size;i++){
	        System.out.println(cir[k]+" "); 
	        k--;
	        if(k==-1){
	          k=cir.length-1;
	        }
	      }
	  }
	  
	  // With no null cells
	  public void linearize(){
	    //TO DO
	    Object[] linear =new Object[size];
	    int k=start;
	    for(int i=0;i<size;i++){
	      linear[i]=cir[k];
	      k=(k+1)%cir.length;
	    }
	  }
	  
	  // Do not change the Start index
	  public void resizeStartUnchanged(int newcapacity){
	    //TO DO
	    System.out.println("resizeStartUnchanged " + "   ");
	    Object[]resizedArr =new Object[size];
	    int k=start;
	  
	    for(int i=0;i<size;i++){    
	         if(k<start){
	           resizedArr[k]=null;
	        }
	         if(k>start+size-1){
	           resizedArr[k]=null;
	         }  
	      resizedArr[i]=cir[k];
	      k=(k+1)%cir.length;
	    }
	    cir=resizedArr;
	  }
	  
	  // Start index becomes zero
	  public void resizeByLinearize(int newcapacity){
	    //TO DO
	    Object[] resize =new Object[newcapacity];
	    int k=start;
	    for(int i=0;i<size;i++){
	      resize[i]=cir[k];
	      k=(k+1)%cir.length;
	    }
	    cir=resize;
	  }
	  
	  /* pos --> position relative to start. Valid range of pos--> 0 to size.
	   * Increase array length by 3 if size==cir.length
	   * use resizeStartUnchanged() for resizing.
	   */
	  public void insertByRightShift(Object elem, int pos){
	    //TO DO
	    if(size==cir.length){
	      
	      resizeByLinearize(8);
	    }
	    System.out.println("insertByRightShift:" + "  " );
	    int numOfShift=size-pos;
	    int from=(start+size-1)%cir.length;
	    int to=(from+1)%cir.length;
	     for(int i=0;i<numOfShift;i++){
	       cir[to]=cir[from];
	       to=from;
	       from--;
	       if(from<0){
	         from=cir.length-1;
	       }
	       int index=(start+pos)%cir.length;
	       cir[index]=elem;
	       size++;
	     }
	  }
	  public void insertByLeftShift(Object elem, int pos){
	    //TO DO
	    if(cir.length==size){
	      resizeByLinearize(8);
	    }
	    System.out.println("insertByLeftShift"  + "   ");
	    int numOfShift=pos-1;
	    int from=start;
	    int to=from-1;
	    if(to<0){
	      to=cir.length-1;
	    }
	     for(int i=0;i<numOfShift;i++){
	       cir[to]=cir[from];
	       to=(to+1)%cir.length;
	       from=(from+1)%cir.length;
	     }
	     int index=start;
	     cir[index]=elem;
	     size++;
	     start--;
	     if(start<0){
	     start=cir.length-1;
	     }
	  }
	  
	  /* parameter--> pos. pos --> position relative to start.
	   * Valid range of pos--> 0 to size-1
	   */
	  public void removeByLeftShift(int pos){
	 
	    int numOfShift=size-(pos+1);
	    int to=(start+pos)%cir.length;
	    int from=(to+1)%cir.length;
	    System.out.println("\nremove by leftShift"  + "   ");
	    for(int i=0;i<numOfShift;i++)
	    {
	      cir[to]=cir[from];
	      to=from+1;
	      from=(from+1)%cir.length;
	    }
	    cir[(start+size-1)%cir.length]=null;
	    size--;
	    //TO DO
	  }
	  
	  /* parameter--> pos. pos --> position relative to start.
	   * Valid range of pos--> 0 to size-1
	   */
	  public void removeByRightShift(int pos){
	    //TO DO
	    System.out.println("\nremoveByRightShift:"  + "   ");
	    int numOfShift=pos;
	    int to=(start+pos)%cir.length;
	    int from=(to-1);
	    if(from<0)
	    {
	      from=cir.length-1;
	    }
	    for(int i=0;i<numOfShift;i++)
	    {
	      cir[to]=cir[from];
	      to=from;
	      from--;
	      if(from<0)
	      {
	        from=cir.length-1;
	      }
	    }
	    cir[start]=null;
	    start=(start+1)%cir.length;
	    size--;
	  }
	  
	}