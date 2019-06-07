package com.llb.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {
	@Bean
	public IRule myRule() {
		return new RoundRobinRule();//这是轮询
		//return new RandomRule();//这才是随机啊
		//return new RetryRule();//重置  防止宕机   瑞踹算法
	}

}
