package com.jeelearning;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/sign.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//创建Bean类类型的数组
    private List<Bean> list=new ArrayList<Bean>();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String userpwd=request.getParameter("userpwd");
		
		Bean bean=new Bean(username,email,userpwd);
		list.add(bean);//添加存储信息

		//创建会话对象
		HttpSession s=request.getSession();
		//设置会话属性
		s.setAttribute("list", list);
	
		//页面重定向
		response.sendRedirect("play.jsp");
		 	
	}

}


