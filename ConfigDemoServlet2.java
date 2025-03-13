package com.wangxuan.week2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/config",
        initParams = {
                @WebInitParam(name = "name1", value = "wangxuan"),
                @WebInitParam(name = "studentId1", value = "2023211001000621")
        })
public class ConfigDemoServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletConfig config = getServletConfig();
        String name1 = config.getInitParameter("name1");
        String studentId1 = config.getInitParameter("studentId1");
        out.println("Name1: " + name1 + "<br>");
        out.println("Student ID1: " + studentId1 + "<br>");
    }
}