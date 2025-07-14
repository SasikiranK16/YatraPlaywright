package org.tests;

import org.base.YatraBase;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class YatraHomePla extends YatraBase {

	@BeforeSuite
	public void launch() {
		optForBrowser();
		commonDrivers(page);
	}
	@Test
	public void testOne() throws Exception {
		yatraPages.clickClose();
		yatraPages.clickCalandar();
		yatraPages.clickSpecificDate(42);
		yatraPages.clickSearch();
		yatraPages.displayPrice();
		page.pause();
	}
}
