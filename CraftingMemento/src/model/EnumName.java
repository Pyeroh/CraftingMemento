package model;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import model.enums.EItemCat;

public class EnumName {

	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle("gui.enums");

	private EnumName() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static void load() {
		RESOURCE_BUNDLE = ResourceBundle.getBundle("gui.enums");
		EItemCat.load();
	}
}
