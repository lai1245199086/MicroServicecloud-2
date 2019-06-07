package com.llb.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.llb.springcloud.bean.Dept;

import feign.hystrix.FallbackFactory;
@Component  //AOP思想 DeptClientServiceFallbackFactory实现加载DeptClientService的熔断接口  对这个创建熔断DeptClientService//这跟查询不到有本质区别，一个是
//关闭服务，一个是服务异常，这是熔断跟降级的本质却别
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override//针对DeptClientService创建熔断
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Dept get(long id)
			{
				return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL");
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
