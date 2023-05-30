package com.zzh.config;

import com.zzh.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author :zhenghan
 **/
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class MyAutoConfiguration {

	static {
		System.out.println("MyAutoConfiguration init ------");
	}

	@Bean
	public SimpleBean simpleBean(){
		return new SimpleBean();
	}
}
