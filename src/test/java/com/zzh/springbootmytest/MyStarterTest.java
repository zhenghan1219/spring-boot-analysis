package com.zzh.springbootmytest;

import com.zzh.SimpleBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description TODO
 * @Author :zhenghan
 **/
@SpringBootTest
public class MyStarterTest {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	void test(){
		System.out.println(simpleBean.getId());
	}
}
