package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DesktposPages;
import pages.HomePage;

public class HoverMenuTest extends TestPase {
	
private HomePage HomePageobject;
private DesktposPages DesktposPagesobject;

@Test
public void UserCanHoverMenuandOpenit() {
	HomePageobject = new HomePage(driver);
	DesktposPagesobject = new DesktposPages(driver);
	HomePageobject.HoverMenuComputers();
	Assert.assertTrue(DesktposPagesobject.GetDesktopText().contains("Desktops"));
}

}
