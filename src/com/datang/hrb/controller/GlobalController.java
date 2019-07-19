package com.datang.hrb.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GlobalController extends HttpServlet {

	private Map<String,String> userMap = new HashMap<String,String>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		System.out.println("执行了get请求");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		String uri = req.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/")+1,uri.indexOf(".do"));
		System.out.println(action);
		
		if(action.equals("register")) {
			userMap.put(username,password);
			resp.sendRedirect("register_success.jsp");
		} else if(action.equals("login")) {
			String originPwd = userMap.get(username);
			System.out.println(originPwd);
			if(originPwd!=null&password.equals(originPwd)) {
				resp.sendRedirect("login_success.jsp");
			} else {
				resp.sendRedirect("login_fail.jsp");
			}
		} else {
			resp.sendRedirect("error.jsp");
		}
		System.out.println(userMap);
		System.out.println("执行了post请求");
	}
	
}
