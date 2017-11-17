package com.huxiaohui.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@ConfigurationProperties(prefix="neo")
public class GlobalConfigProperties {
	
    private static String hello;
	
    private static String bye;

	public static String getHello() {
		return hello;
	}

	@Value("${neo.hello}")
	public void setHello(String value) {
		hello = value;
	}

	public static String getBye() {
		return bye;
	}

	@Value("${neo.hello}")
	public void setBye(String value) {
		bye = value;
	}
    
    
}
