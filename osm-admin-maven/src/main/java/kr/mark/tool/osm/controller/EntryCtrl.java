package kr.mark.tool.osm.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class EntryCtrl {
	
	@RequestMapping(value = "/", produces =  "application/json; charset=utf8") 
	  public @ResponseBody String top (HttpServletRequest  req, HttpServletResponse res, RequestEntity<byte[]> reqE) throws Exception {
		  
		return "{스타트}";

			
	  
	  }
	
	
	  @RequestMapping(value = "sum", produces =  "application/json; charset=utf8") 
	  public @ResponseBody String	  sum_test(HttpServletRequest  req, HttpServletResponse res, RequestEntity<byte[]> reqE) throws Exception {
		  
		return "{}";

			
	  
	  }

}
