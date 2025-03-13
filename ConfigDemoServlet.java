package com.wangxuan.week2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("name");
        String studentId = config.getInitParameter("studentId");
        out.println("Name: " + name + "<br>");
        out.println("Student ID: " + studentId + "<br>");
    }
}