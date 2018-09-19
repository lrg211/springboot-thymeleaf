package com.vmware.springthymeleaf.i18n;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vipclient.i18n.I18nUtil;
import com.vmware.vipclient.i18n.util.LocaleUtility;
import com.vmware.vipclient.i18n.util.RequestParam;
import com.vmware.vipclient.i18n.util.RequestUtility;

public class Translation {
	private static Logger logger = LoggerFactory.getLogger(Translation.class);

	public static String getTranslation(String key, String source,
			String comment, String... args) {
		Locale locale = LocaleUtility.getLocale();
		//RequestParam requestParam = new RequestParam();
		//requestParam.setParams(RequestParam.MACHINE_TRANSLATION, "true");
		//RequestUtility.setRequestParam(requestParam);
		String translation = I18nUtil.getMessageByComponent(locale, "JAVA",
				key, source, comment);
		logger.info("The translation from VIP service is " + translation
				+ ",  key is " + key);
		String formattedTrans = I18nUtil.format(translation, args);
		return formattedTrans;
	}
}
