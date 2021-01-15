package com.xunjia;

import com.xunjia.Service.StudentService;
import com.xunjia.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {

    @Test
    public void test01(){
        String config="applicationContext.xml";

        ApplicationContext appContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student)appContext.getBean("student");
        student.setId(1);
        student.setAge(20);
        student.setName("123");
        //student.set(1);

        StudentService studentService=(StudentService)appContext.getBean("studentService");
        studentService.createStudent(student);
        //System.out.println(student);
    }
}
