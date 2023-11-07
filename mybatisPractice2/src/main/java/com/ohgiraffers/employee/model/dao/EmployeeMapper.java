package com.ohgiraffers.employee.model.dao;


import com.ohgiraffers.employee.model.dto.EmployeeAndDepartmentAndJobDTO;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeAndDepartmentAndJobDTO> selectAllEmployee();
}
