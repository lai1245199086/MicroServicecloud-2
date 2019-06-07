package com.llb.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced //开启ribbon 涝德百伦斯  ***默认轮询  从这里开启ribbon  就这么简单啊
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	@Bean
	public IRule myRule() {
		//return new RoundRobinRule();//这是轮询
		//return new RandomRule();//这才是随机啊
		return new RetryRule();//重置  防止宕机   瑞踹算法
	}

}
