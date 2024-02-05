package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P01_register {
    public P01_register(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(css = "div[class=\"navbar-form navbar-right signin-register-btns hidden-xs\"] a[href=\"https://wuzzuf.net/register\"]")
    public WebElement joinNowButton;
    @FindBy(id = "firstname")
    public WebElement firstname;
    @FindBy(id = "lastname")
    public WebElement lastName;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(css = "div[class=\"css-150a24d\"] input[type=\"password\"]")
    public WebElement password;
    @FindBy(css = "input[placeholder=\"e.g. Android Developer\"]")
    public WebElement jobLookingFor;
    @FindBy(css = "button[class=\"css-6lejne ezfki8j0\"]")
    public WebElement signupButton;
    @FindBy(css = "div[name=\"careerLevel\"] div:nth-child(1)")
    public WebElement student;
    @FindBy(css = "button[id=\"1\"] span")
    public WebElement fullTime;
    @FindBy(css = "div[class=\" css-6hend0 e1v1l3u10\"] div:nth-child(4) strong")
    public WebElement Manager;
    @FindBy(css = "div[class=\"section-validation-error css-6hend0 e1v1l3u10\"]:nth-child(3)")
    public WebElement whatJobCategories;
    @FindBy(css = "a[href=\"https://wuzzuf.net/employer/signup\"]")
    public WebElement createAnEmployerAccount;
    @FindBy(css = "div[class=\"css-1pwt1s8 ediq4wm0\"] div:nth-child(1)")
    public WebElement itSoftwareDevelopment;
    @FindBy(css = "input[name=\"minimumSalary\"]")
    public WebElement expectedSalary;
    @FindBy(css = "div[class=\"css-nwhan4\"] button")
    public WebElement saveAndContinue;
    @FindBy(css = "div[class=\"css-1x21pox e6pv2vl4\"] div[class=\"row\"] div[class=\"col-2-lg col-12\"] div[class=\" css-1dgicot-container\"] div[class=\" css-1hwfws3\"]")
    public WebElement day;
    @FindBy(css = "div[class=\"css-1x21pox e6pv2vl4\"] div:nth-child(2) div[class=\" css-1dgicot-container\"] div[class=\" css-1hwfws3\"]")
    public WebElement month;
    @FindBy(css = "div[class=\"css-1x21pox e6pv2vl4\"] div:nth-child(3) div[class=\" css-1hwfws3\"]")
    public WebElement year;
    @FindBy(css = "div[class=\"css-18uqayh\"] div[class=\"css-3pwpkg\"] label:nth-child(1)")
    public WebElement male;
    @FindBy(css = "form[novalidate] div:nth-child(6) div[class=\" css-zh6qap-control\"] div[class=\" css-1hwfws3\"]")
    public WebElement nationality;
    @FindBy(css = "#basic-info-form > div:nth-child(2) > div:nth-child(3) > div > div.css-1dgicot-container > div > div.css-1hwfws3")
    public WebElement city;
    @FindBy(css = "div[class=\" css-6hend0 e1v1l3u10\"]:nth-child(2) div[class=\"css-rpi6b5 e6pv2vl4\"]:nth-child(4) div[class=\" css-1hwfws3\"]")
    public WebElement area;
    @FindBy(css = "#basic-info-form > div:nth-child(3) > div > div > div.css-150a24d > input")
    public WebElement phoneNumber;
    @FindBy(css = "div[class=\"css-nwhan4\"] button[class=\"css-1wj05oe ezfki8j0\"]")
    public WebElement saveAndContinue2;
    @FindBy(css = "#work-experience-form > div.section-validation-error.css-1h480x3.e1v1l3u10 > div > div > div > div > div.css-1hwfws3")
    public WebElement yearsOfExperiance;
    @FindBy(css ="div[class=\"css-150a24d\"] input[name=\"jobTitle\"]")
    public WebElement jobTitle;
    @FindBy(css = "div[name=\"currentEducationLevel\"] div:nth-child(1)")
    public WebElement educationLevel;
    @FindBy(css = "#work-experience-form > div:nth-child(4) div[class=\"css-1xrefku e6pv2vl1\"] > div:nth-child(1) div[style=\"display: inline-block;\"] input")
    public WebElement languages;
    @FindBy(css = "#work-experience-form > div:nth-child(4) div[class=\"css-1xrefku e6pv2vl1\"] > div:nth-child(2) div[style=\"display: inline-block;\"] input")
    public WebElement proficiency;
    @FindBy(css = "div[class=\"css-1u4hpl4\"] button")
    public WebElement uploadButton;
    @FindBy(css = "div[class=\"css-nwhan4\"] button:nth-child(2)")
    public WebElement gettingStarted;
    @FindBy(css = "div[class=\"css-1xrefku e6pv2vl1\"] button")
    public WebElement addLanguageButton;
    @FindBy(css = "input[name=\"companyName\"]")
    public WebElement company;
    @FindBy(css = "div[class=\"css-r85p5r css-1dgicot-container\"] div[class=\" css-1hwfws3\"]")
    public WebElement jobCategory;
    @FindBy(css = "div[data-field=\"experienceType\"] div[class=\"css-1v7v7rz\"] div:nth-child(1)")
    public WebElement fullTime2;
    @FindBy(css = "div[class=\"css-bngkiu\"] div[data-field=\"experienceDuration.startMonth\"] div[class=\" css-1hwfws3\"]")
    public WebElement startingFromStartingMonth;
    @FindBy(css = "div[class=\"css-bngkiu\"] div[data-field=\"experienceDuration.startYear\"] div[class=\" css-1hwfws3\"]")
    public WebElement startingFromStartingYear;
    @FindBy(css ="label[class=\"css-1pj5q09\"] span:nth-child(2)")
    public WebElement iCurrentlyWorkThere;
    @FindBy(css = "button[name=\"Save_Work_Experience\"]")
    public WebElement experianceSaveButton;
    @FindBy(css = "div[class=\"section-validation-error css-6hend0 e1v1l3u10\"] div[style=\"margin-top: 20px;\"] input[placeholder=\"e.g., Business, Accounting\"]")
    public WebElement fieldOfStudy;
/*    @FindBy(xpath = "//div[@class=\"css-rzjfos\"]//input[@autocapitalize=\"none\"]\n")*/
    @FindBy (css = "div[class=\"css-rzjfos\"] input[autocapitalize=\"none\"]\n")
    public WebElement universityInstitution;
    @FindBy(css = "#work-experience-form div[style=\"margin-top: 20px;\"] > div:nth-child(3) > div:nth-child(3) input:nth-child(1)")
    public WebElement whenDidYouGetYourDegree;
    @FindBy(css = "#work-experience-form > div:nth-child(3) > div:nth-child(3) > div:nth-child(3) > div[class=\"css-1guj1as\"] input[autocapitalize=\"none\"]")
    public WebElement grade;
    @FindBy(css = "div[class=\"section-validation-error css-6hend0 e1v1l3u10\"] div[class=\" css-1dgicot-container\"] div[style=\"display: inline-block;\"] input")
    public WebElement skillsTools;
}

