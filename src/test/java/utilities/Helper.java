package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	public static void takeScreenShot(WebDriver driver,String screenShotName)
	{
		//Path dest = Paths.get("./Screenshots",screenShotName+".png");
		try {
			/*Files.createDirectory(dest.getParent());
			FileOutputStream out = new FileOutputStream(dest.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();*/
			TakesScreenshot SS = (TakesScreenshot) driver;
			File SSFile = SS.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SSFile, new File ("./Screenshots/"+screenShotName+".png"));
		} catch (IOException e) {
			System.out.println("Exception while taking ScreenShot"+e.getMessage());
		}
	}
}
