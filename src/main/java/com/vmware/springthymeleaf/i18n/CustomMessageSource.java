package com.vmware.springthymeleaf.i18n;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.springframework.context.support.ResourceBundleMessageSource;

public class CustomMessageSource extends ResourceBundleMessageSource{
	@SuppressWarnings("static-access")
	protected String getStringOrNull(ResourceBundle bundle, String key) {
		
		if (bundle.containsKey(key)) {
			try {
				String source = bundle.getBundle("i18n/messages", Locale.ENGLISH).getString(key);
				return Translation.getTranslation(key, source, "");
			}
			catch (MissingResourceException ex){
			}
		}
		return null;
	}
}
