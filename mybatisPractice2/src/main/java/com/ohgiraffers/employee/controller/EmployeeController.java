package com.ohgiraffers.employee.controller;

import com.ohgiraffers.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.employee.model.dto.EmployeeAndDepartmentAndJobDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeController {

    private EmployeeMapper mapper;


    public void selectAllEmployee() {

        SqlSession sqlSession =getSqlSession();
        mapper =sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeAndDepartmentAndJobDTO> employeeList = mapper.selectAllEmployee();
        for (EmployeeAndDepartmentAndJobDTO  employee : employeeList) {
            System.out.println(employee);
        }
        sqlSession.close();
    }
}
