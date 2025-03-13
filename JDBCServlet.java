package com.wangxuan.week2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(name = "JDBCServlet", value = "/jdbc")
public class JDBCServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://localhost;databaseName=userdb;encrypt=true;trustServerCertificate=true";
        String username="sa";
        String password="admin123456789";

        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("-->"+con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in doGet()");






    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
