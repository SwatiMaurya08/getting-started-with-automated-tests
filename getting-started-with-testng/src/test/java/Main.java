import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package PACKAGE_NAME
 * @date 11/10/2020
 */
public class Main {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
