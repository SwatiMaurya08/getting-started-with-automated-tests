
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package PACKAGE_NAME
 * @date 11/10/2020
 */
public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
