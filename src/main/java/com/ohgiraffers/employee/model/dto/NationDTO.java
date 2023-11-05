package com.ohgiraffers.employee.model.dto;

public class NationDTO {

    private String national_code;
    private String national_name;

    public NationDTO() {}

    public NationDTO(String national_code, String national_name) {
        this.national_code = national_code;
        this.national_name = national_name;
    }

    public String getNational_code() {
        return national_code;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public String getNational_name() {
        return national_name;
    }

    public void setNational_name(String national_name) {
        this.national_name = national_name;
    }

    @Override
    public String toString() {
        return "NationDTO{" +
                "national_code='" + national_code + '\'' +
                ", national_name='" + national_name + '\'' +
                '}';
    }
}
