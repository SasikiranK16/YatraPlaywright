package org.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.pages.YatraPages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class YatraBase {

	public static Properties properties;
	public static FileInputStream fis;
	public static Browser browser;
	public static Playwright playwright;
	public static BrowserContext browserContext;
	public static Page page;
	public static YatraPages yatraPages;
	public static Properties getProperties() {
		properties = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\utils\\prop.properties");
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	public Page commonDrivers(Page page) {
		yatraPages = new YatraPages(page);
		return page;
	}
	public static Playwright  optForBrowser() {
		getProperties();
		playwright = Playwright.create();
		browser =  playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		browserContext = browser.newContext();
		page = browserContext.newPage();
		page.navigate(getProperties().getProperty("url"));
		return playwright;
	}
}
