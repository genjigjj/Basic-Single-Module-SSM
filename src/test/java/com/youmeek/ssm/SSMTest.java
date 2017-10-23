package com.youmeek.ssm;


import com.gjj.pojo.User;
import com.gjj.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {

	
	@Resource
	private IUserService userService;

	@Test
	public void test1() {
		User user = userService.getById(1);
		System.out.println("--------------------------------" + user.toString());
	}
}
