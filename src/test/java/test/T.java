package test;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class T extends TestBaseReports {
    @Test
    public void test() {

        // Raporlama için oblemizi ekliyoruz
        extentTest = extentReports.createTest("amazonTest");

        //  o https://www.amazon.com.tr/ sitesi açılır.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("Amazon Sitesi Açıldı");


    }


}
