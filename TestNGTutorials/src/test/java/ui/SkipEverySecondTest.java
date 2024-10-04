package ui;

import org.testng.annotations.Test;

public class SkipEverySecondTest {

    @Test
    public void test1() {
        System.out.println("Executing Test 1");
    }

    @Test(enabled = false) // Skipping this test
    public void test2() {
        System.out.println("Executing Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Executing Test 3");
    }

    @Test(enabled = false) // Skipping this test
    public void test4() {
        System.out.println("Executing Test 4");
    }

    @Test
    public void test5() {
        System.out.println("Executing Test 5");
    }

    @Test(enabled = false) // Skipping this test
    public void test6() {
        System.out.println("Executing Test 6");
    }
}
