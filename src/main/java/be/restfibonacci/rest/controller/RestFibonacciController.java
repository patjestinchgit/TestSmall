/**
 * 
 */
/**
 * @author patrick
 *
 */
package be.restfibonacci.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.restfibonacci.rest.calculator.Calculator;
import be.restfibonacci.rest.services.FibonacciService;


@RestController
@RequestMapping(path = "/fibonacci-sequence")
public class RestFibonacciController 
{
    private final FibonacciService fibonacciservice;
    private Calculator calculator;
    
    
    @Autowired
    RestFibonacciController(FibonacciService fibonacciservice) {
		this.fibonacciservice = fibonacciservice;
		this.calculator = calculator = new Calculator();
    }
    
    @GetMapping(path="/10", produces = "application/json")
    public ArrayList<Integer> getFibonacciTen() 
    {	
        return (ArrayList<Integer>) fibonacciservice.calculateFiboacci(10, calculator);
    }
    
    @GetMapping(path="/5", produces = "application/json")
    public ArrayList<Integer> getFibonacciFive() 
    {
	return (ArrayList<Integer>) fibonacciservice.calculateFiboacci(5, calculator);
    }
}