package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown {
public static Select dp(WebElement ele) {
	Select s = new Select(ele);
	return s;
}
}
