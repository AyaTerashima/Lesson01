	package com.seiken_soft.controller;

	import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/hello")
	public class HelloController extends HttpServlet {
	  private static final long serialVersionUID = 1L;

	  protected void doGet(HttpServletRequest request,HttpServletResponse response)
	      throws ServletException, IOException {

	    // フォワード
	    RequestDispatcher dispatcher = request.getRequestDispatcher
	            ("/WEB-INF/view/inputHello.jsp");
	    dispatcher.forward(request, response);
	  }
	   
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException{

	    	
	        // リクエストパラメータを取得
	        String message = request.getParameter("message");

	        // リクエストスコープに保存
	        request.setAttribute("message", message);

	    	
	    // フォワード
	    RequestDispatcher dispatcher = request.getRequestDispatcher
	            ("/WEB-INF/view/showHello.jsp");
	    dispatcher.forward(request, response);
	  }
	}