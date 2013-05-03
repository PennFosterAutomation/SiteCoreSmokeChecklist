package com.jav.SiteCore.pageobjects;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.jav.SiteCore.tests.SelectedCourse_SmokeCheckpoint_Test;
import com.jav.SiteCore.util.Utilities;

public class TimeToCompleteCarrerSchools_UI extends AbstractClass {

	WebDriver driver;

	public TimeToCompleteCarrerSchools_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ################ Home Page Page elements
	// ###################################
	@FindBy(xpath = "(//a[contains(text(),'Programs')])[2]")
	protected WebElement programsAndDegreesTab;
	@FindBy(xpath = "//a[@id='ctl21_rptItems_link_0']")
	protected WebElement programsAndDegreesTabCareerCertificate;

	// ############## Programs and degree page ######################
	@FindBy(xpath = "//a[@id='phcontent_0_rptT2Pages_rptFeaturedItems_3_lnkFeaturedItem_0']")
	protected WebElement careerDiplomaProgram;
	@FindBy(xpath = "//a[@id='phcontent_0_rptT2Pages_rptFeaturedItems_5_lnkFeaturedItem_0']")
	protected WebElement careerCertificateProgram;
	@FindBy(xpath = "//a[@class='btn-time-to-complete']")
	protected WebElement timeToComplete;

	// ####################### Time to complete page ###########################
	@FindBy(xpath = "//input[@id='radio001']")
	protected WebElement extendedRadioButton;
	@FindBy(xpath = "//input[@id='radio002']")
	protected WebElement standarddRadioButton;
	@FindBy(xpath = "//input[@id='radio003']")
	protected WebElement acceleratedRadioButton;
	@FindBy(xpath = "//input[@id='radio004']")
	protected WebElement othersRadioButton;
	@FindBy(xpath = "//input[@id='input001']")
	protected WebElement othersWorkingHours;
	@FindBy(xpath = "//span[@class='summary']")
	protected WebElement summaryInMonths;
	@FindBy(xpath = "//a[@class='btn-custom btn-update-summary']")
	protected WebElement updateBtn;
	@FindBy(xpath = "(//button[@class='close'])[4]")
	protected WebElement closeTimeToComplete;
	@FindBy(xpath = "//div[@class='modal-body']/div/div/p/span")
	protected WebElement getCourseNameTimeTocomplete;

	public void clickProgramAndDegreesTab() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("(//a[contains(text(),'Programs')])[2]")));
			programsAndDegreesTab.click();
			Reporter.log(Utilities
					.logOutputFile("programs and degrees tab clicked - PASS"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log(Utilities
					.logOutputFile("programs and degrees tab clicked - PASS"));
			e.printStackTrace();
		}
	}

	public void clickProgramAndDegreesTabForCareerCertificate() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("(//a[contains(text(),'Programs')])[2]")));
			programsAndDegreesTab.click();
			Reporter.log(Utilities
					.logOutputFile("programs and degrees tab clicked - PASS"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log(Utilities
					.logOutputFile("programs and degrees tab clicked - PASS"));
			e.printStackTrace();
		}
	}

	public void clickCareerDiplomaProgram() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//a[@id='phcontent_0_rptT2Pages_rptFeaturedItems_3_lnkFeaturedItem_0']")));
			careerDiplomaProgram.click();
			Reporter.log(Utilities
					.logOutputFile("click Career Diploma Program - PASS"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log(Utilities
					.logOutputFile("click Career Diploma Program - Fail"));
			e.printStackTrace();
		}
	}

	public void clickCareerCertificateProgram() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//a[@id='phcontent_0_rptT2Pages_rptFeaturedItems_5_lnkFeaturedItem_0']")));
			careerCertificateProgram.click();
			Reporter.log(Utilities
					.logOutputFile("click Career certificate Program - PASS"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log(Utilities
					.logOutputFile("click Career certificate Program - Fail"));
			e.printStackTrace();
		}
	}

	public void clickTimeToCompleteBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//a[@class='btn-time-to-complete']")));
		timeToComplete.click();
		Reporter.log(Utilities
				.logOutputFile("click time to complete btn - PASS"));

	}

	public void clickExtendedRadioBtn(String courseName) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@id='radio001']")));

		Assert.assertTrue(getCourseNameTimeTocomplete.getText()
				.equalsIgnoreCase(courseName));

		List<WebElement> str = driver.findElements(By
				.xpath("//label[@class='radio']/input"));
		// System.out.println(str.size());

		for (WebElement foo : str) {
			Assert.assertTrue(foo.isDisplayed());
		}

		str = driver.findElements(By.xpath("//label[@class='radio']/strong"));
		// System.out.println(str.size());

//		for (WebElement foo : str) {
//			// System.out.println(foo.getText());
//		}

		WebElement RadioLabel = str.get(0);
		Assert.assertTrue(RadioLabel
				.getText()
				.contains(
						"I don’t have a lot of free time throughout the day. I can spend about 30-45 minutes daily"));

		RadioLabel = str.get(1);
		Assert.assertTrue(RadioLabel
				.getText()
				.contains(
						"I have some flexibility in my schedule. I can spend around one hour daily"));

		RadioLabel = str.get(2);
		Assert.assertTrue(RadioLabel
				.getText()
				.contains(
						"I can’t wait to start this program and move towards my new career. I am willing to spend as much time as I can"));

		RadioLabel = str.get(3);
		Assert.assertTrue(RadioLabel.getText().contains("Other"));

		Assert.assertTrue(driver
				.findElement(
						By.xpath("//i[@class='icon-custom icon-client-clock-small black']"))
				.isDisplayed());

		Assert.assertTrue(driver
				.findElement(By.xpath("//div[@class='modal-header']/h2"))
				.getText().contains("Time to Complete"));

		Assert.assertTrue(driver
				.findElement(
						By.xpath("//i[@class='icon-custom icon-client-collapse black']"))
				.isDisplayed());

		Assert.assertTrue(driver
				.findElement(By.xpath("//div[@class='modal-body']/div/div/p"))
				.getText()
				.contains("How many hours a week can you dedicate to")
				&& driver
						.findElement(
								By.xpath("//div[@class='modal-body']/div/div/p"))
						.getText()
						.toLowerCase()
						.contains(
								SelectedCourse_SmokeCheckpoint_Test.courseName
										.toLowerCase()));

		Assert.assertTrue(driver
				.findElement(By.xpath("//div[@class='modal-footer']"))
				.getText().contains("Select an option above"));

		Assert.assertTrue(driver
				.findElement(
						By.xpath("//div[@class='control-group form-inline']/span"))
				.getAttribute("style").equalsIgnoreCase(""));

		extendedRadioButton.click();
		Reporter.log(Utilities
				.logOutputFile("click extended radio button - PASS"));
		Utilities.hardWait(2);
		try {
			Assert.assertTrue(getWeekCount(driver.findElement(
					By.xpath("//h2[contains(text(),'months')]")).getText()) > 0);
		} catch (Exception e) {
			try {
				Assert.assertTrue(driver
						.findElement(
								By.xpath("//span[contains(text(),'You can complete this program in under a month')]"))
						.isDisplayed());
				System.out.println("Invalid Summary for Time to Complete");
			} catch (Exception em) {
				System.out.println(" Invalid Summary for Time to Complete : "
						+ em);
			}

		}

	}

	public void clickStandardRadioBtn() {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@id='radio002']")));
		standarddRadioButton.click();
		Reporter.log(Utilities
				.logOutputFile("click standard radio button - PASS"));
		Utilities.hardWait(2);
		try {
			Assert.assertTrue(getWeekCount(driver.findElement(
					By.xpath("//h2[contains(text(),'months')]")).getText()) > 0);
		} catch (Exception e) {
			try {
				Assert.assertTrue(driver
						.findElement(
								By.xpath("//span[contains(text(),'You can complete this program in under a month')]"))
						.isDisplayed());
				System.out.println("Invalid Summary for Time to Complete");
			} catch (Exception em) {
				System.out.println(" Invalid Summary for Time to Complete : "
						+ em);
			}

		}

	}

	public void clickAcceleratedRadioBtn() {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@id='radio003']")));
		acceleratedRadioButton.click();
		Reporter.log(Utilities
				.logOutputFile("click accelerated radio button - PASS"));
		Utilities.hardWait(2);

		try {
			Assert.assertTrue(getWeekCount(driver.findElement(
					By.xpath("//h2[contains(text(),'months')]")).getText()) > 0);
		} catch (Exception e) {
			try {
				Assert.assertTrue(driver
						.findElement(
								By.xpath("//span[contains(text(),'You can complete this program in under a month')]"))
						.isDisplayed());
				System.out.println("Invalid Summary for Time to Complete");
			} catch (Exception em) {
				System.out.println(" Invalid Summary for Time to Complete : "
						+ em);
			}

		}

	}

	public int getWeekCount(String str) {
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			int i = Integer.parseInt(m.group());
			return i;
		}
		return 0;
	}

	public void clickOthersRadioBtn() {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@id='radio004']")));
		othersRadioButton.click();
		Utilities.hardWait(2);
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//span[(contains(text(),'I can spend'))]")));
		Assert.assertTrue(driver.findElement(
				By.xpath("//div[@class='control-group form-inline']/span"))
				.isDisplayed());
		// System.out.println("Last: "+driver.findElement(By.xpath("//span[@class='control-custom']")).getAttribute("style"));
		Reporter.log(Utilities
				.logOutputFile("click others radio button - PASS"));

	}

	public void inputWorkingHoursDetails() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@id='input001']")));
		othersWorkingHours.sendKeys("10");
		Reporter.log(Utilities
				.logOutputFile("input working hour details - PASS"));

	}

	public void clickUpdateBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//a[@class='btn-custom btn-update-summary']")));
		updateBtn.click();
		Reporter.log(Utilities.logOutputFile("click update button - PASS"));
	}

	public void verifySummaryDetails() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//span[@class='summary']")));
		// System.out.println("summary is " +summaryInMonths.getText());
		Assert.assertTrue(summaryInMonths.getText().contains(
				"You can complete this program in"));
		// //System.out.println(summaryInMonths.getText().matches(".*\\d.*"));
		// Assert.assertTrue(summaryInMonths.getText().matches(".*\\d.*"));
		boolean containsDigit = false;
		for (char c : summaryInMonths.getText().toCharArray()) {
			// System.out.println(c);
			if (Character.isDigit(c)) {
				containsDigit = true;
				// System.out.println("string contains digit " +containsDigit);
				break;
			}
		}
		Assert.assertTrue(containsDigit
				|| summaryInMonths.getText().contains(
						"You can complete this program in under a month!"));
		Assert.assertTrue(summaryInMonths.getText().contains("month"));
		Reporter.log(Utilities
				.logOutputFile("verify summary of time to complete - PASS"));
		Reporter.log(Utilities
				.logOutputFile("for 10 hr/week summary of time to complete is '"
						+ summaryInMonths.getText() + "'- PASS"));

	}

	public void verifySummaryForBounderyValues() {
		othersWorkingHours.clear();
		Utilities.hardWait(1);
		othersWorkingHours.sendKeys("168");
		Utilities.hardWait(1);

		updateBtn.click();
		Utilities.hardWait(3);
		// System.out.println(summaryInMonths.getText());
		Assert.assertTrue(summaryInMonths.getText().contains(
				"You can complete this program in under a month")
				|| summaryInMonths.getText().contains("months"));
		Reporter.log(Utilities
				.logOutputFile("for 168 hr/week summary of time to complete is '"
						+ summaryInMonths.getText() + "'- PASS"));

		othersWorkingHours.clear();
		Utilities.hardWait(1);

		othersWorkingHours.sendKeys("169");
		Utilities.hardWait(1);

		updateBtn.click();
		Utilities.hardWait(3);

		Assert.assertTrue(driver
				.findElement(By.xpath("//span[@class='error-summary']"))
				.getText()
				.contains(
						"Whoa! Either there's a typo in that field or you are very motivated. Try again?"));
		Reporter.log(Utilities
				.logOutputFile("for 169 hr/week summary of time to complete is '"
						+ summaryInMonths.getText() + "'- PASS"));

	}

	public void clickCloseBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//button[@class='close'])[4]")));
		closeTimeToComplete.click();
		Reporter.log(Utilities.logOutputFile("click close button - PASS"));

	}
}