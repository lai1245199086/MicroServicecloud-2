package com.llb.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.llb.springcloud.bean.Dept;
import com.llb.springcloud.service.DeptService;


@RestController
public class DeptController {

	@Autowired
	private  DiscoveryClient client;//服务发现就是查询总共有多少微服务，每个微服务的实例
	
	@Autowired
	private  DeptService deptService;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {//@RequestBody
		
		return deptService.add(dept);
	}
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		
		return deptService.get(id);
	}
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		
		return deptService.list();
	}
	
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery()
	{
		List<String> list = client.getServices(); //查看有多少微服务
		System.out.println("被发现的微服务详细设置" + list);

		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");//查看这个微服务的实例有多少
		for (ServiceInstance element : srvList) {
			System.out.println("服务发现"+element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri()+"服务发现");
		}
		return this.client;
	}

}
