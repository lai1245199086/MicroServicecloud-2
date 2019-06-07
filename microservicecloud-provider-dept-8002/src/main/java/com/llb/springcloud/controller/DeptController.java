package com.llb.springcloud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.llb.springcloud.bean.Dept;
import com.llb.springcloud.service.DeptService;


@RestController
public class DeptController {

	@Autowired
	private  DeptService deptService;
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		System.out.println("1111");
		return deptService.list();
	}

}
