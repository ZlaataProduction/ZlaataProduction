package runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.EmailSendUtils;
import utils.ExcelReportUtil;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/rerun.txt"},
features = {"src/test/resources/features/HomePage","src/test/resources/features/FooterSection","src/test/resources/features/SignUp","src/test/resources/features/Login"},
glue = "stepDef",	
monochrome = true,	
dryRun = false
//tags="@TC_UI_Zlaata_COP_14"

)	
public class TestRunner {	
	
	static {
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        Logger.getLogger("org.apache.http").setLevel(Level.OFF);
        System.setProperty("webdriver.chrome.logfile", "NUL");
        System.setProperty("webdriver.chrome.verboseLogging", "false");
	}


        
//    }

@AfterClass
public static void generateExcelReport() {
	 ExcelReportUtil.generateExcelReport();
//	 EmailSendUtils.sendEmail();
}
}



//



