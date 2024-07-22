package org.jsp.mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/open-home")
	public String openHome(Model model) {
		model.addAttribute("user","kural");
		return "home";
	}
	
	@RequestMapping(value = "/sum")
	public String getsum(@RequestParam(name = "n1") int n1,@RequestParam(name="n2")int n2,Model model) {
		String result=n1+"+"+n2+"="+(n1+n2);
		model.addAttribute("result",result);
//		return "print.jsp";
		return"sum";
	}
	
//	@RequestMapping(value = "/open-sum")
//	public String opensum() {
//		return "/WEB-INF/views/sum.jsp";
//	}
	
	
	
	@RequestMapping(value = "/subtract")
	public String getsubract(@RequestParam(name = "n1") int n1,@RequestParam(name="n2")int n2,Model model) {
		String result=n1+"-"+n2+"="+(n1-n2);
		model.addAttribute("result",result);
//		return "print.jsp";
		return"subtract";
	}
	
	@RequestMapping(value = "/multiple")
	public String getmultiple(@RequestParam(name = "n1") int n1,@RequestParam(name="n2")int n2,Model model) {
		String result=n1+"*"+n2+"="+(n1*n2);
		model.addAttribute("result",result);
//		return "print.jsp";
		return"multiple";
	}
	
	@RequestMapping(value = "/divide")
	public String getdivide(@RequestParam(name = "n1") int n1,@RequestParam(name="n2")int n2,Model model) {
		String result=n1+"/"+n2+"="+(n1/n2);
		model.addAttribute("result",result);
//		return "print.jsp";
		return"divide";
	}
	
	@RequestMapping(value = "/open-view")
	public String openview(@RequestParam String view) {
		return view;
	}
	
	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister() {
		ModelAndView view=new ModelAndView();
		view.setViewName("register");
		view.addObject("u",new User());
		return view; 
	}
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute User u) {
		System.out.println("id:"+u.getId());
		System.out.println("name:"+u.getName());
		System.out.println("phone number:"+u.getPhone());
		System.out.println("email id:"+u.getEmail());
		System.out.println("gender:"+u.getGender());
		System.out.println("age:"+u.getAge());
		System.out.println("password:"+u.getPassword());
		ModelAndView view=new ModelAndView();
		view.setViewName("print");
		view.addObject("result","printed the user details");
		return view;
	}
}
