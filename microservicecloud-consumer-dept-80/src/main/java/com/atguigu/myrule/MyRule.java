package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.springcloud.cfgbean.RandomRule_ZY;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyRule{

	@Bean("myRule1")
	public IRule myRule(){
//		return new RandomRule();// Ribbon默认是轮询，自定义为随机
		return new RandomRule_ZY(); //自定义每台机器 5 次
	}
}
