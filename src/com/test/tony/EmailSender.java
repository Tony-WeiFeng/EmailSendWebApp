package com.test.tony;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

///**
// * Servlet implementation class EmailSender
// */
//@WebServlet(
//		urlPatterns = { "/EmailSender" }, 
//		initParams = { 
//				@WebInitParam(name = "sender", value = "null", description = "sender"), 
//				@WebInitParam(name = "recipients", value = "null", description = "mail to list")
//		})

public class EmailSender extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmailSender() {
        // TODO Auto-generated constructor stub
    	try {
			init();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private static final String CONTENT_TYPE = "text/html; charset=GB2312";
    public void init()throws Ser

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
	}

}
