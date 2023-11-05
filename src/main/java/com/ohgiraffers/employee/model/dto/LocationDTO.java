package com.ohgiraffers.employee.model.dto;

public class LocationDTO {

    private String local_code;
    private String national_code;
    private String local_name;

    public LocationDTO() {}

    public LocationDTO(String local_code, String national_code, String local_name) {
        this.local_code = local_code;
        this.national_code = national_code;
        this.local_name = local_name;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }

    public String getNational_code() {
        return national_code;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
                "local_code='" + local_code + '\'' +
                ", national_code='" + national_code + '\'' +
                ", local_name='" + local_name + '\'' +
                '}';
    }
}
