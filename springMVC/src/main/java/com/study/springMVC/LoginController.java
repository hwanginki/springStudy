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
		// 1. id�� pwd�� Ȯ��
		if (!loginCheck(id, pwd)) {
			// 2. id�� pwd�� ��ġ�ϸ�, ������ �̵�
			String msg = URLEncoder.encode("id �Ǵ� pwd�� ��ġ���� �ʽ��ϴ�.", "utf-8");
			return "redirect:/login/login?sg=" + msg;
		}
		// ��ġ���� ������, loginForm���� �̵�
		return "loginForm";
	}

	private boolean loginCheck(String id, String pwd) {
		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
