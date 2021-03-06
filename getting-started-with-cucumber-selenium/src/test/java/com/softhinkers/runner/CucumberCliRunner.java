package com.softhinkers.runner;

import io.cucumber.core.cli.Main;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.junit.AfterClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.softhinkers.common.BaseTest.getDriver;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.runner
 * @date 1/6/2021
 */

public class CucumberCliRunner {
    public static void main(String[] arg) {
        Main.main("--glue", "com.softhinkers.stepdefinition",
                "--features", "src/test/resources/com/softhinkers/feature/"
        );
    }

    @AfterClass
    public static void tearDown() {
        getDriver().close();
        getDriver().quit();
        generateReport();
    }

    public static void generateReport() {


        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");

        String buildNumber = "1";
        String projectName = "getting-started-with-cucumber-selenium";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();

    }

}
