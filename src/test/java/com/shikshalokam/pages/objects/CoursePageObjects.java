package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePageObjects {
	
	@FindBy(xpath = "(//a[normalize-space()='Courses'])[1]")
	public WebElement coursesButton;
	
	@FindBy(xpath = "//li[normalize-space()='Workspace']")
	public WebElement workspace;
	
	@FindBy(xpath = "//input[@id='keyword']")
	public WebElement searchfield;
	
	@FindBy(xpath = "//button[@title='Search in undefined']")
	public WebElement searchbutton;
	
	@FindBy(xpath = "//bdi[normalize-space()='Automation testing course ML']")          //h4[@title='Automation testing course ML']
	public WebElement ongoingCourse;
	
	@FindBy(xpath = "//button[normalize-space()='Join Course']")
	public WebElement joinCourseButton;
	
	@FindBy(xpath = "//span[normalize-space()='Course']")
	public WebElement createCourse;
	
	@FindBy(xpath = "//input[@placeholder='Title']")
	public WebElement coursetitle;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-new-collection-editor[1]/lib-editor[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-meta-form[1]/sb-dynamic-form[1]/div[1]/div[1]/sb-keywords[1]/div[1]/tag-input[1]/div[1]/div[1]/tag-input-form[1]/form[1]/input[1]")
	public WebElement enterKeywords;
	
	@FindBy(xpath = "//div[@class='sb-dropdown']//select[@id='sb-dropdown']")
	public WebElement courseTypeDropdown;
	
	@FindBy(xpath = "(//option[.='State (Tamil Nadu)'])[1]")
	public WebElement courseTypeTamilNadu;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-new-collection-editor[1]/lib-editor[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-meta-form[1]/sb-dynamic-form[1]/div[1]/div[3]/sb-dynamic-framework-category-select[1]/div[1]/div[1]/select[1]")
	public WebElement selectSubjectDropdown;
	
	@FindBy(xpath = "//option[.=' Accountancy ']")
	public WebElement selectSubjectAccountancy;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-new-collection-editor[1]/lib-editor[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-meta-form[1]/sb-dynamic-form[1]/div[1]/div[4]/sb-dynamic-dropdown[1]/div[1]/div[1]/select[1]")
	public WebElement selectSyllabusDropdown;
	
	@FindBy(xpath = "(//option[.='State (Tamil Nadu)'])[2]")
	public WebElement selectSyllabusTamilNadu;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-new-collection-editor[1]/lib-editor[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-meta-form[1]/sb-dynamic-form[1]/div[1]/div[4]/sb-dynamic-multiple-dropdown[2]/div[1]/div[1]/div[1]")
	public WebElement selectMediumDropdown;
	
	@FindBy(xpath = "//label[normalize-space()='English']")
	public WebElement selectMediumEnglish;
	
	@FindBy(xpath = "//sb-dynamic-multiple-dropdown[3]//div[1]//div[1]//div[1]")
	public WebElement selectClassDropdown;
	
	@FindBy(xpath = "//label[normalize-space()='Class 1']")
	public WebElement selectClass1;
	
	@FindBy(xpath = "//sb-dynamic-multiple-dropdown[4]//div[1]//div[1]//div[1]")
	public WebElement selectSubject1Dropdown;
	
	@FindBy(xpath = "(//li[normalize-space()='English'])[2]")
	public WebElement selectSubjectEnglish1;
	
	@FindBy(xpath = "//input[@placeholder='Copyright Year']")
	public WebElement copyrightYear;
	
	@FindBy(xpath = "//button[normalize-space()='Add Child']")
	public WebElement addChild;
	
	@FindBy(xpath = "//button[normalize-space()='Add from library']")
	public WebElement addfromLibrary;
	
	@FindBy(xpath = "(//div[@class='sbchapter__item__title text-left sb__ellipsis sb__ellipsis--two mr-8 sb-color-black'])[1]")
	public WebElement selectContent1;
	
	
	@FindBy(xpath = "//button[@class='sb-btn sb-btn-xs sb-btn-dark-green sb-left-icon-btn font-weight-bold text-inherit']")
	public WebElement selectContentButton;
	
	@FindBy(xpath = "//div[.=' Where do you want to add this content? ']")
	public WebElement contentPopup;
	

	@FindBy(xpath = "//button[@id='addResource']")
	public WebElement addContentButtonOnPopup;
	
	
	@FindBy(xpath = "//button[@class='sb-btn sb-btn-primary sb-btn-xs back-btn px-0']")
	public WebElement backButton;
	
	@FindBy(xpath = "//button[@class='sb-btn sb-btn-normal sb-btn-primary mr-10 ng-star-inserted']")
	public WebElement sendforReview;
	
	@FindBy(xpath = "//div[normalize-space()='Accepting Terms & Conditions']")
	public WebElement tAndcPopup;
	
	@FindBy(xpath = "//input[@id='termAndConditions']")
	public WebElement agreeTandC;
	
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	public WebElement submitButtonOnTandCPopup;
	
	@FindBy(xpath = "//ngx-avatar[contains(@aria-label, 'Click here to continue to your profile')]")
	public WebElement profileicon;
	
	@FindBy(xpath = "//li[normalize-space()='Logout']")
	public WebElement logout;
	
	@FindBy(xpath = "//a[normalize-space()='Up For Review']")
	public WebElement upforReview;
	
	@FindBy(xpath = "//input[@placeholder='Search content']")
	public WebElement upforReviewSearchBox;
	
	@FindBy(xpath = "//button[normalize-space()='Publish']")
	public WebElement publishButton;
	
	@FindBy(xpath = "//td[1]")
	public WebElement firstSeacrhResult;
	
	@FindBy(xpath = "//span[normalize-space()='Are you sure you want to publish this Collection?']")
	public WebElement publishCollectionPopUp;
	
	@FindBy(xpath = "//button[normalize-space()='No']")
	public WebElement noButtonOnCollectionPopUp;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-header[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/div[1]/a[2]/div[1]/sb-avatar[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement guestIcon;
	//button[normalize-space()='No']
	
	//span[normalize-space()='Are you sure you want to publish this Collection?']
	
	
	//td[1]
	
	
	
	//input[@class='upForReviewSearchBox ng-pristine ng-valid ng-touched']
	//a[normalize-space()='Up For Review']
	//li[normalize-space()='Logout']
	
	//(//div[@class='ui dropdown right top pointing'])[2]
	
	
	
	//div[normalize-space()='Accepting Terms & Conditions']
	//input[@id='termAndConditions']
	
	
	//button[@class='sb-btn sb-btn-normal sb-btn-primary mr-10 ng-star-inserted']
	
	
	//i[@class='arrow left icon fs-1']
	//button[@id='addResource']
	
	//div[.=' Where do you want to add this content? ']
	
	//button[@class='sb-btn sb-btn-xs sb-btn-dark-green sb-left-icon-btn font-weight-bold text-inherit']
	
//	(//div[@class='sbchapter__item__title text-left sb__ellipsis sb__ellipsis--two mr-8 sb-color-black'])[1]
	//button[normalize-space()='Add from library']
	//button[normalize-space()='Add Child']
	
	//input[@placeholder='Copyright Year']
//	(//li[normalize-space()='English'])[2]
	//sb-dynamic-multiple-dropdown[4]//div[1]//div[1]//div[1]
	
	
	//label[normalize-space()='Class 1']
	//sb-dynamic-multiple-dropdown[3]//div[1]//div[1]//div[1]

	
	//label[normalize-space()='English']
//	/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-new-collection-editor[1]/lib-editor[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-meta-form[1]/sb-dynamic-form[1]/div[1]/div[4]/sb-dynamic-multiple-dropdown[2]/div[1]/div[1]/div[1]
	//	(//option[.='State (Tamil Nadu)'])[2]
	
	// /html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-new-collection-editor[1]/lib-editor[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-meta-form[1]/sb-dynamic-form[1]/div[1]/div[4]/sb-dynamic-dropdown[1]/div[1]/div[1]/select[1]
	
	//option[.=' Accountancy ']
	//select[@class='sb-dropdown-select ng-pristine ng-invalid ng-touched']
	//(//option[.='State (Tamil Nadu)'])[1]
	
	//div[@class='sb-dropdown']//select[@id='sb-dropdown']
	
	//input[@placeholder='Enter Keywords']
	
	//input[@placeholder='Title']
	
	//span[normalize-space()='Course']
	//h4[@title='Automation testing course ML']
	
	
	//input[@id='keyword']
	
	//li[normalize-space()='Workspace']
	
//	(//a[normalize-space()='Courses'])[1]

}
