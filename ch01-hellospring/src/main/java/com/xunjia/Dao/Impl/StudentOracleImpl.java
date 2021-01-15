package com.xunjia.Dao.Impl;

import com.xunjia.Dao.StudentDao;
import com.xunjia.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("studentOracleDao")
public class StudentOracleImpl implements StudentDao {
    @Override
    public int saveStudent(Student student) {
        System.out.println("Oracle调用存储");
        System.out.println(student);
        return 1;
    }
}
