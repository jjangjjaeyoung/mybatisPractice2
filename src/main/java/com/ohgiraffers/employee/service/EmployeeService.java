package com.ohgiraffers.employee.service;

import com.ohgiraffers.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {

    private EmployeeMapper mapper;
    public void selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeList = mapper.selectAllEmployee();

        for (EmployeeDTO employee : employeeList){
            System.out.println(employee);
        }
        sqlSession.close();


    }
}
