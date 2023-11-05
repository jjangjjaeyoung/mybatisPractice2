package com.ohgiraffers.employee.model.dto;

public class DepartmentDTO {

    private String dept_id;
    private String title;
    private String location_id;

    public DepartmentDTO() {}

    public DepartmentDTO(String dept_id, String title, String location_id) {
        this.dept_id = dept_id;
        this.title = title;
        this.location_id = location_id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "dept_id='" + dept_id + '\'' +
                ", title='" + title + '\'' +
                ", location_id='" + location_id + '\'' +
                '}';
    }
}
