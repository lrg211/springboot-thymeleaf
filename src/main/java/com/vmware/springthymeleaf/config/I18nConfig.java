package com.vmware.springthymeleaf.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.vmware.springthymeleaf.i18n.CustomMessageSource;

@Configuration
public class I18nConfig {

    //@Bean(name="localeResolver")
    public LocaleResolver localeResolverBean() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.SIMPLIFIED_CHINESE);
        return sessionLocaleResolver;
    }

    @Bean(name="messageSource")
    public CustomMessageSource resourceBundleMessageSource(){
    	CustomMessageSource source=new CustomMessageSource();
        source.setBasename("i18n/messages");
        source.setDefaultEncoding("UTF-8");
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }

   // @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setAlwaysUseMessageFormat(true);
        messageSource.setFallbackToSystemLocale(false);
        messageSource.setBasename("i18n/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(2);
        return messageSource;
    }

}