package com.cfs.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

@WebServlet("/students")

public class StudentListServlet extends HttpServlet {
    public static final String KEY="STD_LIST";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("html,text");
        List<Student> list=getList();

        PrintWriter out=resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>ALL Student ("+list.size()+") </h2>");
        out.println("<a href='index.html'>+add Student </a></br></br>");

        out.println("<table border='1' cellpadding='7' cellspacing=0' >");
        out.println("<tr><th>#</th><th>Name</th><th>rollNo</th><th>Course</th><th>marks</th></tr>");

        int i=1;
        for (Student s:list)
        {
            out.println("<tr>");
            out.println("<td>"+(i++)+"</td>");
            out.println("<td>"+s.getName());
            out.println("<td>"+s.getRoll());
            out.println("<td>"+s.getCourse());
            out.println("<td>"+s.getMarks());

        }
        out.println("</table>");
        out.println("</body></html>");

    }

    private List<Student> getList() {
        ServletContext ctx=getServletContext();
        List<Student> List=(List<Student>)ctx.getAttribute(KEY);
        return(List==null) ? Collections.emptyList():List;
    }
}
