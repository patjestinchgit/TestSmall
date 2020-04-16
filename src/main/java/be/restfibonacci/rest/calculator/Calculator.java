package be.restfibonacci.rest.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> sequencefibonacci;
    
    public Calculator() {
	this.sequencefibonacci = new ArrayList<Integer>(); 
    }

    public List<Integer> getSequencefibonacci(int sequence) {
	if(sequencefibonacci.isEmpty() == false) sequencefibonacci.clear();
	sequencefibonacci = calculateSequence(sequence);
	return sequencefibonacci;
    }
    
    private List<Integer> calculateSequence(int sequence) {
	// TODO Auto-generated method stub
	List<Integer> sequencefibonaccilocal = new ArrayList<Integer>();
	int n1 = 1, n2 = 1, n3, count = sequence;
	sequencefibonaccilocal.add(n1);
	sequencefibonaccilocal.add(n2);

	for (int i = 2; i < count; ++i) {
	    n3 = n1 + n2;
	    sequencefibonaccilocal.add(n3);
	    n1 = n2;
	    n2 = n3;
	}
	return sequencefibonaccilocal;
    }

}
