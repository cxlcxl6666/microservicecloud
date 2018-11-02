package com.atguigu.springcloud.service;

/**
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
 * 新建
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 */
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.atguigu.springcloud.entities.Dept;

//@FeignClient(value="MICROSERVICECLOUD-DEPT")
@FeignClient(value="MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id);
	
	@GetMapping("/dept/list")
	public List<Dept> list();
	
	@PostMapping("/dept/add")
	public boolean add(Dept dept);
}
