package com.netease.esp.cosplay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netease.esp.cosplay.service.UserService;

@Controller
public class Testcontroller {

	@Autowired
	UserService userService;
	 
	@RequestMapping(value = "/index")
	public String TestController(Model model) {
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			UserDAO userSupport = session.getMapper(UserDAO.class);
//			User user = userSupport.selectUserByID(1);
//			System.out.println(user.toString());
//			model.addAttribute("user", user);
//			logger.warn("成功!");
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("发生错误！");
//		}
		return "index";
	}

	
}
