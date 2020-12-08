package com.softhinkers.testngparameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testngparameters
 * @date 12/8/2020
 */
public class Param {

    @Test
    @Parameters({"val1", "val2"})
    public void Sum(int v1, int v2) {
        int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
    }

    @Test
    @Parameters({"val1", "val2"})
    public void Diff(int v1, int v2) {
        int finaldiff = v1 - v2;
        System.out.println("The final difference of the given values is " + finaldiff);
    }
}


