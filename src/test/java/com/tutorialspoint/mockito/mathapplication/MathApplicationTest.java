package com.tutorialspoint.mockito.mathapplication;

import static org.mockito.Mockito.doThrow;

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

    @Test(expected = RuntimeException.class)
    public void testAdd() {
	// add the behavior to throw exception
	doThrow(new RuntimeException("Add operation not implemented")).when(calcService).add(10.0, 20.0);

	// test the add functionality
	Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
    }
}