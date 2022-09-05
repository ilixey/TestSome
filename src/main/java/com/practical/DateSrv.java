package com.practical;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DateSrv extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        Date today=new Date();
        PrintWriter out =res.getWriter();
        out.println("Today is :"+today.toString());
    }
}
