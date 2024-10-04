package ui;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkipSecondTest {

    private static int testCounter = 0;

    @BeforeMethod
    public void beforeMethod() {
        testCounter++;
        // Only skip for every second test
        if (testCounter % 2 == 0) {
            throw new SkipException("Skipping this test case as it is the second test.");
        }
    }

    @Test
    public void test1() {
        System.out.println("Executing Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Executing Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Executing Test 3");
    }

    @Test
    public void test4() {
        System.out.println("Executing Test 4");
    }

    @Test
    public void test5() {
        System.out.println("Executing Test 5");
    }

    @Test
    public void test6() {
        System.out.println("Executing Test 6");
    }
}
