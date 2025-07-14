package org.pages;


import java.util.List;

import com.microsoft.playwright.Page;

public class YatraPages {
	
	public Page page;
	public YatraPages(Page page) {
		this.page=page;
	}

	private String close = "//*[starts-with(@alt,'cross')]";
	private String calandar = "//*[starts-with(@class,'css-w7k25o')]";
	private String dates = "//*[starts-with(@role,'option')]";
	private String clickSearch = "//*[starts-with(@type,'button')]";
	private String prices = "//*[starts-with(@class,'fs-18 bold price-color text-center fare-price')]";
	
	public void clickClose() {
		page.locator(close).nth(0).click();
	}
	public void clickCalandar() {
		page.locator(calandar).click();
	}
	
	public Page clickSpecificDate(int indexNum) {
		page.locator(dates).nth(indexNum).click();
		return page;
	}
	public Page clickSearch() {
		page.locator(clickSearch).nth(1).click();
		return page;
	}
	public void displayPrice() {
		page.locator(prices).allInnerTexts().forEach(p->System.out.println(p));
		
	}
}
