package com.huxiaohui.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@ConfigurationProperties(prefix="neo")
@EnableConfigurationProperties
@Configuration
public class GlobalConfigProperties {
	private String hello;
	private String byebye;
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getByebye() {
		return byebye;
	}
	public void setByebye(String byebye) {
		this.byebye = byebye;
	}
}
