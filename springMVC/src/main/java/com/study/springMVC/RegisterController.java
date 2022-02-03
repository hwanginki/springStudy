package com.study.springMVC;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	
	@RequestMapping("/registerForm/add")
	public String register() {
		return "registerForm";
	}
	
	@RequestMapping("/register/save")
	public String save(User u, Model m) throws UnsupportedEncodingException {
		// 1. ��ȿ�� �˻�
		if(!isValid(u)) {
			String msg = URLEncoder.encode("id�� �߸� �Է��ϼ̽��ϴ�.", "utf-8");
			
			m.addAttribute("msg", msg);
			
			return "redirect:/register/add";
			// return "redirect:/register/add?msg=" + msg; // URL ���ۼ�(rewriting)
		}
		return "registerInfo";
	}

	private boolean isValid(User u) {
		return false;
	}
}
