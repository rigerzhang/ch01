package com.xunjia.Service.Impl;

import com.xunjia.Dao.StudentDao;
import com.xunjia.Service.StudentService;
import com.xunjia.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    //@Autowired
    //@Qualifier("studentDao")
    @Autowired
    @Qualifier("studentOracleDao")
    private StudentDao studentDao=null;

    @Override
    public void createStudent(Student student) {
        //String config="applicationContext.xml";
        //ApplicationContext appContext=new ClassPathXmlApplicationContext(config);
        //Student student=(Student)appContext.getBean("student");
        //System.out.println(student);

        studentDao.saveStudent(student);

    }
}
