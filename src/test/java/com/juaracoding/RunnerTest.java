package com.juaracoding;

import com.juaracoding.pages.HariLiburPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/DayOffPage.feature",
                "src/main/resources/features/EventDatePage.feature",
                "src/main/resources/features/HariLiburPage.feature",
                "src/main/resources/features/LaporanSemuaPage.feature"},
        //src/main/resources/features/EventDatePage.feature
        //src/main/resources/features/HariLiburPage.feature
        //src/main/resources/features/DayOffPage.feature
        //src/main/resources/features/LaporanSemuaPage.feature
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
 