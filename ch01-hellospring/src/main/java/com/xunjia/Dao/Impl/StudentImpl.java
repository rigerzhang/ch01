package com.xunjia.Dao.Impl;

import com.xunjia.Dao.StudentDao;
import com.xunjia.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentImpl implements StudentDao {

    @Override
    public int saveStudent(Student student) {
        System.out.println("调用存储");
        System.out.println(student);
        return 1;
    }
}
