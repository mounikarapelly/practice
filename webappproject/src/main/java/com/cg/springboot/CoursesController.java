package com.cg.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CoursesController
{
	@RequestMapping("/courses")
   public String courses(@RequestParam("cname")String cname,HttpSession session)
   {
		//HttpSession session=req.getSession();
		//String cname=req.getParameter("cname");
	   //System.out.println("welcome to spring web application"+cname);
	   session.setAttribute("cname", cname);
	   return"course";
	   
   }
}
