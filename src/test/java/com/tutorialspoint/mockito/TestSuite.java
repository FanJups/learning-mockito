package com.tutorialspoint.mockito;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tutorialspoint.mockito.mathapplication.MathApplicationTest;
import com.tutorialspoint.mockito.stocks.PortfolioTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ PortfolioTest.class, MathApplicationTest.class, })
public class TestSuite {

}
