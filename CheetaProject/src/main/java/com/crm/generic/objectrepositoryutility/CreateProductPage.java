package com.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
WebDriver driver;
	public CreateProductPage() {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	@FindBy(name="ProductsLinks")
	private WebElement productlink;
	public WebElement getproductlink()
	{

		System.out.println("print code");


		System.out.println("hiiiiiiiii");
		System.out.println("jimmcmsdfghjk");


		return productlink;
	}


}
