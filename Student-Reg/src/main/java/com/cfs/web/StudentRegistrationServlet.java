package com.cfs.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@WebServlet("/student_reg")

public class StudentRegistrationServlet extends HttpServlet {

    public static final String KEY="STD_LIST";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("name");
        String roll=req.getParameter("roll");
        String course=req.getParameter("course");


        int marks=Integer.parseInt(req.getParameter("marks"));

        Student student =new Student(name,roll,course,marks);
        List<Student> list=getOrCreateList();
        list.add(student);


        res.sendRedirect("Student");




    }

    private List<Student> getOrCreateList(){

        ServletContext ctx=getServletContext();
        synchronized (ctx)
        {
            List<Student> list =(List<Student>)ctx.getAttribute(KEY);
            if(list==null)
            {
                list= Collections.synchronizedList(new ArrayList<>());
                ctx.setAttribute(KEY,list);
            }
            return list;
        }



    }


}

