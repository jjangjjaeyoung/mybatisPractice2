package com.ohgiraffers.employee.model.dao;

import com.ohgiraffers.employee.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllEmployee();
}
