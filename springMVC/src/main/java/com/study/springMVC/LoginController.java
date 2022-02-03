package com.study.springMVC;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/login")
	public String loginForm() {
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String login(String id, String pwd, String rememberId) throws UnsupportedEncodingException {
		// 1. id와 pwd를 확인
		if (!loginCheck(id, pwd)) {
			// 2. id와 pwd가 일치하며, 흠으로 이동
			String msg = URLEncoder.encode("id 또는 pwd가 일치하지 않습니다.", "utf-8");
			return "redirect:/login/login?sg=" + msg;
		}
		// 일치하지 않으면, loginForm으로 이동
		return "loginForm";
	}

	private boolean loginCheck(String id, String pwd) {
		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
