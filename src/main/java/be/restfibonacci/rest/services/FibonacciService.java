package be.restfibonacci.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.restfibonacci.rest.calculator.Calculator;

@Service
public class FibonacciService {
    
    @Autowired
    public FibonacciService() {
	
    }
    
    public List<Integer> calculateFiboacci(int sequence, Calculator calculator){
	return calculator.getSequence(sequence);
    }
}
