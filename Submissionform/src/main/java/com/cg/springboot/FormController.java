package com.cg.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("cg")
	
	public String company() {
		return"cg";
	}
	
@PostMapping("/details")
public String viewdetails(@RequestParam("cid") String cid,
		                   @RequestParam("cname") String cname,
		                   @RequestParam("cemail") String cemail,  ModelMap modelmap) 
{
	modelmap.put("cid",cid);
	modelmap.put("cname",cname);
	modelmap.put("cemail",cemail);
							return "ViewCustomers";
	
	
}
	

}
