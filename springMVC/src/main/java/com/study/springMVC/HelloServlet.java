package com.study.springMVC;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloServlet
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
       
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		/*
		 * ������ �ʱ�ȭ�� �� �ڵ� ȣ��Ǵ� �޼ҵ�
		 * 1. ������ �ʱ�ȭ �۾� ����ϴ� ���� 
		 */
		System.out.println("HelloServlet into() ȣ��!!!");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// ������ - ������ �޸𸮿��� ���ŵ� �� ���� �����̳ʿ� ���ؼ� �ڵ� ȣ��
		System.out.println("HelloServlet destory() ȣ��!!!");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. �Է�
		 * 2. ó��
		 * 3. ��� 
		 */
		System.out.println("HelloServlet service() ȣ��!!!");
	}

}
