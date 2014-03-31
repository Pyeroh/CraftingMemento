package test.model;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import model.enums.EItem;

import org.junit.Test;

public class EItemLinkTest {

	@Test
	public void testLocalizationLink() {

		for (EItem item : EItem.values()) {
			assertNotNull(item.getGuiName());
			assertNotEquals(item.getGuiName(), "");
		}

	}

}
