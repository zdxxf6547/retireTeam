package com.controller;

import com.bean.User;
import com.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 控制器
 */
@WebServlet("/login.do")
public class LoginController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        从前台获取值
        String name = (String) req.getParameter("name");
        String password = (String) req.getParameter("password");
//        从dao层获得User对象
        UserDao userDao = new UserDao();
        User user = userDao.getUser(name,password);

        if (user != null){
            req.setAttribute("user",user);
//        转到hello.jsp页面
            req.getRequestDispatcher("hello.jsp").forward(req, resp);
        }else {
//           转到登陆页面到登陆页面
            req.setAttribute("error","用户名或密码错误");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
