package com.xuan.week2.homework;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();


        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        String dateTime = sdf.format(new Date());


        out.println("<html>");
        out.println("<head><title>Homework Exercise#1</title></head>");
        out.println("<body>");
        out.println("<h1>Name: wangxuan</h1>");
        out.println("<h1>ID: 2023211001000621</h1>");
        out.println("<h1>Date and Time: " + dateTime + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}