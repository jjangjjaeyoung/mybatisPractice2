package com.ohgiraffers.employee.model.dto;

public class Sal_GradeDTO {

    private String sal_level;
    private String min_sal;
    private String max_sal;

    public Sal_GradeDTO() {}

    public Sal_GradeDTO(String sal_level, String min_sal, String max_sal) {
        this.sal_level = sal_level;
        this.min_sal = min_sal;
        this.max_sal = max_sal;
    }

    public String getSal_level() {
        return sal_level;
    }

    public void setSal_level(String sal_level) {
        this.sal_level = sal_level;
    }

    public String getMin_sal() {
        return min_sal;
    }

    public void setMin_sal(String min_sal) {
        this.min_sal = min_sal;
    }

    public String getMax_sal() {
        return max_sal;
    }

    public void setMax_sal(String max_sal) {
        this.max_sal = max_sal;
    }

    @Override
    public String toString() {
        return "Sal_GradeDTO{" +
                "sal_level='" + sal_level + '\'' +
                ", min_sal='" + min_sal + '\'' +
                ", max_sal='" + max_sal + '\'' +
                '}';
    }
}
