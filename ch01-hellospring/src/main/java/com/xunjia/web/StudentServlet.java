package com.xunjia.web;

import com.xunjia.Service.StudentService;
import com.xunjia.pojo.School;
import com.xunjia.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller("studentServlet")
public class StudentServlet extends HttpServlet {
    @Autowired
    private StudentService studentService=null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        School school=new School(1,"清华","北京");
        Student student=new Student(1,20,"李四",school);
        studentService.createStudent(student);
    }
}
