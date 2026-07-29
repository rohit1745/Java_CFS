package com.cfs.web;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class StudentRegServlet extends GenericServlet {
    @Override
    public void service(ServletRequest res, ServletResponse req) throws ServletException, IOException {
        req.setContentType("text/html");
        System.out.println("hiii");

        String name= res.getParameter("name");
        String email= res.getParameter("email");
        int marks= Integer.parseInt(res.getParameter("marks"));
        int rollNo= Integer.parseInt(res.getParameter("rollNo"));
        String country= res.getParameter("country");
        System.out.println("data enter");


        student sc=new student(name,email,marks,rollNo,country);
        System.out.println(sc);

    }
}
