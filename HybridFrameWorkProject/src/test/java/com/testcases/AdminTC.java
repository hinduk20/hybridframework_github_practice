package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AdminPage;
import com.testbase.Base;

public class AdminTC extends Base{
	WebDriver driver;
	AdminPage ap=new AdminPage(driver);
	
	@Test
	public void searchSystemUsersTestCase(String username, String employeeName, String userRole, String status ) {
		
		ap.searchUserMethod(username,employeeName,userRole, status );
		Assert.assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "Navigate to search sysytem users fail");
	}
	
	@Test
	public void addUserMethodTestCase(String newUserRole, String newStatus, String newEmployeeName, String newUserName, String password, String confirmPassword) {
		ap.addUserMethod(newUserRole, newStatus, newEmployeeName, newUserName, password, confirmPassword);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveSystemUser"), " User failed to add new user");
	}
	
	@Test
	public void editUserMethodTestCase(String editUserRole, String editEmployeeName, String editStatus, String editUsername) {
		ap.editUserMethod(editUserRole, editEmployeeName, editStatus, editUsername);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveSystemUser/1"), " User failed to edit existing user");
	}
	
	@Test
	public void editUserWithPasswordMethodTestCase(String editUserRole, String editEmployeeName, String editStatus, String editUsername, String password, String confirmPassword) {
		ap.editUserWithPasswordMethod(editUserRole, editEmployeeName, editStatus, editUsername, password, confirmPassword);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveSystemUser/1"), " User failed to edit existing user");
	}
	
	@Test
	public void jobTitleMethodTestCase() {
		ap.jobTitleMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewJobTitleList"), " User failed to Open job Titile page");
	}

	@Test
	public void addJobTitileMethodTestCase(String jobTitle, String jobDiscription, String addNote, String filePath) {
		ap.addJobTitileMethod(jobTitle, jobDiscription, addNote, filePath);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveJobTitle"), " User failed to add job titile");
	}
	
	@Test
	public void payGradesMethodTestCase() {
		ap.payGradesMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewPayGrades"), " User failed to Open Pay Grades page");
	}
	
	@Test
	public void addPayGradesMethodTestCase(String namePayGradesMethod) {
		ap.addPayGradesMethod(namePayGradesMethod);
		Assert.assertTrue(driver.getCurrentUrl().contains("payGrade"), " User failed to add Pay Grades page");
	}
	
	@Test
	public void employmentStatusMethodTestCase() {
		ap.employmentStatusMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("employmentStatus"), " User failed to open employment Status page");
	}
	
	@Test
	public void addEmploymentStatusMethodTestCase(String nameEmploymentStatusMethod) {
		ap.addEmploymentStatusMethod(nameEmploymentStatusMethod);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveEmploymentStatus"), " User failed to add employment Status page");
	}
	
	@Test
	public void jobCategoriesMethodTestCase() {
		ap.jobCategoriesMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("jobCategory"), " User failed to open job categories page");
	}
	
	@Test
	public void addJobCategoriesMethodTestCase(String nameJobCategoriesMethod) {
		ap.addJobCategoriesMethod(nameJobCategoriesMethod);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveJobCategory"), " User failed to add job categories page");
	}
	
	@Test
	public void workShiftMethodTestCase() {
		ap.workShiftMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("workShift"), " User failed to open work shift page");
	}
	
	@Test
	public void addWorkShiftMethodTestCase(String nameWorkShiftMethod, String Assignedemployee) {
		ap.addWorkShiftMethod(nameWorkShiftMethod, Assignedemployee);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveWorkShifts"), " User failed to add work shift page");
	}
	
	@Test
	public void generalInformationMethodTestCase() {
		ap.generalInformationMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewOrganizationGeneralInformation"), " User failed to add General Information page");
	}
	
	@Test
	public void editGeneralInformationMethodTestCase() {
		ap.editGeneralInformationMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewOrganizationGeneralInformation"), " User failed to edit General Information page");
	}
	
	@Test
	public void locationMethodTestCase() {
		ap.locationMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewLocations"), " User failed to open Location page");
	}
	
	
	@Test
	public void searchLocationMethodTestCase(String name, String cityName, String countryName) {
		ap.searchLocationMethod(name, cityName, countryName);
		Assert.assertTrue(driver.getCurrentUrl().contains("viewLocations"), " User failed to search Location page");
	}
	
	@Test
	public void addLocationMethodTestCase(WebElement countryElement, String name, String addCountryName, String addState, String addPinCode, String addCountryName1, String phoneNumber, String faxNumber, String addAddress, String addNotes) {
		ap.addLocationMethod(countryElement, name, addCountryName, addState, addPinCode, addCountryName1, phoneNumber, faxNumber, addAddress, addNotes);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveLocation"), " User failed to add Location page");
	}
	
	@Test
	public void structureMethodTestCase() {
		ap.structureMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewCompanyStructure"), " User failed to open struture page");
	}
	
	@Test
	public void skillMethodTestCase() {
		ap.skillMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewSkills"), " User failed to open Skills page");
	}
	
	@Test
	public void addSkillMethodTestCase(String skillName, String skillDiscription) {
		ap.addSkillMethod(skillName, skillDiscription);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveSkills"), " User failed to add Skills page");
	}
	
	@Test
	public void educationMethodTestCase() {
		ap.educationMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewEducation"), " User failed to open education page");
	}
	
	@Test
	public void addEducationMethodTestCase(String level) {
		ap.addEducationMethod(level);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveEducation"), " User failed to add education page");
	}
	
	@Test
	public void licensesMethodTestCase() {
		ap.licensesMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewLicenses"), " User failed to open Licenses page");
	}
	
	@Test
	public void addLicensesMethodTestCase(String licensesName) {
		ap.addLicensesMethod(licensesName);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveLicenses"), " User failed to add Licenses page");
	}
	
	@Test
	public void languagesMethodTestCase() {
		ap.languagesMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewLanguages"), " User failed to open Languages page");
	}
	
	@Test
	public void addLanguagesMethodTestCase(String languages) {
		ap.addLanguagesMethod(languages);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveLanguages"), " User failed to add Languages page");
	}
	
	@Test
	public void membershipMethodTestCase() {
		ap.membershipMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("membership"), " User failed to open membership page");
	}
	
	@Test
	public void addmembershipMethodTestCase(String languages) {
		ap.addmembershipMethod(languages);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveMembership"), " User failed to add membership page");
	}
	
	@Test
	public void nationalitiesMethodTestCase() {
		ap.nationalitiesMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("nationality"), " User failed to open nationality page");
	}
	
	@Test
	public void addNationalitiesMethodTestCase(String nationalities) {
		ap.addNationalitiesMethod(nationalities);
		Assert.assertTrue(driver.getCurrentUrl().contains("saveNationality"), " User failed to add nationality page");
	}
	
	@Test
	public void corporateBrandingWithoutSocialMethodTestCase(String clientCurrent, String loginCurrent, String primaryColour, String secondoryColour, String primaryFontColour, String secondaryFontColour, String primaryGradientColour1, String primaryGradientColour2, String pathFile) {
		ap.corporateBrandingWithoutSocialMethod(clientCurrent, loginCurrent, primaryColour, secondoryColour, primaryFontColour, secondaryFontColour, primaryGradientColour1, primaryGradientColour2, pathFile);
		Assert.assertTrue(driver.getCurrentUrl().contains("addTheme"), " User failed to chages page colours and themese");
	}
	
	@Test
	public void corporateBrandingWithSocialMethodTestCase(String clientCurrent, String loginCurrent, String primaryColour, String secondoryColour, String primaryFontColour, String secondaryFontColour, String primaryGradientColour1, String primaryGradientColour2, String pathFile) {
		ap.corporateBrandingWithoutSocialMethod(clientCurrent, loginCurrent, primaryColour, secondoryColour, primaryFontColour, secondaryFontColour, primaryGradientColour1, primaryGradientColour2, pathFile);
		Assert.assertTrue(driver.getCurrentUrl().contains("addTheme"), " User failed to chages page colours and themese");
	}
	
	@Test
	public void emailConfigurationWithSendMailMethodTestCase(String mailSendAs, String sendingMethod) {
		ap.emailConfigurationWithSendMailMethod(mailSendAs, sendingMethod);
		Assert.assertTrue(driver.getCurrentUrl().contains("listMailConfiguration"), " User failed to send email configuration");
	}
	
	@Test
	public void emailConfigurationWithSendMailAndSendTestMailMethodTestCase(String mailSendAs, String sendingMethod, String testEmailAddress) {
		ap.emailConfigurationWithSendMailAndSendTestMailMethod(mailSendAs, sendingMethod, testEmailAddress);
		Assert.assertTrue(driver.getCurrentUrl().contains("listMailConfiguration"), " User failed to send email configuration");
	}
	
	@Test
	public void emailConfigurationWithSecureSMTPAndSendTestMailMethodTestCase(String yesNo, String mailSendAs, String sendingMethod, String testEmailAddress,String smtpPort, String smtpHost){
		ap.emailConfigurationWithSecureSMTPAndSendTestMailMethod(yesNo, mailSendAs, sendingMethod, testEmailAddress, smtpPort, smtpHost);
		Assert.assertTrue(driver.getCurrentUrl().contains("listMailConfiguration"), " User failed to send email configuration");
	}
	
	@Test
	public void emailConfigurationWithSecureSMTPMethodTestCase(String yesNo, String mailSendAs, String sendingMethod, String testEmailAddress,String smtpPort, String smtpHost){
		ap.emailConfigurationWithSecureSMTPMethod(yesNo, mailSendAs, sendingMethod, testEmailAddress, smtpPort, smtpHost);
		Assert.assertTrue(driver.getCurrentUrl().contains("listMailConfiguration"), " User failed to send email configuration");
	}
	
	@Test
	public void emailConfigurationWithSecureSMTPAndSendTestMailAndAuthenticationMethodTestCase(String username, String password,String yesNo, String mailSendAs, String sendingMethod, String testEmailAddress,String smtpPort, String smtpHost){
		ap.emailConfigurationWithSecureSMTPAndSendTestMailAndAuthenticationMethod(username, password, yesNo, mailSendAs, sendingMethod, testEmailAddress, smtpPort, smtpHost);
		Assert.assertTrue(driver.getCurrentUrl().contains("listMailConfiguration"), " User failed to send email configuration");
	}
	
	@Test
	public void emailSubscriptionMethodTestCase() {
		ap.emailSubscriptionMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewEmailNotification"), " User failed to Open email Subscription page");
	}

	@Test
	public void localizationOpenMethodTestCase(String language, String dateFormate) {
		ap.localizationOpenMethod(language, dateFormate);
		Assert.assertTrue(driver.getCurrentUrl().contains("localization"), " User failed to Open email localization page");
	}
	
	@Test
	public void languagePackagesMethodTestCase() {
		ap.languagePackagesMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("languagePackage"), " User failed to Open languagePackage page");
	}
	
	@Test
	public void addLanguagePackagesMethodTestCase(String language) {
		ap.addLanguagePackagesMethod(language);
		Assert.assertTrue(driver.getCurrentUrl().contains("languagePackage"), " User failed to add languagePackage page");
	}
	
	@Test
	public void modulesSelectedAllNormalMethodTestCase() {
		ap.modulesSelectedAllNormalMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewModules"), " User failed to open Modules page");
	}
	
	@Test
	public void modulesAllSelectedMethodTestCase(WebElement element) {
		ap.modulesAllSelectedMethod(element);
		Assert.assertTrue(driver.getCurrentUrl().contains("viewModules"), " User failed to open Modules page");
	}
	
	
	
}
