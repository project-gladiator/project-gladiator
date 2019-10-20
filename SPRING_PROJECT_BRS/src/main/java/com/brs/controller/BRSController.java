package com.brs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brs.bean.Bus_Info_Bean;
import com.brs.exception.BRSException;
import com.brs.services.BusInfoServices;
import com.brs.bean.Bus_Info_Bean;
import com.brs.exception.BRSException;


@Controller
public class BRSController {

	@Resource
	private BusInfoServices busInfoServices;
	
	

	@RequestMapping(value = "/buslist", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {
		System.out.println("LoginController.showLoginPage GET method...");
		List<Bus_Info_Bean> busList = null;
		ModelAndView mAndV = null;
		busList = busInfoServices.getBusDetails();
		//System.out.println(empList);
		mAndV = new ModelAndView();
		// Pass-on this data to JSP
		mAndV.setViewName("buslist");
		mAndV.addObject("list", busList);
		return mAndV;
	}
	
	
	
//	@RequestMapping(value="/busDetails" , method = RequestMethod.GET)
//	public ModelAndView getEmpList(){
//		System.out.println("LoginController.showLoginPage GET method...");
//		List<Bus_Info_Bean> busList = null;
//		ModelAndView mAndV = null;
//		busList = busInfoServices.getBusDetails();
//		//System.out.println(empList);
//		mAndV = new ModelAndView();
//		// Pass-on this data to JSP
//		mAndV.setViewName("busDetails");
//		mAndV.addObject("list", busList);
//		return mAndV;
//	} 
}
