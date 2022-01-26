package com.study.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�Ⱑ���� ���α׷����� ���

@Controller
public class Hello {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static(����) ����
	
	// 2. URL�� �޼��带 ����
	@RequestMapping("/hello")
	public void main() { // �ν��Ͻ� �޼��� - iv, cv�� �� �� ��밡��
		System.out.println("Hello");
		System.out.println(iv); // OK
		System.out.println(cv); // OK
	}
	
	// static �޼��� - cv�� ��밡��
	public static void main2() {
		System.out.println(cv); // OK
		// System.out.println(iv); // ����
	}
}
