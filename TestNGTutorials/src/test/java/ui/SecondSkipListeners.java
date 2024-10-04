package ui;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SecondSkipListeners.TestListener.class)
public class SecondSkipListeners {

    private static int testCounter = 0;

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

    public static class TestListener implements ITestListener {

        @Override
        public void onTestStart(ITestResult result) {
            testCounter++;
            // Skip every second test
            if (testCounter % 2 == 0) {
                throw new SkipException("Skipping this test as it's the second test.");
            }
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            System.out.println("Test " + result.getName() + " passed.");
        }

        @Override
        public void onTestFailure(ITestResult result) {
            System.out.println("Test " + result.getName() + " failed.");
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            System.out.println("Test " + result.getName() + " was skipped.");
        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

        @Override
        public void onStart(ITestContext context) {}

        @Override
        public void onFinish(ITestContext context) {}
    }
}