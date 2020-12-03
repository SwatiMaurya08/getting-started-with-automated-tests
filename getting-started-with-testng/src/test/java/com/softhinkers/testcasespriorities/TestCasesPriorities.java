package com.softhinkers.testcasespriorities;

import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testcasespriorities
 * @date 12/3/2020
 */
public class TestCasesPriorities {
    @Test(priority = 1)
    public void b_method() {
        System.out.println("This is B Method");
    }

    @Test(priority = 1)
    public void a_method() {
        System.out.println("This is A Method");
    }

    @Test
    public void d_method() {
        System.out.println("This is D Method");
    }

    @Test
    public void c_method() {
        System.out.println("This is C Method");
    }

    @Test(priority = 2)
    public void e_Method() {
        System.out.println("This is E Method");
    }
}
