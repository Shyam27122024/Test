package ABC;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice1 {
    static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Shyam\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.get("http://192.168.154.183:8080/DIYPortal/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[text()=' New Transaction']")).click();
	    
	    WebElement MobNo = driver.findElement(By.id("txtMobileNumber_KYC"));
	    MobNo.sendKeys("9145043837");
	    WebElement Aadhar = driver.findElement(By.id("txtAadhaarNumber_KYC"));
	    Aadhar.sendKeys("872882405897");
	    WebElement PANNo = driver.findElement(By.id("txtPanNumber_KYC"));
	    PANNo.sendKeys("EYBPR4622A");
	    WebElement Name = driver.findElement(By.id("txtNameAsPerPan_KYC"));
	    Name.sendKeys("Narwade Shyam Ramchandra");
	    WebElement DOB = driver.findElement(By.id("dateDateOfBirthAsPerPan_KYC"));
	    DOB.sendKeys("02/04/1996");
	    Thread.sleep(1000);
	    DOB.click();
	   
	 
	    WebElement NextBtn = driver.findElement(By.id("navigationNextBtn"));
	    NextBtn.click();
	    
	   // Entity Proof of Identity
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
//	    WebElement GSTDropDown = driver.findElement(By.id(" dlEntitySearchGSTNumber")); 

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='DIY_PORTAL_SP_ENTITY_DETAILS_Update_The_Selected_GST_1_label']/parent::div/div")));
	    element.click();

	    WebElement SelectDoct = driver.findElement(By.id("ddlEntitySelectDocument"));
	    
	    Select select = new Select(SelectDoct);
	    select.selectByValue("Test1");
	    
	    WebElement UdyamRegNo = driver.findElement(By.id("txtEntityRegistrationNumber"));
	    UdyamRegNo.sendKeys("UDYAM-1234");
	    
	    WebElement I_authorise_Axis_Bank_to_fetch_and_store_data_from_API_setu = driver.findElement(By.xpath("//*[@ID='EntityDetails_checkbox1']/parent::div"));
	    I_authorise_Axis_Bank_to_fetch_and_store_data_from_API_setu.click();
	    
//	    Entity Proof of Address

//	    change address button
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement ChangeAdd = driver.findElement(By.id("EntityDetails_label11"));
	    boolean add = ChangeAdd.isEnabled();
	    System.out.println(add);
	    	
	    
//	    WebElement RegAddType = driver.findElement(By.id("ddlEntityRegisteredAddress"));
//	    Select selectRegAdd = new Select(RegAddType);
//	    selectRegAdd.selectByValue("Test1");          Delevlopment 
	    
	    WebElement POA_SameAs_reg = driver.findElement(By.xpath("//*[@id='rbtnEntityAddressSameAsRegisterAddress_1']/parent::div/div"));
	    POA_SameAs_reg.click();
	    
	    // Development
//	    WebElement Select_Bank_Branch = driver.findElement(By.id("ddlEntitySelectBankBranch")); 
//	    Select select1 = new Select(Select_Bank_Branch);
//	    select1.selectByValue("Test1");  
	    
	    
	    // Development
//	    WebElement Comm_Language = driver.findElement(By.id("ddlEntityPreferedLanguageForCommnucation")); 
//	    Select select1 = new Select(Select_Bank_Branch);
//	    select1.selectByValue("Test1");
	    
	    
	    // Credit Facility Details
	    
	    WebElement POA_Do_You_Have_Any_Credit_Facilities_From_Other_BanksSameAs_reg = driver.findElement(By.xpath("//*[@id='rbtnEntityDoYouHaveCreditFacility_0_label']/parent::div/div"));
	    POA_Do_You_Have_Any_Credit_Facilities_From_Other_BanksSameAs_reg.click();
	    
//	    WebElement BankName = driver.findElement(By.id("ddlEntityBankName")); 
//	    Select select3 = new Select(BankName);
//	    select3.selectByValue("Test1"); 
	    
	    
	    WebElement Branch_Name_And_City = driver.findElement(By.id("txtEntityBankNameCity")); 
	    Branch_Name_And_City.sendKeys("NoidaAxisBank");
	    
	    
	    WebElement Cash_Credit_and_Overdraft_Sanctioned_Limit = driver.findElement(By.id("txtEntityCashCreditedOverDraftedLimit")); 
	    Cash_Credit_and_Overdraft_Sanctioned_Limit.sendKeys("500000");
	    
	    
	    WebElement Funds_and_Non_Funds_Based_Sanctioned_Limits = driver.findElement(By.id("txtEntityFundNonFundSanctionAmount")); 
	    Funds_and_Non_Funds_Based_Sanctioned_Limits.sendKeys("600000");
	    
	    WebElement SanctionedAmount = driver.findElement(By.id("txtEntitySanctionAmounts")); 
	    SanctionedAmount.sendKeys("550000");
	    
	    WebElement Cancel_Butn = driver.findElement(By.id("btnEntityNext")); 
	    
	    boolean CancelBtn = Cancel_Butn.isEnabled();
	    System.out.println(CancelBtn);
	    
	    
	    WebElement AddToListBtn = driver.findElement(By.id("btnEntityNext")); 
	    boolean value = AddToListBtn.isEnabled();
	    System.out.println(value);
	    
	    //Account Details 
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement PurposeOFAccOpening = driver.findElement(By.id("ddlEntityPurposeOfAccountOpeaning"));
	    Select select4 = new Select(PurposeOFAccOpening);
	    select4.selectByValue("Test1"); 
	
	    
	    WebElement NatureOfBussiness = driver.findElement(By.id("ddlEntityNatureOfBusiness"));
	    Select select5 = new Select(NatureOfBussiness);
	    select5.selectByValue("Test1"); 
	    
	    
	    WebElement Occupation = driver.findElement(By.id("ddlEntityOccupation"));
	    Select select6 = new Select(Occupation);
	    select6.selectByValue("Test1"); 
	    
	    //Profile Sheet
	   
	    WebElement  Annual_Turnover = driver.findElement(By.id("txtEntityAnnualTurnover")); 
	    Annual_Turnover.sendKeys("700000");
	    
	    WebElement  NetWorth = driver.findElement(By.id("txtEntityNetworth")); 
	    NetWorth.sendKeys("700000");
	    
	    WebElement  NetWorth_LFA = driver.findElement(By.id("txtEntityNetProfit")); 
	    NetWorth_LFA.sendKeys("600000");
	    
	    WebElement  SourceOfFunds = driver.findElement(By.id("ddlEntitySourceOfFund")); 
	    Select selectSOF = new Select(SourceOfFunds);
	    selectSOF.selectByValue("Test1"); 
	    
	    WebElement  End_Use_Of_Funds = driver.findElement(By.id("txtEntityEndUseFunds")); 
	    End_Use_Of_Funds.sendKeys("100000");
	    
	    //No Of Years In Business
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement  Years = driver.findElement(By.id("EntityDetails_textbox31")); 
	    Years.sendKeys("10");
	    
	    
	    WebElement  Month = driver.findElement(By.id("EntityDetails_textbox32")); 
	    Month.sendKeys("6");
	    
	   // Principle Place Of Operation
	    
	    WebElement  PPOBO = driver.findElement(By.id("ddlEntityPlaceOfOperation")); 
	    Select select8 = new Select(PPOBO);
	    select8.selectByValue("Test1"); 
	    
	    //Whether Involued In Import/ Export
	    WebElement  ImportExport = driver.findElement(By.id("ddlEntityinvolvedImportExport")); 
	    Select select9 = new Select(ImportExport);
	    select9.selectByValue("EXPORT"); 
	    
	    //Import/ Export Code
	    
	    WebElement  ImportExportCode = driver.findElement(By.id("txtEntityImportExport")); 
	    ImportExportCode.sendKeys("ICE-12345");
	    
	    WebElement  AuthenticateBtn = driver.findElement(By.id("btnEntityAuthenticate")); 
	    AuthenticateBtn.isEnabled();
	    
	    //Export Turnover
	    
	    WebElement  Exturnover = driver.findElement(By.id("txtEntityExportTurnOver")); 
	    Exturnover.sendKeys("40000");
	    
	    //Percentage Of Export Under LC 
	    
	    WebElement  ExportUnderLC = driver.findElement(By.id("txtEntityPercentageOfExport")); 
	    ExportUnderLC.sendKeys("10");
	    
	    // Domasticsales_under_LC
	    
	    WebElement  Domasticsales_under_LC = driver.findElement(By.xpath("//*[@id='rbtnEntityDomesticSalesUnderLc_1']/parent::div/div")); 
	    Domasticsales_under_LC.click();
	    
	    //Percentage Domestic Sales Under LC
	    WebElement  PODSULC = driver.findElement(By.id("txtEntityPercentageOfSalesUnderLc")); 
	    PODSULC.sendKeys("10");
	    
	    // Domestic Purchase Under LC
	    
	    WebElement  DSULC = driver.findElement(By.xpath("//*[@id='rbtnEntityDomesticPurchaseLc_0_label']/parent::div/div")); 
	    DSULC.click();
	    
	    // Bank Gurantee
	    WebElement  Button = driver.findElement(By.xpath("//*[@id='rbtnEntityBankGurantee_0']/parent::div/div")); 
	    Button.click();
	    
	    //Approximate BG Volume Handle In Last FY 
	    
	    WebElement  BG_Volume = driver.findElement(By.id("txtEntityApproxBGVolume")); 
	    BG_Volume.sendKeys("2000");
	    
	    // Are Your Primary Location/ Trade Areas, Customer/Suppliers Domiciled In Any Of The Below Mentenioned List Of U.S. Sanctioned Countries?
//	    WebElement  PrimaryLocations = driver.findElement(By.id("ddlEntityPrimaryLocation")); 
//	    Select select11 = new Select(ImportExportCode);
//	    select11.selectByValue("PrimaryLocations"); 
	    
	    //Channel Facilites
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Please Select Additional Facility
	    
	    WebElement  Account_Statement = driver.findElement(By.xpath("//*[@id='EntityDetails_checkbox2']/parent::div/div")); 
	    Account_Statement.click();
	    
	    WebElement  Estatement = driver.findElement(By.xpath("//*[@id='EntityDetails_checkbox3']/parent::div/div")); 
	    Estatement.click();
	    
	    WebElement  Printed_Statement = driver.findElement(By.xpath("//*[@id='EntityDetails_checkbox4']/parent::div/div"));
	    Printed_Statement.click();
	    
	    //Information On Other Products
	    
	    WebElement  Email = driver.findElement(By.xpath("//*[@id='EntityDetails_checkbox5']/parent::div/div")); 
	    Email.click();
	    
	    WebElement  SMS = driver.findElement(By.xpath("//*[@id='EntityDetails_checkbox6']/parent::div/div")); 
	    SMS.click();
	    
	    WebElement  PhoneCell = driver.findElement(By.xpath("//*[@id='EntityDetails_checkbox7']/parent::div/div")); 
	    PhoneCell.click();
	    
	    // Next Button 
	    
	    WebElement  NextButton = driver.findElement(By.id("navigationNextBtn"));
	    
	    NextButton.click();
	   
	    //Aplication Details
	  
	    //Personal Details
	    WebElement  EmialID = driver.findElement(By.id("txtAppDetlsEmailID"));
	    
	    EmialID.sendKeys("Shyamnarwade@gail.com");
	  
        WebElement  MaritalStatus = driver.findElement(By.id("ddlAppDetailsMaritalStatus"));
	    Select select91 = new Select(MaritalStatus);
	    select91.selectByValue("Yes"); 
	   
	    WebElement  Qualifiaction = driver.findElement(By.id("ddlAppDetailsEducationalQualification"));
	    Select select92 = new Select(Qualifiaction);
	    select92.selectByValue("Yes"); 
	    
	    
//	    WebElement  CommLanguage = driver.findElement(By.id("ddlAppDetailsPrefredLanguagecommnucation"));
//	    Select select93 = new Select(CommLanguage);
//	    select93.selectByValue("Yes"); 
	    
	    WebElement  EnterOTP = driver.findElement(By.id("txtAppDetlsEnterOTP"));
	    
	    EnterOTP.sendKeys("12345");
	    
//	    Business Details
	    
	    WebElement  EntPurpose_of_Account_Openinger = driver.findElement(By.id("txtReviewAppPorposeAccOpen"));
	    EntPurpose_of_Account_Openinger.sendKeys("Personal Account");
	    
//	    WebElement  OccupationType  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Occupation_Type"));
//	    Select select94 = new Select(OccupationType);
//	    select94.selectByValue("Yes");
	    
//	    WebElement  OccupationCode  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Occupation_Code"));
//	    Select select94 = new Select(OccupationCode);
//	    select94.selectByValue("Yes");
	    
	    WebElement  NatureOfBussineess  = driver.findElement(By.id("txtRANatureOfBusiness"));
	    NatureOfBussineess.sendKeys("Personal");
	    
//	    WebElement  SourceOfFunds  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Source_Of_Funds"));
//	    Select select95 = new Select(SourceOfFunds);
//	    select95.selectByValue("Yes");
	
	    WebElement  AnnualIncome  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Annual_Income"));
	    AnnualIncome.sendKeys("80000");
	    
	    
        WebElement  NetWorths  = driver.findElement(By.id("txtRANetWorth"));	    
        NetWorths.sendKeys("80000");
        
        //No of Years in Business
      
        WebElement  Yearss  = driver.findElement(By.id("txtRABussinessInYears"));	    
        Yearss.sendKeys("9");
      
        WebElement  Months  = driver.findElement(By.id("txtRABussinessInMonths"));	    
        Months.sendKeys("11");
       
        //Family Details
        
        WebElement  MFirstName  = driver.findElement(By.id("txtAppDetlsMotherFirstName"));	    
        MFirstName.sendKeys("Bhagyashree");
      
        WebElement  MMiddleName  = driver.findElement(By.id("txtAppDetlsMotherMiddleName"));	    
        MMiddleName.sendKeys("Shyam");
       
        WebElement  MLastName  = driver.findElement(By.id("txtAppDetlsMotherLastName"));	    
        MLastName.sendKeys("Narwade");
       
        WebElement  MMaidinName  = driver.findElement(By.id("txtAppDetlsMotherMaidenName"));	    
        MMaidinName.sendKeys("Shyam");
     
        //Address Details
        
//	    WebElement  PermenAdd  = driver.findElement(By.id("ddlAppDetailPermanentAddressType"));
//	    Select select95 = new Select(PermenAdd);
//	    select95.selectByValue("Yes");
       
        WebElement  CommAddSameasPerm  = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsCommAsPermanentAddress_1']/parent::div/div"));
        CommAddSameasPerm.click();
        
//	    WebElement  SelectBranch  = driver.findElement(By.id("ddlAppDetailsSelectBankBranch"));
//	    Select select96 = new Select(SelectBranch);
//	    select96.selectByValue("Yes");
      	
        WebElement  CommAddSameasReg = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsCommnucationAddressSameAsRegistered_1']/parent::div/div"));
        CommAddSameasReg.click();
        
        
//	    WebElement  SelectPrrofOfAdd  = driver.findElement(By.id("ddlAppDetailsProofOfAddress"));
//	    Select select97 = new Select(SelectPrrofOfAdd);
//	    select97.selectByValue("Yes");  
        
        WebElement  AddLine1 = driver.findElement(By.id("txtAppDetailsAddressAddressline1"));
        AddLine1.sendKeys("Noida sector 137");
      
        WebElement  AddLine2 = driver.findElement(By.id("txtAppDetailsAddressAddressline2"));
        AddLine2.sendKeys("Noida sector 137");
     
        WebElement  LandMark = driver.findElement(By.id("txtAppDetailsAddrsLandmark"));
        LandMark.sendKeys("Noida sector 137");
    
        WebElement  Pincode = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Comm_Reg_Add_Pincode"));
        Pincode.sendKeys("401302");
        
        WebElement  City  = driver.findElement(By.id("txtAppDetailsAddrsCity"));
        City.sendKeys("Noida");
        
        WebElement  State  = driver.findElement(By.id("txtAppDetailsAddrsState"));
        State.sendKeys("UP");
        
	    WebElement  SelectCountry  = driver.findElement(By.xpath("//*[@name='ApplicationDetails_combo37']"));
	    Select selectC = new Select(SelectCountry);
	    selectC.selectByValue("india"); 
        
//        Add Nominee    
        
          WebElement  NoRadio  = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsAddNominee_1']/parent::div/div"));
          NoRadio.click();
        
          WebElement  ReasonForNominating  = driver.findElement(By.id("ddlAppDetailsNotNominating"));
	      Select select98 = new Select(ReasonForNominating);
	      select98.selectByValue("I dont wish to nominate anyone"); 
	    
//	      Debit Card Details
	    
//        WebElement  SelectFormatFor_Indi  = driver.findElement(By.id("ddlAppDetailsFormatToDesiredIndividualCard"));
//	      Select select99 = new Select(SelectFormatFor_Indi);
//	      select99.selectByValue(""); 

	     WebElement  NamePrintOnCard  = driver.findElement(By.id("txtAppDetailsNameToBePrintedCard"));
	     NamePrintOnCard.sendKeys("shyam narwade");
	     
//	     FATCA Details	     
           WebElement  TaxTypeAdd  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Ftca_Address_Type_For_Tax_Pu"));
	       Select select100 = new Select(TaxTypeAdd);
	       select100.selectByValue("Test1");

	        WebElement  TaxAdd  = driver.findElement(By.id("ddlAppDetailsAddressForTaxPurpose"));
		    Select select101 = new Select(TaxAdd);
		    select101.selectByValue("Test1");
	    	    
		    WebElement  AddressLine1  = driver.findElement(By.id("txtAppDetailsFtcaAddressLine"));
		    AddressLine1.sendKeys("Noida");
		   
		    WebElement  AddressLine2  = driver.findElement(By.id("txtAppDetailsFtcaAddressLine2"));
		    AddressLine2.sendKeys("Noida  137");
		   
		    WebElement  LandMarks  = driver.findElement(By.id("txtAppDetailsFtcaLandmark"));
		    LandMarks.sendKeys("Neagen");
		    
		    WebElement  Pincodes  = driver.findElement(By.id("txtAppDetailsFtcaPincode"));
		    Pincodes.sendKeys("402103");
		   
		    WebElement  Citys  = driver.findElement(By.id("ddlAppDetailsFtcaCity"));
		    Select select102 = new Select(Citys);
		    select102.selectByValue("Test1");
    
//		    WebElement  Ststes  = driver.findElement(By.id("ddlAppDetailsFtcaState"));
//		    Select select103 = new Select(Ststes);
//		    select103.selectByValue("Test1");
 
//		    WebElement  Countrys  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Ftca_Country"));
//		    Select select104 = new Select(Countrys);
//		    select104.selectByValue("Test1");
		    
		    WebElement  TaxResistance  = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsFtcataxresident_0_label']/parent::div/div"));
		    TaxResistance.click();
		    
		    WebElement  LOAaddNo  = driver.findElement(By.xpath("//*[@id='DIY_PORTAL_APPLICANT_DETAILS_Do_you_wish_to_add_LOA_1_label']/parent::div/div"));
		    LOAaddNo.click();
		    
//		    Neaxt Button
		    
		    WebElement  Nextbtton  = driver.findElement(By.id("navigationNextBtn"));
		    Nextbtton.click();
		    
//	    KYC Verification
		    
		    WebElement  LOAmob  = driver.findElement(By.id("txtMobileNumber_KYC"));
		    LOAmob.sendKeys("9988776655");
		    
		    WebElement  LOAAdhar  = driver.findElement(By.id("txtAadhaarNumber_KYC"));
		    LOAAdhar.sendKeys("872881405893");
		    
//		    LOA PAN Details
		    
		    WebElement  LOAPAN  = driver.findElement(By.id("txtPanNumber_KYC"));
		    LOAPAN.sendKeys("EYBPR4622A");
		    
		    WebElement  LOANAME  = driver.findElement(By.id("txtNameAsPerPan_KYC"));
		    LOANAME.sendKeys("Luvv Rishhii");
		    
		    WebElement  DOBLOA  = driver.findElement(By.id("dateDateOfBirthAsPerPan_KYC"));
		    DOBLOA.sendKeys("02/04/1997");
		    
		    // Next button
		    
		    WebElement  Nextbtn  = driver.findElement(By.id("navigationNextBtn"));
		    Nextbtn.click();
 
//		    LOA APplication Details
		    
		    //Personal Details
		    WebElement  EmialIDLOA = driver.findElement(By.id("txtAppDetlsEmailID"));
		    
		    EmialIDLOA.sendKeys("Shyamnarwade@gail.com");

	        WebElement  MaritalStatusLOA = driver.findElement(By.id("ddlAppDetailsMaritalStatus"));
		    Select select106 = new Select(MaritalStatusLOA);
		    select106.selectByValue("Yes"); 

		    WebElement  QualifiactionLOA = driver.findElement(By.id("ddlAppDetailsEducationalQualification"));
		    Select select111 = new Select(QualifiactionLOA);
		    select111.selectByValue("Yes"); 

//		    WebElement  CommLanguageLOA = driver.findElement(By.id("ddlAppDetailsPrefredLanguagecommnucation"));
//		    Select select112 = new Select(CommLanguageLOA);
//		    select112.selectByValue("Yes"); 
		    
		    WebElement  EnterOTPLOA = driver.findElement(By.id("txtAppDetlsEnterOTP"));
		    
		    EnterOTPLOA.sendKeys("12345");
		    
//		    Business Details

		    WebElement  EntPurpose_of_Account_Openinger_LOA = driver.findElement(By.id("txtReviewAppPorposeAccOpen"));
		    EntPurpose_of_Account_Openinger_LOA.sendKeys("Personal Account");
		    
//		    WebElement  OccupationTypeLOA  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Occupation_Type"));
//		    Select select113 = new Select(OccupationTypeLOA);
//		    select113.selectByValue("Yes");
		 
//		    WebElement  OccupationCode  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Occupation_Code"));
//		    Select select94 = new Select(OccupationCode);
//		    select94.selectByValue("Yes");
		    
		    WebElement  NatureOfBussineess_LOA  = driver.findElement(By.id("txtRANatureOfBusiness"));
		    NatureOfBussineess_LOA.sendKeys("Personal");   
		    
//		    WebElement  SourceOfFundsLOA  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Source_Of_Funds"));
//		    Select select114 = new Select(SourceOfFundsLOA);
//		    select114.selectByValue("Yes");

		    WebElement  AnnualIncomeLOA  = driver.findElement(By.id("DIY_PORTAL_LOA_APPLICANT_DET_ANNUAL_INCOME"));
		    AnnualIncomeLOA.sendKeys("80000");
    
	        WebElement  NetWorthsLOA  = driver.findElement(By.id("txtRANetWorth"));	    
	        NetWorthsLOA.sendKeys("80000");
	        
	        //No of Years in Business

	        WebElement  YearssLOA  = driver.findElement(By.id("txtRABussinessInYears"));	    
	        YearssLOA.sendKeys("9");

	        WebElement  MonthsLOA  = driver.findElement(By.id("txtRABussinessInMonths"));	    
	        MonthsLOA.sendKeys("11");
	        
	        //Family Details
	        
	        WebElement  MFirstNameLOA  = driver.findElement(By.id("txtAppDetlsMotherFirstName"));	    
	        MFirstNameLOA.sendKeys("Bhagyashree");
	         
	        WebElement  MMiddleNameLOA  = driver.findElement(By.id("txtAppDetlsMotherMiddleName"));	    
	        MMiddleNameLOA.sendKeys("Shyam");
	         
	        WebElement  MLastNameLOA  = driver.findElement(By.id("txtAppDetlsMotherLastName"));	    
	        MLastNameLOA.sendKeys("Narwade");
	         
	        WebElement  MMaidinNameLOA  = driver.findElement(By.id("txtAppDetlsMotherMaidenName"));	    
	        MMaidinNameLOA.sendKeys("Shyam");
	          
	        //Address Details
	        
//		    WebElement  PermenAddLOA  = driver.findElement(By.id("ddlAppDetailPermanentAddressType"));
//		    Select select115 = new Select(PermenAdd);
//		    select115.selectByValue("Yes");
	        
	        
	        WebElement  CommAddSameasPermLOA  = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsCommAsPermanentAddress_1']/parent::div/div"));
	        CommAddSameasPermLOA.click();
	        
//		    WebElement  SelectBranchLOA  = driver.findElement(By.id("ddlAppDetailsSelectBankBranch"));
//		    Select select116 = new Select(SelectBranchLOA);
//		    select116.selectByValue("Yes");
	        
	        
	        	
	        WebElement  CommAddSameasRegLOA = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsCommnucationAddressSameAsRegistered_1']/parent::div/div"));
	        CommAddSameasRegLOA.click();
	        
	        
//		    WebElement  SelectPrrofOfAddLOA  = driver.findElement(By.id("ddlAppDetailsProofOfAddress"));
//		    Select select117 = new Select(SelectPrrofOfAddLOA);
//		    select117.selectByValue("Yes");
	        
	        WebElement  AddLine1LOA = driver.findElement(By.id("txtAppDetailsAddressAddressline1"));
	        AddLine1LOA.sendKeys("Noida sector 137");
	        
	        
	        WebElement  AddLine2LOA = driver.findElement(By.id("txtAppDetailsAddressAddressline2"));
	        AddLine2LOA.sendKeys("Noida sector 137");
	        	
	        
	        WebElement  LandMarkLOA = driver.findElement(By.id("txtAppDetailsAddrsLandmark"));
	        LandMarkLOA.sendKeys("Noida sector 137");
	        
	        
	        WebElement  PincodeLOA = driver.findElement(By.id("DIY_PORTAL_LOA_APPLICANT_DET_COMM_REG_ADD_PINCODE"));
	        PincodeLOA.sendKeys("401302");
	        
	        WebElement  CityLOA  = driver.findElement(By.id("txtAppDetailsAddrsCity"));
	        CityLOA.sendKeys("Noida");
	        
	        WebElement  StateLOA  = driver.findElement(By.id("txtAppDetailsAddrsState"));
	        StateLOA.sendKeys("UP");
	        
		    
//		    Debit Card Details
		    
//	        WebElement  SelectFormatFor_IndiLOA  = driver.findElement(By.id("ddlAppDetailsFormatToDesiredIndividualCard"));
//		    Select select118 = new Select(SelectFormatFor_IndiLOA);
//		    select118.selectByValue(""); 
		    
		    
		     WebElement  NamePrintOnCardLOA  = driver.findElement(By.id("txtAppDetailsNameToBePrintedCard"));
		     NamePrintOnCardLOA.sendKeys("shyam narwade");
		     
//		     FATCA Details
		     
	         WebElement  TaxTypeAddLOA  = driver.findElement(By.id("DIY_PORTAL_LOA_APPLICANT_DET_FTCA_ADDRESS_TYPE_FOR_TAX_PU"));
		     Select select119 = new Select(TaxTypeAddLOA);
		     select119.selectByValue("Test1");
		    
		    
		     
		        WebElement  TaxAddLOA  = driver.findElement(By.id("ddlAppDetailsAddressForTaxPurpose"));
			    Select select120 = new Select(TaxAddLOA);
			    select120.selectByValue("Test1");
		    
		    
			    WebElement  AddressLine1LOA  = driver.findElement(By.id("txtAppDetailsFtcaAddressLine"));
			    AddressLine1LOA.sendKeys("Noida");

			    WebElement  AddressLine2LOA  = driver.findElement(By.id("txtAppDetailsFtcaAddressLine2"));
			    AddressLine2LOA.sendKeys("Noida  137");
			   
			    WebElement  LandMarksLOA  = driver.findElement(By.id("txtAppDetailsFtcaLandmark"));
			    LandMarksLOA.sendKeys("Neagen");
			   
			    WebElement  PincodesLOA  = driver.findElement(By.id("txtAppDetailsFtcaPincode"));
			    PincodesLOA.sendKeys("402103");
			    
		        
			    WebElement  CitysLOA  = driver.findElement(By.id("ddlAppDetailsFtcaCity"));
			    Select select121 = new Select(CitysLOA);
			    select121.selectByValue("Test1");
			    
			    
//			    WebElement  StstesLOA  = driver.findElement(By.id("ddlAppDetailsFtcaState"));
//			    Select select121 = new Select(StstesLOA);
//			    select121.selectByValue("Test1");
	                
//			    WebElement  CountrysLOA  = driver.findElement(By.id("DIY_PORTAL_APPLICANT_DETAILS_Ftca_Country"));
//			    Select select122 = new Select(CountrysLOA);
//			    select122.selectByValue("Test1");
			    
			    WebElement  TaxResistanceLOA  = driver.findElement(By.xpath("//*[@id='rbtnAppDetailsFtcataxresident_0_label']/parent::div/div"));
			    TaxResistanceLOA.click();
			    
			    
//			    NextButtonn
			    WebElement  NextButtonn  = driver.findElement(By.id("navigationNextBtn"));
			    NextButtonn.click();
		    
			   // List<WebElement>  ReviewApplication  = driver.findElements(By.xpath("//div[@id='verNavFragParent']/child::div[2]/div/div/div/div/div"));

			    System.out.println(" Before_Loop");
			    
	   for(int i=0; i<13;i++) {
			    int a[]= {8,9,14,12,11,13,1,2,3,4,15,7,16};
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    Thread.sleep(2000);
			    WebElement secton = driver.findElement(By.xpath("//div[@id='ReviewApplication_frame"+a[i]+"']/div[1]"));
			    String text = secton.getText();
			    secton.click();
			    System.out.println(text);
		}
	    driver.findElement(By.id("navigationNextBtn")).click();
	    
	    //Fund Details
	    
	    WebElement FundAmount = driver.findElement(By.id("txtFundingAmount"));
	    FundAmount.sendKeys("50000");
	    
	    WebElement FundHold = driver.findElement(By.id("ddlFundingHolder"));
	    Select select122 = new Select(FundHold);
	    select122.selectByValue("Test1");
	    
	    driver.findElement(By.id("navigationNextBtn")).click();
	    
	    //Send VKYC Link
	    WebElement PrimayHolder = driver.findElement(By.id("ddlVKYCPrimaryHolder"));
	    Select select123 = new Select(PrimayHolder);
	    select123.selectByValue("Test1");
	    
	    //Verification Via Video
	    WebElement PANcardReady = driver.findElement(By.xpath("//*[@id='DIY_PORTAL_VKYC_Org_PANCARD_label']/parent::div/div"));
	    PANcardReady.click();
	    
	    WebElement InterNetconnection = driver.findElement(By.xpath("//*[@id='DIY_PORTAL_VKYC_Internet_Conntect_label']/parent::div/div"));
	    InterNetconnection.click();
	    
	    WebElement litEnviornment = driver.findElement(By.xpath("//*[@id='DIY_PORTAL_VKYC_Well_Environment_label']/parent::div/div"));
	    litEnviornment.click();
	    
	    WebElement VideoKycProcess = driver.findElement(By.xpath("//*[@id='DIY_PORTAL_VKYC_Terms_And_Condition_label']/parent::div/div"));
	    VideoKycProcess.click();
	    
	     
	    for(int i=0; i<3;i++) {
	    	int a[]= {2,3,17};
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Thread.sleep(2000);
	    	WebElement secton1 = driver.findElement(By.id("VKYC_Tile"+a[i]+""));
	    	String text = secton1.getText();
	    	secton1.click();
	    	System.out.println(text);
	    }
	    
	    WebElement SkipVideokyc = driver.findElement(By.id("rbVKYCSkip_label"));
	    SkipVideokyc.click();
	    
	    //Select your preferred language
	    
	    for(int i=0; i<6;i++) {
	        int a[]= {4,5,7,8,9,10};
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Thread.sleep(1000);
	    	WebElement secton2 = driver.findElement(By.id("VKYC_Tile"+a[i]+""));
	    	String text = secton2.getText();
	    	secton2.click();
	    	System.out.println(text);
	    }
	       
	    //Pick your slot for VKYC
	    WebElement timeForEkyc  = driver.findElement(By.id("dateVKYCDatePicker"));
	    timeForEkyc.sendKeys("16/04/2025");
	        
	    WebElement unfocus  = driver.findElement(By.xpath("//label[text()='Select A Time Slot']"));
	    unfocus.click();
	    
	    //Select A Time Slot
	    
	    for(int i=0; i<6;i++) {
	    	int a[]= {11, 12,13,14,15,16};
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Thread.sleep(1000);
	    	WebElement secton3 = driver.findElement(By.id("VKYC_Tile"+a[i]+""));
	    	String text = secton3.getText();
	    	secton3.click();
	    	System.out.println(text);
	    }
	    
	   driver.findElement(By.id("navigationNextBtn")).click();
	   
	   //Account Details
	   
	   Thread.sleep(2000);
	   WebElement AccDetails   = driver.findElement(By.xpath("//div[text()='Account Details']"));
	   AccDetails.click();
	   
	   driver.findElement(By.id("finalSubmitBtn")).click();

	   String alertWindow = driver.getWindowHandle();
	   driver.switchTo().window(alertWindow);
	   WebElement yes = driver.findElement(By.xpath("//button[text()='Yes']"));
	   yes.click();
	   
	    //driver.close();
	}
}
