package be.restfibonacci.rest.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> sequencefibonacci;
    
    
    public Calculator() {
	this.sequencefibonacci = new ArrayList<Integer>();
    }

    public List<Integer> getSequence(int sequence) {
	// TODO Auto-generated method stub
	 int n1=1,n2=1,n3,count=sequence;   
	     System.out.print(n1+" "+n2);//printing 0 and 1 
	     
	     sequencefibonacci.add(n1);
	     sequencefibonacci.add(n2);
	       
	     for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed   
	     {   
	      n3=n1+n2;   
	      sequencefibonacci.add(n3);   
	      n1=n2;   
	      n2=n3;   
	     }   
	return sequencefibonacci;
    }
    
    
}
