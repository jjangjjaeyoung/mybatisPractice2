package com.ohgiraffers.employee.model.dto;

public class EmployeeAndDepartmentAndJobDTO {

    // 이름 부서명 직급 전화번호
    private  DepartmentDTO departmentDTO;
   private EmployeeDTO employeeDTO;
   private JobDTO jobDTO;

    public EmployeeAndDepartmentAndJobDTO() {
    }

    public EmployeeAndDepartmentAndJobDTO(DepartmentDTO departmentDTO, EmployeeDTO employeeDTO, JobDTO jobDTO) {
        this.departmentDTO = departmentDTO;
        this.employeeDTO = employeeDTO;
        this.jobDTO = jobDTO;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public JobDTO getJobDTO() {
        return jobDTO;
    }

    public void setJobDTO(JobDTO jobDTO) {
        this.jobDTO = jobDTO;
    }

    @Override
    public String toString() {
        return
                "직원이름: " + employeeDTO.getEmp_name()+
                " 부서명: " + departmentDTO.getTitle() +  " 직급: " +  jobDTO.getJob_name() +
                " 전화번호: " + employeeDTO.getPhone() ;
    }
}
