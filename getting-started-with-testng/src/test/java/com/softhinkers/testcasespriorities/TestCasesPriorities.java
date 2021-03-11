package com.softhinkers.testcasespriorities;

import com.softhinkers.addition.TestAddition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testcasespriorities
 * @date 12/3/2020
 */
public class TestCasesPriorities {
    public static final Logger LOGGER = LogManager.getLogger(TestCasesPriorities.class);
    @Test(priority = 1)
    public void b_method() {
        LOGGER.info("This is B Method");
    }

    @Test(priority = 1)
    public void a_method() {
       LOGGER.info("This is A Method");
    }

    @Test
    public void d_method() {
      LOGGER.info("This is D Method");
    }

    @Test
    public void c_method() {
       LOGGER.info("This is C Method");
    }

    @Test(priority = 2)
    public void e_Method() {
        LOGGER.info("This is E Method");
    }
}
