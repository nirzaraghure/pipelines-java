package com.microsoft.demo;

import org.junit.*;

public class DemoTest {
    private Demo demo;

    @Before
    public void setUp() throws Exception {
        demo = new Demo();
    }
    
    @After
    public void tearDown() throws Exception {
        demo = null;
    }

    @Test
    public void testDoSomethingWithTrueFlag() {
        try{
            demo.DoSomething(true);
        } catch (Exception e) {
            Assert.fail("Expected no exception to be thrown");
        }
    }
    
    @Test
    public void testDoSomethingWithFalseFlag() {
        try{
            demo.DoSomething(false);
        } catch (Exception e) {
            Assert.fail("Expected no exception to be thrown");
        }
    }
}