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
		 * 서블릿이 초기화될 때 자동 호출되는 메소드
		 * 1. 서블릿의 초기화 작업 담당하는 로직 
		 */
		System.out.println("HelloServlet into() 호출!!!");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// 뒷정리 - 서블릿이 메모리에서 제거될 때 서블릿 컨테이너에 의해서 자동 호출
		System.out.println("HelloServlet destory() 호출!!!");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. 입력
		 * 2. 처리
		 * 3. 출력 
		 */
		System.out.println("HelloServlet service() 호출!!!");
	}

}
