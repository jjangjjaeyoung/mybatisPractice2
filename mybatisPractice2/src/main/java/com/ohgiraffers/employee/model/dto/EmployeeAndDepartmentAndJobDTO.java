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
        return "EmployeeAndDepartmentAndJobDTO{" +
                "departmentDTO=" + employeeDTO.getEmp_name()+
                ", employeeDTO= " + jobDTO.getJob_name() +  "    " +  departmentDTO.getTitle() +
                ", jobDTO=" + employeeDTO.getPhone() +
                '}';
    }
}
