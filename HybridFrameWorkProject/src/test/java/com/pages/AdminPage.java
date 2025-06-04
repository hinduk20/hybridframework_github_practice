package com.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	
	WebDriver driver;
	
	//Header DropDown Elements
	@FindBy(xpath = "//i[@class='oxd-icon bi-question-lg']")
	WebElement helpElement;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	WebElement userManagementDropDownElement;
	
		@FindBy(xpath = "//a[text()='Users']")
		WebElement userElement;
	
	@FindBy(xpath = "//span[text()='Job ']")
	WebElement jobDropDownElement;
	
		@FindBy(xpath = "//a[text()='Job Titles']")
		WebElement JobTitleElement;
			
			@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
			WebElement jobTitleNameElement;
			
			@FindBy(xpath = "//textarea[@placeholder='Type description here']")
			WebElement jobDiscriptionElement;
			
			@FindBy(xpath = "//div[text()='Browse']")
			WebElement browseFileElement;
			
			@FindBy(xpath = "//textarea[@placeholder='Add note']")
			WebElement addNotesElement;
		
		@FindBy(xpath = "//a[text()='Pay Grades']")
		WebElement payGradesElement;
		
		@FindBy(xpath = "//a[text()='Employment Status']")
		WebElement employmentStatusElement;
		
		@FindBy(xpath = "//a[text()='Job Categories']")
		WebElement jobCategoriesElement;
		
		@FindBy(xpath = "//a[text()='Work Shifts']")
		WebElement workShiftsElement;
		
			@FindBy(xpath = "(//div[@class='oxd-time-input'])[1]")
			WebElement timingFromElement;
			
			@FindBy(xpath = "(//div[@class='oxd-time-input'])[2]")
			WebElement timingToElement;
			
			@FindBy(xpath = "//input[@placeholder='Type for hints...']")
			WebElement assignedEmployeesElement;
				
				@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus oxd-time-hour-input-text']")
				WebElement hourElement;
				
				@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus oxd-time-minute-input-text']")
				WebElement minuteElement;
				
				@FindBy(xpath = "//div[@class='oxd-time-period-input']")
				WebElement amPmElement;
	
	@FindBy(xpath = "//span[text()='Organization ']")
	WebElement organizationDropDownElement;
	
		@FindBy(xpath = "//a[text()='General Information']")
		WebElement generalInformationElement;
		
			@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
			WebElement editBtnElement;
		
		@FindBy(xpath = "//a[text()='Locations']")
		WebElement locationsElement;
		
			@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
			WebElement cityNameElement;
			
			@FindBy(xpath = "//div[@class='oxd-select-text-input']")
			WebElement countryElement;
			
				//add new location 
				@FindBy(xpath = "(//input[@placeholder='Type here ...'])[3]")
				WebElement stateElement;
				
				@FindBy(xpath = "(//input[@placeholder='Type here ...'])[4]")
				WebElement pinCodeElement;
				
				@FindBy(xpath = "(//input[@placeholder='Type here ...'])[5]")
				WebElement phoneElement;
				
				@FindBy(xpath = "(//input[@placeholder='Type here ...'])[6]")
				WebElement faxElement;
				
				@FindBy(xpath = "(//textarea[@placeholder='Type here ...'])[1]")
				WebElement addressElement;
				
				@FindBy(xpath = "(//textarea[@placeholder='Type here ...'])[2]")
				WebElement notesLocationElement;
				
		
		@FindBy(xpath = "//a[text()='Structure']")
		WebElement strutureElement;
	
	@FindBy(xpath = "//span[text()='Qualifications ']")
	WebElement qualificationsDropDownElement;
	
		@FindBy(xpath = "//a[text()='Skills']")
		WebElement skillsElement;
		
		@FindBy(xpath = "//a[text()='Education']")
		WebElement educationElement;
		
		@FindBy(xpath = "//a[text()='Licenses']")
		WebElement licensesElement;
		
		@FindBy(xpath = "//a[text()='Memberships']")
		WebElement membershipsElement;
	
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	WebElement nationalitiesBtnElement;
	
	@FindBy(xpath = "//a[text()='Corporate Branding']")
	WebElement corporateBrandingElement;
		
		@FindBy(xpath = "(//div[@class='orangehrm-color-input-wrapper'])[1]")
		WebElement primaryColourElement;
		
		@FindBy(xpath = "(//div[@class='orangehrm-color-input-wrapper'])[2]")
		WebElement secondaryColourElement;
	
		@FindBy(xpath = "(//div[@class='orangehrm-color-input-wrapper'])[3]")
		WebElement primaryFontColourElement;
		
		@FindBy(xpath = "(//div[@class='orangehrm-color-input-wrapper'])[4]")
		WebElement secondaryFontColourElement;
		
		@FindBy(xpath = "(//div[@class='orangehrm-color-input-wrapper'])[5]")
		WebElement primaryGradientColourElement1;
		
		@FindBy(xpath = "(//div[@class='orangehrm-color-input-wrapper'])[6]")
		WebElement primaryGradientColourElement2;
		
		@FindBy(xpath = "//div[text()='Browse']")
		WebElement uploadFileElement;
		
		@FindBy(xpath = "(//i[@class='oxd-icon bi-file-earmark-text orangehrm-file-icon'])[1]")
		WebElement clientBannerElement;
			
			@FindBy(xpath = "(//div[@class='orangehrm-file-options'])[1]")
			WebElement clientCurrentElement;
			
				@FindBy(xpath = "(//label[text()='Keep Current'])[1]")
				WebElement clientKeepCurrentElement;
			
				@FindBy(xpath = "(//label[text()='Delete Current'])[1]")
				WebElement clientDeleteCurrentElement;
			
				@FindBy(xpath = "(//label[text()='Replace Current'])[1]")
				WebElement clientReplaceCurrentElement;
			
		@FindBy(xpath = "(//i[@class='oxd-icon bi-file-earmark-text orangehrm-file-icon'])[1]")
		WebElement loginBannerElement;
		
			@FindBy(xpath = "(//div[@class='orangehrm-file-options'])[2]")
			WebElement loginCurrentElement;
			
				@FindBy(xpath = "(//label[text()='Keep Current'])[2]")
				WebElement loginKeepCurrentElement;
		
				@FindBy(xpath = "(//label[text()='Delete Current'])[2]")
				WebElement loginDeleteCurrentElement;
			
				@FindBy(xpath = "(//label[text()='Replace Current'])[1]")
				WebElement loginReplaceCurrentElement;
			
		@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
		WebElement socialMediaImageElement;
		
		@FindBy(xpath = "//button[text()=' Publish ']")
		WebElement publishElement;
		
		@FindBy(xpath = "//button[text()=' Preview ']")
		WebElement previewElement;
		
		@FindBy(xpath = "//button[text()=' Reset to Default ']")
		WebElement resetToDefaultElement;
	
	@FindBy(xpath = "//span[text()='Configuration ']")
	WebElement configurationElement;
	
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
		WebElement emailConfigurationElement;
		
			@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]")
			WebElement mailSendAsElement;
			
			@FindBy(xpath = "//div[@class='send-method-div']")
			List<WebElement> sendingBtnMethodElement;
			
			@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]")
			WebElement smtpHostElement;
			
			@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]")
			WebElement smtpPortElement;
			
			@FindBy(xpath = "//div[@class='--status-grouped-field']")
			List<WebElement> smpAuthenticationElement;
			
			@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[9]")
			WebElement smptUserElement;
			
			@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[10]")
			WebElement smptPasswordElement;
		
			@FindBy(xpath = "()//span[@class='oxd-switch-input oxd-switch-input--active --label-right'][1]")
			WebElement tlsBtnElement;
			
			@FindBy(xpath = "()//span[@class='oxd-switch-input oxd-switch-input--active --label-right'][2]")
			WebElement sendTestMailBtnElement;
			
			
			
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
		WebElement emailSubscriptionElement;
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[3]")
		WebElement localisationElement;
				
			@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
			WebElement languageSelectElement;
			
			@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
			WebElement dateFormateElement; 
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[4]")
		WebElement languagePackageElement;
		
			@FindBy(xpath = "//div[@class='oxd-select-text-input']")
			List<WebElement> langaugeNameElement;
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[5]")
		WebElement modulesElement;
		
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[3]")
			WebElement leaveModuleBtnElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[4]")
			WebElement timeBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[7]")
			WebElement directoryBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[5]")
			WebElement recruitmentBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[6]")
			WebElement performanceBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[8]")
			WebElement maintenanceBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[9]")
			WebElement mobileBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[10]")
			WebElement claimBtnModuleElement;
			
			@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[11]")
			WebElement buzzBtnModuleElement;
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[6]")
		WebElement socialMediaAuthenticationElement;
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[7]")
		WebElement registerOAuthClientElement;
		
		@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[8]")
		WebElement ldapConfigurationElement;
		
		
		
	//Add User
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")                               //common in all option
	WebElement nameElement;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]" )
	WebElement userRoleDropDownElement;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")									// Employee Name
	WebElement employeeNameElement;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement statusElement;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement passwordElement;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement confirmPasswordElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement resetBtnElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchBtnElement;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveElement;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	WebElement cancelElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addBtnElement;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-dash oxd-checkbox-input-icon']")
	WebElement selectAllUsernameBoxElement;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	WebElement selectedElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
	WebElement deleteAllSelectedBoxElement;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	WebElement deleteBtnElement;
	
	
	//Edit Role Element
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement editUserRoleElement;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']")
	WebElement editUserEmployeeNameElement;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement editUserStatusElement;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement editUserUsernameElement;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	WebElement editUserChangePasswordBoxElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement editUserSaveBtnElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement editUserCancelBtnElement;
	

	private AdminPage FileUploadUtils;

	private AdminPage RadioButtonUtils;
	
	
	
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
	}

	// search users Method
	public void searchUserMethod(String username, String employeeName, String userRole, String status ) {
		nameElement.sendKeys(username);
		
		selectStatusUtilityMethod(userRoleDropDownElement, userRole);
		
		employeeNameElement.sendKeys(userRole);
		employeeNameElement.sendKeys(employeeName);
		
		selectStatusUtilityMethod(statusElement, status);
		
		searchBtnElement.click();
	}
	
	// Reset Button click method
	public void resetUsermethod() {
		resetBtnElement.click();
	}
	
	//canceled button  click method
	public void cancelButtonMethod() {
		cancelElement.click();
	}
	
	// Delete Button click method
	public void deleteButtonMethod() {
		deleteBtnElement.click();
	}
	
	
	// Add new user method 
	public void addUserMethod(String newUserRole, String newStatus, String newEmployeeName, String newUserName, String password, String confirmPassword) {
		addBtnElement.click();

		selectStatusUtilityMethod(userRoleDropDownElement, newUserRole);
		
		employeeNameElement.sendKeys(newEmployeeName);
		selectStatusUtilityMethod(statusElement, newStatus);
		
		userElement.sendKeys(newUserName);
		passwordElement.sendKeys(password);
		confirmPasswordElement.sendKeys(confirmPassword);
		saveElement.click();
	}
	
	//edit User data method without new password
	public void editUserMethod(String editUserRole, String editEmployeeName, String editStatus, String editUsername) {
		
		selectStatusUtilityMethod(userRoleDropDownElement, editUserRole);
		
		employeeNameElement.sendKeys(editEmployeeName);

		selectStatusUtilityMethod(statusElement, editStatus);
		userElement.sendKeys(editUsername);
		saveElement.click();
	}
	
	//edit User data method with New password
	public void editUserWithPasswordMethod(String editUserRole, String editEmployeeName, String editStatus, String editUsername, String password, String confirmPassword) {
		selectStatusUtilityMethod(userRoleDropDownElement, editUserRole);
		employeeNameElement.sendKeys(editEmployeeName);
				
		selectStatusUtilityMethod(statusElement, editStatus);
		userElement.sendKeys(editUsername);
		editUserChangePasswordBoxElement.click();
		passwordElement.sendKeys(password);
		confirmPasswordElement.sendKeys(confirmPassword);
		saveElement.click();
	}
	
	//open Job title page
	public void jobTitleMethod() {
		jobDropDownElement.click();
		JobTitleElement.click();
	}
		
	// create New job titles method
	public void addJobTitileMethod(String jobTitle, String jobDiscription, String addNote, String filePath) {
		jobDropDownElement.click();
		JobTitleElement.click();
		addBtnElement.click();
		jobTitleNameElement.sendKeys(jobTitle);
		jobDiscriptionElement.sendKeys(jobDiscription);
		
		FileUploadUtils.uploadFileUtilityMethod(browseFileElement, filePath);
		addNotesElement.sendKeys(addNote);
		saveElement.click();	
	}
	
	//open pay grades 
	public void payGradesMethod() {
		jobDropDownElement.click();
		payGradesElement.click();
	}
	
	// create pay grades
	public void addPayGradesMethod(String namePayGradesMethod) {
		jobDropDownElement.click();
		payGradesElement.click();
		addBtnElement.click();
		userElement.sendKeys(namePayGradesMethod);
	}
	
	//open Employment status
	public void employmentStatusMethod() {
		jobDropDownElement.click();
		employmentStatusElement.click();
	}
	
	//create Employment status
	public void addEmploymentStatusMethod(String nameEmploymentStatusMethod) {
		jobDropDownElement.click();
		employmentStatusElement.click();
		addBtnElement.click();
		userElement.sendKeys(nameEmploymentStatusMethod);
	}
	
	//open job categories
	public void jobCategoriesMethod() {
		jobDropDownElement.click();
		jobCategoriesElement.click();
	}
	
	//create job categories
	public void addJobCategoriesMethod(String nameJobCategoriesMethod) {
		jobDropDownElement.click();
		jobCategoriesElement.click();
		addBtnElement.click();
		userElement.sendKeys(nameJobCategoriesMethod);
	}
	
	//open work shift
	public void workShiftMethod() {
		jobDropDownElement.click();
		workShiftsElement.click();
	}
	
	//create work shift
	public void addWorkShiftMethod(String nameWorkShiftMethod, String Assignedemployee) {
		jobDropDownElement.click();
		workShiftsElement.click();
		addBtnElement.click();
		userElement.sendKeys(nameWorkShiftMethod);
		timingFromElement.click();
		selectTimeUtilityMethod(hourElement, minuteElement, amPmElement, nameWorkShiftMethod);
		timingToElement.click();
		selectTimeUtilityMethod(hourElement, minuteElement, amPmElement, nameWorkShiftMethod);
		assignedEmployeesElement.sendKeys(Assignedemployee);
		saveElement.click();
	}
	
	//open general information
	public void generalInformationMethod() {
		organizationDropDownElement.click();
		generalInformationElement.click();
	}
	
	//edit general information
	public void editGeneralInformationMethod() {
		organizationDropDownElement.click();
		generalInformationElement.click();
		editBtnElement.click();
	}
	
	//open location tab
	public void locationMethod() {
		organizationDropDownElement.click();
		locationsElement.click();
	}
	
	//search Location 
	public void searchLocationMethod(String name, String cityName, String countryName) {
		organizationDropDownElement.click();
		locationsElement.click();
		addBtnElement.click();
		nameElement.sendKeys(name);
		cityNameElement.sendKeys(cityName);
		selectStatusUtilityMethod(countryElement, countryName);
		searchBtnElement.click();
	}
	
	//create new Location 
	public void addLocationMethod(WebElement countryElement, String name, String addCountryName, String addState, String addPinCode, String addCountryName1, String phoneNumber, String faxNumber, String addAddress, String addNotes) {
		userElement.sendKeys(name);
		cityNameElement.sendKeys(addCountryName1);
		stateElement.sendKeys(addState);
		pinCodeElement.sendKeys(addPinCode);
		selectStatusUtilityMethod(countryElement, addCountryName1);
		phoneElement.sendKeys(phoneNumber);
		faxElement.sendKeys(faxNumber);
		addressElement.sendKeys(addAddress);
		notesLocationElement.sendKeys(addNotes);
		saveElement.click();
	}
	
	//open structure
	public void structureMethod() {
		organizationDropDownElement.click();
		strutureElement.click();
	}
	
	//open skill method
	public void skillMethod() {
		qualificationsDropDownElement.click();
		skillsElement.click();
	}
	
	//create skill method
		public void addSkillMethod(String skillName, String skillDiscription) {
			qualificationsDropDownElement.click();
			skillsElement.click();
			addBtnElement.click();
			userElement.sendKeys(skillName);
			jobDiscriptionElement.sendKeys(skillDiscription);
			saveElement.click();
		}
		
	//open education method
	public void educationMethod() {
		qualificationsDropDownElement.click();
		educationElement.click();
	}
	
	//create education method
		public void addEducationMethod(String level) {
			qualificationsDropDownElement.click();
			educationElement.click();
			addBtnElement.click();
			userElement.sendKeys(level);
		}
		
	//open license
	public void licensesMethod() {
		qualificationsDropDownElement.click();
		licensesElement.click();
	}
		
		//create license
		public void addLicensesMethod(String licensesName) {
			qualificationsDropDownElement.click();
			licensesElement.click();
			addBtnElement.click();
			userElement.sendKeys(licensesName);
			saveElement.click();
		}
		
	//open languages
	public void languagesMethod() {
		qualificationsDropDownElement.click();
		languagePackageElement.click();
	}
	
		//create languages
		public void addLanguagesMethod(String languages) {
			qualificationsDropDownElement.click();
			languagePackageElement.click();
			addBtnElement.click();
			userElement.sendKeys(languages);
			saveElement.click();
		}
		
	//open languages
	public void membershipMethod() {
			qualificationsDropDownElement.click();
			membershipsElement.click();
	}
		
			//create languages
			public void addmembershipMethod(String languages) {
				qualificationsDropDownElement.click();
				membershipsElement.click();
				addBtnElement.click();
				userElement.sendKeys(languages);
				saveElement.click();
			}	
		
	
	//open Nationalities
	public void nationalitiesMethod() {
		nationalitiesBtnElement.click();
	}
	
		//create Nationalities
		public void addNationalitiesMethod(String nationalities) {
			nationalitiesBtnElement.click();
			addBtnElement.click();
			userElement.sendKeys(nationalities);
			saveElement.click();
		}
		
		
	//open corporate Branding method without social media image
	public void corporateBrandingWithoutSocialMethod(String clientCurrent, String loginCurrent, String primaryColour, String secondoryColour, String primaryFontColour, String secondaryFontColour, String primaryGradientColour1, String primaryGradientColour2, String pathFile) {
		corporateBrandingElement.click();
		chooseColor(primaryColourElement, primaryColour);
		chooseColor(secondaryColourElement, secondoryColour);
		chooseColor(primaryFontColourElement, primaryFontColour);
		chooseColor(secondaryFontColourElement, secondaryFontColour);
		chooseColor(primaryGradientColourElement1, primaryGradientColour1);
		chooseColor(primaryGradientColourElement2, primaryGradientColour2);
		FileUploadUtils.uploadFileUtilityMethod(uploadFileElement, pathFile);
		FileUploadUtils.uploadFileUtilityMethod(clientCurrentElement, clientCurrent);
		FileUploadUtils.uploadFileUtilityMethod(clientCurrentElement, loginCurrent);
		publishElement.click();
	}
	
	
	//open corporate Branding method with social media image
	public void corporateBrandingWithSocialMethod(String clientCurrent, String loginCurrent, String primaryColour, String secondoryColour, String primaryFontColour, String secondaryFontColour, String primaryGradientColour1, String primaryGradientColour2, String pathFile) {
		corporateBrandingElement.click();
		chooseColor(primaryColourElement, primaryColour);
		chooseColor(secondaryColourElement, secondoryColour);
		chooseColor(primaryFontColourElement, primaryFontColour);
		chooseColor(secondaryFontColourElement, secondaryFontColour);
		chooseColor(primaryGradientColourElement1, primaryGradientColour1);
		chooseColor(primaryGradientColourElement2, primaryGradientColour2);
		FileUploadUtils.uploadFileUtilityMethod(uploadFileElement, pathFile);
		FileUploadUtils.uploadFileUtilityMethod(clientCurrentElement, clientCurrent);
		FileUploadUtils.uploadFileUtilityMethod(clientCurrentElement, loginCurrent);
		socialMediaImageElement.click();
		publishElement.click();
	}
	
	
	//Email configuration method with send mail method 
	public void emailConfigurationWithSendMailMethod(String mailSendAs, String sendingMethod) {
		corporateBrandingElement.click();
		mailSendAsElement.clear();
		mailSendAsElement.sendKeys(mailSendAs);
		RadioButtonUtils.selectRadioButtonByValue(sendingBtnMethodElement, sendingMethod);
		saveElement.click();
	}
	
	//Email configuration method with send mail method and send Test mail button
		public void emailConfigurationWithSendMailAndSendTestMailMethod(String mailSendAs, String sendingMethod, String testEmailAddress){
			corporateBrandingElement.click();
			mailSendAsElement.clear();
			mailSendAsElement.sendKeys(mailSendAs);
			RadioButtonUtils.selectRadioButtonByValue(sendingBtnMethodElement, sendingMethod);
			sendTestMailBtnElement.click();
			sendTestMailBtnElement.sendKeys(testEmailAddress);
			saveElement.click();
		}
		
		//Email configuration method with Secure SMTP method and send Test mail button
		 public void emailConfigurationWithSecureSMTPAndSendTestMailMethod(String yesNo, String mailSendAs, String sendingMethod, String testEmailAddress,String smtpPort, String smtpHost){
			 corporateBrandingElement.click();		
			 mailSendAsElement.clear();
					mailSendAsElement.sendKeys(mailSendAs);
					RadioButtonUtils.selectRadioButtonByValue(sendingBtnMethodElement, sendingMethod);
					smtpHostElement.sendKeys(smtpHost);
					smtpPortElement.sendKeys(smtpPort);
					RadioButtonUtils.selectRadioButtonByValue(smpAuthenticationElement, yesNo);
					tlsBtnElement.click();
					sendTestMailBtnElement.click();
					sendTestMailBtnElement.sendKeys(testEmailAddress);
					saveElement.click();
		 }
		 
		 
		//Email configuration method with Secure SMTP method 
		 public void emailConfigurationWithSecureSMTPMethod(String yesNo, String mailSendAs, String sendingMethod, String testEmailAddress,String smtpPort, String smtpHost){
			 corporateBrandingElement.click();		
			 mailSendAsElement.clear();
					mailSendAsElement.sendKeys(mailSendAs);
					RadioButtonUtils.selectRadioButtonByValue(sendingBtnMethodElement, sendingMethod);
					smtpHostElement.sendKeys(smtpHost);
					smtpPortElement.sendKeys(smtpPort);
					RadioButtonUtils.selectRadioButtonByValue(smpAuthenticationElement, yesNo);
					saveElement.click();
		 }
		 
		//Email configuration method with Secure SMTP method and send Test mail button with SMPT Authentication
		 public void emailConfigurationWithSecureSMTPAndSendTestMailAndAuthenticationMethod(String username, String password,String yesNo, String mailSendAs, String sendingMethod, String testEmailAddress,String smtpPort, String smtpHost){
			 corporateBrandingElement.click();		
			 mailSendAsElement.clear();
					mailSendAsElement.sendKeys(mailSendAs);
					RadioButtonUtils.selectRadioButtonByValue(sendingBtnMethodElement, sendingMethod);
					smtpHostElement.sendKeys(smtpHost);
					smtpPortElement.sendKeys(smtpPort);
					RadioButtonUtils.selectRadioButtonByValue(smpAuthenticationElement, yesNo);
					smptUserElement.sendKeys(username);
					smptPasswordElement.sendKeys(password);
					tlsBtnElement.click();
					sendTestMailBtnElement.click();
					sendTestMailBtnElement.sendKeys(testEmailAddress);
					saveElement.click();
		 }
		 
		// Email subscription
		 public void emailSubscriptionMethod() {
			 corporateBrandingElement.click();
			 emailSubscriptionElement.click();
		 }
		 
		 //Localization
		 //open Localization
		 public void localizationOpenMethod(String language, String dateFormate) {
			 corporateBrandingElement.click();
			 localisationElement.click();
			 selectLanguageFromDropdown(languageSelectElement, language);
			 selectDateFormatUtilityMethod(dateFormateElement, dateFormate);
			 saveElement.click();
		 }
		 
		 //Language Packages
		 //Open Language Packages
		 public void languagePackagesMethod() {
			 corporateBrandingElement.click();
			 languagePackageElement.click();
		 }
		
		//add Language Packages
		 public void addLanguagePackagesMethod(String language) {
			 corporateBrandingElement.click();
			 languagePackageElement.click();
			 addBtnElement.click();
			 selectLanguageFromDropdownInCountry(langaugeNameElement, language);
			 saveElement.click();
		 }
		 
		 //open Modules
		 public void modulesSelectedAllNormalMethod() {
			 corporateBrandingElement.click();
			 modulesElement.click();
			 leaveModuleBtnElement.click();
			 timeBtnModuleElement.click();
			 timeBtnModuleElement.clear();
			 performanceBtnModuleElement.click();
			 directoryBtnModuleElement.click();
			 maintenanceBtnModuleElement.click();
			 mobileBtnModuleElement.click();
			 claimBtnModuleElement.click();
			 buzzBtnModuleElement.click();
			 saveElement.click();
		 }
		 
		 //open Modules all selected Method
		 public void modulesAllSelectedMethod(WebElement element) {
			 selectAllMethod(leaveModuleBtnElement);
			 selectAllMethod(timeBtnModuleElement);
			 selectAllMethod(timeBtnModuleElement);
			 selectAllMethod(performanceBtnModuleElement);
			 selectAllMethod(directoryBtnModuleElement);
			 selectAllMethod(maintenanceBtnModuleElement);
			 selectAllMethod(mobileBtnModuleElement);
			 selectAllMethod(claimBtnModuleElement);
			 selectAllMethod(buzzBtnModuleElement);
			 saveElement.click();
		 }
		 
		 //open modules all disabled Method
//		  public void modulesAllDisabledMethod() {
//			  disableEnabledButtons(driver, leaveModuleBtnElement);
//		  }
		 
		 
		
	
	//Utility 
	
	//disable all enable method
		 public  void disableEnabledButtons(WebDriver driver, List<WebElement> buttons) {
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        for (WebElement button : buttons) {
		            if (button.isEnabled()) {
		                js.executeScript("arguments[0].setAttribute('disabled', 'true');", button);
		            }
		        }
		    }
		 
	// Selected Enable disable Button
		 public static void selectAllMethod(WebElement element) {
				if(element.isEnabled()) {
					if(element.isDisplayed()) {
							boolean status = element.isSelected();
							if(status) {
							System.out.println("element is already selected");
							}
							else {
								element.click();
								System.out.println("element is clicked");
							}
					}
				}
			}	 
		 
	// Disable all enabled buttons
		 public static void disableAllMethod(WebElement element) {
				if(element.isEnabled()) {
					if(element.isDisplayed()) {
							boolean status = element.isSelected();
							if(status) {
							System.out.println("element is already selected");
							}
							else {
								element.click();
								System.out.println("element is clicked");
							}
					}
				}
			}	 
		 
		 
		 
	// Languages
		 public static void selectLanguageFromDropdown(WebElement languageSelectElements, String language) {
		        Select select = new Select(languageSelectElements);
		        select.selectByVisibleText(language);
		    }
		 
		 public static void selectLanguageFromDropdownInCountry(List<WebElement> langaugeNameElement, String language) {
		        Select select = new Select((WebElement) langaugeNameElement);
		        select.selectByVisibleText(language);
		    }
		 
	// Date Format
		 public static void selectDateFormatUtilityMethod(WebElement datePickerdropdownElement, String dateFormate) {
			 Select select = new Select(datePickerdropdownElement);
		        select.selectByVisibleText(dateFormate);
		 }
		 
		 
	//radio button utility
	public static void selectRadioButtonByValue(List<WebElement> radioButtons, String valueToSelect) {
        for (WebElement radio : radioButtons) {
            String value = radio.getAttribute("value");
            if (value.equalsIgnoreCase(valueToSelect)) {
                if (!radio.isSelected()) {
                    radio.click();
                }
                break;
            }
        }
    }
	
	//choose color utility method
	public static void chooseColor(WebElement colorElement, String hexColor) {
        if (!hexColor.matches("^#([A-Fa-f0-9]{6})$")) {
            throw new IllegalArgumentException("Invalid hex color code. Use format: #RRGGBB");
        }
        colorElement.sendKeys(hexColor);
    }
	
	//dropDown Utility method 
	static void selectStatusUtilityMethod(WebElement dropdownElement, String value) {
		
		Select select = new Select(dropdownElement);
        select.selectByValue(value);
	}
	
	//file upload utility method
	public static void uploadFileUtilityMethod(WebElement browseFileElement, String filePath) {
		browseFileElement.sendKeys(filePath);
    }
	
	//set timing utility method
	 public static void selectTimeUtilityMethod(WebElement hourElement, WebElement minuteElement, WebElement amPmElement, String time) {
	        // Example time: "02:30 PM"
	        String[] timeParts = time.split("[: ]");
	        if (timeParts.length != 3) {
	            throw new IllegalArgumentException("Invalid time format. Use hh:mm AM/PM format.");
	        }

	        String hour = timeParts[0];
	        String minute = timeParts[1];
	        String amPm = timeParts[2].toUpperCase();

	        new Select(hourElement).selectByVisibleText(hour);
	        new Select(minuteElement).selectByVisibleText(minute);
	        new Select(amPmElement).selectByVisibleText(amPm);
	    }
	
	
	static void handleDropdownOptions(WebElement dropdown, String option) {
		List<WebElement> options = new Select(dropdown).getOptions();
		for (WebElement ele : options) {
			if (ele.getText().equals(option)) {
				ele.click();
				break;
			}
		}
	}
	
	
}
