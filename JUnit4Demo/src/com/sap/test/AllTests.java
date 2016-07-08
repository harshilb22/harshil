package com.sap.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ calcTest.class, RoundTest.class, LoanTest.class })
public class AllTests {

}
