package com.xd.halo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xd.halo.model.User;

/**
 * 
 * @author xiaodong
 *
 * @date 2014年12月16日 下午3:54:55
 */
@Controller
public class ParamTestController {

	@RequestMapping("/test1")
	public ModelAndView requestParam1(@RequestParam String username){
		System.out.println(username);
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/test2")
	public ModelAndView requestParam2(@ModelAttribute("user") User user){
		System.out.println(user);
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
