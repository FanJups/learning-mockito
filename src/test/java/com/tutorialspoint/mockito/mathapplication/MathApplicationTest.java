package com.tutorialspoint.mockito.mathapplication;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

//@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

//@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd() {
	// add the behavior of calc service to add two numbers
	when(calcService.add(10.0, 20.0)).thenReturn(30.00);

	// add the behavior of calc service to subtract two numbers
	when(calcService.subtract(20.0, 10.0)).thenReturn(10.00);

	// test the add functionality
	Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
	Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
	Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);

	// test the subtract functionality
	Assert.assertEquals(mathApplication.subtract(20.0, 10.0), 10.0, 0.0);

	// check a minimum 1 call count
	verify(calcService, atLeastOnce()).subtract(20.0, 10.0);

	// check if add function is called minimum 2 times
	verify(calcService, atLeast(2)).add(10.0, 20.0);

	// check if add function is called maximum 3 times
	verify(calcService, atMost(3)).add(10.0, 20.0);

    }
}