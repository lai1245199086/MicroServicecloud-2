package com.llb.springcloud.bean;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


//以上注解可以生成所有方法 专用bean
@SuppressWarnings({"serial" })
//@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain=true)//链式调用噢 
@Setter
@Getter
public class Dept implements Serializable{

	 public Long  deptno;   //主键
	 public String  dname;   //部门名称
	 public String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库	

}
